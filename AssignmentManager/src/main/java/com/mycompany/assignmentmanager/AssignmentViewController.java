package com.mycompany.assignmentmanager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author rizin
 */
public class AssignmentViewController implements Initializable {

    // 🔹 Hubungan ke komponen di Scene Builder (fx:id)
    @FXML private TextField txtTitle;
    @FXML private TextField txtDescription;
    @FXML private DatePicker dpDueDate;
    @FXML private DatePicker dpSearch;

    @FXML private Button btnAdd;
    @FXML private Button btnEdit;
    @FXML private Button btnDelete;
    @FXML private Button btnSearch;

    @FXML private TableView<Assignment> tblAssignments;
    @FXML private TableColumn<Assignment, String> colTitle;
    @FXML private TableColumn<Assignment, String> colDescription;
    @FXML private TableColumn<Assignment, LocalDate> colDueDate;

    private ObservableList<Assignment> assignmentList = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
    colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
    colDueDate.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

    // Set data awal TableView (sementara buat test)
    assignmentList.add(new Assignment("Tugas PBO", "Buat GUI pakai JavaFX", LocalDate.of(2025, 11, 20)));
    assignmentList.add(new Assignment("Laporan AI", "Kumpulkan minggu depan", LocalDate.of(2025, 11, 25)));

    tblAssignments.setItems(assignmentList);
    }    
    
}

