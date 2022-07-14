import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "1.3.7"
    id("xyz.jpenilla.run-paper") version "1.0.6"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.2" // Generates plugin.yml
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "net.parklabs"
version = "1.0.0"
description = property("project_description").toString()

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    paperDevBundle("1.19-R0.1-SNAPSHOT")
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }

    compileJava {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything
        options.release.set(17)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name() // We want UTF-8 for everything
    }
}

bukkit {
    load = BukkitPluginDescription.PluginLoadOrder.POSTWORLD
    main = property("project_main").toString()
    apiVersion = "1.19"
    name = property("project_name").toString()
    authors = listOf("HadiHariri","Joekoei","EendjeBernard")
    version = property("project_version").toString()
    description = property("project_description").toString()
}
