package HumanResource;

import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;
import Login.Conn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import HumanResource.HR_Add_Employee_Controller.*;

public class HR_Update_Employee_Controller {

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
	    private Label L1;

	    @FXML
	    private TextField FName;

	    @FXML
	    private Label L2;

	    @FXML
	    private TextField LName;

	    @FXML
	    private Label L3;

	    @FXML
	    private Label L4;

	    @FXML
	    private Label L5;

	    @FXML
	    private TextField email;

	    @FXML
	    private Label L6;

	    @FXML
	    private TextField phone;

	    @FXML
	    private Label L7;

	    @FXML
	    private TextField AddL1;

	   
	    
	    @FXML
	    private Label L9;

	    @FXML
	    private TextField City;

	    @FXML
	    private Label L10;

	    @FXML
	    private TextField State;

	    @FXML
	    private Label L11;

	    @FXML
	    private TextField Pin;

	    @FXML
	    private Label L12;

	    @FXML
	    private Label L14;

	    @FXML
	    private TextField Eid;

	    @FXML
	    private Label L15;

	    @FXML
	    private Label L16;

	    @FXML
	    private Label L17;

	    @FXML
	    private TextField DeptName;

	    @FXML
	    private Label L18;

	    @FXML
	    private TextField ProName;
   
	    @FXML
	    private Label L20;
	    
	    @FXML
	    private Label L21;

	    @FXML
	    private TextField Password;

	    @FXML
	    private Button Save_Update;

	    @FXML
	    private Label L13;

	    @FXML
	    private TextField e_phone;

	    @FXML
	    private TextField SearchButton;

	    @FXML
	    private Button GoButton;

	    @FXML
	    private TextField DOB;

	    @FXML
	    private TextField Gender;

	    @FXML
	    private TextField BG;

	    @FXML
	    private TextField ELevel;

	    @FXML
	    private TextField DOJ;
   
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
		primaryStage.setTitle("EMPLOYEEE MANAGEMENT SYSTEM | Login");
		primaryStage.show();
    }

    @FXML
    void onAction_ManageSalaryButton(ActionEvent event) throws IOException {
    	AnchorPane HR_Homepage = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Payroll.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMPLOYEEE MANAGEMENT SYSTEM | HR | Manage Payroll");
        window1.setScene(new Scene(HR_Homepage));
        window1.show();
    }

    @FXML
    void onAction_Manage_GrievancesButton(ActionEvent event) throws IOException {
    	AnchorPane mainPane = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Grievances.fxml"));
        Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("EMPLOYEEE MANAGEMENT SYSTEM | HR | Grievance Portal");
		primaryStage.show();
    }

    @FXML
    void onAction_NewButton(ActionEvent event) throws IOException {
    	AnchorPane mainPane = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Company_Reports.fxml"));
        Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("EMPLOYEEE MANAGEMENT SYSTEM | HR | Company Reports");
		primaryStage.show();
    }

    @FXML
    void onAction_UpdatePerformanceButton(ActionEvent event) throws IOException {
    	AnchorPane HR_Homepage = (AnchorPane) FXMLLoader.load(getClass().getResource("HR_Evaluate_Performance.fxml"));
        Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window1.setTitle("EMPLOYEEE MANAGEMENT SYSTEM | HR | Employee Performance");
        window1.setScene(new Scene(HR_Homepage));
        window1.show();   
    }

    
    @FXML
