import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class calce extends JFrame implements ActionListener{
		JTextField tf;
		JButton  
b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
		Double num1,num2,res;
		String op;
		
	calce(){
	 	
		setVisible(true);
		setSize(300,400);
		setTitle("Calculator");
		

		BorderLayout br = new BorderLayout();

		
		Panel p1 = new Panel();
		p1.setBackground(Color.LIGHT_GRAY);
		

		Panel p2 = new Panel();
		p2.setBackground(Color.LIGHT_GRAY);


		Panel p3 = new Panel();
		p3.setBackground(Color.LIGHT_GRAY);


						


		tf = new JTextField(20);
		p1.add(tf);
		
		add(p1,br.NORTH);
		add(p2,br.CENTER);
		add(p3,br.EAST);
		
		 b1 = new JButton("7");
		 b2 = new JButton("8");
		 b3 = new JButton("9");
		 b4 = new JButton("4");
		 b5 = new JButton("5");
		 b6 = new JButton("6");
		 b7 = new JButton("1");
		 b8 = new JButton("2");
		 b9 = new JButton("3");
		 b10 = new JButton(".");
		 b11 = new JButton("0");
		 b12 = new JButton("=");
		 b13 = new JButton("CE");
		 b14 = new JButton("+");
		 b15 = new JButton("-");
		 b16 = new JButton("*");
		 b17 = new JButton("/");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b12);
		p3.add(b13);
		p3.add(b14);
		p3.add(b15);
		p3.add(b16);
		p3.add(b17);
		

		GridLayout gr1 = new GridLayout(4,3,1,1);
		p2.setLayout(gr1);

		GridLayout gr2 = new GridLayout(5,1,2,2);
		p3.setLayout(gr2);


		MenuBar mb = new MenuBar();
		setMenuBar(mb);

		Menu m1 = new Menu("View");
		mb.add(m1);	

		MenuItem mi1 = new MenuItem("Standard");
		m1.add(mi1);
		MenuItem mi2 = new MenuItem("Scientific");
		m1.add(mi2);
		MenuItem mi3 = new MenuItem("Programer");
		m1.add(mi3);


		Menu m2 = new Menu("Edit");
		mb.add(m2);

		MenuItem mi4 = new MenuItem("Undo");
		m2.add(mi4);	
		MenuItem mi5 = new MenuItem("Cut");
		m2.add(mi5);
		MenuItem mi6 = new MenuItem("Paste");
		m2.add(mi6);
	}


	public void actionPerformed(ActionEvent e){
		//System.out.println(e.getActionCOmmand());
		//System.out.println(b1);
		//tf.setText(tf.getText()+e.getActionCommand());

		if(e.getSource().equals(b1)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b2)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b3)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b4)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b5)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b6)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b7)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b8)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b9)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b11)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b10)){
			tf.setText(tf.getText()+e.getActionCommand());
		}
		if(e.getSource().equals(b13)){
			String s = tf.getText();
			num1 = Double.parseDouble(s);
			op = e.getActionCommand();
			tf.setText("");
		}
		if(e.getSource().equals(b14)){
			String s = tf.getText();
			num1 = Double.parseDouble(s);
			op = e.getActionCommand();
			tf.setText("");
		}
		if(e.getSource().equals(b15)){
			String s = tf.getText();
			num1 = Double.parseDouble(s);
			op = e.getActionCommand();
			tf.setText("");
		}
		if(e.getSource().equals(b16)){
			String s = tf.getText();
			num1 = Double.parseDouble(s);
			op = e.getActionCommand();
			tf.setText("");
		}
		if(e.getSource().equals(b17)){
			String s = tf.getText();
			num1 = Double.parseDouble(s);
			op = e.getActionCommand();
			tf.setText("");
		}
		if(e.getSource().equals(b12)){
			String s = tf.getText();
			num2 = Double.parseDouble(s);

			if(op.equals("+")){
				res = num1+num2;
			}
			if(op.equals("-")){
				res = num1-num2;
			}
			if(op.equals("*")){
				res = num1*num2;
			}
			if(op.equals("/")){
				res = num1/num2;
			}
			if(op.equals("")){
				res = num1=num2;
			}
			tf.setText(res+"");
		}	
			
		
	}
}
class createcalce{
	public static void main(String arg []){
		calce c = new calce();
	}
}
