plugins {
    alias(libs.plugins.runique.android.library)
    alias(libs.plugins.runique.android.room)
}

android {
    namespace = "com.deved.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain )
}