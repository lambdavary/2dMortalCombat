
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Hard Combat");
		Panel panel = new Panel();
		
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				int key = e.getKeyCode();
				
				if(key==KeyEvent.VK_X) {
					panel.label2.setVisible(false);
					panel.label.setVisible(true);
					panel.repaint();
				}
				
				if(key==KeyEvent.VK_UP) {
					panel.setY(panel.getY()+50);
					panel.repaint();
					
				}
				
				if(key==KeyEvent.VK_DOWN) {
					panel.setY(panel.getY()-20);
					panel.repaint();
					
				if(key==KeyEvent.VK_Z) {
					panel.label4.setVisible(false);
					panel.label.setVisible(true);
					panel.repaint();
				}
					
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {

				int key = e.getKeyCode();
						
				if(key==KeyEvent.VK_RIGHT) {
					panel.setX(panel.getX()+20);
					panel.repaint();
					
				}
				
				if(key==KeyEvent.VK_LEFT) {
					panel.setX(panel.getX()-20);
					panel.repaint();
					
				}
				
				if(key==KeyEvent.VK_UP) {
					panel.setY(panel.getY()-50);
					panel.repaint();
					
				}
				
				if(key==KeyEvent.VK_DOWN) {
					panel.setY(panel.getY()+20);
					panel.repaint();
					
				}
				
				if(key==KeyEvent.VK_X) {
					panel.label2.setVisible(true);
					panel.label.setVisible(false);
					panel.repaint();
				}
				
				
				if(key==KeyEvent.VK_Z) {
					panel.label4.setVisible(true);
					panel.label.setVisible(false);
					panel.repaint();
				}
				
				if(key==KeyEvent.VK_C) {
					panel.label3.setVisible(false);
					panel.label5.setVisible(true);
					panel.repaint();
					String asd = "/home/lambdavary/Downloads/K.O Sound effect.mp3";
					JFrame frame = new JFrame("Finish");
					frame.setVisible(true);
					frame.setSize(600, 400);
					JLabel label = new JLabel("You Won!");
					frame.add(label);
					
				}
				
				
				
				
				
			}
		});
		
		/*
		final int imageHeight = 150;
		final int imageWidth = 250;
		
		
		JLabel label = new JLabel(new ImageIcon("/home/lambdavary/Desktop/images/hum/curtscrew/l/4.png"));
		label.setBounds(imageWidth, imageHeight, imageWidth, imageHeight);
		label.setLocation(x, y);
		frame.add(label);
		*/
		
		
		
			
		
		
		

	}

}