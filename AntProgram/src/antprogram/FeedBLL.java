/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fatma
 */
public class FeedBLL {
    private ResultSet resultset;

    private FeedDAL feedDAL;

    public FeedBLL() {
    }

    public FeedBLL(FeedDAL feedDAL) {
        this.feedDAL = feedDAL;
    }

    public void createFeed(Feed feed) throws BusinessException {
        if (feed.getFeedBarCode() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER BarCode");
        }
        if (feed.getFeedName() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Feed NAME");
        }
        if (feed.getFeedQuantity() == 0) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Quantity");
        }
        if (feed.getFeedSize() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Size");
        }

        try {
            feedDAL.createFeed(feed);
        } catch (Exception e) {
            throw new BusinessException("Failed to Add Feed.", e);
        }
    }

    public ResultSet getAllFeeds() throws BusinessException, SQLException {
        resultset = feedDAL.getAllFeeds();
        try {
            
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve All Feeds ", e);
        }
        return resultset;
    }

    public Feed getFeedByBarCode(String feedBarCode) throws BusinessException {
        if (feedBarCode == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Bar Code");
        }

        try {
            return feedDAL.getFeedByBarCode(feedBarCode);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Feed by BarCode.", e);
        }
    }

    public Feed getFeedByName(String feedName) throws BusinessException {
        if (feedName == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Feed Name");
        }

        try {
            return feedDAL.getFeedByName(feedName);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Feed by FeedName.", e);
        }
    }

    public Feed getFeedBySize(String feedSize) throws BusinessException {
        if (feedSize == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Feed Size");
        }

        try {
            return feedDAL.getFeedBySize(feedSize);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Feed by FeedSize.", e);
        }
    }

    public Feed getFeedByPurchasePrice(int feedPurchasePrice) throws BusinessException {
        if (feedPurchasePrice == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Purchase Price");
        }

        try {
            return feedDAL.getFeedByPurchasePrice(feedPurchasePrice);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Feed by FeedPurchasePrice.", e);
        }
    }

    public Feed getFeedBySellingPrice(int feedSellingPrice) throws BusinessException {
        if (feedSellingPrice == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Selling Price");
        }

        try {
            return feedDAL.getFeedBySellingPrice(feedSellingPrice);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Feed by FeedSellingPrice.", e);
        }
    }

    public Feed getFeedByFactoryLisence(String factoryLisence) throws BusinessException {
        if (factoryLisence == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Factory Lisence");
        }

        try {
            return feedDAL.getFeedByFactoryLisence(factoryLisence);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Feed by FactoryLisence.", e);
        }
    }

    public Feed getFeedByVetrinaryID(String vetrinaryID) throws BusinessException {
        if (vetrinaryID == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Vet ID");
        }

        try {
            return feedDAL.getFeedByVetrinaryID(vetrinaryID);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Feed by VetrinaryID.", e);
        }
    }

    public void updateFeed(Feed feed) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Feed Updated", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            feedDAL.updateFeed(feed);
        } catch (Exception e) {
            throw new BusinessException("Failed to Update Feed.", e);
        }
    }

    public void deleteFeed(String feedBarCode) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Feed Deleted", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            feedDAL.deleteFeed(feedBarCode);
        } catch (Exception e) {
            throw new BusinessException("Failed to Delete Feed.", e);
        }
    }

}
