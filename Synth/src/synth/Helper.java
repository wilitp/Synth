/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synth;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author deipola
 */
public class Helper {
    Synthesizer synth;
    MidiChannel[] mc;
    JButton button1;
    
    Helper() throws MidiUnavailableException{
        System.out.println("dnivkf");
        synth = MidiSystem.getSynthesizer();
        synth.open();
        mc = synth.getChannels();
        Instrument[] instr = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument(instr[10]);
        JFrame frame = new JFrame("Sound1");
        JPanel pane = new JPanel();
        button1 = new JButton("Click me!");
        frame.getContentPane().add(pane);
        pane.add(button1);
        frame.pack();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mc[5].noteOn(60, 600);
            }

        });
        InputCheck c1 = new InputCheck(button1, mc,0);
//        InputCheck c2 = new InputCheck(button1, mc, 1);
//        InputCheck c3 = new InputCheck(button1, mc, 2);
//        InputCheck c4 = new InputCheck(button1, mc, 3);
//        InputCheck c5 = new InputCheck(button1, mc, 4);
//        
        
        
}
    
}
