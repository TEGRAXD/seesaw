plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Configuration.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Configuration.minSdkVersion)
        targetSdkVersion(Configuration.targetSdkVersion)
        versionName = Configuration.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Configuration.jvmTarget
    }
}

dependencies {
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.androidxCoreKTX)
    implementation(Dependencies.androidxAppCompat)
    implementation(Dependencies.materialComponents)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.navigationFragmentKTX)
    implementation(Dependencies.navigationUIKTX)

    testImplementation(Dependencies.junit4)
    androidTestImplementation(Dependencies.androidxTestJunit)
    androidTestImplementation(Dependencies.espressoCore)

    // implementation("com.github.suganda8:seesaw:1.0.0")
    implementation(project(":seesaw"))
}