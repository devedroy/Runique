import com.android.build.gradle.LibraryExtension
import com.deved.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("runique.android.library")

            val extension = target.extensions.getByType<LibraryExtension>()
            configureAndroidCompose(extension)
        }
    }
}