import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListModel;

public class Lottery extends JFrame {
	private JPanel contentPane;
	TreeSet <Integer> rndTreeSet= new TreeSet<Integer>();   //電腦選號陣列
	TreeSet <Integer> seleTreeSet= new TreeSet<Integer>();  //自選號陣列
	String strnums;  //購買獎號組
	String strbingos;  //開獎獎號組
	private JTextField txtF_1;
	private JTextField txtF_2;
	private JTextField txtF_3;
	private JTextField txtF_4;
	private JTextField txtF_5;
	private JTextField txtF_6;
	private JList<String> list;
	DefaultListModel<String> model=new DefaultListModel<>();
	int index;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lottery frame = new Lottery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	

	public void deleteallnums() {    //清除所有號碼以及數字按鍵顏色回覆
		txtF_1.setText(null);
		txtF_2.setText(null);
		txtF_3.setText(null);
		txtF_4.setText(null);
		txtF_5.setText(null);
		txtF_6.setText(null);
	}
	
	public void fillnum() {          //填值
		deleteallnums();
		try {
			Iterator<Integer> seleIt=seleTreeSet.iterator();
			while(seleIt.hasNext()) {
				for(int i = 1; i<=6; i++) {
					if(i ==1) {
						txtF_1.setText(seleIt.next().toString());												
					}
					if(i ==2) {
						txtF_2.setText(seleIt.next().toString());							
					}
					if(i ==3) {
						txtF_3.setText(seleIt.next().toString());							
					}
					if(i ==4) {
						txtF_4.setText(seleIt.next().toString());							
					}
					if(i ==5) {
						txtF_5.setText(seleIt.next().toString());							
					}
					if(i ==6) {
						txtF_6.setText(seleIt.next().toString());							
					}
				}
			}
		}
		catch(NoSuchElementException e){
			e.printStackTrace();
		}
	}
	
	

