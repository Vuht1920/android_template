import deps.dependOn

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Build.compileSdk

    defaultConfig {
        minSdk = Build.minSdk
        targetSdk = Build.targetSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = deps.Compose.Versions.composeCompiler
    }
    namespace = "com.solid.theme"
}

repositories {
    mavenCentral()
    google()
}


dependencies {
    dependOn(
        deps.AndroidX,
        deps.Compose,
        deps.Hilt
    )
}
// Allow references to generated code
kapt {
    correctErrorTypes = true
}