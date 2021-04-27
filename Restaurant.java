package restaurants;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.InputStream;
import java.sql.Date;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Restaurant {

	private JFrame frame;
	private JTextField vbtextField;
	private JTextField vbmtextField;
	private JTextField cbtextField;
	private JTextField qntextField;
	private JTextField textField;
	private JLabel datelabel;
	private String df;
	
	
	
	
	double firstnum; 
	double secondnum;
	double result;
	String operations;
	String answer;
	private JTextField chb;
	private JTextField chbm;
	private JTextField eb;
	private JTextField ebm;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clock()
	{
		Calendar  cal= new GregorianCalendar ();
		int day= cal.get(Calendar.DAY_OF_MONTH);
		int month= cal.get(Calendar.MONTH);
		int year=cal.get(Calendar.YEAR);
		
		int second= cal.get(Calendar.SECOND);
		int minute= cal.get(Calendar.MINUTE);
		int hour=cal.get(Calendar.HOUR);
		
		datelabel.setText("Time "+hour+":"+minute+":"+second+"    Date "+day+"/"+month+"/"+year);

				
				
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1328, 889);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 140, 483, 325);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel vblabel = new JLabel("VEG BURGER");
		vblabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		vblabel.setBounds(56, 39, 175, 36);
		panel.add(vblabel);
		
		vbtextField = new JTextField();
		vbtextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		vbtextField.setBounds(239, 44, 190, 31);
		panel.add(vbtextField);
		vbtextField.setColumns(10);
		
		JLabel vbmlabel = new JLabel("VEG BURGER MEAL");
		vbmlabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		vbmlabel.setBounds(55, 104, 180, 22);
		panel.add(vbmlabel);
		
		vbmtextField = new JTextField();
		vbmtextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		vbmtextField.setBounds(239, 99, 190, 36);
		panel.add(vbmtextField);
		vbmtextField.setColumns(10);
		
		JLabel cblabel = new JLabel("CHEESE BURGER");
		cblabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		cblabel.setBounds(69, 167, 150, 22);
		panel.add(cblabel);
		
		cbtextField = new JTextField();
		cbtextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbtextField.setBounds(239, 162, 190, 36);
		panel.add(cbtextField);
		cbtextField.setColumns(10);
		
		JLabel lblHomeDelivery = new JLabel("HOME DELIVERY");
		lblHomeDelivery.setFont(new Font("Arial Narrow", Font.BOLD, 19));
		lblHomeDelivery.setBounds(22, 286, 160, 22);
		panel.add(lblHomeDelivery);
		
		JCheckBox hdcheckBox = new JCheckBox("");
		hdcheckBox.setBounds(156, 286, 25, 22);
		panel.add(hdcheckBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 209, 423, 7);
		panel.add(separator);
		
		JLabel drinkslebel = new JLabel("DRINKS");
		drinkslebel.setFont(new Font("Arial Narrow", Font.BOLD, 19));
		drinkslebel.setBounds(22, 214, 148, 22);
		panel.add(drinkslebel);
		
		JLabel qnlebel = new JLabel("QUANTITY");
		qnlebel.setForeground(new Color(0, 0, 0));
		qnlebel.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 14));
		qnlebel.setBounds(269, 211, 160, 32);
		panel.add(qnlebel);
		
		qntextField = new JTextField();
		qntextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		qntextField.setColumns(10);
		qntextField.setBounds(258, 246, 190, 22);
		panel.add(qntextField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[]
		{"Select a drink", "Coke", "Sprite", "Fanta", "Cold_coffee", "Strawberry_shake", "Oreo_Shake", "Chocalate_Shake", "Iced_tea"}));
		comboBox.setBounds(27, 245, 175, 22);
		panel.add(comboBox);
		
		JLabel ctax = new JLabel("TAX");
		ctax.setFont(new Font("Arial Narrow", Font.BOLD, 19));
		ctax.setBounds(268, 286, 63, 22);
		panel.add(ctax);
		
		JCheckBox txbox = new JCheckBox("");
		txbox.setBounds(306, 286, 25, 22);
		panel.add(txbox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 478, 484, 203);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(279, 141, -266, 2);
		panel_1.add(separator_3);
		
		JLabel codlabel = new JLabel("COST OF DRINKS");
		codlabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		codlabel.setBounds(50, 26, 175, 36);
		panel_1.add(codlabel);
		
		JLabel comlabel = new JLabel("COST OF MEAL");
		comlabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		comlabel.setBounds(60, 80, 190, 36);
		panel_1.add(comlabel);
		
		JLabel cohdlabel = new JLabel("COST OF DELIVERY");
		cohdlabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		cohdlabel.setBounds(51, 141, 190, 32);
		panel_1.add(cohdlabel);
		
		JLabel cod = new JLabel("");
		cod.setHorizontalAlignment(SwingConstants.RIGHT);
		cod.setFont(new Font("Tahoma", Font.BOLD, 21));
		cod.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				cod.setBounds(253, 26, 203, 36);
		panel_1.add(cod);
		
		JLabel com = new JLabel("");
		com.setHorizontalAlignment(SwingConstants.RIGHT);
		com.setFont(new Font("Tahoma", Font.BOLD, 21));
		com.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		com.setBounds(253, 80, 203, 36);
		panel_1.add(com);
		
		JLabel cohd = new JLabel("");
		cohd.setHorizontalAlignment(SwingConstants.RIGHT);
		cohd.setFont(new Font("Tahoma", Font.BOLD, 21));
		cohd.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		cohd.setBounds(253, 129, 203, 36);
		panel_1.add(cohd);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(27, 705, 1263, 110);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 7, true));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(523, 140, 414, 325);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel chblabel = new JLabel("CHICKEN BURGER");
		chblabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		chblabel.setBounds(26, 58, 160, 36);
		panel_3.add(chblabel);
		
		chb = new JTextField();
		chb.setFont(new Font("Tahoma", Font.BOLD, 18));
		chb.setColumns(10);
		chb.setBounds(212, 60, 190, 31);
		panel_3.add(chb);
		
		chbm = new JTextField();
		chbm.setFont(new Font("Tahoma", Font.BOLD, 18));
		chbm.setColumns(10);
		chbm.setBounds(212, 115, 190, 36);
		panel_3.add(chbm);
		
		JLabel chbmlabel = new JLabel("CHICKEN BURGER MEAL");
		chbmlabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		chbmlabel.setBounds(26, 115, 188, 39);
		panel_3.add(chbmlabel);
		
		JLabel eblabel = new JLabel("EGG BURGER");
		eblabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		eblabel.setBounds(26, 181, 137, 31);
		panel_3.add(eblabel);
		
		eb = new JTextField();
		eb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		eb.setColumns(10);
		eb.setBounds(212, 178, 190, 36);
		panel_3.add(eb);
		
		ebm = new JTextField();
		ebm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ebm.setColumns(10);
		ebm.setBounds(212, 234, 190, 36);
		panel_3.add(ebm);
		
		JLabel ebmlabel = new JLabel("EGG BURGER MEAL");
		ebmlabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		ebmlabel.setBounds(26, 232, 174, 43);
		panel_3.add(ebmlabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(524, 478, 413, 203);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel txlbel = new JLabel("");
		txlbel.setHorizontalAlignment(SwingConstants.RIGHT);
		txlbel.setFont(new Font("Tahoma", Font.BOLD, 21));
		txlbel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txlbel.setBounds(182, 29, 203, 36);
		panel_4.add(txlbel);
		
		JLabel stlabel = new JLabel("");
		stlabel.setHorizontalAlignment(SwingConstants.RIGHT);
		stlabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		stlabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		stlabel.setBounds(182, 86, 203, 36);
		panel_4.add(stlabel);
		
		JLabel totallabel = new JLabel("");
		totallabel.setHorizontalAlignment(SwingConstants.RIGHT);
		totallabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		totallabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		totallabel.setBounds(182, 135, 203, 36);
		panel_4.add(totallabel);
		
		JLabel tax = new JLabel("TAX");
		tax.setHorizontalAlignment(SwingConstants.CENTER);
		tax.setFont(new Font("Tahoma", Font.BOLD, 18));
		tax.setBounds(12, 29, 167, 36);
		panel_4.add(tax);
		
		JLabel subt = new JLabel("SUB TOTAL");
		subt.setHorizontalAlignment(SwingConstants.CENTER);
		subt.setFont(new Font("Tahoma", Font.BOLD, 18));
		subt.setBounds(22, 86, 157, 36);
		panel_4.add(subt);
		
		JLabel label_7 = new JLabel("TOTAL");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(13, 135, 157, 36);
		panel_4.add(label_7);
		
		
		JButton btntotal = new JButton("TOTAL");
		btntotal.setForeground(new Color(255, 255, 255));
		btntotal.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btntotal.setBackground(new Color(0, 0, 0));
		btntotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//-----------------------------------------------VEG-------------------------------------------------------------
				double vblabel=Double.parseDouble(vbtextField.getText());
				double vburger=89;
				double burger;
				burger=(vblabel*vburger);
				String pmeal = String.format("%.2f", burger);
						com.setText(pmeal);
				
			double vbmlabel=Double.parseDouble(vbmtextField.getText());
			double vmeal=159;
			double burgermeal;
			burgermeal=(vbmlabel*vmeal);
			String cbmeal = String.format("%.2f",burgermeal+burger);
			com.setText(cbmeal);
			
			double cblabel=Double.parseDouble(cbtextField.getText());
			double cburger=139;
			double cburgermeal;
			cburgermeal = (cblabel*cburger);
			String cheese=String.format("%.2f",cburgermeal+burgermeal+burger);
			com.setText(cheese);
			
			
			//--------------------------------------------NON-VEG---------------------------------------------------------------
			double chblabel=Double.parseDouble(chb.getText());
			double chburger=119;
			double chburgersin;
			chburgersin=(chblabel*chburger);
			String chmeal = String.format("%.2f", cburgermeal+burgermeal+burger+chburgersin);
					com.setText(chmeal);
			
		double chbmlabel=Double.parseDouble(chbm.getText());
		double chmeal1=199;
		double chburgermeal;
		chburgermeal=(chbmlabel*chmeal1);
		String chbmmeal = String.format("%.2f",cburgermeal+burgermeal+burger+chburgersin+chburgermeal);
		com.setText(chbmmeal);
		
		double eblabel=Double.parseDouble(eb.getText());
		double eburger=99;
		double eburgersin;
		eburgersin = (eblabel*eburger);
		String ebmeal1=String.format("%.2f",cburgermeal+burgermeal+burger+chburgersin+chburgermeal+eburgersin);
		com.setText(ebmeal1);
		
		double ebmlabel=Double.parseDouble(ebm.getText());
		double emburger=179;
		double eburgermeal;
		eburgermeal = (ebmlabel*emburger);
		String ebmeal2=String.format("%.2f",cburgermeal+burgermeal+burger+chburgersin+chburgermeal+eburgersin+eburgermeal);
		com.setText(ebmeal2);
			
			
			
			
			
			//------------------------------------------------------------HOME DELIVERY----------------------------------------------------------------------------------------
			
			
			
			double idelivery=50;
			if (hdcheckBox. isSelected( ) )  
			{
				String pDelivery=String.format("%.2f", idelivery);
				cohd.setText(pDelivery);
			}
			
			else
			{
				cohd.setText("0");
			}



			
			//---------------------------------------DRINKS--------------------------------------------------------------------------------------------------------------------------------
			double Drinks=Double.parseDouble(qntextField.getText());
			double Coke  =  65 * Drinks;
			double Sprite = 60 * Drinks;
			double Fanta = 60 *Drinks;
			double Cold_coffee = 119 * Drinks;
			double Strawberry_shake = 129 * Drinks;
			double Oreo_shake = 189 * Drinks ;
			double Chocalate_Shake = 139 * Drinks;
			double Iced_tea = 119 * Drinks ;
			
			if(comboBox.getSelectedItem().equals("Coke"))
			{
				String cCoke =String.format("%.2f", Coke);
				cod.setText(cCoke);
			}
			if(comboBox.getSelectedItem().equals("Sprite"))
			{
				String cSprite =String.format("%.2f", Sprite);
				cod.setText(cSprite);
			}
			if(comboBox.getSelectedItem().equals("Fanta"))
			{
				String cFanta =String.format("%.2f", Fanta);
				cod.setText(cFanta);
			}
			if(comboBox.getSelectedItem().equals("Cold_coffee"))
			{
				String cCF =String.format("%.2f", Cold_coffee);
				cod.setText(cCF);
			}
			if(comboBox.getSelectedItem().equals("Strawberry_shake"))
			{
				String cSs =String.format("%.2f", Strawberry_shake);
				cod.setText(cSs);
			}
			if(comboBox.getSelectedItem().equals("Oreo_Shake"))
			{
				String cOs =String.format("%.2f", Oreo_shake);
				cod.setText(cOs);
			}
			if(comboBox.getSelectedItem().equals("Chocalate_Shake"))
			{
				String cCs =String.format("%.2f", Chocalate_Shake);
				cod.setText(cCs);
			}
			if(comboBox.getSelectedItem().equals("Iced_tea"))
			{
				String cIc =String.format("%.2f", Iced_tea);
				cod.setText(cIc);
			}
			if(comboBox.getSelectedItem().equals("Select a drink"))
			{
				cod.setText("0");
			}
			//===================================================================TAX================================================================================================================
			
		           double Total1 = Double.parseDouble(cod.getText());
		           double Total2 = Double.parseDouble(com.getText());
		           double Total3 = Double.parseDouble(cohd.getText());
		           double sum = Total1+Total2 +Total3;
		           double ALLTOTAL=sum/100;
		           
		           if (txbox.isSelected())
		           {
		        	   String iTotal= String.format("%.2f",ALLTOTAL);
		        	   txlbel.setText(iTotal);
		        	   
		           }
		           else
		           {
		        	  txlbel.setText("0");
		           }
		           
		           //---------------------------------------------------------------TOTAL-------------------------------------------------------------------------------------------------------------------
		        
		        	   double Total4 = Double.parseDouble(txlbel.getText());
		        	   
		        	   double subtotal=(sum);
		        	   String isubtotal=String.format("₹ %.2f",subtotal);
		        	   stlabel.setText(isubtotal);
		        	   
		        	   
		        	   double allTotal=(sum+Total4);
		        	   String itotal=String.format("₹ %.2f",allTotal);
		        	   totallabel.setText(itotal);
		        	   
		        	   String itaxtotal=String.format("₹ %.2f",Total4);
		        	   txlbel.setText(itaxtotal);
		        	   
		        	  
		        	   
		        	   
		           
		          
		           
			
			}
		});
		btntotal.setBounds(61, 32, 136, 44);
		panel_2.add(btntotal);
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(949, 93, 336, 588);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 26, 312, 502);
		panel_5.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("RECEIPT", null, panel_6, null);
		panel_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("EngraversGothic BT", Font.BOLD | Font.ITALIC, 18));
		textArea.setBounds(0, 0, 295, 472);
		panel_6.add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(274, 0, 21, 472);
		panel_6.add(scrollBar);
		
		
		JButton btnreceipt = new JButton("RECEIPT");
		btnreceipt.addActionListener(new ActionListener() {
			private String df;

			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("-----------------------------------------------------------------");
				textArea.setText(textArea.getText()+"***                   Receipt             ***\n");
				textArea.setText(textArea.getText()+"***                   Receipt             ***\\n");
				textArea.setText(textArea.getText()+"----------------------------------------------\n");
				
				df = (datelabel.getText() );
				textArea.setText(textArea.getText()+"\n"+df+"\n\n");
				textArea.setText(textArea.getText()+"Veg Burger                :"+vbtextField.getText()+" *89\n");
				textArea.setText(textArea.getText()+"Veg Burger meal         : "+vbmtextField.getText()+"*159\n");
				textArea.setText(textArea.getText()+"cheese Burger           : "+cbtextField.getText()+"*139\n");
				textArea.setText(textArea.getText()+"Chicken Burger          :"+chb.getText()+"\n");
				textArea.setText(textArea.getText()+"Chicken Burger meal   :"+chbm.getText()+"\n");
				textArea.setText(textArea.getText()+"Egg Burger               :"+eb.getText()+"\n");
				textArea.setText(textArea.getText()+"Egg Burger Meal        :"+ebm.getText()+"\n");
				textArea.setText(textArea.getText()+"----------------------------------------------\n");
				textArea.setText(textArea.getText()+" Drinks                     :"+qntextField.getText()+"\n");
				textArea.setText(textArea.getText()+"----------------------------------------------\n");
				textArea.setText(textArea.getText()+"SUBTOTAL                 :"+stlabel.getText()+"\n");
				
				textArea.setText(textArea.getText()+"TAX  CGST , SGST       :"+txlbel.getText()+"\n");
				textArea.setText(textArea.getText()+"----------------------------------------------\n");
				textArea.setText(textArea.getText()+"----------------------------------------------\n");
				textArea.setText(textArea.getText()+"TOTAL                     :"+totallabel.getText()+"\n");
				
				
				textArea.setText(textArea.getText()+"***      Thanks for Ordering            ***\n");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnreceipt.setForeground(Color.WHITE);
		btnreceipt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnreceipt.setBackground(Color.BLACK);
		btnreceipt.setBounds(320, 32, 136, 44);
		panel_2.add(btnreceipt);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnexit.setForeground(Color.WHITE);
		btnexit.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnexit.setBackground(Color.BLACK);
		btnexit.setBounds(1070, 32, 136, 44);
		panel_2.add(btnexit);
		
		
		
		
	
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("CALCULATOR", null, panel_7, null);
		panel_7.setLayout(null);
		
		
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		textField.setBounds(12, 13, 295, 64);
		textField.setColumns(10);
		panel_7.add(textField);
		
		JButton btndelete = new JButton("<--");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btndelete.setBounds(12, 90, 60, 60);
		panel_7.add(btndelete);
		
		JButton button_1 = new JButton("C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		button_1.setBounds(84, 90, 60, 60);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("%");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBounds(156, 90, 60, 60);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_3.setBounds(237, 90, 60, 60);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_4.setBounds(237, 165, 60, 60);
		panel_7.add(button_4);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(156, 165, 60, 60);
		panel_7.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(84, 168, 60, 60);
		panel_7.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(12, 163, 60, 60);
		panel_7.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(12, 236, 60, 60);
		panel_7.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(84, 238, 60, 60);
		panel_7.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(156, 238, 60, 60);
		panel_7.add(btn6);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_11.setBounds(237, 238, 60, 60);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_12.setBounds(237, 309, 60, 60);
		panel_7.add(button_12);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(156, 309, 60, 60);
		panel_7.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(84, 312, 60, 60);
		panel_7.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(12, 312, 60, 60);
		panel_7.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(12, 382, 60, 60);
		panel_7.add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText() + btndot.getText();
				textField.setText(EnterNumber);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(84, 382, 60, 60);
		panel_7.add(btndot);
		
		JButton button_18 = new JButton("+-");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				 ops = ops * (-1);
				 textField.setText(String.valueOf(ops));
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_18.setBounds(156, 382, 60, 60);
		panel_7.add(button_18);
		
		JButton button_19 = new JButton("=");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result= firstnum+secondnum;
					answer= String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else
				if(operations=="-")
				{
					result= firstnum-secondnum;
					answer= String.format("%.2f",result);
					textField.setText(answer);
			}
				else
					if(operations=="*")
					{
						result= firstnum*secondnum;
						answer= String.format("%.2f",result);
						textField.setText(answer);
				}
					else
						if(operations=="/")
						{
							result= firstnum/secondnum;
							answer= String.format("%.2f",result);
							textField.setText(answer);
					
					}
						else
							if(operations=="%")
							{
								result= firstnum%secondnum;
								answer= String.format("%.2f",result);
								textField.setText(answer);
						}	
				
				
				
				
				
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_19.setBounds(237, 382, 60, 60);
		panel_7.add(button_19);
		
		datelabel = new JLabel("clock");
		datelabel.setHorizontalAlignment(SwingConstants.RIGHT);
		datelabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		datelabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		datelabel.setBounds(22, 539, 290, 36);
		panel_5.add(datelabel);
		
		JLabel lblNewLabel_1 = new JLabel("RESTAURANT MANAGEMENT");
		lblNewLabel_1.setFont(new Font("Swis721 BlkCn BT", Font.ITALIC, 38));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(426, 13, 547, 67);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vbtextField.setText(null);
				vbmtextField.setText(null);
				cbtextField.setText(null);
				qntextField.setText(null);
				chb.setText(null);
				chbm.setText(null);
				eb.setText(null);
				ebm.setText(null);
				cod.setText(null);
				com.setText(null);
				cohd.setText(null);
				txlbel.setText(null);
				stlabel.setText(null);
				totallabel.setText(null);
				textField.setText(null);
				textArea.setText(null);
				comboBox.setSelectedItem("Select a drink");
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnreset.setForeground(Color.WHITE);
		btnreset.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnreset.setBackground(Color.BLACK);
		btnreset.setBounds(844, 32, 136, 44);
		panel_2.add(btnreset);
		
		JButton btnprint = new JButton("PRINT");
		btnprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textArea.print();
				}
				catch(Exception e1) {
				}
				
				
			}
		});
		btnprint.setForeground(Color.WHITE);
		btnprint.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnprint.setBackground(Color.BLACK);
		btnprint.setBounds(588, 32, 136, 44);
		panel_2.add(btnprint);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_8.setBounds(646, 103, 180, 41);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNonveg = new JLabel("NON-VEG");
		lblNonveg.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNonveg.setBounds(12, 13, 104, 15);
		panel_8.add(lblNonveg);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_9.setBounds(181, 103, 180, 41);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblVeg = new JLabel("VEG");
		lblVeg.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblVeg.setBounds(46, 13, 56, 16);
		panel_9.add(lblVeg);
	}
}

