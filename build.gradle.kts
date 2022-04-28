plugins {
    kotlin("jvm") version "1.6.21"
    id("com.google.devtools.ksp") version "1.6.21-1.0.5"
}

group = "org.example"
version = "1.0-SNAPSHOT"

apply(plugin = "kotlin")

repositories {
    mavenCentral()
    maven { url = uri("https://maven.taktik.be/content/groups/public") }
}

val kmapVersion = "0.1.23-0a1725c2ab"
dependencies {
    implementation(kotlin("stdlib"))
    implementation(group = "io.icure", name = "kmap", version = kmapVersion)
    ksp(group = "io.icure", name = "kmap", version = kmapVersion)

    implementation(group = "org.mapstruct", name = "mapstruct", version = "1.3.1.Final")
}
