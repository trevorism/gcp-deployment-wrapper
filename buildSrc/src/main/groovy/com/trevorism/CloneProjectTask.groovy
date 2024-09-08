package com.trevorism

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CloneProjectTask extends DefaultTask{

    @TaskAction
    void cloneProject(){
        String serviceName = project.hasProperty("serviceName") ? project.property("serviceName") : "sample"
        project.exec {
            commandLine "git", "clone", "https://github.com/trevorism/${serviceName}.git", "${project.projectDir}/service"
        }
        project.file("${project.projectDir}/service/src/main/appengine").mkdirs()
        project.file("${project.projectDir}/service/src/main/appengine/app.yaml").text =
                """runtime: java17
service: ${serviceName}
entrypoint: java -jar ${serviceName}-all.jar
handlers:
  - url: /.*
    secure: always
    redirect_http_response_code: 301
    script: auto
"""
    }
}
