/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synth;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import javax.sound.midi.MidiChannel;
import javax.swing.JButton;

/**
 *
 * @author deipola
 */
public class InputCheck extends Thread {

    private final JButton check;
    private final int canal;
    MidiChannel[] mc;
    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    boolean q = false;

    InputCheck(JButton c, MidiChannel[] mc, int canal) {
        this.check = c;
        this.canal = canal;
        this.mc = mc;
        start();
    }

    @Override
    public void run() {
        System.out.println("p");
        check.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("b");
                if ((ke.getKeyCode() == 65) & (a == false)) {
                    a = true;
                    mc[canal].noteOn(48, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == 87) & (b == false)) {
                    b = true;
                    mc[canal].noteOn(49, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == 83) & (c == false)) {
                    c = true;
                    mc[canal].noteOn(50, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == 69) & (d == false)) {
                    d = true;
                    mc[canal].noteOn(51, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == 68)& (e == false)) {
                    e = true;
                    mc[canal].noteOn(52, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_F)& (f == false)) {
                    f = true;
                    mc[canal].noteOn(53, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_T)& (g == false)) {
                    g = true;
                    mc[canal].noteOn(54, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_G)& (h == false)) {
                    h = true;
                    mc[canal].noteOn(55, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_Y)& (i == false)) {
                    i = true;
                    mc[canal].noteOn(56, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_H)& (j == false)) {
                    j = true;
                    mc[canal].noteOn(57, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_U)& (k == false)) {
                    k = true;
                    mc[canal].noteOn(58, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_J) & (l == false)) {
                    l = true;
                    mc[canal].noteOn(59, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_K)& (m == false)) {
                    m = true;
                    mc[canal].noteOn(60, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_O)& (n == false)) {
                    n = true;
                    mc[canal].noteOn(61, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_L)& (o == false)) {
                    o = true;
                    mc[canal].noteOn(62, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == VK_P)& (p == false)) {
                    p = true;
                    mc[canal].noteOn(63, 600);
                    System.out.println("Pepe");
                }
                if ((ke.getKeyCode() == 0)& (q == false)) {
                    q = true;
                    mc[canal].noteOn(64, 600);
                    System.out.println("Pepe");
                }
            }

        }
        );
        check.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("b");
                if (ke.getKeyCode() == 65) {
                    a = false;
                    mc[canal].noteOff(48, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == 87) {
                    b = false;
                    mc[canal].noteOff(49, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == 83) {
                    c = false;
                    mc[canal].noteOff(50, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == 69) {
                    d = false;
                    mc[canal].noteOff(51, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == 68) {
                    e = false;
                    mc[canal].noteOff(52, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_F) {
                    f = false;
                    mc[canal].noteOff(53, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_T) {
                    g = false;
                    mc[canal].noteOff(54, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_G) {
                    h = false;
                    mc[canal].noteOff(55, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_Y) {
                    i = false;
                    mc[canal].noteOff(56, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_H) {
                    j = false;
                    mc[canal].noteOff(57, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_U) {
                    k = false;
                    mc[canal].noteOff(58, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_J) {
                    l = false;
                    mc[canal].noteOff(59, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_K) {
                    m = false;
                    mc[canal].noteOff(60, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_O) {
                    n = false;
                    mc[canal].noteOff(61, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_L) {
                    o = false;
                    mc[canal].noteOff(62, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == VK_P) {
                    p = false;
                    mc[canal].noteOff(63, 600);
                    System.out.println("Pepe");
                }
                if (ke.getKeyCode() == 0) {
                    q = false;
                    mc[canal].noteOff(64, 600);
                    System.out.println("Pepe");
                }
            }

        }
        );

    }
}
