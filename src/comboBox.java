import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class comboBox {

	JFrame fr;
	JComboBox cmbcity;
	JLabel lblcity;
	
	public void setting() {
		String country[] = {"select","India","Pak","USA"};
		fr= new JFrame("ComboBox");
		lblcity = new JLabel ("Select City");
		lblcity.setBounds(60,30,500,30);
		fr.add(lblcity);
		cmbcity = new JComboBox(country);
		cmbcity.setBounds(170,30,500,30);
		fr.add(cmbcity);
		fr.setResizable(true);
		fr.setLayout(null);
		fr.setSize(1000, 300);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		comboBox r= new comboBox();
		r.setting();
	}
	
}
