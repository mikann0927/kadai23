package jp.techacademy.yosuke.kokhara.kadai23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Human = Human("こあら", age = 34,hobby = "お金")

        Human.say()
        Human.think()

        val Human2 = Human("こあら",age = 34,hobby = "今後")
        Human2.say()
        Human2.think()

    }
}