void onClick_GoButton(ActionEvent event) {
    try {
        String employeeId = SearchButton.getText().trim();
        if (employeeId.isEmpty()) {
            showAlert("Input Error", "Please enter an Employee ID to search");
            return;
        }

        try {
            Conn cc = new Conn();
             PreparedStatement ps = cc.getConnection().prepareStatement(
                 "SELECT e.*, d.dept_name, p.project_name, l.city, l.state, " +
                 "ep.phone_number, ep.EmergencyContactNumber " +
                 "FROM employee_details e " +
                 "LEFT JOIN departments d ON e.dept_id = d.dept_id " +
                 "LEFT JOIN projects p ON e.project_id = p.project_id " +
                 "LEFT JOIN locations l ON e.pincode = l.pincode " +
                 "LEFT JOIN employee_phones ep ON e.EmployeeID = ep.employee_id " +
                 "WHERE e.EmployeeID = ?") ;
            
            ps.setString(1, employeeId);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Populate employee details
                    FName.setText(rs.getString("FName"));
                    LName.setText(rs.getString("LName"));
                    Gender.setText(rs.getString("Gender"));
                    DOB.setText(rs.getDate("DOB").toString());
                    email.setText(rs.getString("Email"));
                    AddL1.setText(rs.getString("Address"));
                    Pin.setText(rs.getString("pincode"));
                    BG.setText(rs.getString("BloodGroup"));
                    Eid.setText(rs.getString("EmployeeID"));
                    ELevel.setText(rs.getString("EmployeeLevel"));
                    DOJ.setText(rs.getDate("DOJ").toString());
                    
                    // Populate joined data
                    DeptName.setText(rs.getString("dept_name"));
                    ProName.setText(rs.getString("project_name"));
                    City.setText(rs.getString("city"));
                    State.setText(rs.getString("state"));
                    phone.setText(rs.getString("phone_number"));
                    e_phone.setText(rs.getString("EmergencyContactNumber"));
                    
                    setFieldsVisibility(true);
                    setFieldsEditable(true);
                } else {
                    showAlert("Not Found", "Employee Record Not Found");
                }
            }
        }
        catch (SQLException e) {
        handleDatabaseError( e);
    }
    } catch (Exception e) {
        System.out.println(e);
    }
}

@FXML
void onClick_Save_Update(ActionEvent event) {
    // Validate required fields before update
    if (!validateUpdateFields()) {
        JOptionPane.showMessageDialog(null, "please fill-in all the fields");
        return;
    }

    Conn cc = null;
    try {
        cc = new Conn();
        cc.getConnection().setAutoCommit(false); // Start transaction

        // First update employee details
        updateEmployeeDetails(cc.getConnection());
        
        // If department changed, update department reference
        updateDepartmentIfChanged(cc);
        
        // Update phone numbers
        updateEmployeePhones(cc); 
        
        // If project changed, update project reference
        updateProjectIfChanged(cc);
        
        // Update location if changed
        updateLocationIfChanged(cc);
        
        // Commit transaction
        cc.getConnection().commit();
        
        JOptionPane.showMessageDialog(null, "Employee Data Updated Successfully");
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
        e.printStackTrace();
    } finally {
        // Reset auto-commit and close connection
        if (cc != null) {
            try {
                cc.getConnection().setAutoCommit(true);
                cc.close();
            } catch (SQLException ex) {
                System.err.println("Error resetting auto-commit: " + ex);
            }
        }
    }
}

private boolean validateUpdateFields() {
    // Similar to your original validateFields but only checks editable fields
    boolean isValid = true;
    
    if (email.getText() == null || email.getText().trim().isEmpty()) {
        email.setPromptText("*Enter Email ID");
        isValid = false;
    }
    
    if (phone.getText() == null || phone.getText().trim().isEmpty()) {
        phone.setPromptText("*Enter Contact Number");
        isValid = false;
    }
    
    if (e_phone.getText() == null || e_phone.getText().trim().isEmpty()) {
        e_phone.setPromptText("*Enter Emergency Contact");
        isValid = false;
        System.out.println("emptyyyyyyyy");
    }
    
    if (AddL1.getText() == null || AddL1.getText().trim().isEmpty()) {
        AddL1.setPromptText("*Enter Address Line 1");
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
    
    return isValid;
}

private void updateEmployeeDetails(Connection conn) throws SQLException {
    String query = "UPDATE employee_details SET " +
                  "FName=?, LName=?, Email=?, Address=?, pincode=?, BloodGroup=?, EmployeeLevel=? " +
                  "WHERE EmployeeID=?";
    
    try (PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, FName.getText().trim());
        ps.setString(2, LName.getText().trim());
        ps.setString(3, email.getText().trim());
        ps.setString(4, AddL1.getText().trim());
        ps.setString(5, Pin.getText().trim());
        ps.setString(6, BG.getText().trim());
        ps.setString(7, ELevel.getText().trim());
        ps.setString(8, Eid.getText().trim());
        ps.executeUpdate();
    }
}

