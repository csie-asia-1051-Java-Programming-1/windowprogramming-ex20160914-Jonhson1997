import java.awt.*;
import java.awt.event.*;

public class hw01_2_104021052 extends Frame {

	public hw01_2_104021052() {
		initComp();
	}

	private void initComp() {
		setwindows();
		
		//<!--			new			-->
		Button btn_login = new Button("Login");
		Label lb_username = new Label("User: ");
		TextField tf_username = new TextField();
		Label lb_passwd = new Label("Passwd: ");
		TextField tf_passwd = new TextField();
		
		//<!--			set			-->
		btn_login.setBounds(80, 230, 150, 30);
		lb_username.setBounds(48, 50, 50, 20);
		lb_passwd.setBounds(30, 85, 50, 20);
		tf_username.setBounds(100, 50, 150, 20);
		tf_passwd.setBounds(100, 85, 150, 20);
		
		//<!--			add			-->
		this.add(btn_login);
		this.add(lb_username);
		this.add(lb_passwd);
		this.add(tf_username);
		this.add(tf_passwd);
	}

	private void setwindows() {
		this.setBounds(50, 50, 300, 300);
		this.setTitle("AwtWindows");
		this.setLayout(null);
		this.setBackground(new Color(0x888888));
		this.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
	}

		
	

	
}
