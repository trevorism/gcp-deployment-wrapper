package com.trevorism


import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author tbrooks
 */
class DeployPlugin implements Plugin<Project> {

    private static final String VERSIONING_GROUP = "deploy"

    void apply(Project project) {
        println "Hello WOrld"

        //clone into build/project
        //modify project, adding values from template
        //invoke GCP Deploy
    }

}