package com.gayi.Introduction;
import java.util.Arrays;
public class InsertionFunction {
    public static void main(String[] args) {
        Main.Student kunal = new Main.Student();

        kunal.greeting();
        class Student {
            int rollno;
            String name;
            Float marks;

            void greeting() {
                System.out.println("hello my name is" + name);
            }

            Student() {
                this.rollno = 77;
                this.name = "kunal";
                Float marks = this.marks;

            }
        }
    }
}
