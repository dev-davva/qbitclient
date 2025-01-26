plugins {
    kotlin("jvm") version "2.1.0"
}

dependencies {
    implementation(project(":qbitclient.core"))
    implementation(project(":qbitclient.implemented"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}