/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 11:08 AM
 *  File Name : Binding.java
 * */
package definitions.bindings;

public class Binding {
    public static void main(String[] args) {

    }
}

class A {
    public void display() {
        System.out.println("Class A.");
    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("Class B.");
    }
}
