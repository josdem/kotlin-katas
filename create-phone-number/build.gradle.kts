plugins {
    kotlin("jvm") version "1.5.10"
}

val junitJupiterVersion = "5.7.0"

group = "com.jos.dem.kata"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:$junitJupiterVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
