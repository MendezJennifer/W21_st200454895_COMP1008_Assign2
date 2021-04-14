package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

public class PaintingViewController implements Initializable
{
    @FXML
    private Label paintingCount;

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
    private Label techniqueLabel;

    @FXML
    private Label typeLabel;


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
                titleLabel.setText(DBUtility.getPaintingsFromDB().get(index).getArtTitle());
                authorLabel.setText(DBUtility.getPaintingsFromDB().get(index).getArtAuthor());
                dateLabel.setText(Integer.toString(DBUtility.getPaintingsFromDB().get(index).getArtCreationDate()));
                priceLabel.setText(Double.toString(DBUtility.getPaintingsFromDB().get(index).getArtPrice()));
                statusLabel.setText(DBUtility.getPaintingsFromDB().get(index).getArtStatus());
                techniqueLabel.setText(DBUtility.getPaintingsFromDB().get(index).getPaintingTechnique());
                typeLabel.setText(DBUtility.getPaintingsFromDB().get(index).getPaintingType());
                paintingCount.setText(String.format("Paintings: %d",DBUtility.getPaintingsFromDB().size()));

        }
        catch (SQLException throwable)
        {
            throwable.printStackTrace();
        }
    }

    @FXML
    private void lastPainting(ActionEvent actionEvent) throws SQLException
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
    private void nextPainting(ActionEvent actionEvent) throws SQLException
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


