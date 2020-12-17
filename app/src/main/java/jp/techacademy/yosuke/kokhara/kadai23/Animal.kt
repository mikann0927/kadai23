package jp.techacademy.yosuke.kokhara.kadai23

import android.util.Log

open class Animal: Human {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby:String): super(name, age, hobby) {
    }
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)")
    }

    override fun think() {
        Log.d("kotlintest", this.name +"は"+ this.hobby + "について考える")
    }
}