package pert9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main {
	JFrame f = new JFrame("MY First Application");
	
	public Main() {
		// TODO Auto-generated constructor stub
	
		f.setEnabled(true);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
//		f.setResizable(false);
		f.setSize(400,400);
		f.setLayout(new BorderLayout(0,20));
		f.getContentPane().setBackground(Color.CYAN);
		
		JLabel HelloWorld = new JLabel("Submit Data", SwingConstants.CENTER);
		HelloWorld.setFont(new Font(Font.DIALOG_INPUT, Font.ITALIC, 30));
		
		JPanel form = new JPanel(new GridLayout(3, 2, 0, 20));

		JLabel nama = new JLabel("Name : "), umur =  new JLabel("Umur : ");
		JLabel email = new JLabel("Email : ");
		
		JTextField namaf = new JTextField(), umurf = new JTextField(), emailf = new JTextField();
		
		form.add(nama);
		form.add(namaf);
		form.add(umur);
		form.add(umurf);
		form.add(email);
		form.add(emailf);
		
		form.setBackground(Color.GREEN.brighter());
		
		JButton submit = new JButton("Submit");
		
		submit.addActionListener((Event) -> {
			int umurVal = 0;
			boolean valid = true;
			try {
				umurVal = Integer.valueOf(umurf.getText());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(Main.this.f, "Please input a number, dont input anything else");
				valid = false;
			}
			if (valid) JOptionPane.showMessageDialog(Main.this.f, ("Your age is " + umurVal), "Age", JOptionPane.INFORMATION_MESSAGE);
		});
		
		JPanel south = new JPanel();
		south.add(submit);
		south.setBackground(Color.BLUE);
		
		f.add(HelloWorld, BorderLayout.NORTH);
		f.add(form, BorderLayout.CENTER);
		f.add(south, BorderLayout.SOUTH);
//		JButton b1 = new JButton("South");
//		JButton b2 = new JButton("North");
//		JButton b3 = new JButton("East");
//		JButton b4 = new JButton("West");
//		JButton b5 = new JButton("Center");
//		b5.setPreferredSize(new Dimension(150,50));
		
//		JPanel p = new JPanel(); // Default layoutnya  flowlayout.
		
//		p.add(b5);
		
		
//		f.add(b1);
//		f.add(b2);
//		f.add(b3, BorderLayout.EAST);
//		f.add(b4, BorderLayout.WEST);
//		f.add(b5, BorderLayout.CENTER);
		
	
//		layout library awt
//		Flowlayout, borderlayout, gridlayout, gridbaglayout, cardlayout, boxlayout dll
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
