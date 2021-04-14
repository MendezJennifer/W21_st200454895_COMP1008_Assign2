package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.ArtStatus;
import models.Painting;
import models.Sculpture;
import utilities.DBUtility;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddArtworkViewController implements Initializable {

    @FXML
    private TextField paintingTitleInput;

    @FXML
    private TextField SculptureTitleInput;

    @FXML
    private TextField paintingAuthorInput;

    @FXML
    private TextField sculptureAuthorInput;

    @FXML
    private TextField paintingCreationYearInput;

    @FXML
    private TextField sculptureCreationYearInput;

    @FXML
    private TextField paintingPriceInput;

    @FXML
    private TextField sculpturePriceInput;

    @FXML
    private ChoiceBox paintingStatusInput;

    @FXML
    private ChoiceBox sculptureStatusInput;

    @FXML
    private TextField paintingTechniqueInput;

    @FXML
    private TextField paintingTypeInput;

    @FXML
    private TextField sculptureMaterialInput;

    @FXML
    private TextField sculptureHeightInput;

    @FXML
    private Label msgLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paintingStatusInput.getItems().add(ArtStatus.Sold);
        paintingStatusInput.getItems().add(ArtStatus.Display);
        paintingStatusInput.getItems().add(ArtStatus.Restoration);
        paintingStatusInput.getItems().add(ArtStatus.Transit);

        sculptureStatusInput.getItems().add(ArtStatus.Sold);
        sculptureStatusInput.getItems().add(ArtStatus.Display);
        sculptureStatusInput.getItems().add(ArtStatus.Restoration);
        sculptureStatusInput.getItems().add(ArtStatus.Transit);
    }

    @FXML
    private void addPainting() {
        if (fieldsArePopulatedPainting())
        {
            try {
                Painting newPainting = new Painting(paintingTitleInput.getText(),
                        paintingAuthorInput.getText(),
                        Integer.parseInt(paintingCreationYearInput.getText()),
                        Double.parseDouble(paintingPriceInput.getText()),
                        paintingStatusInput.getValue().toString(),
                        paintingTechniqueInput.getText(),
                        paintingTypeInput.getText());
                int artID = DBUtility.insertPaintingIntoDB(newPainting);
                newPainting.setArtID(artID);
                msgLabel.setText(newPainting.toString());
            } catch (IllegalArgumentException | SQLException e) {
                msgLabel.setText(e.getMessage());
            }
        }
    }

    private boolean fieldsArePopulatedPainting()
    {
        String errMsg = "The following fields are empty: ";
        if (paintingTitleInput.getText().isEmpty())
            errMsg += "painting title, ";

        if (paintingAuthorInput.getText().isEmpty())
            errMsg += "painting author, ";

        if (paintingCreationYearInput.getText().isEmpty())
            errMsg += "painting creation year, ";

        if (paintingPriceInput.getText().isEmpty())
            errMsg += "painting price, ";

        if (paintingStatusInput.getValue()==null)
            errMsg += "painting status, ";

        if (paintingTechniqueInput.getText().isEmpty())
            errMsg += "painting technique, ";

        if (paintingTypeInput.getText().isEmpty())
            errMsg += "painting type, ";

        if (errMsg.equals("The following fields are empty: "))
            return true;

        //there was at least 1 empty field
        msgLabel.setText(errMsg.substring(0, errMsg.length()-2));
        return false;
    }

    @FXML
    private void addSculpture() {
        if (fieldsArePopulatedSculpture())
        {
            try {
                Sculpture newSculpture = new Sculpture(SculptureTitleInput.getText(),
                        sculptureAuthorInput.getText(),
                        Integer.parseInt(sculptureCreationYearInput.getText()),
                        Double.parseDouble(sculpturePriceInput.getText()),
                        sculptureStatusInput.getValue().toString(),
                        sculptureMaterialInput.getText(),
                        Double.parseDouble(sculptureHeightInput.getText()));
                int artID = DBUtility.insertSculptureIntoDB(newSculpture);
                newSculpture.setArtID(artID);
                msgLabel.setText(newSculpture.toString());
            } catch (IllegalArgumentException | SQLException e) {
                msgLabel.setText(e.getMessage());
            }
        }
    }

    private boolean fieldsArePopulatedSculpture()
    {
        String errMsg = "The following fields are empty: ";
        if (SculptureTitleInput.getText().isEmpty())
            errMsg += "sculpture title, ";

        if (sculptureAuthorInput.getText().isEmpty())
            errMsg += "sculpture author, ";

        if (sculptureCreationYearInput.getText().isEmpty())
            errMsg += "sculpture creation year, ";

        if (sculpturePriceInput.getText().isEmpty())
            errMsg += "sculpture price, ";

        if (sculptureStatusInput.getValue()==null)
            errMsg += "sculpture status, ";

        if (sculptureMaterialInput.getText().isEmpty())
            errMsg += "sculpture material, ";

        if (sculptureHeightInput.getText().isEmpty())
            errMsg += "sculpture height, ";

        if (errMsg.equals("The following fields are empty: "))
            return true;

        //there was at least 1 empty field
        msgLabel.setText(errMsg.substring(0, errMsg.length()-2));
        return false;
    }

    @FXML
    private void goToGallery(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/GalleryView.fxml", "Artwork Gallery");
    }
}
