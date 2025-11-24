plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.hamcrest:hamcrest:3.0")
    testImplementation(platform("org.junit:junit-bom:6.0.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation(platform("org.assertj:assertj-bom:3.27.6"))
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.assertj:assertj-guava")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events( "passed", "skipped", "failed")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
