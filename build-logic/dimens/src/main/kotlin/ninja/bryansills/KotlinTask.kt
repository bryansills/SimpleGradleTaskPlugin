package ninja.bryansills

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class KotlinTask : DefaultTask() {
    @TaskAction
    fun doWork() {
        println("hey i'm doing new work")
    }
}