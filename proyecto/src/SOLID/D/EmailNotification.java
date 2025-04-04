/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.D;

/**
 *
 * @author Tuf Gaming
 */
public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}