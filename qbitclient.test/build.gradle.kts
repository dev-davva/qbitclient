plugins {
    kotlin("jvm") version "2.1.0"
}

dependencies {
    project(":qbitclient.core")
    project(":qbitclient.implemented")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}