package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import models.Student;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class StudentInterestsViewController implements Initializable
{
    @FXML
    private Label fNameLabel;
    @FXML
    private Label lNameLabel;
    @FXML
    private Label studentInterestsLabel;
    @FXML
    private ImageView imageView;
    @FXML
    private CheckBox readingBox;
    @FXML
    private CheckBox hikingBox;
    @FXML
    private CheckBox dancingBox;
    @FXML
    private CheckBox cookingBox;
    @FXML
    private CheckBox codingBox;
    @FXML
    private CheckBox gamingBox;
    @FXML
    private CheckBox swimmingBox;
    @FXML
    private CheckBox drawingBox;

    //Make Student a global variable
    private Student student;

    //Make Student Interests a global variable
    private ArrayList<String> s1Interests;

    /**
     * This method will initialize the scene and display a checklist with the student's interests
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        s1Interests= new ArrayList<>();

        student=new Student("jEnNifER","mendez",200454895, s1Interests);
        //Display student's data on labels
        fNameLabel.setText(student.getFName());
        lNameLabel.setText(student.getLName());
        imageView.setImage(student.getStudentImage());

    }

    /**
     * This method will update interests list according to checkboxes
     */
    @FXML
    private void updateInterests()
    {
        if(readingBox.isSelected() && !s1Interests.contains("Reading"))
            { s1Interests.add("Reading"); }
            else
                { s1Interests.remove("Reading"); }
        if(hikingBox.isSelected() && !s1Interests.contains("Hiking"))
            { s1Interests.add("Hiking"); }
            else
                {s1Interests.remove("Hiking");}
        if(dancingBox.isSelected() && !s1Interests.contains("Dancing"))
            { s1Interests.add("Dancing"); }
            else
                {s1Interests.remove("Dancing");}
        if(cookingBox.isSelected() && !s1Interests.contains("Cooking"))
            { s1Interests.add("Cooking"); }
            else
                {s1Interests.remove("Cooking");}
        if(codingBox.isSelected() && !s1Interests.contains("Coding"))
            {s1Interests.add("Coding"); }
            else
                {s1Interests.remove("Coding");}
        if(gamingBox.isSelected() && !s1Interests.contains("Gaming"))
            {s1Interests.add("Gaming"); }
            else
                {s1Interests.remove("Gaming");}
        if(swimmingBox.isSelected() && !s1Interests.contains("Swimming"))
            { s1Interests.add("Swimming"); }
            else
                {s1Interests.remove("Swimming");}
        if(drawingBox.isSelected() && !s1Interests.contains("Drawing"))
            { s1Interests.add("Drawing"); }
            else
                {s1Interests.remove("Drawing");}

        studentInterestsLabel.setText(s1Interests.toString());

    }



    /**
     * This method will send us to the student card view when the second button is pushed
     * @param event
     * @throws IOException
     */
    @FXML
    private void goToStudentCard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../views/studentView.fxml"));
        Scene scene = new Scene(root);
        Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Student Card");
        stage.show();

    }
}
