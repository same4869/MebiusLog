package com.pokemon.hikari.mebius.log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.pokemon.mebius.commlib.utils.onClick
import com.pokemon.mebius.log.MLog
import com.pokemon.mebius.log.MLogConfig
import com.pokemon.mebius.log.MLogManager
import com.pokemon.mebius.log.printer.MViewPrinter

class MainActivity : AppCompatActivity() {
    private val viewPrinter by lazy {
        MViewPrinter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //自定义view打印输出
        MLogManager.addPrinter(viewPrinter)

        MLog.d("kkkk test1")
        MLog.d(listOf("test2", "你好", "吃饭了吗", "是的", "再见"))
        MLog.logToLocal("kkkk test3~~")

        MLog.d(TestLogBean().apply {
            age = 18
            name = "张三 test4"
            isGood = true
            sex = 1
        })

        MLog.log(object : MLogConfig() {
            override fun stackTraceDepth(): Int {
                return 5
            }
        }, contents = "Test5")

        findViewById<Button>(R.id.showViewBtn).onClick {
            viewPrinter.showLogView()
        }
    }
}