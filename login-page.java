import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
 
    Container container=getContentPane();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
    JButton resetButton=new JButton("CLEAR");
    JCheckBox showPassword=new JCheckBox("Show Password");
    JButton ForgotPasswordButton = new JButton("Forgot Password");
    JLabel lblNewLabel = new JLabel("");
    
    
 
 
    LoginFrame()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActions();
    }
   public void setLayoutManager()
   {
       container.setLayout(null);
   }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,100,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       showPassword.setBounds(150,250,150,30);
       loginButton.setBounds(50,300,100,30);
       resetButton.setBounds(200,300,100,30);
       ForgotPasswordButton.setBounds(100, 341, 159, 21);
       lblNewLabel.setForeground(new Color(255, 0, 0));
       lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
       lblNewLabel.setBounds(50, 40, 250, 65);
 
   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(showPassword);
       container.add(loginButton);
       container.add(resetButton);
       container.add(ForgotPasswordButton);
       container.add(lblNewLabel);
       
       
   }
 
 
  public void addActions() {
	   showPassword.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		if (showPassword.isSelected()) {
	      			passwordField.setEchoChar((char)0);
	      		}
	      		else {
	      			passwordField.setEchoChar('*');
	      		}
	      	}
	   });
	   
	   resetButton.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		userTextField.setText("");
	       		passwordField.setText("");
	       	}
	       });
	   
	   ForgotPasswordButton.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		ForgotPassword f=new ForgotPassword();
	       		f.setVisible(true);
	       	}
	       });
	   
	   
	   loginButton.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		if(userTextField.getText().isEmpty()||passwordField.getText().isEmpty()) {
	       			
	       			lblNewLabel.setText("Incorrect Password or Username");
	       		}
	       		else {
	       			MainPage mp=new MainPage();
	       			mp.setVisible(true);
	       		}
	       	}
	       });
  }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
 
    
    
}
 

 
public class Login {
    public static void main(String[] a){
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 
    }
 
}
