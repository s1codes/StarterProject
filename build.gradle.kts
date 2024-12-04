plugins {
    kotlin("jvm") version "2.0.21"
    id("xyz.jpenilla.run-paper") version "2.3.1"
    id("com.gradleup.shadow") version "9.0.0-beta2"
}

group = "change.me"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.3-R0.1-SNAPSHOT")
}

tasks {
    runServer {
        minecraftVersion("1.21.3")
    }

    build {
        dependsOn(shadowJar)
    }

    shadowJar {
        archiveFileName = "${project.name}.jar"
        manifest {
            attributes["paperweight-mappings-namespace"] = "mojang"
        }

//        relocate("you.dependency", "your.new.relocated.dependency.location")
    }

    processResources {
        val props = mapOf("version" to version)
        inputs.properties(props)
        filteringCharset = "UTF-8"
        filesMatching("plugin.yml") {
            expand(props)
        }
    }
}

kotlin {
    jvmToolchain(21)
}