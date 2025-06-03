package HumanResource;
import Login.Conn;
import java.sql.*;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HR_Add_Employee_Controller implements Initializable{

    @FXML
    private Button DashboardButton;

    @FXML
    private Button AddEmployee;

    @FXML
    private Button ApproveApplicationButton;

    @FXML
    private Button ManageSalaryButton;

    @FXML
    private Button UpdatePerformanceButton;

    @FXML
    private Button NewButton;

    @FXML
    private Button Manage_GrievancesButton;

    @FXML
    private Button LogoutButton;

    @FXML
    private Button BackButton;

    @FXML
    void onAction_AddEmployee(ActionEvent event) throws IOException {
    	AnchorPane HR_Add_Employee = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Manage_Employee.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMS | HR | Manage Employee");
        window1.setScene(new Scene(HR_Add_Employee));
        window1.show();
    }

    @FXML
    void onAction_ApproveApplicationButton(ActionEvent event) throws IOException {
    	AnchorPane HR_Homepage = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Approve_Applications.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMS | HR | Manage Employee Applications");
        window1.setScene(new Scene(HR_Homepage));
        window1.show();
    }

    @FXML
    void onAction_BackButton(ActionEvent event) throws IOException {
    	AnchorPane HR_Homepage = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Manage_Employee.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMS | HR | Manage Employee");
        window1.setScene(new Scene(HR_Homepage));
        window1.show();
    }

    @FXML
    void onAction_DashboardButton(ActionEvent event) throws IOException {
    	AnchorPane HR_Homepage = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Homepage.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMS | HR | Dashboard");
        window1.setScene(new Scene(HR_Homepage));
        window1.show();
    }

    @FXML
    void onAction_LogoutButton(ActionEvent event) throws IOException {
    	AnchorPane mainPane = (AnchorPane) FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
        Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("EMS | Login");
		primaryStage.show();
    }

    @FXML
    void onAction_ManageSalaryButton(ActionEvent event) throws IOException {
    	AnchorPane HR_Homepage = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Payroll.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMS | HR | Manage Payroll");
        window1.setScene(new Scene(HR_Homepage));
        window1.show();
    }

    @FXML
    void onAction_Manage_GrievancesButton(ActionEvent event) throws IOException {
    	AnchorPane mainPane = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Grievances.fxml"));
        Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("EMS | HR | Grievance Portal");
		primaryStage.show();
    }

    @FXML
    void onAction_NewButton(ActionEvent event) throws IOException {
    	AnchorPane mainPane = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Company_Reports.fxml"));
        Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("EMS | HR | Company Reports");
		primaryStage.show();
    }

    @FXML
    void onAction_UpdatePerformanceButton(ActionEvent event) throws IOException {
    	AnchorPane HR_Homepage = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Evaluate_Performance.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMS | HR | Employee Performance");
        window1.setScene(new Scene(HR_Homepage));
        window1.show();   
    }
    
    //-------------------------------------------------------------------------------------------------------------------------------
    
    @FXML
    private TextField FName;

    @FXML
    private TextField LName;

    @FXML
    private ChoiceBox<String> Gender;

    @FXML
    private DatePicker DOB;

    @FXML
    private TextField email;

    @FXML
    private TextField phone;

    @FXML
    private TextField AddL1;

    @FXML
    private TextField proj_con;;

    @FXML
    private TextField City;

    @FXML
    private TextField State;

    @FXML
    private TextField Pin;

    @FXML
    private ChoiceBox<String> BG;

    @FXML
    private TextField Eid;

    @FXML
    private ChoiceBox<String> ELevel;

    @FXML
    private TextField DeptName;

    @FXML
    private DatePicker DOJ;

    @FXML
    private TextField ProName;

    @FXML
    private TextField Password;
    
    @FXML
    private TextField username;

    @FXML
    private TextField phone1;

    @FXML
    private Button Submit;

    
    ObservableList<String> Gender_list = FXCollections.observableArrayList();
    ObservableList<String> ELevel_list = FXCollections.observableArrayList();
    ObservableList<String> BG_list = FXCollections.observableArrayList();
    
    private void loadData() {
    	Gender_list.removeAll(Gender_list);
    	String a = "Male";
    	String b = "Female";
    	String c = "Rather Not Say";
    	Gender_list.addAll(a,b,c);
    	Gender.getItems().addAll(Gender_list);
    	
    	BG_list.removeAll(BG_list);
     	BG_list.addAll("A+","B+","O+","AB+","A-","B-","O-","AB-");
    	BG.getItems().addAll(BG_list);
    	
     	ELevel_list.removeAll(ELevel_list);
     	ELevel_list.addAll("Executive (L1)", "Assistant Manager (L2)", "Manager (L3)", "Senior Manager (L4)", "Department Head (L5)","Human Resource");
     	ELevel.getItems().addAll(ELevel_list);
    }
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		loadData();
		
	}   
    //------------------------------------------------------------------------------------------------------------------------------------
   // @FXML
        @FXML
