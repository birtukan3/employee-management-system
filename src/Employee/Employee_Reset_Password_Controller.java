package Employee;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import Login.Conn;
import Login.LoginController;
import java.sql.PreparedStatement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Employee_Reset_Password_Controller implements Initializable {

	@FXML
    private Button ResetButton;

    @FXML
    private TextField EIDTF;

    @FXML
    private PasswordField OldPass1;

    @FXML
    private PasswordField NewPass1;

    @FXML
    private PasswordField NewPass2;
    
    @FXML
    private Button CancelButton;

    @FXML
    void onClick_CancelButton(ActionEvent event) throws IOException {
    	 AnchorPane Employee_MyHR_Pane = (AnchorPane) FXMLLoader.load(getClass().getResource("Employee_Profile.fxml"));
         Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
         window1.setTitle("GrowFast | Employee | Profile");
         window1.setScene(new Scene(Employee_MyHR_Pane));
         window1.show();
    }

    @FXML
    void onClick_ResetButton(ActionEvent event) throws IOException {
        LoginController obj = new LoginController();
    String username= obj.getID();
        
    	String e_id = EIDTF.getText().toString();
    	String oldpass1 = OldPass1.getText().toString();
    	String newpass1 = NewPass1.getText().toString();
    	String newpass2 = NewPass2.getText().toString();
        
    	
    
    			try 
    			{
    				Conn c1 = new Conn();

            String q = "select * from Employee_login where Eid='"+e_id+"' and password='"+oldpass1+"'";
            ResultSet rs =c1.s.executeQuery(q);
         if(rs.next()){ 
                    if(newpass1.compareTo(newpass2) !=0) {
                            JOptionPane.showMessageDialog(null, "Passwords do not match. Please try again.");
                        return;
                    }		                	
                    else{
                     Conn cc = new Conn();
                     String q1 = "UPDATE Employee_login SET password='"+newpass1+"' WHERE Eid='"+e_id+"' ";
                         cc.s.executeUpdate(q1);
                         JOptionPane.showMessageDialog(null,"Password Updated Successfully ");
                         AnchorPane Employee_MyHR_Pane = (AnchorPane) FXMLLoader.load(getClass().getResource("Employee_Profile.fxml"));
                     Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
                     window1.setTitle("EMS | Employee | Profile");
                     window1.setScene(new Scene(Employee_MyHR_Pane));
                     window1.show();
                    }
         }
		            else{
	                 JOptionPane.showMessageDialog(null, "Invalid Username or password. Please try again.");
		             }
	            
                        }
		        catch(HeadlessException | SQLException e1){
		 	             e1.printStackTrace();
		      	}				
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Employee_profileController obj = new Employee_profileController();
                
		EIDTF.setText(obj.getID());
	}

}
