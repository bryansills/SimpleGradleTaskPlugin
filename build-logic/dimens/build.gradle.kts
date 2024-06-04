plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("bryantask") {
            id = "ninja-bryansills-kotlin"
            implementationClass = "ninja.bryansills.KotlinTaskPlugin"
        }
    }
}