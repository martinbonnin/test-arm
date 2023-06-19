plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.8.21")
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    iosSimulatorArm64()

    sourceSets {
        getByName("commonTest") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }
    }
}