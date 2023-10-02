package Static_And_Instance;

import jdk.internal.dynalink.beans.StaticClass;

public class StaticModifier {

        public static void staticMethod() {
            System.out.println("Inside Static method");
        }

        public void nonStaticMethod() {
            System.out.println("Inside Non-Static method");
        }
        public static void main(String[] args) {
            staticMethod();

//          nonStaticMethod(); //Static methods can't access instance methods and instance variables directly while a non -static method can. Refer the below method.
            StaticModifier newObj = new StaticModifier();
            newObj.nonStaticMethod();
        }

        public void testMain() {
            staticMethod();
            nonStaticMethod();
        }
        /*staticMethod() is a static method, which means it can be called like this: MyClass.staticMethod();
        without creating an object of MyClass.
        On the other hand, nonStaticMethod() is a non-static method,
        which means it can only be called on an instance of the class:
        MyClass obj = new MyClass(); obj.nonStaticMethod();.
         */

}
