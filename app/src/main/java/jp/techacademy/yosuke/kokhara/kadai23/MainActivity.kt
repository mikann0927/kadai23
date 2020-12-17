package jp.techacademy.yosuke.kokhara.kadai23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Human = Animal("こあら", 34,hobby = "")

        Human.say()
        Log.d("kotlintest", "私の名前は" + Human.name + "です。")
        Log.d("kotlintest", "年は" + Human.age + "歳です。")

        val Human2 = Animal("こあら",age = 0,hobby = "年齢")
        Human2.think()

    }
}