plugins {
    id("io.papermc.sculptor.version") version "1.0.6"
}

mache {
    minecraftVersion = "23w51a"

    repositories.register("sonatype snapshots") {
        url = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
        includeGroups.add("org.vineflower")
    }

    remapperArgs.set(
        listOf(
            "--temp-dir={tempDir}",
            "--remapper-file={remapperFile}",
            "--mappings-file={mappingsFile}",
            "--params-file={paramsFile}",
            // "--constants-file={constantsFile}",
            "--output={output}",
            "--input={input}",
            "--input-classpath={inputClasspath}",
        )
    )
}

dependencies {
    codebook("1.0.10")
    remapper(art("1.0.14"))
    decompiler(vineflower("1.11.0-20240414.025732-15"))
    parchment("1.20.4", "2024.02.25")
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.0.1")
}
