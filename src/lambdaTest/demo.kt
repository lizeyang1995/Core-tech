package lambdaTest

fun main() {
    val method1: (String, String) -> Unit = {aStr, bStr -> println("method1:a$aStr, b$bStr")}
    method1("str1", "str2")

    val method2 = { println("method2") }
    method2()//或者method2.invoke()

    val method3: (String) -> Unit = {
        println("method3:传入的是$it")
    }
    method3("hello")

    val method4: (Int) -> Unit = {
        print("method4:")
        when (it) {
            1 -> println("等于1")
            in 20..30 -> println("20到30")
            else -> println("都不满足")
        }
    }
    method4(30)

    val method5: (Int, Int) -> Unit = { numberOne, _ ->
        println("method5:$numberOne")
    }
    method5(5, 6)
}