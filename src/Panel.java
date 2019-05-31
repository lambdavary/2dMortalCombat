

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	JLabel label;
	int x=230;
	int y=10;
	
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	Panel(){
		setLayout(null);
		
		
		label = new JLabel(new ImageIcon("/home/lambdavary/Desktop/images/hum/stand/l/1.png"));
		label.setBounds(150, 250, 150, 250);
		label.setLocation(getX(),getY());
		add(label);
		
		label2 = new JLabel(new ImageIcon("/home/lambdavary/Desktop/images/hum/gutling/l/1.png"));
		label2.setVisible(false);
		label2.setBounds(150, 250, 150, 250);
		label2.setLocation(getX(),getY());
		add(label2);
		
		label3 = new JLabel(new ImageIcon("/home/lambdavary/Desktop/images/com/stand/r/2.png"));
		label3.setBounds(0, 0, 200, 200);
		label3.setLocation(0,0);
		add(label3);
		
		label4 = new JLabel(new ImageIcon("/home/lambdavary/Desktop/images/hum/curtscrew/l/4.png"));
		label4.setVisible(false);
		label4.setBounds(150, 250, 150, 250);
		label4.setLocation(getX(),getY());
		add(label4);
		
		label5 = new JLabel(new ImageIcon("/home/lambdavary/Desktop/images/com/ko/r/7.png"));
		label5.setVisible(false);
		label5.setBounds(0, 0, 200, 200);
		label5.setLocation(0,0);
		add(label5);
		
	}
	

}
