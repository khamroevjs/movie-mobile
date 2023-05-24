// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application") version("8.0.1") apply(false)
    id("com.android.library") version("8.0.1") apply(false)
    kotlin("android") version("1.8.21") apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
