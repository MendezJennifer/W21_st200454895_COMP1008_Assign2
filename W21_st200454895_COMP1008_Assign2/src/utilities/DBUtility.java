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

    /**
     * This method with get all the paintings inside the paintings table in the database
     * @return ArrayList <Painting>
     * @throws SQLException
     */
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

    /**
     * This method with get all the paintings inside the paintings table in the database
     * @return ArrayList<Sculpture>
     * @throws SQLException
     */
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

    /**
     * This method will add both the paintings and the sculptures from the databse
     * @return ArrayList <Artwork>
     * @throws SQLException
     */
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

    /**
     * This method receive a Painting object and insert it into the database
     * @return the artID generated by the database server
     */
    public static int insertPaintingIntoDB(Painting newPainting) throws SQLException {
        int artID=-1;

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try{
            //1. connect to the DB
            conn = DriverManager.getConnection(connectionString,user,password);

            //2. create our sql statement
            statement = conn.prepareStatement("INSERT INTO painting (artTitle, artAuthor, artCreationDate,ArtCategory, artPrice,ArtStatus,paintingTechnique,paintingType) VALUES " +
                    "(?,?,?,?,?,?,?,?)", new String[]{"artID"});

            //3. bind the values to the datatypes
            statement.setString(1, newPainting.getArtTitle());
            statement.setString(2, newPainting.getArtAuthor());
            statement.setInt(3, newPainting.getArtCreationDate());
            statement.setString(4,Painting.PAINTINGCAT);
            statement.setDouble(5, newPainting.getArtPrice());
            statement.setString(6, newPainting.getArtStatus());
            statement.setString(7, newPainting.getPaintingTechnique());
            statement.setString(8, newPainting.getPaintingType());

            //4. execute the insert
            statement.executeUpdate();

            //5. get the student number returned
            resultSet = statement.getGeneratedKeys();

            //6. update the student number variable
            while (resultSet.next())
                artID = resultSet.getInt(1);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
            return artID;
        }
    }

    /**
     * This method receive a Painting object and insert it into the database
     * @return the artID generated by the database server
     */
    public static int insertSculptureIntoDB(Sculpture newSculpture) throws SQLException {
        int artID=-1;

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try{
            //1. connect to the DB
            conn = DriverManager.getConnection(connectionString,user,password);

            //2. create our sql statement
            statement = conn.prepareStatement("INSERT INTO sculpture (artTitle, artAuthor, artCreationDate,ArtCategory, artPrice,ArtStatus,sculptureMaterial,sculptureHeight) VALUES " +
                    "(?,?,?,?,?,?,?,?)", new String[]{"artID"});

            //3. bind the values to the datatypes
            statement.setString(1, newSculpture.getArtTitle());
            statement.setString(2, newSculpture.getArtAuthor());
            statement.setInt(3, newSculpture.getArtCreationDate());
            statement.setString(4,Sculpture.SCULPTURECAT);
            statement.setDouble(5, newSculpture.getArtPrice());
            statement.setString(6, newSculpture.getArtStatus());
            statement.setString(7, newSculpture.getSculptureMaterial());
            statement.setDouble(8, newSculpture.getSculptureHeight());

            //4. execute the insert
            statement.executeUpdate();

            //5. get the student number returned
            resultSet = statement.getGeneratedKeys();

            //6. update the student number variable
            while (resultSet.next())
                artID = resultSet.getInt(1);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
            return artID;
        }
    }
}