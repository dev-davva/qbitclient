plugins {
    kotlin("jvm") version "2.1.0"
}

dependencies {
    project(":qbitclient.core")
}

kotlin {
    jvmToolchain(17)
}