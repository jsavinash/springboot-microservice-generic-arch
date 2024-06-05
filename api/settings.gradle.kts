rootProject.name = "airport-management-api"

// Locations of Gradle plugins
pluginManagement {
    repositories.gradlePluginPortal()
    includeBuild("../bundler")
}

// Location of other components
dependencyResolutionManagement {
    repositories.mavenCentral()
      includeBuild("../common")
      includeBuild(".")
}

include("api-gateway")
include("config-server")
include("department-service")
include("employee-service")
include("service-registry")