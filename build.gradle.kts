apply(plugin = "de.marcphilipp.nexus-publish")
apply(plugin = "io.codearte.nexus-staging")
apply(plugin = "org.jetbrains.dokka")

buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    }
    dependencies {
        classpath(Dependencies.androidGradlePlugin)
        classpath(Dependencies.kotlinGradlePlugin)
        classpath(Dependencies.navigationSafeArgsGradlePlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
        classpath(Dependencies.gradleNexusPublishPlugin)
        classpath(Dependencies.gradleNexusStagingPlugin)
        classpath(Dependencies.dokka)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}