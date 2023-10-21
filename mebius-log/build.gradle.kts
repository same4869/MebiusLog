import com.pokemon.mebius.framework.buildsrc.AndroidX
import com.pokemon.mebius.framework.buildsrc.Dependencies
import com.pokemon.mebius.framework.buildsrc.UIKit
import com.pokemon.mebius.framework.buildsrc.Versions

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
//    id("com.pokemon.hikari.upload.plugin")
    id("maven-publish")
}

android {
    namespace = "com.pokemon.mebius.log"
    compileSdk = Versions.compileSdkVersion

    defaultConfig {
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
    //发布jitpack用的，私有仓库用自己的那个插件
    afterEvaluate {
        publishing {
            publications {
                create<MavenPublication>("release") {
                    from(components["release"])
                    groupId = "com.pokemon.mebius"
                    artifactId = "log"
                    version = "0.0.1"
                }
            }
        }
    }
}

dependencies {
    implementation(AndroidX.core_ktx)
    implementation(AndroidX.appcompat)
    implementation(UIKit.recycler_view)
//    api(Dependencies.mebius_commlib)
    api("com.github.same4869:MebiusCommlib:0.0.1")
}