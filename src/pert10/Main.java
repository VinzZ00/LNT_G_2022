package pert10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout.Constraints;
import javax.swing.SwingConstants;

public class Main {

	/**
	 * Part 1 :
1. Container (Panel, frame)
2. Components (button, label, textfield, text area).
3. action listener
4. Layout (default para container).
5. Joption pane(ini Pop up messsage).

Part 2 :
1. Layout manager (Flow layout, border layout, grid 
layout, null layout, gridbag layout ).
layout dari para container, itu bisa di ganti (set).
2. action listener, Mouse listener, Keyboard listener.

	 */
	 
	public Main() {
		// TODO Auto-generated constructor stub
//		GUIpart2_1(); //Border Layout
//		GUIpart2_2(); //Grid Layout
//		GUIpart2_3(); //Null Layout
		GUIpart2_4(); //Listeners
		
	}
	
	public void GUIpart2_4() {
		JFrame f = new JFrame();
		
		f.setEnabled(true);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setTitle("Listener Frame");
		f.setLocationRelativeTo(null);
		f.setLayout(new BorderLayout(10, 10));
		
		
		
		JButton[] bs = new JButton[5];
		Color[] cs = {Color.red, Color.green, Color.blue, Color.yellow, Color.cyan};
		String constraint[] = {"North", "East", "South", "West", "Center"}; 
		
		for (int i = 0; i < bs.length; i++) {
			JButton butt = new JButton(constraint[i]);
			butt.setBackground(cs[i]);
			
			
			
			final Color oldCol = butt.getBackground(), newCol = oldCol.darker();
			

			
			butt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				}
			});
			
			butt.addActionListener((e) -> {
				System.out.println("Button " + butt.getLabel() + " Has been clicked");
			});
			
			butt.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					butt.setBackground(oldCol);
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					butt.setBackground(newCol);
				}
				
				int clickcount = 0;
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					++clickcount;
					System.out.println("Clicked for " + clickcount);
					if (clickcount % 2 != 0) {
						butt.setBackground(oldCol.darker());
					} else {
						butt.setBackground(oldCol);
					}
				}
			});
			
			bs[i] = butt;
		}
		
		JTextField field = new JTextField();
		
		field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent ke) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent ke) {
				// TODO Auto-generated method stub
				if (ke.getKeyCode() == ke.VK_ENTER) {
					System.out.println("Key you pressed " + ke.getKeyText(ke.getKeyCode()));
					System.out.println("you have typed : " + field.getText() );
				}
				
				System.out.println("Key you pressed outside if " + ke.getKeyText(ke.getKeyCode()));
				
			}
		});
		
		
		f.add(bs[0], BorderLayout.NORTH);
		f.add(bs[1], BorderLayout.EAST);
		f.add(field, BorderLayout.SOUTH);
		f.add(bs[3], BorderLayout.WEST);
		f.add(bs[4], BorderLayout.CENTER);
		
		
		
		
	}
	
	public void GUIpart2_3() {
		JFrame f = new JFrame();
		
		f.setEnabled(true);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(true);
		f.setTitle("Null layout Frame");
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		
		b1.setBounds(0, 0, 150, 30);
//		
		b2.setBounds(150, 30, 150, 30);
		
		f.add(b1);
		f.add(b2);
		
	}
	
	public void GUIpart2_2() {
		JFrame f = new JFrame();
		
		f.setEnabled(true);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setTitle("Grid layout Frame");
		f.setLocationRelativeTo(null);
		f.setLayout(new GridLayout(3,2,10,10));
		
		JLabel[] ls = new JLabel[5];
		
		Color[] cs = {Color.red, Color.green, Color.blue, Color.yellow, Color.cyan};
		JPanel[] ps = new JPanel[5];
		
		for (int i = 0; i < 5; i++) {
			ps[i] = new JPanel(new BorderLayout());
			ls[i] = new JLabel(String.format("label ke %d", i), SwingConstants.CENTER);
			ps[i].setBackground(cs[i]);
			ps[i].add(ls[i]);
		}
		
		for (JPanel jPanel : ps) {
			f.add(jPanel);
		}
		
		
	}
	
	public void GUIpart2_1() {
		JFrame f = new JFrame();
		
		f.setEnabled(true);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setTitle("Border layout Frame");
		f.setLocationRelativeTo(null);
		f.setLayout(new BorderLayout(10, 10));
		
		
		
		JButton[] bs = new JButton[5];
		String constraint[] = {"North", "East", "South", "West", "Center"}; 
		
		for (int i = 0; i < bs.length; i++) {
			bs[i] = new JButton(constraint[i]);
		}
		
		f.add(bs[0], BorderLayout.NORTH);
		f.add(bs[1], BorderLayout.EAST);
		f.add(bs[2], BorderLayout.WEST);
		f.add(bs[3], BorderLayout.SOUTH);
		f.add(bs[4], BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
