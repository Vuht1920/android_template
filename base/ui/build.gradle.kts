import deps.dependOn

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-parcelize")
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
    namespace = "com.solid.ui"
}

repositories {
    mavenCentral()
    google()
}


dependencies {
    implementation("com.github.skydoves:colorpicker-compose:1.0.0")
    implementation(project(":base:theme"))
    dependOn(
        deps.AndroidX,
        deps.Compose,
        deps.Log,
        deps.CameraX,
        deps.Glide
    )
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}