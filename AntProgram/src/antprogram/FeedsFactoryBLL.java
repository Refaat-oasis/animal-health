/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fatma
 */
public class FeedsFactoryBLL {

    private FeedsFactoryDAL feedsFactoryDAL;

    public FeedsFactoryBLL() {
    }

    public FeedsFactoryBLL(FeedsFactoryDAL feedsFactoryDAL) {
        this.feedsFactoryDAL = feedsFactoryDAL;
    }

    public void createFeedsFactory(FeedFactory factory) throws BusinessException {
        if (factory.getFactoryLicense() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Lisence");
        }
        if (factory.getFactoryName() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Factory NAME");
        }
        if (factory.getFactoryPhone() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Factory PHONE");
        }
        if (factory.getFactoryAddress() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Address");
        }

        try {
            feedsFactoryDAL.createFeedsFactory(factory);
        } catch (Exception e) {
            throw new BusinessException("Failed to Sign up .", e);
        }
    }

    public List<FeedFactory> getAllFeedsFactory() throws BusinessException, SQLException {
        List<FeedFactory> feedFact = feedsFactoryDAL.getAllFeedsFactory();
        try {
            for (FeedFactory fedFact : feedFact) {
                System.out.println(fedFact.getFactoryLicense() + ", " + fedFact.getFactoryName());
            }
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve All FeedsFactories ", e);
        }
        return feedFact;
    }

    public FeedFactory getFeedFactoryByLicense(String lisence) throws BusinessException {
      
        if (lisence == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Lisence");
        }
        try {
            feedsFactoryDAL.getFeedFactoryByLicense(lisence);
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve FeedFactory by License .", e);
        }
        return null;
    }

    public FeedFactory getFeedFactoryByName(String name) throws BusinessException {

        if (name == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Name");
        }
        try {
            feedsFactoryDAL.getFeedFactoryByName(name);
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve FeedFactory by name .", e);
        }
        return null;
    }

    public FeedFactory getFeedFactoryByAddress(String address) throws BusinessException {

        if (address == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Address");
        }
        try {
            feedsFactoryDAL.getFeedFactoryByAddress(address);
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve FeedFactory by address .", e);
        }
        return null;
    }

    public FeedFactory getFeedFactoryByPhoneNumber(String phonenumber) throws BusinessException {
        if (phonenumber == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Phone Number");
        }

        try {
            feedsFactoryDAL.getFeedFactoryByPhoneNumber(phonenumber);
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve FeedFactory by phone number .", e);
        }
        return null;
    }

    public FeedFactory getFeedFactoryByCity(String city) throws BusinessException {
        if (city == null) {
            JOptionPane.showMessageDialog(null, "Please Enter City");
        }

        try {
            feedsFactoryDAL.getFeedFactoryByCity(city);
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve FeedFactory by city .", e);
        }
        return null;

    }

    public void updateFeedFactory(FeedFactory factory) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Feed Factory Updated", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);

        try {
            feedsFactoryDAL.updateFeedFactory(factory);
        } catch (Exception e) {
            throw new BusinessException("Failed to Update FeedFactory .", e);
        }
    }

    public void deleteFeedFactory(String license) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Feed Factory deleted", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);

        try {
            feedsFactoryDAL.deleteFeedFactory(license);
        } catch (Exception e) {
            throw new BusinessException("Failed to delete FeedFactory .", e);
        }
    }

}
