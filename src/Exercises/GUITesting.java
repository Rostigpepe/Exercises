package Exercises;

import javax.swing.*;

public class GUITesting {

    GUITesting(){
        //alternativt kan man låta denna klass extenda JFrameDemo
        //Då behövs inget JFrame-objekt och istf. "jf." används "this."
        JFrame jf = new JFrame();
        jf.setTitle("En titel");
        jf.setSize(500, 200);
        //jf.setLocation(100, 50);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }

}
