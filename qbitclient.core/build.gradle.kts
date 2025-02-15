plugins {
    kotlin("jvm") version "2.1.0"
}

kotlin {
    jvmToolchain(17)
}
dependencies {
    implementation(kotlin("reflect"))
}