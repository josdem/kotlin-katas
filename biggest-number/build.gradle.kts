plugins {
    kotlin("jvm") version "1.5.21"
}

group = "com.jos.dem.kata"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}