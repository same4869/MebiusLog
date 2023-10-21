package com.pokemon.hikari.mebius.log

import android.app.Application
import android.util.Log
import com.pokemon.mebius.commlib.utils.APPLICATION
import com.pokemon.mebius.log.MLog
import com.pokemon.mebius.log.MLogConfig
import com.pokemon.mebius.log.MLogManager
import com.pokemon.mebius.log.printer.MConsolePrinter
import com.pokemon.mebius.log.printer.MFilePrinter
import com.pokemon.mebius.log.printer.MLogPrinter

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        APPLICATION = this

        initLog()

    }

    private fun initLog() {
        MLogManager.init(object : MLogConfig() {
            override fun enable(): Boolean {
                return true//BuildConfig.DEBUG
            }
        }
//            //控制台打印输出
//            MConsolePrinter(),
//            //本地文件打印输出
//            MFilePrinter().apply {
//                init(applicationContext.filesDir!!.absolutePath, 0)
//            }
        )
        //写在init外面的话，很可能会被冲掉
        //控制台打印输出，默认也会添加，但只能存在一个
        MLogManager.addPrinter(MConsolePrinter())
        //本地文件打印输出
        MLogManager.addPrinter(MFilePrinter().apply {
            init(applicationContext.filesDir!!.absolutePath, 0)
        })
    }
}