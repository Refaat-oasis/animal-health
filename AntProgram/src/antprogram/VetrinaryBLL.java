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
public class VetrinaryBLL {

    private VetrinaryDAL vetrinaryDAL;

    public VetrinaryBLL() {
    }

    public VetrinaryBLL(VetrinaryDAL vetrinaryDAL) {
        this.vetrinaryDAL = vetrinaryDAL;
    }

    public void createVetrinary(Vetrinary vetrinary) throws BusinessException {
        if (vetrinary.getVetID() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER ID");
        }
        if (vetrinary.getVetFirstName() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER YOUR NAME");
        }
        if (vetrinary.getVetPhone() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER YOUR PHONE");
        }
        if (vetrinary.getVetPassword() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER YOUR PASSWORD");
        }
        try {
            vetrinaryDAL.createVetrinary(vetrinary);

        } catch (SQLException e) {
            throw new BusinessException("Failed to create Vetrinary  .", e);
        }
    }

    public List<Vetrinary> getAllVetrinary() throws BusinessException, SQLException {
        List<Vetrinary> vet = vetrinaryDAL.getAllVetrinary();
        vetrinaryDAL.getAllVetrinary();
        try {
            for (Vetrinary v : vet) {
                System.out.println(v.getVetID() + ", " + v.getVetFirstName());
            }
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vetrinaries.", e);
        }
        return vet;
    }

    public Vetrinary getVetrinaryByID(String vetID) throws BusinessException {
        if (vetID == null) {
            JOptionPane.showMessageDialog(null, "Please Enter ID");
        }

        try {
            return vetrinaryDAL.getVetrinaryByID(vetID);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vetrinary by ID.", e);
        }
    }

    public Vetrinary getVetrinaryByFirstName(String vetFirstname) throws BusinessException {
        if (vetFirstname == null) {
            JOptionPane.showMessageDialog(null, "Please Enter First Name");
        }

        try {
            return vetrinaryDAL.getVetrinaryByFirstName(vetFirstname);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vetrinary by First name.", e);
        }
    }

    public Vetrinary getVetrinaryByLastName(String vetLastname) throws BusinessException {
        if (vetLastname == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Last Name");
        }
        try {
            return vetrinaryDAL.getVetrinaryByLastName(vetLastname);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vetrinary by Last name.", e);
        }
    }

    public Vetrinary getVetrinaryByPhone(String vetPhone) throws BusinessException {
        if (vetPhone == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Phone");
        }
        try {
            return vetrinaryDAL.getVetrinaryByPhone(vetPhone);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vetrinary by vet Phone.", e);
        }
    }

    public Vetrinary getVetrinaryByAddress(String vetAddress) throws BusinessException {
        if (vetAddress == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Address");
        }
        try {
            return vetrinaryDAL.getVetrinaryByAddress(vetAddress);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vetrinary by vet Address.", e);
        }
    }

    public Vetrinary getVetrinaryByCity(String vetCity) throws BusinessException {
        if (vetCity == null) {
            JOptionPane.showMessageDialog(null, "Please Enter City");
        }
        try {
            return vetrinaryDAL.getVetrinaryByCity(vetCity);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vetrinary by vet City.", e);
        }
    }

    public void updateVetrinary(Vetrinary vet) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Vetrinary Updated", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            vetrinaryDAL.updateVetrinary(vet);
        } catch (Exception e) {
            throw new BusinessException("Failed to update Vetrinary.", e);
        }
    }

    public void deleteVetrinary(String vetID) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Vetrinary deleted", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            vetrinaryDAL.deleteVetrinary(vetID);
        } catch (Exception e) {
            throw new BusinessException("Failed to delete Vetrinary .", e);
        }
    }
}
