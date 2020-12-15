package highOrder

fun main() {
    //一步步化简
    //匿名函数当作函数参数
    loginAction("lee2", "123123", fun(result: Boolean) { if (result) println("登陆成功") else println("登陆失败") })

    //匿名函数写成lambda表达式
    loginAction("lee2", "123123", { result -> if (result) println("登陆成功") else println("登陆失败") })

    //lambda是最后一个参数，所以写在小括号外面
    loginAction("lee2", "123123") { result -> if (result) println("登陆成功") else println("登陆失败") }

    // lambda是单参数，该参数可以用it代替
    loginAction("lee", "123456") {
        if (it) println("登陆成功") else println("登陆失败")
    }
}

fun loginAction(userName: String, password: String, loginResponseResult: (Boolean) -> Unit) {
    if (userName == null || password == null) {
        return
    }

    loginEngine(userName, password, loginResponseResult)
}

fun loginEngine(userName: String, password: String, loginResponseResult: (Boolean) -> Unit) {
    if ("lee" == userName && "123456" == password) {
        loginResponseResult(true)
    } else {
        loginResponseResult(false)
    }
}