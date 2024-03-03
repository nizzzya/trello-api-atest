plugins {
    id("java")
    kotlin("jvm")
}

group = "com.jira"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.javafaker:javafaker:1.0.2")
    implementation("io.rest-assured:rest-assured:5.4.0")
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.16.1")
    implementation(kotlin("stdlib-jdk8"))

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}