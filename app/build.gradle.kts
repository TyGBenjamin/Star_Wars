plugins {
    id(Plugins.androidApp)
    id(Plugins.kotlinAndroid)
}

android {
    namespace = "com.rave.starwars"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.rave.starwars"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Libs.constraintLayout)
    implementation(Libs.coreCtx)
    implementation(Libs.composeActivity)
    implementation(Libs.composeUi)
    implementation(Libs.composeUiToolingPreview)
    implementation(Libs.lifecycleRuntime)
    implementation(Libs.material3)
    implementation(Libs.navigationFragmentKtx)
    implementation(Libs.navigationUiKtx)

    testImplementation(Libs.Test.junit5)
    testRuntimeOnly(Libs.Test.junit5Engine)
}
