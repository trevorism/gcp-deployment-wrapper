package com.trevorism

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class DeleteClonedProjectTask extends DefaultTask{

    @TaskAction
    void deleteClonedProject(){
        project.exec {
            commandLine "powershell", "Remove-Item", "-Recurse -Force", "${project.projectDir}/service"
        }
    }
}