void onClick_Submit(ActionEvent event) {
    // Validate all fields first
    if (!validateFields()) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");

        return;
    }

    Conn cc = null;
    try {
        cc = new Conn();
        
        // Start transaction by disabling auto-commit
        cc.getConnection().setAutoCommit(false);

        // Get department ID (insert if new)
        int deptId = getOrCreateDepartment(cc);
        System.out.println(deptId);
        
        // Get project ID (insert if new)
        int projectId = getOrCreateProject(cc);
         System.out.println(projectId);
        // Insert location if needed
        insertLocation(cc);
        
        
        
        // Insert employee details
        insertEmployeeDetails(cc, deptId, projectId);
        
        insertEmployeePhone(cc);
        
        // Insert login credentials
        insertLoginCredentials(cc);
        
        // Initialize performance data
        initializePerformanceData(cc);
        
        // Commit transaction
        cc.getConnection().commit();
        
        showSuccessAndRedirect(event);
    } catch (Exception e) {
        // Rollback transaction if there was an error
        if (cc != null) {
            try {
                cc.getConnection().rollback();
            } catch (SQLException ex) {
                e.addSuppressed(ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        System.err.println("Database error: " + e);
    } finally {
        // Reset auto-commit and close connection
        if (cc != null) {
            try {
                cc.getConnection().setAutoCommit(true);
            } catch (SQLException ex) {
                System.err.println("Error resetting auto-commit: " + ex);
            }
            cc.close();
        }
    }
}

// The validateFields() method remains exactly the same as in your original code
private boolean validateFields() {
    boolean isValid = true;
    
    // Validate text fields
    if (FName.getText() == null || FName.getText().trim().isEmpty()) {
        FName.setPromptText("*Enter First Name");
        isValid = false;
    }
    
    if (LName.getText() == null || LName.getText().trim().isEmpty()) {
        LName.setPromptText("*Enter Last Name");
        isValid = false;
    }
    
    if (email.getText() == null || email.getText().trim().isEmpty()) {
        email.setPromptText("*Enter Email ID");
        isValid = false;
    }
    
    if (phone.getText() == null || phone.getText().trim().isEmpty()) {
        phone.setPromptText("*Enter Contact Number");
        isValid = false;
    }
    
    if (AddL1.getText() == null || AddL1.getText().trim().isEmpty()) {
        AddL1.setPromptText("*Enter Address Line 1");
        isValid = false;
    }
    
    if (proj_con.getText() == null || proj_con.getText().trim().isEmpty()) {
        proj_con.setPromptText("*Enter Project Description");
        isValid = false;
    }
    
    if (City.getText() == null || City.getText().trim().isEmpty()) {
        City.setPromptText("*Enter City Name");
        isValid = false;
    }
    
    if (State.getText() == null || State.getText().trim().isEmpty()) {
        State.setPromptText("*Enter State Name");
        isValid = false;
    }
    
    if (Pin.getText() == null || Pin.getText().trim().isEmpty()) {
        Pin.setPromptText("*Enter Pincode");
        isValid = false;
    }
    
    if (Eid.getText() == null || Eid.getText().trim().isEmpty()) {
        Eid.setPromptText("*Enter Employee ID");
        isValid = false;
    }
    
    if (DeptName.getText() == null || DeptName.getText().trim().isEmpty()) {
        DeptName.setPromptText("*Enter Department Name");
        isValid = false;
    }
    
    if (ProName.getText() == null || ProName.getText().trim().isEmpty()) {
        ProName.setPromptText("*Enter Project Name");
        isValid = false;
    }
    
    if (phone1.getText() == null || phone1.getText().trim().isEmpty()) {
        phone1.setPromptText("*Enter Emergency Contact");
        isValid = false;
    }
    
    if (Password.getText() == null || Password.getText().trim().isEmpty()) {
        Password.setPromptText("*Enter Password");
        isValid = false;
    }
    
    if (username.getText() == null || username.getText().trim().isEmpty()) {
        username.setPromptText("*Enter Username");
        isValid = false;
    }
    
    // Validate combo boxes
    if (Gender.getValue() == null) {
        JOptionPane.showMessageDialog(null, "Please select Gender");
        isValid = false;
    }
    
    if (BG.getValue() == null) {
        JOptionPane.showMessageDialog(null, "Please select Blood Group");
        isValid = false;
    }
    
    if (ELevel.getValue() == null) {
        JOptionPane.showMessageDialog(null, "Please select Employee Level");
        isValid = false;
    }
    
    // Validate date pickers
    if (DOB.getValue() == null) {
        JOptionPane.showMessageDialog(null, "Please select Date of Birth");
        isValid = false;
    }
    
    if (DOJ.getValue() == null) {
        JOptionPane.showMessageDialog(null, "Please select Date of Joining");
        isValid = false;
    }
    
    return isValid;
}
public int getOrCreateDepartment(Conn cc) throws SQLException {
    String deptName = DeptName.getText().trim();
    
    // First try to find existing department
    String query = "SELECT dept_id FROM departments WHERE dept_name = ?";
    PreparedStatement ps = cc.prepareStatement(query);
    ps.setString(1, deptName);
    ResultSet rs = ps.executeQuery();
    
    if (rs.next()) {
        int id = rs.getInt(1);
        rs.close();
        ps.close();
        return id;
    }
    rs.close();
    ps.close();
    
    // Department doesn't exist, insert it
    String insertQuery = "INSERT INTO departments (dept_name) VALUES (?)";
    ps = cc.prepareStatementWithGeneratedKeys(insertQuery);  // Using the new method
    ps.setString(1, deptName);
    ps.executeUpdate();
    
    rs = ps.getGeneratedKeys();
    if (rs.next()) {
        int id = rs.getInt(1);
        rs.close();
        ps.close();
        return id;
    }
    
    rs.close();
    ps.close();
    throw new SQLException("Failed to create department");
}

public int getOrCreateProject(Conn cc) throws SQLException {
    String projectName = ProName.getText().trim();
    String projectDesc = proj_con.getText().trim();
    
    // First try to find existing project
    String query = "SELECT project_id FROM projects WHERE project_name = ?";
    PreparedStatement ps = cc.prepareStatement(query);
    ps.setString(1, projectName);
    ResultSet rs = ps.executeQuery();
    
    if (rs.next()) {
        int id = rs.getInt(1);
        rs.close();
        ps.close();
        return id;
    }
    rs.close();
    ps.close();
    
    // Project doesn't exist, insert it
    String insertQuery = "INSERT INTO projects (project_name, description) VALUES (?, ?)";
    ps = cc.prepareStatementWithGeneratedKeys(insertQuery);  // Using the new method
    ps.setString(1, projectName);
    ps.setString(2, projectDesc);
    ps.executeUpdate();
    
    rs = ps.getGeneratedKeys();
    if (rs.next()) {
        int id = rs.getInt(1);
        rs.close();
        ps.close();
        return id;
    }
    
    rs.close();
    ps.close();
    throw new SQLException("Failed to create project");
}

private void insertLocation(Conn cc) throws SQLException {
    String pincode = Pin.getText().trim();
    String city = City.getText().trim();
    String state = State.getText().trim();
    
    // Check if location exists first
    String checkQuery = "SELECT 1 FROM locations WHERE pincode = ?";
    PreparedStatement ps = cc.prepareStatement(checkQuery);
    ps.setString(1, pincode);
    ResultSet rs = ps.executeQuery();
    
    if (!rs.next()) {
        rs.close();
        ps.close();
        
        String insertQuery = "INSERT INTO locations  VALUES (?, ?, ?)";
        ps = cc.prepareStatement(insertQuery);
        ps.setString(1, pincode);
        ps.setString(2, city);
        ps.setString(3, state);
        ps.executeUpdate();
    }
    
    rs.close();
    ps.close();
}

private void insertEmployeeDetails(Conn cc, int deptId, int projectId) throws SQLException {
    String query = "INSERT INTO employee_details "+
                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    PreparedStatement ps = cc.prepareStatement(query);
    ps.setString(1, Eid.getText().trim());
    ps.setString(2, FName.getText().trim());
    ps.setString(3, LName.getText().trim());
    ps.setString(4, Gender.getValue().toString());
    ps.setString(5, DOB.getValue().toString());
    ps.setString(6, email.getText().trim());
    ps.setString(7, AddL1.getText().trim());
    ps.setString(8, Pin.getText().trim());
    ps.setString(9, BG.getValue().toString());
    ps.setString(10, ELevel.getValue().toString());
    ps.setInt(11, deptId);
    ps.setString(12, DOJ.getValue().toString());
    ps.setInt(13, projectId);
    
    ps.executeUpdate();
    ps.close();
}
private void insertLoginCredentials(Conn cc) throws SQLException {
    String employeeId = Eid.getText().trim();
    String usernameValue = username.getText().trim();
    String password = Password.getText().trim();
    String emailValue = email.getText().trim();
    
    String tableName;
    String usernameColumn;
    String passwordColumn;
    String emailColumn;
    
    if ("Human Resource".equals(ELevel.getValue().toString())) {
        tableName = "hr_login";
        usernameColumn = "hr_username";
        passwordColumn = "hr_password";
        emailColumn = "hr_email";
    } else {
        tableName = "Employee_login";
        usernameColumn = "username";
        passwordColumn = "password";
        emailColumn = "email";
    }
    
    String query = String.format("INSERT INTO %s (Eid, %s, %s, %s) VALUES (?, ?, ?, ?)", 
                               tableName, usernameColumn, passwordColumn, emailColumn);
    
    try (PreparedStatement ps = cc.prepareStatement(query)) {
        ps.setString(1, employeeId);
        ps.setString(2, usernameValue);
        ps.setString(3, password);
        ps.setString(4, emailValue);
        
        int rowsAffected = ps.executeUpdate();
        System.out.println("Rows affected in " + tableName + ": " + rowsAffected);
    }
}

//private void insertLoginCredentials(Conn cc) throws SQLException {
//    String employeeId = Eid.getText().trim();
//    String usernam = username.getText().trim();
//    String password = Password.getText().trim();
//    String emai = email.getText().trim();
//    
//    String tableName = "Human Resource".equals(ELevel.getValue().toString()) 
//            ? "hr_login" : "Employee_login";
//    
//    String query = String.format("INSERT INTO %s  VALUES (?, ?, ?, ?)", tableName);
//    
//    PreparedStatement ps = cc.prepareStatement(query);
//    ps.setString(1, employeeId);
//    ps.setString(2, usernam);
//    ps.setString(3, password);
//    ps.setString(4, emai);
//    
//    ps.executeUpdate();
//    ps.close();
//}
private void insertEmployeePhone(Conn cc) throws SQLException {
    String employeeId = Eid.getText().trim();
    String phoneNumber = phone.getText().trim();
    String emergencyContact = phone1.getText().trim();
    
    String query = "INSERT INTO employee_phones (employee_id, phone_number, EmergencyContactNumber) " +
                  "VALUES (?, ?, ?)";
    
    try (PreparedStatement ps = cc.prepareStatement(query)) {
        ps.setString(1, employeeId);
        ps.setString(2, phoneNumber);
        ps.setString(3, emergencyContact);
        ps.executeUpdate();
    }
}

private void initializePerformanceData(Conn cc) throws SQLException {
    String employeeId = Eid.getText().trim();
    
    // First get the next available Performance_id
    int performanceId = 1;
    String getMaxIdQuery = "SELECT MAX(Performance_id) FROM employee_performance";
    try (Statement stmt = cc.getConnection().createStatement();
         ResultSet rs = stmt.executeQuery(getMaxIdQuery)) {
        if (rs.next()) {
            performanceId = rs.getInt(1) + 1;
        }
    }
    
    String query = "INSERT INTO employee_performance " +
                   "(Performance_id, Eid, SinceritySelf, ReliabilitySelf, LeadSelf, " +
                   "TeamSelf, IntegritySelf, SoftSkillsSelf, CommentsSelf, " +
                   "SincerityHR, ReliabilityHR, LeadHR, TeamHR, IntegrityHR, SoftSkillsHR, CommentsHR) " +
                   "VALUES (?, ?, 0, 0, 0, 0, 0, 0, 'Not Assigned Yet', 0, 0, 0, 0, 0, 0, 'Not Assigned Yet')";
    
    try (PreparedStatement ps = cc.prepareStatement(query)) {
        ps.setInt(1, performanceId);
        ps.setString(2, employeeId);
        
        int rowsAffected = ps.executeUpdate();
        System.out.println("Rows affected in employee_performance: " + rowsAffected);
    }
}

//private void initializePerformanceData(Conn cc) throws SQLException {
//    String employeeId = Eid.getText().trim();
//    String query = "INSERT INTO employee_performance  " +
//                   "VALUES (?, 0, 0, 0, 0, 0, 0, 'Not Assigned Yet', 0, 0, 0, 0, 0, 0, 'Not Assigned Yet')";
//    
//    PreparedStatement ps = cc.prepareStatement(query);
//    ps.setString(1, employeeId);
//    ps.executeUpdate();
//    ps.close();
//}

private void showSuccessAndRedirect(ActionEvent event) throws IOException {
    JOptionPane.showMessageDialog(null, "Employee data successfully added");
    
    AnchorPane hrAddEmployee = FXMLLoader.load(getClass().getResource("HR_Add_Employee.fxml"));
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    window.setTitle("EMS | HR | Add Employee");
    window.setScene(new Scene(hrAddEmployee));
    window.show();
}
//    @FXML
//void onClick_Submit(ActionEvent event) {
//    // Validate all fields first
//    if (!validateFields()) {
//        return;
//    }
//
//    try {
//        // Process in a transaction to ensure atomicity
//        Conn cc = new Conn();
//        cc.getConnection().setAutoCommit(false); // Start transaction
//
//        // Get department ID (insert if new)
//        int deptId = getOrCreateDepartment(cc);
//        
//        // Get project ID (insert if new)
//        int projectId = getOrCreateProject(cc);
//        
//        // Insert location if needed
//        insertLocation(cc);
//        
//        // Insert employee details
//        insertEmployeeDetails(cc, deptId, projectId);
//        
//        // Insert login credentials
//        insertLoginCredentials(cc);
//        
//        // Initialize performance data
//        initializePerformanceData(cc);
//        
//        cc.getConnection().commit(); // Commit transaction
//        
//        showSuccessAndRedirect(event);
//    } catch (Exception e) {
//        try {
//            if (cc != null && cc.conn != null) {
//                cc.conn.rollback(); // Rollback on error
//            }
//        } catch (SQLException ex) {
//            e.addSuppressed(ex);
//        }
//        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
//        System.err.println("Database error: " + e);
//    } finally {
//        try {
//            if (cc != null && cc.conn != null) {
//                cc.conn.setAutoCommit(true); // Reset auto-commit
//            }
//        } catch (SQLException ex) {
//            System.err.println("Error resetting auto-commit: " + ex);
//        }
//    }
//}
//
//private boolean validateFields() {
//    boolean isValid = true;
//    
//    // Create a map of fields and their validation messages
//    Map<TextField, String> fieldValidations = Map.of(
//        FName, "*Enter First Name",
//        LName, "*Enter Last Name",
//        email, "*Enter Email ID",
//        phone, "*Enter Contact Number",
//        AddL1, "*Enter Address Line 1",
//        proj_con, "*Enter Address Line 2",
//        City, "*Enter City Name",
//        State, "*Enter State Name",
//        Pin, "*Enter Pincode",
//        Eid, "*Enter Employee ID",
//        DeptName, "*Enter Department Name",
//        ProName, "*Enter Current Project Name",
//        phone1, "*Enter Emergency Contact Number",
//        Password, "*Enter a Strong Password",
//        username, "*Enter Username"
//    );
//    
//    // Validate all text fields
//    for (Map.Entry<TextField, String> entry : fieldValidations.entrySet()) {
//        if (entry.getKey().getText() == null || entry.getKey().getText().trim().isEmpty()) {
//            entry.getKey().setPromptText(entry.getValue());
//            isValid = false;
//        }
//    }
//    
//    // Validate combo boxes
//    if (Gender.getValue() == null) {
//        JOptionPane.showMessageDialog(null, "Enter Gender");
//        isValid = false;
//    }
//    
//    if (BG.getValue() == null) {
//        JOptionPane.showMessageDialog(null, "Enter Blood Group");
//        isValid = false;
//    }
//    
//    if (ELevel.getValue() == null) {
//        JOptionPane.showMessageDialog(null, "Enter Employee Level");
//        isValid = false;
//    }
//    
//    // Validate date pickers
//    if (DOB.getValue() == null) {
//        JOptionPane.showMessageDialog(null, "Enter Date of Birth");
//        isValid = false;
//    }
//    
//    if (DOJ.getValue() == null) {
//        JOptionPane.showMessageDialog(null, "Enter Date of Joining");
//        isValid = false;
//    }
//    
//    return isValid;
//}
//
//private int getOrCreateDepartment(Conn cc) throws SQLException {
//    String deptName = DeptName.getText().trim();
//    String query = "SELECT dept_id FROM departments WHERE dept_name = ?";
//    
//    try (PreparedStatement ps = cc.conn.prepareStatement(query)) {
//        ps.setString(1, deptName);
//        ResultSet rs = ps.executeQuery();
//        
//        if (rs.next()) {
//            return rs.getInt(1);
//        }
//    }
//    
//    // Department doesn't exist, insert it
//    String insertQuery = "INSERT INTO departments (dept_name) VALUES (?)";
//    try (PreparedStatement ps = cc.conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
//        ps.setString(1, deptName);
//        ps.executeUpdate();
//        
//        ResultSet rs = ps.getGeneratedKeys();
//        if (rs.next()) {
//            return rs.getInt(1);
//        }
//    }
//    
//    throw new SQLException("Failed to create department");
//}
//
//private int getOrCreateProject(Conn cc) throws SQLException {
//    String projectName = ProName.getText().trim();
//    String projectDesc = proj_con.getText().trim();
//    String query = "SELECT project_id FROM projects WHERE project_name = ?";
//    
//    try (PreparedStatement ps = cc.conn.prepareStatement(query)) {
//        ps.setString(1, projectName);
//        ResultSet rs = ps.executeQuery();
//        
//        if (rs.next()) {
//            return rs.getInt(1);
//        }
//    }
//    
//    // Project doesn't exist, insert it
//    String insertQuery = "INSERT INTO projects (project_name, project_description) VALUES (?, ?)";
//    try (PreparedStatement ps = cc.conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
//        ps.setString(1, projectName);
//        ps.setString(2, projectDesc);
//        ps.executeUpdate();
//        
//        ResultSet rs = ps.getGeneratedKeys();
//        if (rs.next()) {
//            return rs.getInt(1);
//        }
//    }
//    
//    throw new SQLException("Failed to create project");
//}
//
//private void insertLocation(Conn cc) throws SQLException {
//    String pincode = Pin.getText().trim();
//    String city = City.getText().trim();
//    String state = State.getText().trim();
//    
//    // Check if location exists first
//    String checkQuery = "SELECT 1 FROM locations WHERE pincode = ?";
//    try (PreparedStatement ps = cc.conn.prepareStatement(checkQuery)) {
//        ps.setString(1, pincode);
//        ResultSet rs = ps.executeQuery();
//        
//        if (!rs.next()) {
//            String insertQuery = "INSERT INTO locations (pincode, city, state) VALUES (?, ?, ?)";
//            try (PreparedStatement insertPs = cc.conn.prepareStatement(insertQuery)) {
//                insertPs.setString(1, pincode);
//                insertPs.setString(2, city);
//                insertPs.setString(3, state);
//                insertPs.executeUpdate();
//            }
//        }
//    }
//}
//
//private void insertEmployeeDetails(Conn cc, int deptId, int projectId) throws SQLException {
//    String query = "INSERT INTO employee_details (employee_id, first_name, last_name, gender, dob, email, " +
//                   "address_line1, pincode, blood_group, employee_level, dept_id, doj, project_id) " +
//                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//    
//    try (PreparedStatement ps = cc.conn.prepareStatement(query)) {
//        ps.setString(1, Eid.getText().trim());
//        ps.setString(2, FName.getText().trim());
//        ps.setString(3, LName.getText().trim());
//        ps.setString(4, Gender.getValue().toString());
//        ps.setString(5, DOB.getValue().toString());
//        ps.setString(6, email.getText().trim());
//        ps.setString(7, AddL1.getText().trim());
//        ps.setString(8, Pin.getText().trim());
//        ps.setString(9, BG.getValue().toString());
//        ps.setString(10, ELevel.getValue().toString());
//        ps.setInt(11, deptId);
//        ps.setString(12, DOJ.getValue().toString());
//        ps.setInt(13, projectId);
//        
//        ps.executeUpdate();
//    }
//}
//
//private void insertLoginCredentials(Conn cc) throws SQLException {
//    String employeeId = Eid.getText().trim();
//    String username = username.getText().trim();
//    String password = Password.getText().trim();
//    String email = email.getText().trim();
//    
//    String tableName = "Human Resource".equals(ELevel.getValue().toString()) 
//            ? "hr_login" : "employee_login";
//    
//    String query = String.format("INSERT INTO %s (employee_id, username, password, email) VALUES (?, ?, ?, ?)", tableName);
//    
//    try (PreparedStatement ps = cc.conn.prepareStatement(query)) {
//        ps.setString(1, employeeId);
//        ps.setString(2, username);
//        ps.setString(3, password);
//        ps.setString(4, email);
//        
//        ps.executeUpdate();
//    }
//}
//
//private void initializePerformanceData(Conn cc) throws SQLException {
//    String employeeId = Eid.getText().trim();
//    String query = "INSERT INTO employee_performance (employee_id, kpi1, kpi2, kpi3, kpi4, kpi5, kpi6, " +
//                   "feedback1, kpi7, kpi8, kpi9, kpi10, kpi11, kpi12, feedback2) " +
//                   "VALUES (?, 0, 0, 0, 0, 0, 0, 'Not Assigned Yet', 0, 0, 0, 0, 0, 0, 'Not Assigned Yet')";
//    
//    try (PreparedStatement ps = cc.conn.prepareStatement(query)) {
//        ps.setString(1, employeeId);
//        ps.executeUpdate();
//    }
//}
//
//private void showSuccessAndRedirect(ActionEvent event) throws IOException {
//    JOptionPane.showMessageDialog(null, "Employee data successfully added");
//    
//    AnchorPane hrAddEmployee = FXMLLoader.load(getClass().getResource("HR_Add_Employee.fxml"));
//    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
//    window.setTitle("EMS | HR | Add Employee");
//    window.setScene(new Scene(hrAddEmployee));
//    window.show();
//}
//    void onClick_Submit(ActionEvent event) {
//    	
//    	int flag=0;    	
//    	String FName1 = FName.getText().toString();
//    	if(FName1 == null) {
//    		FName.setPromptText("*Enter First Name");
//    		flag=1;
//    	}
//    	
//    	String LName1 = LName.getText().toString();
//    	if(LName1 == null) {
//    		LName.setPromptText("*Enter Last Name");
//    		flag=1;
//    	}
//    	
//    	String Gender1 = (String) Gender.getValue().toString();
//    	if(Gender1 == "null") {
//     		JOptionPane.showMessageDialog(null,"Enter Gender");
//    		flag=1;
//    	}
//    	
//      	//Date DOB1 = new Date(DOB.getValue().toEpochDay());
//    	String DOB1 = DOB.getValue().toString();
//    	
//    	String email1 = email.getText().toString();
//    	if(email == null) {
//    		email.setPromptText("*Enter Email ID");
//    		flag=1;
//    	}
//    	
//    	String phoneNo = phone.getText().toString();
//    	if(phoneNo == null) {
//    		phone.setPromptText("*Enter Contact Number");
//    		flag=1;
//    	}
//    	
//    	String AddL11 = AddL1.getText().toString();
//    	if(AddL11 == null) {
//    		AddL1.setPromptText("*Enter Address Line 1");
//    		flag=1;
//    	}
//    	
//    	String proj_dis = proj_con.getText().toString();
//    	if(proj_con == null) {
//    		proj_con.setPromptText("*Enter Address Line 2");
//    		flag=1;
//    	}
//    	
//    	String City1 = City.getText().toString();
//    	if(City1 == null) {
//    		City.setPromptText("*Enter City Name");
//    		flag=1;
//    	}
//    	
//    	String State1 = State.getText().toString();
//    	if(State1 == null) {
//    		State.setPromptText("*Enter State Name");
//    		flag=1;
//    	}
//    	
//    	String Pincode1 = Pin.getText().toString();
//    	if(Pincode1 == null) {
//    		Pin.setPromptText("*Enter Pincode");
//    		flag=1;
//    	}
//    	String BG1 = (String) BG.getValue().toString();
//    	if(BG1 == null) {
//     		JOptionPane.showMessageDialog(null,"Enter Blood Group");
//    		flag=1;
//    	}
//    	
//    	String Eid1 = Eid.getText().toString();
//    	if(Eid1 == null) {
//    		Eid.setPromptText("*Enter Employee ID");
//    		flag=1;
//    	}
//    	String ELevel1 =  ELevel.getValue().toString();
//     	if(ELevel1 == null) {
//     		JOptionPane.showMessageDialog(null,"Enter Employee Level");
//    		flag=1;
//    	}
//    	String DeptName1 = DeptName.getText().toString();
//     	if(DeptName1 == null) {
//    		DeptName.setPromptText("*Enter Department Name");
//    		flag=1;
//    	}
//    	
//     	//Date DOJ1 = new Date(DOJ.getValue().toEpochDay());
//     	String DOJ1 = DOJ.getValue().toString();
//     	
//     	String ProjectName1 = ProName.getText().toString();
//    	if(ProjectName1 == null) {
//    		ProName.setPromptText("*Enter Current Project Name");
//    		flag=1;
//    	}
//    	
//    	String phoneNo1 = phone1.getText().toString();
//    	if(phoneNo1 == null) {
//    		phone1.setPromptText("*Enter Emergency Contact Number");
//    		flag=1;
//    	}
//    	
//    	String password = Password.getText().toString();
//    	if(password == null) {
//    		Password.setPromptText("*Enter a Strong Password");
//    		flag=1;
//    	}
//        
//        String usernam = username.getText().toString();
//    	if(usernam == null) {
//    		Password.setPromptText("*Enter a Strong Password");
//    		flag=1;
//    	}
//    	
//    	if(flag ==0)
//    	{
//    		int another_flag=0;
//	    	try
//	    	{
//	    		//Add Employee Details
//	    	    Conn cc = new Conn();
//                    String q1="insert into departements values ('"+DeptName1+"')"; 
//                    String q2="select dept_id from departements where dept_name= '"+DeptName1+"'";
//                    cc.s.executeUpdate(q1);
//                   ResultSet re= cc.s.executeQuery(q2);
//                   int dept_i=0;
//                   if(re.next())
//                   {
//                       dept_i=re.getInt(1);
//                   }
//                   
//                    String q3="insert into projects values ('"+ProjectName1+"','"+proj_dis+"')";
//                    String q4 ="select project_id from projects where project_name= '"+ProjectName1+"'";
//                    cc.s.executeUpdate(q3);
//                   ResultSet rs= cc.s.executeQuery(q4);
//                   int proj_id=0;
//                   if(rs.next())
//                   {
//                        proj_id=rs.getInt(1);
//                        
//                   }
//                    
//                    String q5 ="insert into locations values ('"+Pincode1+"','"+City1+"','"+State1+"')";
//                     cc.s.executeUpdate(q5);
//	    	    String q6 = "insert into employee_details values ('"+Eid1+"','"+FName1+"','"+LName1+"','"+Gender1+"','"+DOB1+"','"+email1+"','"+AddL11+"','"+Pincode1+"','"+BG1+"','"+ELevel1+"',"+dept_i+" ,'"+DOJ1+"',"+proj_id+")";
//	    	     cc.s.executeUpdate(q6);
//	    	    another_flag=1;
//	    	    JOptionPane.showMessageDialog(null,"Employee Data Successfully Added");
//	    	}
//	    	catch(Exception ee)
//	    	{
//	    	    JOptionPane.showMessageDialog(null,";;;;;;"+ee);
//                    System.out.println("111111111 "+ee);
//	    	}
//	    	
//	    	if(another_flag==1) {
//	    	
//	    			//Add Login Details
//			    	try
//			    	{
//			    	    Conn cc = new Conn();
//			    	    if((String) ELevel.getValue().toString() == "Human Resource" )
//                                        
//			    	    {
//			    	    	String q1 = "INSERT INTO hr_login VALUES('"+Eid1+"','"+usernam+"','"+password+"','"+email1+"')";
//			    	    	cc.s.executeUpdate(q1);
//			    	    }
//			    	    else
//			    	    {
//			    	    	String q2 = "INSERT INTO Employee_login VALUES('"+Eid1+"','"+usernam+"','"+password+"','"+email1+"')";
//			    	    	cc.s.executeUpdate(q2);
//			    	    }
//			    	    
//			    	    
//			    	    //JOptionPane.showMessageDialog(null,"Employee Data Successfully Added");
//			    	    AnchorPane HR_Add_Employee = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Add_Employee.fxml"));
//			            Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
//			            window1.setTitle("EMS | HR | Add Employee");
//			            window1.setScene(new Scene(HR_Add_Employee));
//			            window1.show();
//			    	}
//			    	catch(Exception ee)
//			    	{
//			    	    JOptionPane.showMessageDialog(null,ee);
//			    	}
//			    	
//			    	//Initializing Employee Performance Data
//			    	try
//			    	{
//			    		String a ="Not Assigned Yet";
//                                        
//                                        String b ="Not Assigned Yet";
//			    		
//			    	    Conn cc = new Conn();
//			    	    String q = "insert into employee_performance values('"+Eid1+"',0,0,0,0,0,0,'"+a+"',0,0,0,0,0,0,'"+b+"')";
//			    	    cc.s.executeUpdate(q);
//			    	    JOptionPane.showMessageDialog(null,"Employee Performance Data Successfully Added");
//			    	}
//			    	catch(Exception ee)
//			    	{
//			    	    JOptionPane.showMessageDialog(null,"Employee Performance Not Initialized" + ee);
//			    	}
//	    	}
//    	}
 //  }
   

}
