import org.gradle.api.Plugin
import org.gradle.api.Project

class RandomNumberPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.tasks.register("generateRandomNumber") {
            doLast {
                println "Random number: ${Math.random()}"
            }
        }
    }
}
