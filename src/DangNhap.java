import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DangNhap extends JFrame{
	public static void main(String[] args) {
		new DangNhap();
	}
	
	public DangNhap() {
		accountmanege am=new accountmanege();
		account a=new account("admin", "1234");
		am.add(a);
		this.setTitle("	Dang nhap");
		this.setSize(350,200);
		this.setDefaultCloseOperation(3);  
		
		this.setLayout(new BorderLayout(30,20));
		
		JLabel lb0=new JLabel("Dang nhap",JLabel.CENTER);
		this.add(lb0,BorderLayout.NORTH);
		
		JLabel lb00=new JLabel();
		this.add(lb00,BorderLayout.EAST);
		
		JPanel P1=new JPanel();
		P1.setLayout(new GridLayout(2,1,10,10));
		JLabel lb1=new JLabel("ten dang nhap",JLabel.RIGHT);
		JTextField f1=new JTextField(5);
		JLabel lb2=new JLabel("mat khau",JLabel.RIGHT);
		JTextField f2=new JTextField(5);
		//P1.add(lb1);
		P1.add(f1);
		//P1.add(lb2);
		P1.add(f2);
		this.add(P1,BorderLayout.CENTER);
		
		JPanel P3=new JPanel();
		P3.setLayout(new GridLayout(2,1));
		P3.add(lb1);
		P3.add(lb2);
		this.add(P3,BorderLayout.WEST);
		
		JPanel P2=new JPanel();
		JButton b3=new JButton("Dang nhap");
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1=f1.getText();
				String s2=f2.getText();
				for(int i=0;i<am.Size();i++)
				{
					if(s1.equals(am.getat(i).getName())&&s2.equals(am.getat(i).getPassword())) {
						System.out.println("dang nhap thanh cong");
					}
				}
			}
		});
		JButton b4=new JButton("Thoat");
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		P2.add(b3);
		P2.add(b4);
		this.add(P2,BorderLayout.SOUTH);
		this.add(P1);
		
		setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
