package application.employee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class EmployeeManagerController implements Initializable {
    @FXML
    private ObservableList<Employee> employeeList;

    @FXML
    private TableView<Employee> employeeTableView;

    @FXML
    private TableColumn<Employee, String> codeColumn;

    @FXML
    private TableColumn<Employee, String> nameColumn;

    @FXML
    private TableColumn<Employee, String> idnumberColumn;

    @FXML
    private TableColumn<Employee, String> addressColumn;

    @FXML
    private TableColumn<Employee, LocalDate> birthdayColumn;

    @FXML
    private TableColumn<Employee, String> accessTypeColumn;

    @FXML
    private TableColumn<Employee, Boolean> statusColumn;


    public void addEmployee() {
    }

    public void removeEmployee() {

    }

    public void editEmployee() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File("application/employee/data/employees.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            employeeList = FXCollections.observableArrayList((Employee)ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        codeColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("employeeCode"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("employeeName"));
        idnumberColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("employeeIDNumber"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("employeeAddress"));
        accessTypeColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("accessType"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<Employee, Boolean>("status"));
        employeeTableView.setItems(employeeList);
    }
}
