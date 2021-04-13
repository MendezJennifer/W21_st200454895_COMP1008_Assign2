package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import models.*;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SculptureViewController implements Initializable
{
    @FXML
    private Label titleLabel;

    @FXML
    private Label authorLabel;

    @FXML
    private Label dateLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private Label materialLabel;

    @FXML
    private Label heightLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Gallery gallery;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    @FXML
    private void getNextSculpture()
    {

    }

    @FXML
    private  void goToGallery(ActionEvent event) throws IOException
    {
        SceneChanger.changeScenes(event,"../views/GalleryView.fxml","Artwork Gallery");
    }
}
