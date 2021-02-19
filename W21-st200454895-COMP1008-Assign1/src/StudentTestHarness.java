/** Class StudentTestHarness: contains main method, creates models.Student objects based on models.Student class
 * COMP1008:Lab 2
 * Author: Jennifer Mendez
 *Date: 04/Feb/2021
 *Time: 10:23 pm
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTestHarness extends Application
{
    public static void main(String[] args)
    {
        launch(args);
//        //Create Array list with student 1 interests
//        ArrayList<String> newInterests=new ArrayList<>();
//        newInterests.addAll(Arrays.asList("Cooking","Reading"));
//
//        //Instantiate student 1
//        Student student1= new Student("Jennifer","Mendez",200454895, newInterests);
//
//        //Print student 1 information
//        System.out.println("models.Student 1");
//        System.out.println("Name: " +student1.getFName()+ " " + student1.getLName());
//        System.out.println("models.Student Number: "+student1.getStudentNum());
//        System.out.println("Interests: "+ newInterests);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("views/studentView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Student Card");
        stage.show();
    }
}
