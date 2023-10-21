package com.pokemon.mebius.log.formatter

interface MLogFormatter<T> {
    fun format(data: T): String
}