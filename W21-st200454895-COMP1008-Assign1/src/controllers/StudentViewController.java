package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import models.Student;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable
{
    @FXML
    private Label fNameLabel;
    @FXML
    private Label lNameLabel;
    @FXML
    private Label studentNumLabel;
    @FXML
    private Label studentInterestsLabel;
    @FXML
    private ImageView imageView;

    //Make Student a global variable
    private Student student;

    //Make Student Interests a global variable
    private ArrayList<String> s1Interests;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        //Create Array list with student interests
        s1Interests= new ArrayList<>();
        s1Interests.addAll(Arrays.asList("Reading","Cooking","Swimming","Drawing"));

        //Instantiate new student
        student=new Student("jEnNifER","mendez",200454895, s1Interests);

        //Display student's data on labels
        fNameLabel.setText(student.getFName());
        lNameLabel.setText(student.getLName());
        studentNumLabel.setText(Integer.toString(student.getStudentNum()));
        studentInterestsLabel.setText(s1Interests.toString().replace("[", " ").replace("]", "").replace(",", "\n"));
        imageView.setImage(student.getStudentImage());

        //Scroll Panel
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(studentInterestsLabel);
        scrollPane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
    }

    /**
     * This method will send us to the student's interests view when the button is pushed
     * @param event
     * @throws IOException
     */
    @FXML
    private void goToStudentInterests(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("../views/studentInterestsView.fxml"));
        Scene scene = new Scene(root);
        Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Viewing Student Interests");
        stage.show();
        ////
    }
}

