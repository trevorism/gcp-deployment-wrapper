package com.trevorism


import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author tbrooks
 */
class DeployPlugin implements Plugin<Project> {

    private static final String VERSIONING_GROUP = "deploy"

    void apply(Project project) {
        project.tasks.create("cloneProject", CloneProjectTask)
        project.tasks.create("deleteClonedProject", DeleteClonedProjectTask)


        //modify project, adding values from template
        //invoke GCP Deploy
    }

}