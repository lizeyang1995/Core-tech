package generic;

import generic.obj.Person;
import generic.obj.Student;
import generic.obj.Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaDemo {
    private Person person = new Person();
    private Student student = new Student();
    private Worker worker = new Worker();

    public void JavaDemo1() {
        //加上? extends Person之后，该list不能修改了，能获取里面的内容
        List<? extends Person> list = new ArrayList<Student>();

        //不能修改
        //list.add(person)

        //能获取
        Person person = list.get(0);
    }

    public void JavaDemo2() {
        //加上? super Person之后，该list能修改了，不能获取里面的内容
        List<? super Student> list = new ArrayList<Person>();

        //能修改
        list.add(student);

        //不能获取
        //Student student = list.get(0);
    }

    void show1(List<? extends Person> list) {
        //能获取
        for (Person person : list) {

        }
        //不能修改
        //list.add(person)
    }

    void test1() {
        List<Student> list = new ArrayList<>();
        show1(list);
    }

    void show2(List<? super Student> list) {
        //不能获取
        //for (Student student : list) {
        //
        //}
        //能修改
        list.add(student);
    }

    void test2() {
        List<Person> list = new ArrayList<>();
        show2(list);
    }
}