//private void updateDepartmentIfChanged(Conn cc) throws SQLException {
//    String newDeptName = DeptName.getText().trim();
//    String currentDeptName = ""; // You would need to get the current department name
//    
//    // In a real implementation, you would compare current vs new department name
//    // For now, we'll just insert/retrieve the department as in your original code
//    HR_Add_Employee_Controller controller = new HR_Add_Employee_Controller();
//    int deptId = controller.getOrCreateDepartment(cc);
//    
//    // Update the employee's department reference
//    String query = "UPDATE employee_details SET dept_id = ? WHERE EmployeeID = ?";
//    PreparedStatement ps = cc.prepareStatement(query);
//    ps.setInt(1, deptId);
//    ps.setString(2, Eid.getText().trim());
//    ps.executeUpdate();
//    ps.close();
//}
private void updateDepartmentIfChanged(Conn cc) throws SQLException {
    String newDeptName = DeptName.getText().trim();
    if (newDeptName.isEmpty()) {
        return; // No department specified, don't update
    }

    // 1. Get current department ID from employee record
    int currentDeptId = -1;
    String getCurrentDeptQuery = "SELECT dept_id FROM employee_details WHERE EmployeeID = ?";
    try (PreparedStatement ps = cc.prepareStatement(getCurrentDeptQuery)) {
        ps.setString(1, Eid.getText().trim());
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                currentDeptId = rs.getInt("dept_id");
            }
        }
    }

    // 2. Get current department name (if any)
    String currentDeptName = "";
    if (currentDeptId != -1) {
        String getDeptNameQuery = "SELECT dept_name FROM departments WHERE dept_id = ?";
        try (PreparedStatement ps = cc.prepareStatement(getDeptNameQuery)) {
            ps.setInt(1, currentDeptId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    currentDeptName = rs.getString("dept_name");
                }
            }
        }
    }

    // 3. Only update if department name actually changed
    if (!newDeptName.equals(currentDeptName)) {
        // 4. Get or create the new department
        int newDeptId;
        String findDeptQuery = "SELECT dept_id FROM departments WHERE dept_name = ?";
        try (PreparedStatement ps = cc.prepareStatement(findDeptQuery)) {
            ps.setString(1, newDeptName);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    newDeptId = rs.getInt("dept_id");
                } else {
                    // Department doesn't exist, create it
                    String insertDeptQuery = "INSERT INTO departments (dept_name) VALUES (?)";
                    try (PreparedStatement insertPs = cc.prepareStatementWithGeneratedKeys(insertDeptQuery)) {
                        insertPs.setString(1, newDeptName);
                        insertPs.executeUpdate();
                        try (ResultSet generatedKeys = insertPs.getGeneratedKeys()) {
                            if (generatedKeys.next()) {
                                newDeptId = generatedKeys.getInt(1);
                            } else {
                                throw new SQLException("Failed to create departments, no ID obtained");
                            }
                        }
                    }
                }
            }
        }

        // 5. Update employee's department reference
        String updateQuery = "UPDATE employee_details SET dept_id = ? WHERE EmployeeID = ?";
        try (PreparedStatement ps = cc.prepareStatement(updateQuery)) {
            ps.setInt(1, newDeptId);
            ps.setString(2, Eid.getText().trim());
            ps.executeUpdate();
        }
    }
}

//private void updateProjectIfChanged(Conn cc) throws SQLException {
//    String newProjectName = ProName.getText().trim();
//    String currentProjectName = ""; // You would need to get the current project name
//    
//    // Similar to department handling
//    
//    HR_Add_Employee_Controller controller= new HR_Add_Employee_Controller();
//    int projectId = controller.getOrCreateProject(cc);
//    
//    // Update the employee's project reference
//    String query = "UPDATE employee_details SET project_id = ? WHERE EmployeeID = ?";
//    PreparedStatement ps = cc.prepareStatement(query);
//    ps.setInt(1, projectId);
//    ps.setString(2, Eid.getText().trim());
//    ps.executeUpdate();
//    ps.close();
//}
private void updateProjectIfChanged(Conn cc) throws SQLException {
    String newProjectName = ProName.getText().trim();
    if (newProjectName.isEmpty()) {
        return; // No project specified, don't update
    }

    // 1. Get current project ID from employee record
    int currentProjectId = -1;
    String getCurrentProjectQuery = "SELECT project_id FROM employee_details WHERE EmployeeID = ?";
    try (PreparedStatement ps = cc.prepareStatement(getCurrentProjectQuery)) {
        ps.setString(1, Eid.getText().trim());
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                currentProjectId = rs.getInt("project_id");
            }
        }
    }

    // 2. Get current project name (if any)
    String currentProjectName = "";
    if (currentProjectId != -1) {
        String getProjectNameQuery = "SELECT project_name FROM projects WHERE project_id = ?";
        try (PreparedStatement ps = cc.prepareStatement(getProjectNameQuery)) {
            ps.setInt(1, currentProjectId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    currentProjectName = rs.getString("project_name");
                }
            }
        }
    }

    // 3. Only update if project name actually changed
    if (!newProjectName.equals(currentProjectName)) {
        // 4. Get or create the new project
        int newProjectId;
        String findProjectQuery = "SELECT project_id FROM projects WHERE project_name = ?";
        try (PreparedStatement ps = cc.prepareStatement(findProjectQuery)) {
            ps.setString(1, newProjectName);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    newProjectId = rs.getInt("project_id");
                } else {
                    // Project doesn't exist, create it
                    String insertProjectQuery = "INSERT INTO projects (project_name) VALUES (?)";
                    try (PreparedStatement insertPs = cc.prepareStatementWithGeneratedKeys(insertProjectQuery)) {
                        insertPs.setString(1, newProjectName);
                        insertPs.executeUpdate();
                        try (ResultSet generatedKeys = insertPs.getGeneratedKeys()) {
                            if (generatedKeys.next()) {
                                newProjectId = generatedKeys.getInt(1);
                            } else {
                                throw new SQLException("Failed to create project, no ID obtained");
                            }
                        }
                    }
                }
            }
        }

        // 5. Update employee's project reference
        String updateQuery = "UPDATE employee_details SET project_id = ? WHERE EmployeeID = ?";
        try (PreparedStatement ps = cc.prepareStatement(updateQuery)) {
            ps.setInt(1, newProjectId);
            ps.setString(2, Eid.getText().trim());
            ps.executeUpdate();
        }
    }
}

