/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.traeper.app

import com.traeper.utilities.StringUtils

import org.apache.commons.text.WordUtils

fun main() {
    val tokens = StringUtils.split(MessageUtils.getMessage())
    val result = StringUtils.join(tokens)
    println(WordUtils.capitalize(result))
}
