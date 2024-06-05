plugins {
    id("java")
}

group = "org.airport.app"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}