private void updateLocationIfChanged(Conn cc) throws SQLException {
    String pincode = Pin.getText().trim();
    String city = City.getText().trim();
    String state = State.getText().trim();
    
    // Check if location exists
    String checkQuery = "SELECT 1 FROM locations WHERE pincode = ?";
    PreparedStatement ps = cc.prepareStatement(checkQuery);
    ps.setString(1, pincode);
    ResultSet rs = ps.executeQuery();
    
    if (!rs.next()) {
        // Location doesn't exist, insert it
        String insertQuery = "INSERT INTO locations (pincode, city, state) VALUES (?, ?, ?)";
        PreparedStatement insertPs = cc.prepareStatement(insertQuery);
        insertPs.setString(1, pincode);
        insertPs.setString(2, city);
        insertPs.setString(3, state);
        insertPs.executeUpdate();
        insertPs.close();
    }
    
    rs.close();
    ps.close();
}
private void updateEmployeePhones(Conn cc) throws SQLException {
    String employeeId = Eid.getText().trim();
    String phoneNumber = phone.getText().trim();
    String emergencyPhone = e_phone.getText().trim();

    // Check if phone record exists
    boolean phoneExists = false;
    String checkQuery = "SELECT 1 FROM employee_phones WHERE employee_id = ?";
    try (PreparedStatement ps = cc.prepareStatement(checkQuery)) {
        ps.setString(1, employeeId);
        try (ResultSet rs = ps.executeQuery()) {
            phoneExists = rs.next();
        }
    }

    String updateQuery;
    if (phoneExists) {
        // Update existing phone record
        updateQuery = "UPDATE employee_phones SET phone_number = ?, EmergencyContactNumber = ? WHERE employee_id = ?";
    } else {
        // Insert new phone record
        updateQuery = "INSERT INTO employee_phones (phone_number, EmergencyContactNumber, employee_id) VALUES (?, ?, ?)";
    }

    try (PreparedStatement ps = cc.prepareStatement(updateQuery)) {
        ps.setString(1, phoneNumber);
        ps.setString(2, emergencyPhone);
        ps.setString(3, employeeId);
        ps.executeUpdate();
    }
}

