//package puzzle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.applet.*;
import java.applet.AudioClip;
import java.util.*;

public class Puzzle extends JFrame{
	public JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
	public ImageIcon img1, img2, img3, img4, img5, img6, img7, img8, img9, imgFull;
	JLabel msg, swaps, highScoreLabel, image;
	public JTextField swapsField, highScoreField;
        public AudioClip click, success;
	
        public void clickSound(){
		URL urlClick, urlSuccess;
		urlClick=Puzzle.class.getResource("sounds/clickSound.wav");
		urlSuccess=Puzzle.class.getResource("sounds/success.wav");
		click=Applet.newAudioClip(urlClick);
		success=Applet.newAudioClip(urlSuccess);
	}

        public Puzzle(){
		super("Puzzle");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		img1=new ImageIcon("pics/1.jpg", "img1");
		img2=new ImageIcon("pics/2.jpg", "img2");
		img3=new ImageIcon("pics/3.jpg", "img3");
		img4=new ImageIcon("pics/4.jpg", "img4");
		img5=new ImageIcon("pics/5.jpg", "img5");
		img6=new ImageIcon("pics/6.jpg", "img6");
		img7=new ImageIcon("pics/7.jpg", "img7");
		img8=new ImageIcon("pics/8.jpg", "img8");
		img9=new ImageIcon("pics/9.jpg", "img9");
		imgFull=new ImageIcon("pics/full.jpg");

                msg=new JLabel("Match the tiles as the image on the right.");
                msg.setFont(new Font("Helvetica", Font.PLAIN, 17));
		msg.setBounds(40, 10, 400, 20);
                add(msg);
                
		button1=new JButton(img2);
		button2=new JButton(img1);
		button3=new JButton(img3);
		button4=new JButton(img5);
		button5=new JButton(img4);
		button6=new JButton(img6);
		button7=new JButton(img8);
		button8=new JButton(img7);
		button9=new JButton(img9);
		button10=new JButton(imgFull);
	
		button1.setBounds(40, 40, 173, 164);
		button2.setBounds(218, 40, 173, 164);
		button3.setBounds(396, 40, 173, 164);
		button4.setBounds(40, 209, 173, 164);
		button5.setBounds(218, 209, 173, 164);
		button6.setBounds(396, 209, 173, 164);
		button7.setBounds(40, 378, 173, 164);
		button8.setBounds(218, 378, 173, 164);
		button9.setBounds(396, 378, 173, 164);
		button10.setBounds(632,40,218,207);
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button10);
		
		ButtonSensor bs=new ButtonSensor(this);
		
		button1.addActionListener(bs);
		button2.addActionListener(bs);
		button3.addActionListener(bs);
		button4.addActionListener(bs);
		button5.addActionListener(bs);
		button6.addActionListener(bs);
		button7.addActionListener(bs);
		button8.addActionListener(bs);
		button9.addActionListener(bs);
		
		swaps=new JLabel();
		swaps.setText("Swaps: ");
		swaps.setFont(new Font("Helvetica", Font.PLAIN, 20));
		swaps.setBounds(40,570,80,20);
		swapsField=new JTextField();
		swapsField.setBounds(110,570,30,20);
                swapsField.setBackground(new Color(174, 214, 241));
                swapsField.setFont(new Font("Helvetica", Font.PLAIN, 20));
                swapsField.setEditable(false);
		
		highScoreLabel=new JLabel("Highest score: ");
		highScoreLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
		highScoreLabel.setBounds(600,570,180,20);
		highScoreField=new JTextField();
		highScoreField.setBounds(780,570,30,20);
		highScoreField.setEditable(false);
		highScoreField.setFont(new Font("Helvetica", Font.PLAIN, 20));
		
		add(swaps);
		add(swapsField);
		add(highScoreLabel);
		add(highScoreField);
		              
		getContentPane().setBackground(new Color(174, 214, 241));
		setSize(900,700);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}		
}