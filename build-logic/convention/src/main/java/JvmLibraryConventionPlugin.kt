import com.deved.convention.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

class JvmLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply {
                apply("org.jetbrains.kotlin.jvm")
                configureKotlinJvm()
            }
        }
    }
}