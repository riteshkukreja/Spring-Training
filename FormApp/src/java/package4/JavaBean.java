/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package4;

/**
 *
 * @author admin
 */
public class JavaBean {
    public String name;
    public int age;
    
    public JavaBean(String n, int a) {
        name = n;
        age = a;
    }
    
    public String toString() {
        return "{ name: " + name + ", age: " + age + "}";
    }
}
