package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import models.Artwork;
import models.Gallery;
import models.Painting;
import models.Sculpture;
import utilities.DBUtility;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GalleryViewController implements Initializable {
    @FXML
    private Label galleryToStringLabel;

    @FXML
    private ListView artworkListView;

    @FXML
    private TextField authorInput;

    @FXML
    private TextField catInput;

    @FXML
    private  TextField statusInput;

    @FXML
    private TextField year1Input;

    @FXML
    private TextField year2Input;

    private Gallery gallery;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        gallery= new Gallery();
        try
        {
            for(int i=0;i<DBUtility.getArtworksFromDB().size();i++)
            {
                gallery.addArtwork(DBUtility.getArtworksFromDB().get(i));
            }
            artworkListView.getItems().addAll(DBUtility.getArtworksFromDB());
        } catch (SQLException throwable)
        {
            throwable.printStackTrace();
        }

        galleryToStringLabel.setText(gallery.toString());
    }

    @FXML
    private void getArtByAuthorButton()
    {
        if (!authorInput.getCharacters().isEmpty())
            artworkListView.getItems().clear();
            for (int i=0;i<gallery.getArtByAuthor(authorInput.getCharacters().toString()).size();i++)
            artworkListView.getItems().add(gallery.getArtByAuthor(authorInput.getCharacters().toString()).get(i));
    }

    @FXML
    private void getArtByCatButton()
    {
        if (!catInput.getCharacters().isEmpty())
            artworkListView.getItems().clear();
        for (int i=0;i<gallery.getArtByCat(catInput.getCharacters().toString()).size();i++)
            artworkListView.getItems().add(gallery.getArtByCat(catInput.getCharacters().toString()).get(i));
    }

    @FXML
    private void getArtByDateButton()
    {
        int year1=Integer.parseInt(year1Input.getText());
        int year2=Integer.parseInt(year2Input.getText());
        if (year2>=year1)
            artworkListView.getItems().clear();
        for (int i=0;i<gallery.getArtByDate(year1,year2).size();i++)
            artworkListView.getItems().add(gallery.getArtByDate(year1,year2).get(i));
    }

    @FXML
    private void getArtByStatusButton()
    {
        if (!statusInput.getCharacters().isEmpty())
            artworkListView.getItems().clear();
        for (int i=0;i<gallery.getArtByStatus(statusInput.getCharacters().toString()).size();i++)
            artworkListView.getItems().add(gallery.getArtByStatus(statusInput.getCharacters().toString()).get(i));
    }

    @FXML
    private void getCompleteListButton()
    {
        artworkListView.getItems().clear();
        try
        {
            artworkListView.getItems().addAll(DBUtility.getArtworksFromDB());
        } catch (SQLException throwable)
        {
            throwable.printStackTrace();
        }
    }

    @FXML
    private  void goToPaintings(ActionEvent event) throws IOException
    {
        SceneChanger.changeScenes(event,"../views/PaintingView.fxml","Gallery Paintings");
    }

    @FXML
    private  void goToSculptures(ActionEvent event) throws IOException
    {
        SceneChanger.changeScenes(event,"../views/SculptureView.fxml","Gallery Sculptures");
    }

    @FXML
    private  void goToAddArtwork(ActionEvent event) throws IOException
    {
        SceneChanger.changeScenes(event,"../views/AddArtworkView.fxml","Add Artwork");
    }
}
