/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.S;

/**
 *
 * @author Tuf Gaming
 */
// Single Responsibility Principle
public class UserService {
    public void printUser(User user) {
        System.out.println("User: " + user.getName());
    }
}