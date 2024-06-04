package ninja.bryansills

import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinTaskPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("testing 123")
        project.tasks.register("bryanTestTask", KotlinTask::class.java)
    }
}