private void setFieldsVisibility(boolean visible) {
    double opacity = visible ? 1.0 : 0.0;
    
    L20.setOpacity(opacity);
    L21.setOpacity(opacity);
    L1.setOpacity(opacity);
    L2.setOpacity(opacity);
    L3.setOpacity(opacity);
    L4.setOpacity(opacity);
    L5.setOpacity(opacity);
    L6.setOpacity(opacity);
    L7.setOpacity(opacity);
   
    L9.setOpacity(opacity);
    L10.setOpacity(opacity);
    L11.setOpacity(opacity);
    L12.setOpacity(opacity);
    L13.setOpacity(opacity);
    L14.setOpacity(opacity);
    L15.setOpacity(opacity);
    L16.setOpacity(opacity);
    L17.setOpacity(opacity);
    L18.setOpacity(opacity);
    
    FName.setOpacity(opacity);
    LName.setOpacity(opacity);
    Gender.setOpacity(opacity);
    DOB.setOpacity(opacity);
    email.setOpacity(opacity);
    phone.setOpacity(opacity);
    e_phone.setOpacity(opacity);
    AddL1.setOpacity(opacity);
    
    City.setOpacity(opacity);
    State.setOpacity(opacity);
    Pin.setOpacity(opacity);
    BG.setOpacity(opacity);
    Eid.setOpacity(opacity);
    ELevel.setOpacity(opacity);
    DeptName.setOpacity(opacity);
    ProName.setOpacity(opacity);
    DOJ.setOpacity(opacity);
    Save_Update.setOpacity(opacity);
}

private void setFieldsEditable(boolean editable) {
    email.setEditable(editable);
    phone.setEditable(editable);
    e_phone.setEditable(editable);
    AddL1.setEditable(editable);
    FName.setEditable(editable);
    LName.setEditable(editable);
    City.setEditable(editable);
    State.setEditable(editable);
    Pin.setEditable(editable);
    ELevel.setEditable(editable);
    ProName.setEditable(editable);
}
    
   private void showAlert(String title, String message) {
    JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
}

