pluginManagement {
    repositories {
        // Репозиторий Google (Maven) с фильтрацией групп
        google {
            content {
                includeGroupByRegex("com\\.android.*")  // Плагины Android (com.android.*)
                includeGroupByRegex("com\\.google.*")    // Плагины Google (com.google.*)
                includeGroupByRegex("androidx.*")        // Плагины AndroidX (androidx.*)
            }
        }
        mavenCentral()      // Основной репозиторий Maven
        gradlePluginPortal() // Официальный портал плагинов Gradle
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Блокировка репозиториев в модулях
    repositories {
        google()      // Репозиторий Google для Android-библиотек
        mavenCentral() // Репозиторий Maven Central для общих библиотек
    }
}

rootProject.name = "ASUapp001"  // Имя корневого проекта (влияет на имя папки в .idea)
include(":app")                // Включение модуля `app` в сборку
 
