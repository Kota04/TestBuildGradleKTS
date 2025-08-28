@file:Suppress("unused")

package com.example.internal.dependencies

import com.example.internal.Versions

object Test {
    /**
     * [JUnit](https://mvnrepository.com/artifact/junit/junit)
     * JUnit is a unit testing framework for Java, created by Erich Gamma and Kent Beck.
     */
    const val junit = "junit:junit:${Versions.junit}"

    /**
     * [AndroidX Test JUnit](https://developer.android.com/training/testing/instrumented-tests)
     * AndroidX Test Library's JUnit extension for Android instrumented tests.
     */
    const val androidJunit = "androidx.test.ext:junit:${Versions.androidJunit}"

    /**
     * [Espresso Core](https://developer.android.com/training/testing/espresso)
     * Core Espresso library for Android UI testing.
     */
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}