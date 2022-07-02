package com.github.isaaq.palmdoraide.services

import com.intellij.openapi.project.Project
import com.github.isaaq.palmdoraide.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
