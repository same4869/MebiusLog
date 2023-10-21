package com.pokemon.mebius.log.printer

import com.pokemon.mebius.log.MLogConfig

interface MLogPrinter {
    fun print(config: MLogConfig, level: Int, tag: String, printString: String)
}