pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AulaModulos"
include(":clientes")
include(":lojas")
include(":entregas")
include(":core:autenticacao")
include(":core:validacoes")
include(":data:api")
include(":data:banco")
include(":feature:autenticacao")
include(":domain")