	/**
	 * Create the frame.
	 */
	public Lottery() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5927\u6A02\u900F\u5C0D\u734E\u7CFB\u7D71");
		label.setBounds(0, 21, 665, 33);
		label.setForeground(new Color(165, 42, 42));
		label.setFont(new Font("微軟正黑體", Font.BOLD, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 64, 602, 245);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn_01 = new JButton("01");			
		btn_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				if(seleTreeSet.contains(1)) {
					seleTreeSet.remove(1);
					btn_01.setBackground(new Color(105, 105, 105));
					btn_01.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(1);
						btn_01.setBackground(new Color(255, 215, 0));
						btn_01.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_01.setBackground(new Color(105, 105, 105));
		btn_01.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_01.setForeground(new Color(255, 255, 255));
		btn_01.setBounds(10, 10, 75, 23);
		panel.add(btn_01);
		
		
		JButton btn_02 = new JButton("02");
		btn_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				if(seleTreeSet.contains(2)) {
					seleTreeSet.remove(2);
					btn_02.setBackground(new Color(105, 105, 105));
					btn_02.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(2);
						btn_02.setBackground(new Color(255, 215, 0));
						btn_02.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_02.setBackground(new Color(105, 105, 105));
		btn_02.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_02.setForeground(new Color(255, 255, 255));
		btn_02.setBounds(95, 10, 75, 23);
		panel.add(btn_02);
		
		JButton btn_03 = new JButton("03");		
		btn_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(3)) {
					seleTreeSet.remove(3);
					btn_03.setBackground(new Color(105, 105, 105));
					btn_03.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(3);
						btn_03.setBackground(new Color(255, 215, 0));
						btn_03.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_03.setBackground(new Color(105, 105, 105));
		btn_03.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_03.setForeground(new Color(255, 255, 255));
		btn_03.setBounds(180, 10, 75, 23);
		panel.add(btn_03);
		
		JButton btn_04 = new JButton("04");
		btn_04.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(4)) {
					seleTreeSet.remove(4);
					btn_04.setBackground(new Color(105, 105, 105));
					btn_04.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(4);
						btn_04.setBackground(new Color(255, 215, 0));
						btn_04.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_04.setBackground(new Color(105, 105, 105));
		btn_04.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_04.setForeground(new Color(255, 255, 255));
		btn_04.setBounds(265, 10, 75, 23);
		panel.add(btn_04);
		
		JButton btn_05 = new JButton("05");
		btn_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(seleTreeSet.contains(5)) {
					seleTreeSet.remove(5);
					btn_05.setBackground(new Color(105, 105, 105));
					btn_05.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(5);
						btn_05.setBackground(new Color(255, 215, 0));
						btn_05.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_05.setBackground(new Color(105, 105, 105));
		btn_05.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_05.setForeground(new Color(255, 255, 255));
		btn_05.setBounds(349, 10, 75, 23);
		panel.add(btn_05);
		
		JButton btn_06 = new JButton("06");
		btn_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(6)) {
					seleTreeSet.remove(6);
					btn_06.setBackground(new Color(105, 105, 105));
					btn_06.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(6);
						btn_06.setBackground(new Color(255, 215, 0));
						btn_06.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_06.setBackground(new Color(105, 105, 105));
		btn_06.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_06.setForeground(new Color(255, 255, 255));
		btn_06.setBounds(431, 10, 75, 23);
		panel.add(btn_06);
		
		JButton btn_07 = new JButton("07");
		btn_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(7)) {
					seleTreeSet.remove(7);
					btn_07.setBackground(new Color(105, 105, 105));
					btn_07.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(7);
						btn_07.setBackground(new Color(255, 215, 0));
						btn_07.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_07.setBackground(new Color(105, 105, 105));
		btn_07.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_07.setForeground(new Color(255, 255, 255));
		btn_07.setBounds(516, 10, 75, 23);
		panel.add(btn_07);
		
		JButton btn_08 = new JButton("08");
		btn_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(8)) {
					seleTreeSet.remove(8);
					btn_08.setBackground(new Color(105, 105, 105));
					btn_08.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(8);
						btn_08.setBackground(new Color(255, 215, 0));
						btn_08.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_08.setBackground(new Color(105, 105, 105));
		btn_08.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_08.setForeground(new Color(255, 255, 255));
		btn_08.setBounds(10, 43, 75, 23);
		panel.add(btn_08);
		
		JButton btn_09 = new JButton("09");
		btn_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(9)) {
					seleTreeSet.remove(9);
					btn_09.setBackground(new Color(105, 105, 105));
					btn_09.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(9);
						btn_09.setBackground(new Color(255, 215, 0));
						btn_09.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_09.setBackground(new Color(105, 105, 105));
		btn_09.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_09.setForeground(new Color(255, 255, 255));
		btn_09.setBounds(95, 43, 75, 23);
		panel.add(btn_09);
		
		JButton btn_10 = new JButton("10");
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(10)) {
					seleTreeSet.remove(10);
					btn_10.setBackground(new Color(105, 105, 105));
					btn_10.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(10);
						btn_10.setBackground(new Color(255, 215, 0));
						btn_10.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_10.setBackground(new Color(105, 105, 105));
		btn_10.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_10.setForeground(new Color(255, 255, 255));
		btn_10.setBounds(180, 43, 75, 23);
		panel.add(btn_10);
		
		JButton btn_11 = new JButton("11");
		btn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(11)) {
					seleTreeSet.remove(11);
					btn_11.setBackground(new Color(105, 105, 105));
					btn_11.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(11);
						btn_11.setBackground(new Color(255, 215, 0));
						btn_11.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_11.setBackground(new Color(105, 105, 105));
		btn_11.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_11.setForeground(new Color(255, 255, 255));
		btn_11.setBounds(265, 43, 75, 23);
		panel.add(btn_11);
		
		JButton btn_12 = new JButton("12");
		btn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(12)) {
					seleTreeSet.remove(12);
					btn_12.setBackground(new Color(105, 105, 105));
					btn_12.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(12);
						btn_12.setBackground(new Color(255, 215, 0));
						btn_12.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_12.setBackground(new Color(105, 105, 105));
		btn_12.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_12.setForeground(new Color(255, 255, 255));
		btn_12.setBounds(349, 43, 75, 23);
		panel.add(btn_12);
		
		JButton btn_13 = new JButton("13");
		btn_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(13)) {
					seleTreeSet.remove(13);
					btn_13.setBackground(new Color(105, 105, 105));
					btn_13.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(13);
						btn_13.setBackground(new Color(255, 215, 0));
						btn_13.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_13.setBackground(new Color(105, 105, 105));
		btn_13.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_13.setForeground(new Color(255, 255, 255));
		btn_13.setBounds(431, 43, 75, 23);
		panel.add(btn_13);
		
		JButton btn_14 = new JButton("14");
		btn_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(14)) {
					seleTreeSet.remove(14);
					btn_14.setBackground(new Color(105, 105, 105));
					btn_14.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(14);
						btn_14.setBackground(new Color(255, 215, 0));
						btn_14.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_14.setBackground(new Color(105, 105, 105));
		btn_14.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_14.setForeground(new Color(255, 255, 255));
		btn_14.setBounds(516, 43, 75, 23);
		panel.add(btn_14);
		
		JButton btn_15 = new JButton("15");
		btn_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(15)) {
					seleTreeSet.remove(15);
					btn_15.setBackground(new Color(105, 105, 105));
					btn_15.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(15);
						btn_15.setBackground(new Color(255, 215, 0));
						btn_15.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_15.setBackground(new Color(105, 105, 105));
		btn_15.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_15.setForeground(new Color(255, 255, 255));
		btn_15.setBounds(10, 76, 75, 23);
		panel.add(btn_15);
		
		JButton btn_16 = new JButton("16");
		btn_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(16)) {
					seleTreeSet.remove(16);
					btn_16.setBackground(new Color(105, 105, 105));
					btn_16.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(16);
						btn_16.setBackground(new Color(255, 215, 0));
						btn_16.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_16.setBackground(new Color(105, 105, 105));
		btn_16.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_16.setForeground(new Color(255, 255, 255));
		btn_16.setBounds(95, 76, 75, 23);
		panel.add(btn_16);
		
		JButton btn_17 = new JButton("17");
		btn_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(17)) {
					seleTreeSet.remove(17);
					btn_17.setBackground(new Color(105, 105, 105));
					btn_17.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(17);
						btn_17.setBackground(new Color(255, 215, 0));
						btn_17.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_17.setBackground(new Color(105, 105, 105));
		btn_17.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_17.setForeground(new Color(255, 255, 255));
		btn_17.setBounds(180, 76, 75, 23);
		panel.add(btn_17);
		
		JButton btn_18 = new JButton("18");
		btn_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(18)) {
					seleTreeSet.remove(18);
					btn_18.setBackground(new Color(105, 105, 105));
					btn_18.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(18);
						btn_18.setBackground(new Color(255, 215, 0));
						btn_18.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_18.setBackground(new Color(105, 105, 105));
		btn_18.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_18.setForeground(new Color(255, 255, 255));
		btn_18.setBounds(265, 76, 75, 23);
		panel.add(btn_18);
		
		JButton btn_19 = new JButton("19");
		btn_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(19)) {
					seleTreeSet.remove(19);
					btn_19.setBackground(new Color(105, 105, 105));
					btn_19.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(19);
						btn_19.setBackground(new Color(255, 215, 0));
						btn_19.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_19.setBackground(new Color(105, 105, 105));
		btn_19.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_19.setForeground(new Color(255, 255, 255));
		btn_19.setBounds(349, 76, 75, 23);
		panel.add(btn_19);
		
		JButton btn_20 = new JButton("20");
		btn_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(20)) {
					seleTreeSet.remove(20);
					btn_20.setBackground(new Color(105, 105, 105));
					btn_20.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(20);
						btn_20.setBackground(new Color(255, 215, 0));
						btn_20.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_20.setBackground(new Color(105, 105, 105));
		btn_20.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_20.setForeground(new Color(255, 255, 255));
		btn_20.setBounds(431, 76, 75, 23);
		panel.add(btn_20);
		
		JButton btn_21 = new JButton("21");
		btn_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(21)) {
					seleTreeSet.remove(21);
					btn_21.setBackground(new Color(105, 105, 105));
					btn_21.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(21);
						btn_21.setBackground(new Color(255, 215, 0));
						btn_21.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_21.setBackground(new Color(105, 105, 105));
		btn_21.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_21.setForeground(new Color(255, 255, 255));
		btn_21.setBounds(516, 76, 75, 23);
		panel.add(btn_21);
		
		JButton btn_22 = new JButton("22");
		btn_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(22)) {
					seleTreeSet.remove(22);
					btn_22.setBackground(new Color(105, 105, 105));
					btn_22.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(22);
						btn_22.setBackground(new Color(255, 215, 0));
						btn_22.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_22.setBackground(new Color(105, 105, 105));
		btn_22.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_22.setForeground(new Color(255, 255, 255));
		btn_22.setBounds(10, 109, 75, 23);
		panel.add(btn_22);
		
		JButton btn_23 = new JButton("23");
		btn_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(23)) {
					seleTreeSet.remove(23);
					btn_23.setBackground(new Color(105, 105, 105));
					btn_23.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(23);
						btn_23.setBackground(new Color(255, 215, 0));
						btn_23.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_23.setBackground(new Color(105, 105, 105));
		btn_23.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_23.setForeground(new Color(255, 255, 255));
		btn_23.setBounds(95, 109, 75, 23);
		panel.add(btn_23);
		
		JButton btn_24 = new JButton("24");
		btn_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(24)) {
					seleTreeSet.remove(24);
					btn_24.setBackground(new Color(105, 105, 105));
					btn_24.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(24);
						btn_24.setBackground(new Color(255, 215, 0));
						btn_24.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_24.setBackground(new Color(105, 105, 105));
		btn_24.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_24.setForeground(new Color(255, 255, 255));
		btn_24.setBounds(180, 109, 75, 23);
		panel.add(btn_24);
		
		JButton btn_25 = new JButton("25");
		btn_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(25)) {
					seleTreeSet.remove(25);
					btn_25.setBackground(new Color(105, 105, 105));
					btn_25.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(25);
						btn_25.setBackground(new Color(255, 215, 0));
						btn_25.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_25.setBackground(new Color(105, 105, 105));
		btn_25.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_25.setForeground(new Color(255, 255, 255));
		btn_25.setBounds(265, 109, 75, 23);
		panel.add(btn_25);
		
		JButton btn_26 = new JButton("26");
		btn_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(26)) {
					seleTreeSet.remove(26);
					btn_26.setBackground(new Color(105, 105, 105));
					btn_26.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(26);
						btn_26.setBackground(new Color(255, 215, 0));
						btn_26.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_26.setBackground(new Color(105, 105, 105));
		btn_26.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_26.setForeground(new Color(255, 255, 255));
		btn_26.setBounds(349, 109, 75, 23);
		panel.add(btn_26);
		
		JButton btn_27 = new JButton("27");
		btn_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(27)) {
					seleTreeSet.remove(27);
					btn_27.setBackground(new Color(105, 105, 105));
					btn_27.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(27);
						btn_27.setBackground(new Color(255, 215, 0));
						btn_27.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_27.setBackground(new Color(105, 105, 105));
		btn_27.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_27.setForeground(new Color(255, 255, 255));
		btn_27.setBounds(431, 109, 75, 23);
		panel.add(btn_27);
		
		JButton btn_28 = new JButton("28");
		btn_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(28)) {
					seleTreeSet.remove(28);
					btn_28.setBackground(new Color(105, 105, 105));
					btn_28.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(28);
						btn_28.setBackground(new Color(255, 215, 0));
						btn_28.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_28.setBackground(new Color(105, 105, 105));
		btn_28.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_28.setForeground(new Color(255, 255, 255));
		btn_28.setBounds(516, 109, 75, 23);
		panel.add(btn_28);
		
		JButton btn_29 = new JButton("29");
		btn_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(29)) {
					seleTreeSet.remove(29);
					btn_29.setBackground(new Color(105, 105, 105));
					btn_29.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(29);
						btn_29.setBackground(new Color(255, 215, 0));
						btn_29.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_29.setBackground(new Color(105, 105, 105));
		btn_29.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_29.setForeground(new Color(255, 255, 255));
		btn_29.setBounds(10, 142, 75, 23);
		panel.add(btn_29);
		
		JButton btn_30 = new JButton("30");
		btn_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(30)) {
					seleTreeSet.remove(30);
					btn_30.setBackground(new Color(105, 105, 105));
					btn_30.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(30);
						btn_30.setBackground(new Color(255, 215, 0));
						btn_30.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_30.setBackground(new Color(105, 105, 105));
		btn_30.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_30.setForeground(new Color(255, 255, 255));
		btn_30.setBounds(95, 142, 75, 23);
		panel.add(btn_30);
		
		JButton btn_31 = new JButton("31");
		btn_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(31)) {
					seleTreeSet.remove(31);
					btn_31.setBackground(new Color(105, 105, 105));
					btn_31.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(31);
						btn_31.setBackground(new Color(255, 215, 0));
						btn_31.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_31.setBackground(new Color(105, 105, 105));
		btn_31.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_31.setForeground(new Color(255, 255, 255));
		btn_31.setBounds(180, 142, 75, 23);
		panel.add(btn_31);
		
		JButton btn_32 = new JButton("32");
		btn_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(32)) {
					seleTreeSet.remove(32);
					btn_32.setBackground(new Color(105, 105, 105));
					btn_32.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(32);
						btn_32.setBackground(new Color(255, 215, 0));
						btn_32.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_32.setBackground(new Color(105, 105, 105));
		btn_32.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_32.setForeground(new Color(255, 255, 255));
		btn_32.setBounds(265, 142, 75, 23);
		panel.add(btn_32);
		
		JButton btn_33 = new JButton("33");
		btn_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(33)) {
					seleTreeSet.remove(33);
					btn_33.setBackground(new Color(105, 105, 105));
					btn_33.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(33);
						btn_33.setBackground(new Color(255, 215, 0));
						btn_33.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_33.setBackground(new Color(105, 105, 105));
		btn_33.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_33.setForeground(new Color(255, 255, 255));
		btn_33.setBounds(349, 142, 75, 23);
		panel.add(btn_33);
		
		JButton btn_34 = new JButton("34");
		btn_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(34)) {
					seleTreeSet.remove(34);
					btn_34.setBackground(new Color(105, 105, 105));
					btn_34.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(34);
						btn_34.setBackground(new Color(255, 215, 0));
						btn_34.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_34.setBackground(new Color(105, 105, 105));
		btn_34.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_34.setForeground(new Color(255, 255, 255));
		btn_34.setBounds(431, 142, 75, 23);
		panel.add(btn_34);
		
		JButton btn_35 = new JButton("35");
		btn_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(35)) {
					seleTreeSet.remove(35);
					btn_35.setBackground(new Color(105, 105, 105));
					btn_35.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(35);
						btn_35.setBackground(new Color(255, 215, 0));
						btn_35.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_35.setBackground(new Color(105, 105, 105));
		btn_35.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_35.setForeground(new Color(255, 255, 255));
		btn_35.setBounds(516, 142, 75, 23);
		panel.add(btn_35);
		
		JButton btn_36 = new JButton("36");
		btn_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(36)) {
					seleTreeSet.remove(36);
					btn_36.setBackground(new Color(105, 105, 105));
					btn_36.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(36);
						btn_36.setBackground(new Color(255, 215, 0));
						btn_36.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_36.setBackground(new Color(105, 105, 105));
		btn_36.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_36.setForeground(new Color(255, 255, 255));
		btn_36.setBounds(10, 175, 75, 23);
		panel.add(btn_36);
		
		JButton btn_37 = new JButton("37");
		btn_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(37)) {
					seleTreeSet.remove(37);
					btn_37.setBackground(new Color(105, 105, 105));
					btn_37.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(37);
						btn_37.setBackground(new Color(255, 215, 0));
						btn_37.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_37.setBackground(new Color(105, 105, 105));
		btn_37.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_37.setForeground(new Color(255, 255, 255));
		btn_37.setBounds(95, 175, 75, 23);
		panel.add(btn_37);
		
		JButton btn_38 = new JButton("38");
		btn_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(38)) {
					seleTreeSet.remove(38);
					btn_38.setBackground(new Color(105, 105, 105));
					btn_38.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(38);
						btn_38.setBackground(new Color(255, 215, 0));
						btn_38.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_38.setBackground(new Color(105, 105, 105));
		btn_38.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_38.setForeground(new Color(255, 255, 255));
		btn_38.setBounds(180, 175, 75, 23);
		panel.add(btn_38);
		
		JButton btn_39 = new JButton("39");
		btn_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(39)) {
					seleTreeSet.remove(39);
					btn_39.setBackground(new Color(105, 105, 105));
					btn_39.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(39);
						btn_39.setBackground(new Color(255, 215, 0));
						btn_39.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_39.setBackground(new Color(105, 105, 105));
		btn_39.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_39.setForeground(new Color(255, 255, 255));
		btn_39.setBounds(265, 175, 75, 23);
		panel.add(btn_39);
		
		JButton btn_40 = new JButton("40");
		btn_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(40)) {
					seleTreeSet.remove(40);
					btn_40.setBackground(new Color(105, 105, 105));
					btn_40.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(40);
						btn_40.setBackground(new Color(255, 215, 0));
						btn_40.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_40.setBackground(new Color(105, 105, 105));
		btn_40.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_40.setForeground(new Color(255, 255, 255));
		btn_40.setBounds(349, 175, 75, 23);
		panel.add(btn_40);
		
		JButton btn_41 = new JButton("41");
		btn_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(41)) {
					seleTreeSet.remove(41);
					btn_41.setBackground(new Color(105, 105, 105));
					btn_41.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(41);
						btn_41.setBackground(new Color(255, 215, 0));
						btn_41.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_41.setBackground(new Color(105, 105, 105));
		btn_41.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_41.setForeground(new Color(255, 255, 255));
		btn_41.setBounds(431, 175, 75, 23);
		panel.add(btn_41);
		
		JButton btn_42 = new JButton("42");
		btn_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(42)) {
					seleTreeSet.remove(42);
					btn_42.setBackground(new Color(105, 105, 105));
					btn_42.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(42);
						btn_42.setBackground(new Color(255, 215, 0));
						btn_42.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_42.setBackground(new Color(105, 105, 105));
		btn_42.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_42.setForeground(new Color(255, 255, 255));
		btn_42.setBounds(516, 175, 75, 23);
		panel.add(btn_42);
		
		JButton btn_43 = new JButton("43");
		btn_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(43)) {
					seleTreeSet.remove(43);
					btn_43.setBackground(new Color(105, 105, 105));
					btn_43.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(43);
						btn_43.setBackground(new Color(255, 215, 0));
						btn_43.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_43.setBackground(new Color(105, 105, 105));
		btn_43.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_43.setForeground(new Color(255, 255, 255));
		btn_43.setBounds(10, 208, 75, 23);
		panel.add(btn_43);
		
		JButton btn_44 = new JButton("44");
		btn_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(44)) {
					seleTreeSet.remove(44);
					btn_44.setBackground(new Color(105, 105, 105));
					btn_44.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(44);
						btn_44.setBackground(new Color(255, 215, 0));
						btn_44.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_44.setBackground(new Color(105, 105, 105));
		btn_44.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_44.setForeground(new Color(255, 255, 255));
		btn_44.setBounds(95, 208, 75, 23);
		panel.add(btn_44);
		
		JButton btn_45 = new JButton("45");
		btn_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(45)) {
					seleTreeSet.remove(45);
					btn_45.setBackground(new Color(105, 105, 105));
					btn_45.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(45);
						btn_45.setBackground(new Color(255, 215, 0));
						btn_45.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_45.setBackground(new Color(105, 105, 105));
		btn_45.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_45.setForeground(new Color(255, 255, 255));
		btn_45.setBounds(180, 208, 75, 23);
		panel.add(btn_45);
		
		JButton btn_46 = new JButton("46");
		btn_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(46)) {
					seleTreeSet.remove(46);
					btn_46.setBackground(new Color(105, 105, 105));
					btn_46.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(46);
						btn_46.setBackground(new Color(255, 215, 0));
						btn_46.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_46.setBackground(new Color(105, 105, 105));
		btn_46.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_46.setForeground(new Color(255, 255, 255));
		btn_46.setBounds(265, 208, 75, 23);
		panel.add(btn_46);
		
		JButton btn_47 = new JButton("47");
		btn_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(47)) {
					seleTreeSet.remove(47);
					btn_47.setBackground(new Color(105, 105, 105));
					btn_47.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(47);
						btn_47.setBackground(new Color(255, 215, 0));
						btn_47.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_47.setBackground(new Color(105, 105, 105));
		btn_47.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_47.setForeground(new Color(255, 255, 255));
		btn_47.setBounds(349, 208, 75, 23);
		panel.add(btn_47);
		
		JButton btn_48 = new JButton("48");
		btn_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(48)) {
					seleTreeSet.remove(48);
					btn_48.setBackground(new Color(105, 105, 105));
					btn_48.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(48);
						btn_48.setBackground(new Color(255, 215, 0));
						btn_48.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_48.setBackground(new Color(105, 105, 105));
		btn_48.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_48.setForeground(new Color(255, 255, 255));
		btn_48.setBounds(431, 208, 75, 23);
		panel.add(btn_48);
		
		JButton btn_49 = new JButton("49");
		btn_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(seleTreeSet.contains(49)) {
					seleTreeSet.remove(49);
					btn_49.setBackground(new Color(105, 105, 105));
					btn_49.setForeground(new Color(255, 255, 255));
					fillnum();
				}else {
					if(seleTreeSet.size()<=5) {
						seleTreeSet.add(49);
						btn_49.setBackground(new Color(255, 215, 0));
						btn_49.setForeground(new Color(0, 0, 128));
						fillnum();
					}else {
						JOptionPane.showMessageDialog(null, "您已選取六個號碼");
					}
				}
			}
		});
		btn_49.setBackground(new Color(105, 105, 105));
		btn_49.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btn_49.setForeground(new Color(255, 255, 255));
		btn_49.setBounds(516, 208, 75, 23);
		panel.add(btn_49);
		
		JButton btn_清除重選 = new JButton("\u6E05\u9664\u91CD\u9078");
		btn_清除重選.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rndTreeSet.clear();
				seleTreeSet.clear();
				deleteallnums();
				btn_01.setBackground(new Color(105, 105, 105));
				btn_01.setForeground(new Color(255, 255, 255));
				btn_02.setBackground(new Color(105, 105, 105));
				btn_02.setForeground(new Color(255, 255, 255));
				btn_03.setBackground(new Color(105, 105, 105));
				btn_03.setForeground(new Color(255, 255, 255));
				btn_04.setBackground(new Color(105, 105, 105));
				btn_04.setForeground(new Color(255, 255, 255));
				btn_05.setBackground(new Color(105, 105, 105));
				btn_05.setForeground(new Color(255, 255, 255));
				btn_06.setBackground(new Color(105, 105, 105));
				btn_06.setForeground(new Color(255, 255, 255));
				btn_07.setBackground(new Color(105, 105, 105));
				btn_07.setForeground(new Color(255, 255, 255));
				btn_08.setBackground(new Color(105, 105, 105));
				btn_08.setForeground(new Color(255, 255, 255));
				btn_09.setBackground(new Color(105, 105, 105));
				btn_09.setForeground(new Color(255, 255, 255));
				btn_10.setBackground(new Color(105, 105, 105));
				btn_10.setForeground(new Color(255, 255, 255));
				btn_11.setBackground(new Color(105, 105, 105));
				btn_11.setForeground(new Color(255, 255, 255));
				btn_12.setBackground(new Color(105, 105, 105));
				btn_12.setForeground(new Color(255, 255, 255));
				btn_13.setBackground(new Color(105, 105, 105));
				btn_13.setForeground(new Color(255, 255, 255));
				btn_14.setBackground(new Color(105, 105, 105));
				btn_14.setForeground(new Color(255, 255, 255));
				btn_15.setBackground(new Color(105, 105, 105));
				btn_15.setForeground(new Color(255, 255, 255));
				btn_16.setBackground(new Color(105, 105, 105));
				btn_16.setForeground(new Color(255, 255, 255));
				btn_17.setBackground(new Color(105, 105, 105));
				btn_17.setForeground(new Color(255, 255, 255));
				btn_18.setBackground(new Color(105, 105, 105));
				btn_18.setForeground(new Color(255, 255, 255));
				btn_19.setBackground(new Color(105, 105, 105));
				btn_19.setForeground(new Color(255, 255, 255));
				btn_20.setBackground(new Color(105, 105, 105));
				btn_20.setForeground(new Color(255, 255, 255));
				btn_21.setBackground(new Color(105, 105, 105));
				btn_21.setForeground(new Color(255, 255, 255));
				btn_22.setBackground(new Color(105, 105, 105));
				btn_22.setForeground(new Color(255, 255, 255));
				btn_23.setBackground(new Color(105, 105, 105));
				btn_23.setForeground(new Color(255, 255, 255));
				btn_24.setBackground(new Color(105, 105, 105));
				btn_24.setForeground(new Color(255, 255, 255));
				btn_25.setBackground(new Color(105, 105, 105));
				btn_25.setForeground(new Color(255, 255, 255));
				btn_26.setBackground(new Color(105, 105, 105));
				btn_26.setForeground(new Color(255, 255, 255));
				btn_27.setBackground(new Color(105, 105, 105));
				btn_27.setForeground(new Color(255, 255, 255));
				btn_28.setBackground(new Color(105, 105, 105));
				btn_28.setForeground(new Color(255, 255, 255));
				btn_29.setBackground(new Color(105, 105, 105));
				btn_29.setForeground(new Color(255, 255, 255));
				btn_30.setBackground(new Color(105, 105, 105));
				btn_30.setForeground(new Color(255, 255, 255));
				btn_31.setBackground(new Color(105, 105, 105));
				btn_31.setForeground(new Color(255, 255, 255));
				btn_32.setBackground(new Color(105, 105, 105));
				btn_32.setForeground(new Color(255, 255, 255));
				btn_33.setBackground(new Color(105, 105, 105));
				btn_33.setForeground(new Color(255, 255, 255));
				btn_34.setBackground(new Color(105, 105, 105));
				btn_34.setForeground(new Color(255, 255, 255));
				btn_35.setBackground(new Color(105, 105, 105));
				btn_35.setForeground(new Color(255, 255, 255));
				btn_36.setBackground(new Color(105, 105, 105));
				btn_36.setForeground(new Color(255, 255, 255));
				btn_37.setBackground(new Color(105, 105, 105));
				btn_37.setForeground(new Color(255, 255, 255));
				btn_38.setBackground(new Color(105, 105, 105));
				btn_38.setForeground(new Color(255, 255, 255));
				btn_39.setBackground(new Color(105, 105, 105));
				btn_39.setForeground(new Color(255, 255, 255));
				btn_40.setBackground(new Color(105, 105, 105));
				btn_40.setForeground(new Color(255, 255, 255));
				btn_41.setBackground(new Color(105, 105, 105));
				btn_41.setForeground(new Color(255, 255, 255));
				btn_42.setBackground(new Color(105, 105, 105));
				btn_42.setForeground(new Color(255, 255, 255));
				btn_43.setBackground(new Color(105, 105, 105));
				btn_43.setForeground(new Color(255, 255, 255));
				btn_44.setBackground(new Color(105, 105, 105));
				btn_44.setForeground(new Color(255, 255, 255));
				btn_45.setBackground(new Color(105, 105, 105));
				btn_45.setForeground(new Color(255, 255, 255));
				btn_46.setBackground(new Color(105, 105, 105));
				btn_46.setForeground(new Color(255, 255, 255));
				btn_47.setBackground(new Color(105, 105, 105));
				btn_47.setForeground(new Color(255, 255, 255));
				btn_48.setBackground(new Color(105, 105, 105));
				btn_48.setForeground(new Color(255, 255, 255));
				btn_49.setBackground(new Color(105, 105, 105));
				btn_49.setForeground(new Color(255, 255, 255));				
			}
		});
		btn_清除重選.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btn_清除重選.setBounds(47, 366, 95, 32);
		contentPane.add(btn_清除重選);
		
		JButton btn_電腦快選 = new JButton("\u96FB\u8166\u5FEB\u9078");
		btn_電腦快選.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn_01.setBackground(new Color(105, 105, 105));
				btn_01.setForeground(new Color(255, 255, 255));
				btn_02.setBackground(new Color(105, 105, 105));
				btn_02.setForeground(new Color(255, 255, 255));
				btn_03.setBackground(new Color(105, 105, 105));
				btn_03.setForeground(new Color(255, 255, 255));
				btn_04.setBackground(new Color(105, 105, 105));
				btn_04.setForeground(new Color(255, 255, 255));
				btn_05.setBackground(new Color(105, 105, 105));
				btn_05.setForeground(new Color(255, 255, 255));
				btn_06.setBackground(new Color(105, 105, 105));
				btn_06.setForeground(new Color(255, 255, 255));
				btn_07.setBackground(new Color(105, 105, 105));
				btn_07.setForeground(new Color(255, 255, 255));
				btn_08.setBackground(new Color(105, 105, 105));
				btn_08.setForeground(new Color(255, 255, 255));
				btn_09.setBackground(new Color(105, 105, 105));
				btn_09.setForeground(new Color(255, 255, 255));
				btn_10.setBackground(new Color(105, 105, 105));
				btn_10.setForeground(new Color(255, 255, 255));
				btn_11.setBackground(new Color(105, 105, 105));
				btn_11.setForeground(new Color(255, 255, 255));
				btn_12.setBackground(new Color(105, 105, 105));
				btn_12.setForeground(new Color(255, 255, 255));
				btn_13.setBackground(new Color(105, 105, 105));
				btn_13.setForeground(new Color(255, 255, 255));
				btn_14.setBackground(new Color(105, 105, 105));
				btn_14.setForeground(new Color(255, 255, 255));
				btn_15.setBackground(new Color(105, 105, 105));
				btn_15.setForeground(new Color(255, 255, 255));
				btn_16.setBackground(new Color(105, 105, 105));
				btn_16.setForeground(new Color(255, 255, 255));
				btn_17.setBackground(new Color(105, 105, 105));
				btn_17.setForeground(new Color(255, 255, 255));
				btn_18.setBackground(new Color(105, 105, 105));
				btn_18.setForeground(new Color(255, 255, 255));
				btn_19.setBackground(new Color(105, 105, 105));
				btn_19.setForeground(new Color(255, 255, 255));
				btn_20.setBackground(new Color(105, 105, 105));
				btn_20.setForeground(new Color(255, 255, 255));
				btn_21.setBackground(new Color(105, 105, 105));
				btn_21.setForeground(new Color(255, 255, 255));
				btn_22.setBackground(new Color(105, 105, 105));
				btn_22.setForeground(new Color(255, 255, 255));
				btn_23.setBackground(new Color(105, 105, 105));
				btn_23.setForeground(new Color(255, 255, 255));
				btn_24.setBackground(new Color(105, 105, 105));
				btn_24.setForeground(new Color(255, 255, 255));
				btn_25.setBackground(new Color(105, 105, 105));
				btn_25.setForeground(new Color(255, 255, 255));
				btn_26.setBackground(new Color(105, 105, 105));
				btn_26.setForeground(new Color(255, 255, 255));
				btn_27.setBackground(new Color(105, 105, 105));
				btn_27.setForeground(new Color(255, 255, 255));
				btn_28.setBackground(new Color(105, 105, 105));
				btn_28.setForeground(new Color(255, 255, 255));
				btn_29.setBackground(new Color(105, 105, 105));
				btn_29.setForeground(new Color(255, 255, 255));
				btn_30.setBackground(new Color(105, 105, 105));
				btn_30.setForeground(new Color(255, 255, 255));
				btn_31.setBackground(new Color(105, 105, 105));
				btn_31.setForeground(new Color(255, 255, 255));
				btn_32.setBackground(new Color(105, 105, 105));
				btn_32.setForeground(new Color(255, 255, 255));
				btn_33.setBackground(new Color(105, 105, 105));
				btn_33.setForeground(new Color(255, 255, 255));
				btn_34.setBackground(new Color(105, 105, 105));
				btn_34.setForeground(new Color(255, 255, 255));
				btn_35.setBackground(new Color(105, 105, 105));
				btn_35.setForeground(new Color(255, 255, 255));
				btn_36.setBackground(new Color(105, 105, 105));
				btn_36.setForeground(new Color(255, 255, 255));
				btn_37.setBackground(new Color(105, 105, 105));
				btn_37.setForeground(new Color(255, 255, 255));
				btn_38.setBackground(new Color(105, 105, 105));
				btn_38.setForeground(new Color(255, 255, 255));
				btn_39.setBackground(new Color(105, 105, 105));
				btn_39.setForeground(new Color(255, 255, 255));
				btn_40.setBackground(new Color(105, 105, 105));
				btn_40.setForeground(new Color(255, 255, 255));
				btn_41.setBackground(new Color(105, 105, 105));
				btn_41.setForeground(new Color(255, 255, 255));
				btn_42.setBackground(new Color(105, 105, 105));
				btn_42.setForeground(new Color(255, 255, 255));
				btn_43.setBackground(new Color(105, 105, 105));
				btn_43.setForeground(new Color(255, 255, 255));
				btn_44.setBackground(new Color(105, 105, 105));
				btn_44.setForeground(new Color(255, 255, 255));
				btn_45.setBackground(new Color(105, 105, 105));
				btn_45.setForeground(new Color(255, 255, 255));
				btn_46.setBackground(new Color(105, 105, 105));
				btn_46.setForeground(new Color(255, 255, 255));
				btn_47.setBackground(new Color(105, 105, 105));
				btn_47.setForeground(new Color(255, 255, 255));
				btn_48.setBackground(new Color(105, 105, 105));
				btn_48.setForeground(new Color(255, 255, 255));
				btn_49.setBackground(new Color(105, 105, 105));
				btn_49.setForeground(new Color(255, 255, 255));		
				rndTreeSet.clear();
				while(rndTreeSet.size() < 6) {
					rndTreeSet.add((int) (Math.random()*49+1));					
				}
				Iterator <Integer> rndIt= rndTreeSet.iterator(); 
				while(rndIt.hasNext()) {
					for(int i=1; i<=6; i++) {
						if(i ==1) {
							txtF_1.setText(rndIt.next().toString());							
						}
						if(i ==2) {
							txtF_2.setText(rndIt.next().toString());							
						}
						if(i ==3) {
							txtF_3.setText(rndIt.next().toString());							
						}
						if(i ==4) {
							txtF_4.setText(rndIt.next().toString());							
						}
						if(i ==5) {
							txtF_5.setText(rndIt.next().toString());							
						}
						if(i ==6) {
							txtF_6.setText(rndIt.next().toString());							
						}
					}
				}
			}
		});
		btn_電腦快選.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btn_電腦快選.setBounds(47, 327, 95, 32);
		contentPane.add(btn_電腦快選);
		
		JLabel lblNewLabel = new JLabel("\u5DF2\u9078\u865F\u78BC");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel.setBounds(172, 330, 56, 26);
		contentPane.add(lblNewLabel);
		
		
		
		
		JButton btn_加入對獎 = new JButton("\u52A0\u5165\u5C0D\u734E");
		btn_加入對獎.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				if(rndTreeSet.size()==6||seleTreeSet.size()==6) {
					strnums =txtF_1.getText()+", "+txtF_2.getText()+", "+txtF_3.getText()+", "+txtF_4.getText()+", "+txtF_5.getText()+", "+txtF_6.getText();
					model.addElement(strnums);
					}else {
						JOptionPane.showMessageDialog(null, "請選擇六個號碼");
					}					
			}
		});
		btn_加入對獎.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btn_加入對獎.setBounds(544, 327, 95, 32);
		contentPane.add(btn_加入對獎);
		
		
		
		JButton btn_刪除 = new JButton("\u522A\u9664\u6240\u9078");
		btn_刪除.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(model.size()>0) {
						model.removeElementAt(index);
					}	
				}catch(Exception e) 
				{
					JOptionPane.showMessageDialog(null, "請選擇欲刪除之獎號組");
				}
							
			}
		});
		btn_刪除.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btn_刪除.setBounds(438, 366, 95, 32);
		contentPane.add(btn_刪除);
		
		
		
		JButton btn_清空 = new JButton("\u5168\u90E8\u6E05\u7A7A");
		btn_清空.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultListModel)list.getModel()).removeAllElements();
			}
		});
		btn_清空.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btn_清空.setBounds(544, 366, 95, 32);
		contentPane.add(btn_清空);
		
		JLabel lbl_bingostr = new JLabel("");
		lbl_bingostr.setVisible(false);
		lbl_bingostr.setOpaque(true);
		lbl_bingostr.setEnabled(false);
		lbl_bingostr.setBounds(437, 21, 233, 15);
		contentPane.add(lbl_bingostr);
		
		
		
		JButton btn_對獎 = new JButton("\u5C0D\u734E");
		btn_對獎.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int bingos[]= new int[7];  //開獎號
				int bingo=0;                 //一般號對獎
				boolean sbingo=false;      //特別號對獎
				String strbingonumsmag;
				String strbingomsg;
				String strbingoallmsg="";
				
				if(model.size()>0) {
					//開獎
					for(int i=0; i<7; i++) {
						bingos[i]=(int)((Math.random()*49)+1);
						for(int j=0; j<i; j++) {
							while(bingos[j]==bingos[i]) {
								j=0;
								bingos[i]=(int)(((Math.random()*49)+1));
							}
						}
					}
					strbingonumsmag=Integer.toString(bingos[0])+", "+Integer.toString(bingos[1])+", "+Integer.toString(bingos[2])+", "+Integer.toString(bingos[3])+", "+Integer.toString(bingos[4])+", "+Integer.toString(bingos[5])+"    特別號:"+Integer.toString(bingos[6]);
					strbingos=Integer.toString(bingos[0])+", "+Integer.toString(bingos[1])+", "+Integer.toString(bingos[2])+", "+Integer.toString(bingos[3])+", "+Integer.toString(bingos[4])+", "+Integer.toString(bingos[5])+", "+Integer.toString(bingos[6]);
					lbl_bingostr.setText(strbingos);
					
					//對獎
					String bingonums[]=lbl_bingostr.getText().split(", ");
					for(int x=0; x<model.size(); x++) {
						String nums[]=model.getElementAt(x).split(", ");
						
						for(int y=0; y<6; y++) {
							for(int k=0; k<6; k++) {
								if(nums[y].equals(bingonums[k])) {
									bingo++;
								}
								if(nums[y].equals(bingonums[6])) {
									sbingo=true;
								}
							}
						}
						
						if(bingo==6) {
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   六個獎號完全相同  對中 頭獎";
						}else if((bingo==5)&&(sbingo==true)){
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   五碼＋特別號相同   對中 貳獎";
						}else if(bingo==5){
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   五碼相同   對中 參獎";
						}else if((bingo==4)&&(sbingo==true)){
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   四碼＋特別號   對中 肆獎";
						}else if(bingo==4){
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   四碼相同   對中 伍獎";
						}else if((bingo==3)&&(sbingo==true)){
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   三碼＋特別號相同   對中 陸獎";
						}else if((bingo==2)&&(sbingo==true)){
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   兩碼＋特別號相同   對中 柒獎";
						}else if(bingo==3){
							strbingomsg="第"+(x+1)+"組號碼: "+" 恭喜您   三碼相同   對中 普獎";
						}else{
							strbingomsg="第"+(x+1)+"組號碼: "+" 本組號碼未中獎";
						}										
						strbingoallmsg+=strbingomsg+"\n";
						
						bingo=0;
						sbingo=false;		
					}
					JOptionPane.showMessageDialog(null, "本期開獎獎號為: "+strbingonumsmag+"\n\n"+strbingoallmsg, "對獎訊息", JOptionPane.INFORMATION_MESSAGE );		
				}else {
					JOptionPane.showMessageDialog(null, "對獎欄空白\n請加入欲對獎號", "錯誤訊息", JOptionPane.ERROR_MESSAGE);	
				}
				
			}
		});
		btn_對獎.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btn_對獎.setBounds(343, 542, 296, 25);
		contentPane.add(btn_對獎);
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(245, 245, 245));
		textPane.setForeground(new Color(70, 130, 180));
		textPane.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		textPane.setText("\u8207\u7576\u671F\u516D\u500B\u734E\u865F\u5B8C\u5168\u76F8\u540C\u8005            \u982D\u734E\r\n\u5C0D\u4E2D\u7576\u671F\u734E\u865F\u4E4B\u4EFB\u4E94\u78BC\uFF0B\u7279\u5225\u865F    \u8CB3\u734E\r\n\u5C0D\u4E2D\u7576\u671F\u734E\u865F\u4E4B\u4EFB\u4E94\u78BC                    \u53C3\u734E\r\n\u5C0D\u4E2D\u7576\u671F\u734E\u865F\u4E4B\u4EFB\u56DB\u78BC\uFF0B\u7279\u5225\u865F    \u8086\u734E\r\n\u5C0D\u4E2D\u7576\u671F\u734E\u865F\u4E4B\u4EFB\u56DB\u78BC                    \u4F0D\u734E NT$2,000\r\n\u5C0D\u4E2D\u7576\u671F\u734E\u865F\u4E4B\u4EFB\u4E09\u78BC\uFF0B\u7279\u5225\u865F    \u9678\u734E NT$1,000\r\n\u5C0D\u4E2D\u7576\u671F\u734E\u865F\u4E4B\u4EFB\u5169\u78BC\uFF0B\u7279\u5225\u865F    \u67D2\u734E NT$400\r\n\u5C0D\u4E2D\u7576\u671F\u734E\u865F\u4E4B\u4EFB\u4E09\u78BC                    \u666E\u734E NT$400");
		textPane.setBounds(39, 425, 273, 142);
		contentPane.add(textPane);
		
		txtF_1 = new JTextField();
		txtF_1.setFocusable(false);
		txtF_1.setBounds(238, 330, 39, 26);
		contentPane.add(txtF_1);
		txtF_1.setColumns(10);
		
		txtF_2 = new JTextField();
		txtF_2.setFocusable(false);
		txtF_2.setColumns(10);
		txtF_2.setBounds(279, 330, 39, 26);
		contentPane.add(txtF_2);
		
		txtF_3 = new JTextField();
		txtF_3.setFocusable(false);
		txtF_3.setColumns(10);
		txtF_3.setBounds(320, 330, 39, 26);
		contentPane.add(txtF_3);
		
		txtF_4 = new JTextField();
		txtF_4.setFocusable(false);
		txtF_4.setColumns(10);
		txtF_4.setBounds(361, 330, 39, 26);
		contentPane.add(txtF_4);
		
		txtF_5 = new JTextField();
		txtF_5.setFocusable(false);
		txtF_5.setColumns(10);
		txtF_5.setBounds(402, 330, 39, 26);
		contentPane.add(txtF_5);
		
		txtF_6 = new JTextField();
		txtF_6.setFocusable(false);
		txtF_6.setColumns(10);
		txtF_6.setBounds(443, 330, 39, 26);
		contentPane.add(txtF_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(343, 409, 296, 130);
		contentPane.add(scrollPane);
		list = new JList<>(model);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				index=list.getSelectedIndex();
			}
		});
		scrollPane.setViewportView(list);
		
		
		
		
	}
}