private void handleDatabaseError(SQLException e) {
    showAlert("Database Error", "Error: " + e.getMessage());
    e.printStackTrace();
} 
//    @FXML
//    void onClick_GoButton(ActionEvent event) {
//    	 
//    	try{   		
//	   		String FName1="Full Name",LName1="Last Name",Gender1="Gender",DOB1="Date of Birth",Email1="Email ID",PhoneNo="Phone No.",AddL11="Address Line 1",AddL21="Address Line 2",City1="City",State1="State",Pincode1="Pincode",BloodGroup1="BloodGroup",EmployeeID1="EmployeeID",EmployeeLevel1="EmployeeLevel",DeptName1="Department Name",DOJ1="Date of Joining",ProjectName1="Project Name",PhoneNo1="Phone";
//	    	//String e_id= SearchButton.getText().toString();
//	    	
//	        Conn con = new Conn();
//            String str = "select * from employee_details where EmployeeID = '"+SearchButton.getText().toString()+"'";
//            ResultSet rs= con.s.executeQuery(str);
//            
//            int i=0;
//	            if(rs.next())
//	            {
//	            	i=1;
//	                FName1 = rs.getString("FName");
//	                LName1 = rs.getString("LName");
//	                Gender1 = rs.getString("Gender");
//	                DOB1 = rs.getString("DOB");
//	                Email1 = rs.getString("Email");
//	                PhoneNo = rs.getString("PhoneNo");
//	                AddL11 = rs.getString("AddL1");
//	                AddL21 = rs.getString("AddL2");
//	                City1 = rs.getString("City");
//	                State1= rs.getString("State");
//	                Pincode1= rs.getString("Pincode");
//	                BloodGroup1= rs.getString("BloodGroup");
//	                EmployeeID1= rs.getString("EmployeeID");
//	                EmployeeLevel1= rs.getString("EmployeeLevel");
//	                DeptName1= rs.getString("DeptName");
//	                DOJ1= rs.getString("DOJ");
//	                ProjectName1= rs.getString("ProjectName");
//	                PhoneNo1= rs.getString("PhoneNo1");	
//	             }
//	            else JOptionPane.showMessageDialog(null,"Employee Record Not Found.");
//            
//	        if(i!=0)
//	        {
//	        	
//	            //Add Text to fields
//	            FName.setText(FName1);  
//	            LName.setText(LName1);  
//	            Gender.setText(Gender1); 
//	            DOB.setText(DOB1); 
//	            email.setText(Email1);  
//	            phone.setText(PhoneNo);
//	            phone1.setText(PhoneNo1);
//	            AddL1.setText(AddL11);
//	            AddL2.setText(AddL21);  
//	            City.setText(City1);
//	            State.setText(State1);
//	            Pin.setText(Pincode1);
//	            BG.setText(BloodGroup1);
//	            Eid.setText(EmployeeID1);
//	            ELevel.setText(EmployeeLevel1);
//	            DeptName.setText(DeptName1);
//	            ProName.setText(ProjectName1);
//	            DOJ.setText(DOJ1);
//	            
//	            //Set all labels and fields and visible
//	        	 
//	            L20.setOpacity(1);
//	            L21.setOpacity(1);
//	            L1.setOpacity(1);
//	            L2.setOpacity(1);
//	            L3.setOpacity(1);
//	            L4.setOpacity(1);
//	            L5.setOpacity(1);
//	            L6.setOpacity(1);
//	            L7.setOpacity(1);
//	            L8.setOpacity(1);
//	            L9.setOpacity(1);
//	            L10.setOpacity(1);
//	            L11.setOpacity(1);
//	            L12.setOpacity(1);
//	            L13.setOpacity(1);
//	            L14.setOpacity(1);
//	            L15.setOpacity(1);
//	            L16.setOpacity(1);
//	            L17.setOpacity(1);
//	            L18.setOpacity(1);
//	            
//	            FName.setOpacity(1);  
//	            LName.setOpacity(1);  
//	            Gender.setOpacity(1); 
//	            DOB.setOpacity(1);
//	            email.setOpacity(1);  
//	            phone.setOpacity(1); 
//	            phone1.setOpacity(1); 
//	            AddL1.setOpacity(1);
//	            AddL2.setOpacity(1); 
//	            City.setOpacity(1);
//	            State.setOpacity(1);
//	            Pin.setOpacity(1);
//	            BG.setOpacity(1);
//	            Eid.setOpacity(1);
//	            ELevel.setOpacity(1);
//	            DeptName.setOpacity(1);
//	            ProName.setOpacity(1);
//	            DOJ.setOpacity(1);
//	            Save_Update.setOpacity(1);
//	            
//	            //Editable Fields        
//	            email.setEditable(true); 
//	            phone.setEditable(true);
//	            phone1.setEditable(true); 
//	            AddL1.setEditable(true);
//	            AddL2.setEditable(true); 
//	            City.setEditable(true);
//	            State.setEditable(true);
//	            Pin.setEditable(true);        
//	        }
//        }
//   	 
//   	 catch(Exception e){ JOptionPane.showMessageDialog(null,e);
//   	 e.printStackTrace();
//   	 }  	 
//}   
//    @FXML
//    void onClick_Save_Update(ActionEvent event) {
//    	  	
//    	/*
//    	 * Get Current Text (Updated)
//    	 */
//    	
//    	String FName1 = FName.getText().toString();    	  	
//    	String LName1 = LName.getText().toString();    	
//    	String Gender1 = (String) Gender.getText().toString();
//    	String DOB1 = DOB.getText().toString();    	
//    	String email1 = email.getText().toString();
//    	String phoneNo = phone.getText().toString();
//    	String AddL11 = AddL1.getText().toString();
//    	String AddL21 = AddL2.getText().toString();
//    	String City1 = City.getText().toString();
//    	String State1 = State.getText().toString();
//    	String Pincode1 = Pin.getText().toString();
//    	String BG1 = (String) BG.getText().toString();
//    	String Eid1 = Eid.getText().toString();
//    	String ELevel1 = (String) ELevel.getText().toString();
//     	String DeptName1 = DeptName.getText().toString();
//     	String DOJ1 = DOJ.getText().toString();
//    	String ProjectName1 = ProName.getText().toString();
//    	String phoneNo1 = phone1.getText().toString();
//    	//String password = Password.getText().toString();
//    	
//    	try
//    	{
//    	    Conn cc = new Conn();
//    	    String q = "UPDATE employee_details SET FName='"+FName1+"',LName='"+LName1+"',Gender='"+Gender1+"',DOB='"+DOB1+"',Email='"+email1+"',PhoneNo='"+phoneNo+"',AddL1='"+AddL11+"',AddL2='"+AddL21+"',City='"+City1+"',State='"+State1+"',Pincode='"+Pincode1+"',BloodGroup='"+BG1+"',EmployeeID='"+Eid1+"',EmployeeLevel='"+ELevel1+"',DeptName='"+DeptName1+"',DOJ='"+DOJ1+"',ProjectName='"+ProjectName1+"',PhoneNo1='"+phoneNo1+"' WHERE EmployeeID='"+Eid1+"' ";
//    	    cc.s.executeUpdate(q);
//    	    JOptionPane.showMessageDialog(null,"Employee Data Updated Successfully ");
//    	}
//    	catch(Exception ee)
//    	{
//    	    JOptionPane.showMessageDialog(null,ee);
//    	    ee.printStackTrace();
//    	}
//
//    }
}

