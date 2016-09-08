package tw.org.iii.java2.allan;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Sample extends JFrame {

	private JMenuBar jmb;
	private JMenu[] jm=new JMenu[3];
	private JMenuItem[] jmi=new JMenuItem[6];
	
	
	
	public static void main(String[] args) {
		Sample sm= new Sample();
	}
	public Sample() {
		//設定標題
		super("範例");
		//建立元件
		jmb = new JMenuBar();
		
		jm[0]=new JMenu("檔案");
		jm[1]=new JMenu("設定");
		jm[2]=new JMenu("圖形");
		
		jmi[0]=new JMenuItem("開啟舊檔");
		jmi[1]=new JMenuItem("儲存檔案");
		jmi[2]=new JRadioButtonMenuItem("四角形");
		jmi[3]=new JRadioButtonMenuItem("橢圓形");
		jmi[4]=new JRadioButtonMenuItem("三角形");
		jmi[5]=new JMenuItem("選擇顏色");
		
		
		//新增到容器中
		jm[0].add(jmi[0]);
		jm[0].add(jmi[1]);
		
		jm[2].add(jmi[2]);
		jm[2].add(jmi[3]);
		jm[2].add(jmi[4]);
		
		jm[1].add(jm[2]);
		jm[1].add(jmi[5]);
		
		jmb.add(jm[0]);
		jmb.add(jm[1]);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jmi[2]);
		bg.add(jmi[3]);
		bg.add(jmi[4]);
		
		add(jmb,BorderLayout.NORTH);
		
		//新增傾聽者
		for(int i = 0;i<jmi.length;i++){
			jmi[i].addActionListener(new SampleActionListener());
		}
		addWindowListener((WindowListener) new SampleActionListener());
		//進行初始化
		
		//設定框架
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//傾聽者類別
	class SampleActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}

}
