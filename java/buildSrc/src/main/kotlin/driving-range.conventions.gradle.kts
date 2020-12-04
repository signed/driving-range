plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.hamcrest:hamcrest-core:1.3")
    testImplementation(platform("org.junit:junit-bom:5.7.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events( "passed", "skipped", "failed")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(14))
    }
}
