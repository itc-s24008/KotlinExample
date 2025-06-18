package chap02

class User1 {
    var name: String = ""

    // Kotlin のコンパイラがプロパティのアクセサメソッドを生成するので
    // メソッドの宣言が重複するのでエラーになる。
//    fun getName(): String {
//        return name
//    }
//
//    fun setName(name: String) { {
//        this.name = name
//    }}
}

fun main() {
    val user = User1()
    user.name = "Nakasone"
    println(user.name)
}