package ex05;

import ex05.teacher.JavaTeacher;
import ex05.teacher.HtmlTeacher;
import ex05.teacher.PythonTeacher;

public class App {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();
        HtmlTeacher ht = new HtmlTeacher();
        jt.teachClass();
        System.out.println();
        pt.teachClass();
        System.out.println();
        ht.teachClass();
    }
}
