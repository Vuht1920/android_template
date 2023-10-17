plugins {
    id("com.google.dagger.hilt.android") version "2.48.1" apply false
}

buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.47")
        classpath("com.google.gms:google-services:4.4.0")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.9")
        classpath("com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:2.0.1")

    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
