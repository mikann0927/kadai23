package jp.techacademy.yosuke.kokhara.kadai23

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, think: String) {
        this.name = name
        this.age = age
        this.hobby = think
    }

    abstract fun say()
    abstract fun think()
}