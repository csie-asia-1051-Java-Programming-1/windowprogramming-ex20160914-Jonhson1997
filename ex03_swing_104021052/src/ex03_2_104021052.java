import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ex03_2_104021052 extends JFrame {

	private JLabel jlb_user = new JLabel("User: ");
	private JLabel jlb_passwd = new JLabel("Passwd: ");
	private JTextField jtf_user = new JTextField();
	private JPasswordField jpf_passwd = new JPasswordField();
	private JButton btn_Login = new JButton("Login");
	private JButton btn_Signup = new JButton("Sign up");
	private int count = 0;
	private String[] user = new String[10];
	private String[] passwd = new String[10];
	private int Login_count = 0;

	public ex03_2_104021052() {
		initComp();
	}

	private void initComp() {
		this.setBounds(50, 50, 400, 300);
		this.setLayout(null);
		this.setTitle("Login");
		jlb_user.setBounds(50, 30, 80, 30);
		this.add(jlb_user);
		jlb_passwd.setBounds(32, 60, 80, 30);
		this.add(jlb_passwd);
		jtf_user.setBounds(130, 30, 150, 30);
		this.add(jtf_user);
		jpf_passwd.setBounds(130, 60, 150, 30);
		this.add(jpf_passwd);
		btn_Login.setBounds(35, 200, 150, 30);
		this.add(btn_Login);
		btn_Signup.setBounds(195, 200, 150, 30);
		this.add(btn_Signup);

		/* ���b���K�X�}�C������ */
		setArray();

		/* �]�wbtn_Login��ActionListener */

		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < user.length; i++) {
					if (user[i].equals(jtf_user.getText()) && passwd[i].equals(jpf_passwd.getText())) {
						Login_count = 1;
					}
				}
				if (Login_count == 1) {
					System.out.println("�n�J���\");
				} else {
					System.out.println("�n�J����");
				}
			}
		});

		/* �]�wbtn_Signup��ActionListener */

		btn_Signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!jtf_user.getText().equals(null) && !jpf_passwd.getText().equals(null)) {
					user[count] = jtf_user.getText();
					passwd[count] = jpf_passwd.getText();
					System.out.println("���U���\");
					count++;
				} else {
					System.out.println("���U����");
				}
			}
		});

	}

	private void setArray() {
		for (int i = 0; i < user.length; i++) {
			user[i] = "yjhoiwo";
			passwd[i] = "erywhiohrw";
		}
	}
}