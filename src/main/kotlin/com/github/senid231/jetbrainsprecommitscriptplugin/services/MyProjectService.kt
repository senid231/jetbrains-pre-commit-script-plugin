package com.github.senid231.jetbrainsprecommitscriptplugin.services

import com.github.senid231.jetbrainsprecommitscriptplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
