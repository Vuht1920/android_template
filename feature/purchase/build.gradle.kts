import deps.dependOn

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
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
    namespace = "com.solid.feature.purchase"
}

repositories {
    mavenCentral()
    google()
}

secrets {
    // Optionally specify a different file name containing your secrets.
    // The plugin defaults to "local.properties"
    propertiesFileName = "purchase.properties"
}

dependencies {
    implementation(project(":base:theme"))
    implementation(project(":base:ui"))
    dependOn(
        deps.AndroidX,
        deps.Log,
        deps.Billing,
        deps.Hilt,
        deps.Compose,
    )
}