package Login;

import java.awt.HeadlessException;
import java.net.URL;
import java.sql.*;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Node;
import javafx.scene.control.Alert;

public class LoginController implements Initializable {
    
    ObservableList<String> list = FXCollections.observableArrayList();
    static String u,v,e;
  
    @FXML
    private TextField UsernameTextfield;

    @FXML
    private PasswordField PasswordTextField;
        
    @FXML
    private TextField emailTextField;
    
    @FXML
    private ChoiceBox<String> LoginTypeChoice;
    
    // Regular expressions for validation
    private static final String USERNAME_REGEX = "^[a-zA-Z0-9._-]{3,20}$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    
    @FXML
    void onAction_LoginTypeChoice(ActionEvent event) {
        String choice = LoginTypeChoice.getValue();
    }
    
    @FXML
    void LoginAction(ActionEvent event) throws IOException {    
         
        u = UsernameTextfield.getText().toString();
        v = PasswordTextField.getText().toString();
        e = emailTextField.getText().toString();
            
        try {
            Conn c1 = new Conn();	
            
            if (UsernameTextfield.getText().isEmpty() || PasswordTextField.getText().isEmpty() || emailTextField.getText().isEmpty()) {
                showAlert("Warning", "Missing Information", "Please fill in all fields");
                return;
            }
            

            
            if(LoginTypeChoice.getValue() == "Employee") {
                String q = "select * from Employee_login where username='"+u+"' and password='"+v+"' and email='"+e+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()) {                
                    AnchorPane EmployeeHomePane = (AnchorPane) FXMLLoader.load(getClass().getResource("/Employee/Employee_Dashboard.fxml"));
                    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    window.setTitle(" Employee | Dashboard");
                    window.setScene(new Scene(EmployeeHomePane));
                    window.centerOnScreen();
                    window.setResizable(false);
                    window.show();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or password. Please try again.");
                }
            }
            else if(LoginTypeChoice.getValue() == "HR Personnel") {
                String q = "select * from hr_login where hr_username='"+u+"' and hr_password='"+v+"' and hr_email='"+e+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()) {
                    AnchorPane HRHomePane = (AnchorPane) FXMLLoader.load(getClass().getResource("/HumanResource/HR_Homepage.fxml"));
                    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    window.setTitle(" HR | Dashboard");
                    window.setScene(new Scene(HRHomePane));
                    window.centerOnScreen();
                    window.setResizable(false);
                    window.show();	 
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or password or email. Please try again.");
                }
            }     
            else {
                JOptionPane.showMessageDialog(null, "Please Select Login Type");
            }
        }
        catch(HeadlessException | SQLException e1) {
            e1.printStackTrace();
        }	
    }
    
  
    
    // Validation methods using regex
    private boolean isValidUsername(String username) {
        return username.matches(USERNAME_REGEX);
    }
    
    private boolean isValidPassword(String password) {
        return password.matches(PASSWORD_REGEX);
    }
    
    private boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }
    
    public String getID() {
        return u;
    }
    
    private void loadData() {
        list.removeAll(list);
        String a = "Employee";
        String b = "HR Personnel";
        list.addAll(a,b);
        LoginTypeChoice.getItems().addAll(list);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        loadData();
    } 
    
    private boolean userExists(String username, String email) throws SQLException {
        Conn c = new Conn();
        String query = "Employee".equals(LoginTypeChoice.getValue())
            ? "SELECT 1 FROM log_in WHERE username = ? OR email = ?"
            : "SELECT 1 FROM hr_login WHERE username = ? OR email = ?";
        
        try (PreparedStatement pstmt = c.c.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } finally {
            c.c.close();
        }
    } 
    
    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }	
}




            // Validate fields before proceeding
