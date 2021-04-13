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

public class PaintingViewController implements Initializable
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
    private Label techniqueLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private ImageView paintingImageView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        try
        {
            titleLabel.setText(DBUtility.getPaintingsFromDB().get(0).getArtTitle());
        }
        catch (SQLException throwable)
        {
            throwable.printStackTrace();
        }
    }

//    @FXML
//    private void nextPainting() throws SQLException {
//        //for(int i=0;i<DBUtility.getPaintingsFromDB().size();i++)
//        //{
//            //titleLabel.setText(DBUtility.getPaintingsFromDB().get(i).getArtTitle());
//            //authorLabel.setText(DBUtility.getPaintingsFromDB().get(0).getArtAuthor());
//            //dateLabel.setText(String.valueOf(DBUtility.getPaintingsFromDB().get(0).getArtCreationDate()));
//            //priceLabel.setText(String.valueOf(DBUtility.getPaintingsFromDB().get(0).getArtPrice()));
//            //statusLabel.setText(DBUtility.getPaintingsFromDB().get(0).getPaintingTechnique());
//            //typeLabel.setText(DBUtility.getPaintingsFromDB().get(0).getPaintingType());
//            //paintingImageView.setImage(DBUtility.getPaintingsFromDB().get(0).getArtImage());
//       // }
//    }

    @FXML
    private  void goToGallery(ActionEvent event) throws IOException
    {
        SceneChanger.changeScenes(event,"../views/GalleryView.fxml","Artwork Gallery");
    }

}

