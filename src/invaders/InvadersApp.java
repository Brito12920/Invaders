/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invaders;

/**
 *
 * @author v103760
 */
import javax.swing.JFrame;
public class InvadersApp
 {
 public static void main(String[] args)
 {
 InvadersPanel sip = new InvadersPanel();
 JFrame frame = new JFrame();
 frame.getContentPane().add(sip);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.pack();
 frame.setVisible(true);
 }
 }