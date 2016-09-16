import javax.swing.*;

public class ex01_2_104021052 extends JFrame {

	private JLabel jlb_user = new JLabel("User: ");
	private JLabel jlb_passwd = new JLabel("Passwd: ");
	private JTextField jtf_user = new JTextField();
	private JPasswordField jpf_passwd = new JPasswordField();
	private JButton btn_Login = new JButton("Login");
	private JButton btn_Signup = new JButton("Sign up");

	public ex01_2_104021052() {
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

	}
}
