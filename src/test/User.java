/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import main.Student;

/**
 *
 * @author Umman
 */
public class User {
    

    private String name;
    public String surname;
    public int age;
    public static String companyName;
    public Student student;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("duz teyin edin");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
