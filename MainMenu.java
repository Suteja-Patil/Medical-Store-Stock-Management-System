package phar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener
{   JFrame jf;
	JMenuBar mbar;
	JMenu m1,m2,m3,m4;
	JMenuItem m1_1,m1_2,m1_3,m1_4,m1_5,m2_1,m2_2,m2_3,m2_4,m2_5,m3_1,m3_2,m4_1;
	JLabel l1,LogoColl;
	GridBagLayout gbl;

	public MainMenu()
	{
        jf=new JFrame();
		gbl=new GridBagLayout();
		jf.setLayout(gbl);

		l1=new JLabel("WELCOME TO MEDICAL STOCK MANAGEMENT SYSTEM");
		l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		jf.add(l1);

		mbar = new JMenuBar();
		jf.setJMenuBar(mbar);

		m1=new JMenu("Supplier");
		mbar.add(m1);
		m1_1 = new JMenuItem("Add New Supplier");
		m1.add(m1_1);
		m1_2 = new JMenuItem("search Supplier");
		m1.add(m1_2);
		m1_3 = new JMenuItem("Update Supplier");
		m1.add(m1_3);
		m1_4 = new JMenuItem("Delete Supplier");
		m1.add(m1_4);
	    m1_5 = new JMenuItem("List of Supplier");
		m1.add(m1_5);

		m2=new JMenu("Medicine");
		mbar.add(m2);
		m2_1 = new JMenuItem("Add New Medicine");
		m2.add(m2_1);
		m2_2 = new JMenuItem("search Medicine");
		m2.add(m2_2);
		m2_3 = new JMenuItem("Update Medicine");
		m2.add(m2_3);
		m2_4 = new JMenuItem("Delete Medicine");
		m2.add(m2_4);
	    m2_5 = new JMenuItem("Stock of Medicine");
		m2.add(m2_5);


		m3=new JMenu("Report");
	    mbar.add(m3);
		m3_1 = new JMenuItem("Daily Purchase Report");
		m3.add(m3_1);

		m3_2 = new JMenuItem("Suplier wise medicine Report");
		m3.add(m3_2);

		

		m4=new JMenu("Exit");
		mbar.add(m4);
		m4_1 = new JMenuItem("Exit");
		m4.add(m4_1);

        m1_1.addActionListener(this);
		m1_2.addActionListener(this);
		m1_3.addActionListener(this);
		m1_4.addActionListener(this);
    	m1_5.addActionListener(this);

		m2_1.addActionListener(this);
		m2_2.addActionListener(this);
		m2_3.addActionListener(this);
		m2_4.addActionListener(this);
	    m2_5.addActionListener(this);

		m3_1.addActionListener(this);
		m3_2.addActionListener(this);
		m4_1.addActionListener(this);
		

		jf.setTitle("Main Menu");
		jf.setLocation(20,20);
	    jf.setSize(900,700);
	    jf.setResizable(false);
		jf.getContentPane().setBackground(Color.orange);
		jf.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{

	  if(ae.getSource()==m1_1)
		{
		  new AddNewSupplier();
		}
		else if(ae.getSource()==m1_2)
		{
		 new SearchSupplier();
		}
		else if(ae.getSource()==m1_3)
		{
		new UpdateSupplier();
		}
		else if(ae.getSource()==m1_4)
		{
		new DeleteSupplier();
		}
	    else if(ae.getSource()==m1_5)
		{
		  new SupplierList();
		}


		else if(ae.getSource()==m2_1)
		{
			new AddNewMedicine();
		}
		else if(ae.getSource()==m2_2)
		{
			new SearchMedicine();
		}
		else if(ae.getSource()==m2_3)
		{
			new UpdateMedicine();
		}
		else if(ae.getSource()==m2_4)
		{
			new DeleteMedicine();
		}
		else if(ae.getSource()==m2_5)
		{
			new MedicineList();
		}

		 else if(ae.getSource()==m3_1)
		 {
		   new DailyPurchaseReport();
		 }

		  else if(ae.getSource()==m3_2)
		 {
		   new SupplierWiseMedList();
		 }

		

		else if(ae.getSource()==m4_1)
		{
		  System.exit(0);
		}

  }

	public static void main(String args[])
	{
		new MainMenu();
	}
}