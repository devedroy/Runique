plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.deved.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data)
}