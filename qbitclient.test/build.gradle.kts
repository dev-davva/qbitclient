plugins {
    kotlin("jvm") version "2.1.0"
}

dependencies {
    implementation(project(":qbitclient.core"))
    implementation(project(":qbitclient.implemented"))
    implementation("io.github.cdimascio:dotenv-kotlin:6.5.0")
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}