package utilities;

import models.Artwork;
import models.Gallery;
import models.Painting;

import java.util.ArrayList;
import models.Sculpture;

import java.sql.*;

public class DBUtility {
    private static String user = "root";
    private static String password = "";
    private static String connectionString = "jdbc:mysql://localhost:3306/W21_st200454895_COMP1008_Assign2";

    public static ArrayList<Painting> getPaintingsFromDB() throws SQLException {
        ArrayList<Painting> paintings = new ArrayList<>();

        //connect to the DB
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //connect to the Database
            conn = DriverManager.getConnection(connectionString, user, password);

            statement = conn.createStatement();

            //run the query on the DB
            resultSet = statement.executeQuery("SELECT * FROM painting");

            //loop over the resultset and create Painting objects
            while (resultSet.next()==true) {
                Painting newPainting = new Painting(resultSet.getInt("artID"),
                        resultSet.getString("artTitle"),
                        resultSet.getString("artAuthor"),
                        resultSet.getInt("artCreationDate"),
                        resultSet.getString("ArtCategory"),
                        resultSet.getDouble("artPrice"),
                        resultSet.getString("ArtStatus"),
                        resultSet.getString("paintingTechnique"),
                        resultSet.getString("paintingType"));
                paintings.add(newPainting);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
        }
        return paintings;
    }

    public static ArrayList<Sculpture> getSculpturesFromDB() throws SQLException {
        ArrayList<Sculpture> sculptures = new ArrayList<>();

        //connect to the DB
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //connect to the Database
            conn = DriverManager.getConnection(connectionString, user, password);

            statement = conn.createStatement();

            //run the query on the DB
            resultSet = statement.executeQuery("SELECT * FROM sculpture");

            //loop over the resultset and create Painting objects
            while (resultSet.next()==true) {
                Sculpture newSculpture = new Sculpture(resultSet.getInt("artID"),
                        resultSet.getString("artTitle"),
                        resultSet.getString("artAuthor"),
                        resultSet.getInt("artCreationDate"),
                        resultSet.getString("ArtCategory"),
                        resultSet.getDouble("artPrice"),
                        resultSet.getString("ArtStatus"),
                        resultSet.getString("sculptureMaterial"),
                        resultSet.getDouble("sculptureHeight"));
                sculptures.add(newSculpture);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
        }
        return sculptures;
    }

    public static ArrayList<Artwork> getArtworksFromDB() throws SQLException {
        ArrayList<Artwork> artworks = new ArrayList<>();

        //connect to the DB
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try
        {
            for (int i=0;i<getSculpturesFromDB().size();i++)
                artworks.add(getSculpturesFromDB().get(i));
            for (int i=0;i<getPaintingsFromDB().size();i++)
                artworks.add(getPaintingsFromDB().get(i));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally
        {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
        }
        return artworks;
    }

}