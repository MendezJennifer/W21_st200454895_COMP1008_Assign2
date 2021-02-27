/** Class StudentTestHarness: contains main method, creates models.Student objects based on models.Student class
 * COMP1008:Assignment 1
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


public class StudentTestHarness extends Application
{
    public static void main(String[] args)
    {
        launch(args);
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
