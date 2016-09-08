package tw.org.iii.java2.allan;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	
	private JButton go;
	private JLabel[] lanes;
	private int rank;
	
	public Racing(){
		super("Racing Game");
		setLayout(new GridLayout(9, 1));
	
		go = new JButton("Go!"); add(go);
		lanes = new JLabel[8];
		for (int i=0; i<lanes.length; i++){
			lanes[i] = new JLabel((i+1) + ". ");
			add(lanes[i]);
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		setSize(1024, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go(){
		rank = 0;
		Car[] cars = new Car[8];
		for (int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for (int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}
	
	private class Car extends Thread {
		private int num;
		Car(int num){this.num = num;}
		@Override
		public void run() {
			for (int i=0; i<100; i++){
				lanes[num].setText(lanes[num].getText()+">");
				if (i==99){
					lanes[num].setText(lanes[num].getText()+ ++rank);
				}
				try {
					Thread.sleep((int)(Math.random()*200));
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
