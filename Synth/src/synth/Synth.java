/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synth;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiUnavailableException;



/**
 *
 * @author deipola
 */
public class Synth {

    

    public static void main(String[] args) {
        try {
            Helper synth = new Helper();
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(Synth.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
