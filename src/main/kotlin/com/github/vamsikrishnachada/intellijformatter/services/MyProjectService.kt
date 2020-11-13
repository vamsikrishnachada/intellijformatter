package com.github.vamsikrishnachada.intellijformatter.services

import com.intellij.openapi.project.Project
import com.github.vamsikrishnachada.intellijformatter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
