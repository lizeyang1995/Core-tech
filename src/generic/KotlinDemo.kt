package generic

import generic.obj.Person
import generic.obj.Student

fun main() {
    //不能修改了，能获取里面的内容
    var list: MutableList<out Person> = ArrayList<Student>()
    //能修改了，不能获取里面的内容
    var list2: MutableList<in Student> = ArrayList<Person>()

}

class test1<out T> {
    //只能获取
    fun getData(): T? = null
    //不能修改
    //fun setData(d: T) {
    //
    //}

}

class test2<in T> {
    //不能获取
    //fun getData(): T? = null
    //能修改
    fun setData(d: T) {

    }

}