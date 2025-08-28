typealias and = com.example.internal.Android
typealias dep = com.example.internal.Dependencies

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.testbuildgradlekts"
    compileSdk = and.compileSdk

    defaultConfig {
        applicationId = "com.example.testbuildgradlekts"
        minSdk = and.minSdk
        targetSdk = and.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    dep.other.apply {
        implementation(ktxCore)
        implementation(appcompat)
        implementation(material)
        implementation(constraintLayout)
    }

    dep.test.apply {
        testImplementation(junit)
        androidTestImplementation(androidJunit)
        androidTestImplementation(espressoCore)
    }
}