//            if (!isValidUsername(u)) {
//                showAlert("Invalid Username", "Username Requirements", 
//                    "Username must be 3-20 characters long and can only contain letters, numbers, dots, underscores, or hyphens.");
//                return;
//            }
//            
//            if (!isValidPassword(v)) {
//                showAlert("Invalid Password", "Password Requirements", 
//                    "Password must be at least 8 characters long and contain:\n" +
//                    "- At least one digit\n" +
//                    "- At least one lowercase letter\n" +
//                    "- At least one uppercase letter\n" +
//                    "- At least one special character (@#$%^&+=)\n" +
//                    "- No whitespace allowed");
//                return;
//            }
//            
//            if (!isValidEmail(e)) {
//                showAlert("Invalid Email", "Email Requirements", 
//                    "Please enter a valid email address (e.g., user@example.com)");
//                return;
//            }















//    @FXML
//    void SignUpAction(ActionEvent event) throws SQLException, IOException {
//        String username = UsernameTextfield.getText().trim();
//        String password = PasswordTextField.getText().trim();
//        String email = emailTextField.getText().trim();
//        
//        if (username.isEmpty() || password.isEmpty() || LoginTypeChoice.getValue() == null || email.isEmpty()) {
//            showAlert("Warning", "Missing Information", "Please fill in all fields");
//            return;
//        }
//        
//        // Validate fields before checking existence
//        if (!isValidUsername(username)) {
//            showAlert("Invalid Username", "Username Requirements", 
//                "Username must be 3-20 characters long and can only contain letters, numbers, dots, underscores, or hyphens.");
//            return;
//        }
//        
//        if (!isValidPassword(password)) {
//            showAlert("Invalid Password", "Password Requirements", 
//                "Password must be at least 8 characters long and contain:\n" +
//                "- At least one digit\n" +
//                "- At least one lowercase letter\n" +
//                "- At least one uppercase letter\n" +
//                "- At least one special character (@#$%^&+=)\n" +
//                "- No whitespace allowed");
//            return;
//        }
//        
//        if (!isValidEmail(email)) {
//            showAlert("Invalid Email", "Email Requirements", 
//                "Please enter a valid email address (e.g., user@example.com)");
//            return;
//        }
//        
//        // Check if username already exists
//        if(userExists(username, email)) {
//            showAlert("Error", "Registration Failed", 
//                "The information you entered already exists. Please login or choose a different username and email.");
//            return;
//        }
//        
//        try {
//            Conn c = new Conn();
//            String query;
//            if(LoginTypeChoice.getValue() == "Employee") {
//                query = "INSERT INTO log_in (username, password, email) VALUES (?, ?, ?)";
//            }
//            else {
//                query = "INSERT INTO hr_login (username, password, email) VALUES (?, ?, ?)";
//            }
//            
//            PreparedStatement pstmt = c.c.prepareStatement(query);
//            pstmt.setString(1, username);
//            pstmt.setString(2, password);
//            pstmt.setString(3, email);
//            
//            int rowsAffected = pstmt.executeUpdate();             
//            if (rowsAffected > 0) {
//                showAlert("Success", "Registration Successful", "User account created successfully");
//                UsernameTextfield.clear();
//                PasswordTextField.clear();
//                emailTextField.clear();
//                LoginTypeChoice.setValue(null);
//                
//                if(LoginTypeChoice.getValue() == "Employee")
//                {
//                    AnchorPane EmployeeHomePane = (AnchorPane) FXMLLoader.load(getClass().getResource("/Employee/Employee_Dashboard.fxml"));
//                    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
//                    window.setTitle(" Employee | Dashboard");
//                    window.setScene(new Scene(EmployeeHomePane));
//                    window.centerOnScreen();
//                    window.setResizable(false);
//                    window.show();
//                }
//                else
//                {
//                    AnchorPane HRHomePane = (AnchorPane) FXMLLoader.load(getClass().getResource("/HumanResource/HR_Homepage.fxml"));
//                    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
//                    window.setTitle(" HR | Dashboard");
//                    window.setScene(new Scene(HRHomePane));
//                    window.centerOnScreen();
//                    window.setResizable(false);
//                    window.show();
//                }
//            } else {
//                showAlert("Error", "Registration Failed", "Unable to create user account");
//            }
//            
//            pstmt.close();
//            c.s.close();
//            c.c.close();
//        }
//        catch(HeadlessException e1) {
//            e1.printStackTrace();
//        }
//    } 