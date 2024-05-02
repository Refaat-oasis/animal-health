/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

import static antprogram.main.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;

/**
 *
 * @author Belal Center
 */
public class FeedDAL {

    private Connection connection;

    public FeedDAL(Connection connection) {
        this.connection = connection;
    }

    public void createFeed(Feed feed) throws SQLException {
        String query = "INSERT INTO tblFeed (feed_bar_code,  feed_name  ,size,  purchase_price,  selling_price,   fac_lic,  vet_ID, quantity) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, feed.getFeedBarCode());
        statement.setString(2, feed.getFeedName());
        statement.setString(3, feed.getFeedSize());
        statement.setInt(4, (feed.getFeedPurchasePrice()));
        statement.setInt(5, feed.getFeedSellPrice());
        statement.setString(6, feed.getFactoryLisence());
        statement.setString(7, feed.getVetrinaryID());
        statement.setInt(8, feed.getFeedQuantity());
        statement.executeUpdate();
        statement.close();
    }

    public ResultSet getAllFeeds() throws SQLException {
//        List<Feed> feed = new ArrayList<>();
//        String query = "SELECT * FROM tblFeed";
//        String url = "jdbc:ucanaccess://C://Users//Administrator//Documents//NetBeansProjects//AntProgram//projectDataBase.accdb";

 List<Medicine> medList = new ArrayList<>();
        String query = "SELECT * FROM tblFeed";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
//        Connection conn = DriverManager.getConnection(url);
//        Statement stmt = conn.createStatement();
//        //PreparedStatement statement = connection.prepareStatement(query);
        //ResultSet resultSet = statement.executeQuery();
        //try (ResultSet resultSet = stmt.executeQuery(query)) {
            //PreparedStatement statement = connection.prepareStatement(query);
            //ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                Feed f = new Feed();
//                
//                f.setFeedBarCode(resultSet.getString("feed_bar_code"));
//                f.setFeedName(resultSet.getString("feed_name"));
//                f.setFeedSize(resultSet.getString("size"));
//                f.setFeedPurchasePrice(resultSet.getInt("purchase_price"));
//                f.setFeedSellPrice(resultSet.getInt("selling_price"));
//                f.setFactoryLisence(resultSet.getString("fac_lic"));
//                f.setVetrinaryID(resultSet.getString("vet_ID"));
//                f.setFeedQuantity(resultSet.getInt("quantity"));
//                
//                feed.add(f);
//            }
//        }
       // statement.close();
        return resultSet;
    }

    public Feed getFeedByBarCode(String feedBarCode) throws SQLException {
        String query = "SELECT * FROM tblFeed WHERE feed_bar_code= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, feedBarCode);
        ResultSet resultSet = statement.executeQuery();
        Feed feed = null;
        if (resultSet.next()) {
            feed = new Feed();
            feed.setFeedBarCode(resultSet.getString("feed_bar_code"));

        }
        resultSet.close();
        statement.close();
        return feed;
    }

    public Feed getFeedByName(String feedName) throws SQLException {
        String query = "SELECT * FROM tblFeed WHERE feed_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(2, feedName);
        ResultSet resultSet = statement.executeQuery();
        Feed feed = null;
        if (resultSet.next()) {
            feed = new Feed();
            feed.setFeedName(resultSet.getString("feed_name"));

        }
        resultSet.close();
        statement.close();
        return feed;

    }

    public Feed getFeedBySize(String feedSize) throws SQLException {
        String query = "SELECT * FROM tblFeed WHERE Feed size = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(3, feedSize);
        ResultSet resultSet = statement.executeQuery();
        Feed feed = null;
        if (resultSet.next()) {
            feed = new Feed();
            feed.setFeedSize(resultSet.getString("size"));

        }
        resultSet.close();
        statement.close();
        return feed;
    }

    public Feed getFeedByPurchasePrice(int feedPurchasePrice) throws SQLException {
        String query = "SELECT * FROM tblFeed WHERE purchase_price = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(4, feedPurchasePrice);
        ResultSet resultSet = statement.executeQuery();
        Feed feed = null;
        if (resultSet.next()) {
            feed = new Feed();
            feed.setFeedPurchasePrice(resultSet.getInt("purchase_price"));

        }
        resultSet.close();
        statement.close();
        return feed;
    }

    public Feed getFeedBySellingPrice(int feedSellingPrice) throws SQLException {
        String query = "SELECT * FROM tblFeed WHERE selling_price= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(5, feedSellingPrice);
        ResultSet resultSet = statement.executeQuery();
        Feed feed = null;
        if (resultSet.next()) {
            feed = new Feed();
            feed.setFeedSellPrice(resultSet.getInt("selling_price"));

        }
        resultSet.close();
        statement.close();
        return feed;
    }

    public Feed getFeedByFactoryLisence(String factoryLisence) throws SQLException {
        String query = "SELECT * FROM tblFeed WHERE fac_lic = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(6, factoryLisence);
        ResultSet resultSet = statement.executeQuery();
        Feed feed = null;
        if (resultSet.next()) {
            feed = new Feed();
            feed.setFactoryLisence(resultSet.getString("fac_lic"));

        }
        resultSet.close();
        statement.close();
        return feed;
    }

    public Feed getFeedByVetrinaryID(String vetrinaryID) throws SQLException {
        String query = "SELECT * FROM tblFeed WHERE vet_ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(7, vetrinaryID);
        ResultSet resultSet = statement.executeQuery();
        Feed feed = null;
        if (resultSet.next()) {
            feed = new Feed();
            feed.setVetrinaryID(resultSet.getString("vet_ID"));

        }
        resultSet.close();
        statement.close();
        return feed;
    }

    public void updateFeed(Feed feed) throws SQLException {
        String query = "UPDATE tblFeed SET feed_name = ? , size =?, purchase_price = ? , selling_price =?, fac_lic =?, vet_ID=? , quantity=?,  WHERE feed_bar_code = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, feed.getFeedBarCode());
        statement.setString(2, feed.getFeedName());
        statement.setString(3, feed.getFeedSize());
        statement.setInt(4, feed.getFeedPurchasePrice());
        statement.setInt(5, feed.getFeedSellPrice());
        statement.setString(6, feed.getFactoryLisence());
        statement.setString(7, feed.getVetrinaryID());
        statement.setInt(8, feed.getFeedQuantity());
        statement.executeUpdate();
        statement.close();
    }

    public void deleteFeed(String feedBarCode) throws SQLException {
        String query = "DELETE FROM tblFeed WHERE feed_bar_code= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, feedBarCode);
        statement.executeUpdate();
        statement.close();
    }
}
