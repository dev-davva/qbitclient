plugins {
    kotlin("jvm") version "2.1.0"
}

dependencies {
    implementation(project(":qbitclient.core"))
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.google.code.gson:gson:2.11.0")
}

kotlin {
    jvmToolchain(17)
}