package com.pokemon.mebius.framework.buildsrc

object Repos {
    const val maven_repo = "http://localhost:8081/repository/maven-releases/"
}

object Dependencies {
    const val mebius_publish_notify_plugin = "com.pokemon.hikari:upload-plugin:0.0.5"
    const val mebius_commlib = "com.pokemon.mebius:commlib:0.0.1"
}

object SoraLog {
    const val debug_mode = true
    const val core = "com.pokemon.mebius:log:0.0.1"
}

object Kotlin {
    const val gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val std = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
}

object Test {
    const val junit = "junit:junit:4.+"
    const val android_test_ext = "androidx.test.ext:junit:1.1.2"
    const val android_test_espresso = "androidx.test.espresso:espresso-core:3.3.0"
}

object UIKit {
    const val material = "com.google.android.material:material:1.4.0"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val recycler_view = "androidx.recyclerview:recyclerview:1.1.0"
}

object AndroidX {
    const val core = "androidx.core:core:1.5.0"
    const val core_ktx = "androidx.core:core-ktx:1.3.2"
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val fragment_ktx = "androidx.fragment:fragment-ktx:1.2.0"
    const val lifecycle = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
}

object Versions {
    const val compileSdkVersion = 33
    const val minSdkVersion = 24
    const val targetSdkVersion = 33
    const val kotlin = "1.8.20"
    const val agp = "8.0.1"
}
