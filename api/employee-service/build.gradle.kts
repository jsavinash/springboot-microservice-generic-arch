plugins {
    id("airport-base")
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
}

extra["springCloudVersion"] = "2023.0.2"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.0")
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.3.0")
    implementation("io.zipkin.reporter2:zipkin-reporter-brave:3.4.0")
    implementation("org.springframework.cloud:spring-cloud-starter-config:4.1.2")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.1.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
