plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.freetubemini"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.freetubemini"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}
