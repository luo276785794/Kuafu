package com.github.luo276785794.kuafu.services

import com.github.luo276785794.kuafu.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
