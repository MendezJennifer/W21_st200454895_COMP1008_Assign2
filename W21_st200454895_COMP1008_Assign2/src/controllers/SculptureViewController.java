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
import utilities.DBUtility;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SculptureViewController implements Initializable
{
    @FXML
    private Label sculptureCount;

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


    private int index=0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        showData();
    }

    @FXML
    private void showData()
    {
        try
        {
            titleLabel.setText(DBUtility.getSculpturesFromDB().get(index).getArtTitle());
            authorLabel.setText(DBUtility.getSculpturesFromDB().get(index).getArtAuthor());
            dateLabel.setText(Integer.toString(DBUtility.getSculpturesFromDB().get(index).getArtCreationDate()));
            priceLabel.setText(Double.toString(DBUtility.getSculpturesFromDB().get(index).getArtPrice()));
            statusLabel.setText(DBUtility.getSculpturesFromDB().get(index).getArtStatus());
            materialLabel.setText(DBUtility.getSculpturesFromDB().get(index).getSculptureMaterial());
            heightLabel.setText(Double.toString(DBUtility.getSculpturesFromDB().get(index).getSculptureHeight()));
            sculptureCount.setText(String.format("Sculptures: %d",DBUtility.getSculpturesFromDB().size()));

        }
        catch (SQLException throwable)
        {
            throwable.printStackTrace();
        }
    }

    @FXML
    private void lastSculpture(ActionEvent actionEvent) throws SQLException
    {
        if(index>0)
        {
            index -= 1;
            showData();
        }
        else
        {
            index=DBUtility.getPaintingsFromDB().size();
        }
    }

    @FXML
    private void nextSculpture(ActionEvent actionEvent) throws SQLException
    {
        if (index < DBUtility.getPaintingsFromDB().size()-1)
        {
            index += 1;
            showData();
        }
        else
        {
            index=0;
        }
    }

    @FXML
    private  void goToGallery(ActionEvent event) throws IOException
    {
        SceneChanger.changeScenes(event,"../views/GalleryView.fxml","Artwork Gallery");
    }
}
