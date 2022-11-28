object Versions {
    const val androidGradle = "7.3.1"
    const val constraint = "2.1.4"
    const val compose = "1.3.1"
    const val composeActivity = "1.6.1"
    const val composeCompiler = "1.3.2"
    const val coreCtx = "1.9.0"
    const val coroutines = "1.3.2"
    const val junit5 = "5.9.1"
    const val kotlin = "1.7.20"
    const val lifecycle = "2.5.1"
    const val material = "1.1.0-alpha02"
    const val navigation = "2.5.3"
}

object Plugins {
    const val androidApp = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
}

object Libs {
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val coreCtx = "androidx.core:core-ktx:${Versions.coreCtx}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val material3 = "androidx.compose.material3:material3:${Versions.material}"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    object Test {
        const val junit5 = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
        const val junit5Engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
    }
}
