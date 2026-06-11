plugins {
    alias(libs.plugins.android.application) apply false
    var spec = alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.28" apply false
    implementation("androidx.navigation:navigation-compose:2.7.7")
}