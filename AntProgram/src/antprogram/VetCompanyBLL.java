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
public class VetCompanyBLL {

    private VetCompanyDAL vetCompanyDAL;

    public VetCompanyBLL() {
    }

    public VetCompanyBLL(VetCompanyDAL vetCompanyDAL) {
        this.vetCompanyDAL = vetCompanyDAL;
    }

    public void createVetCompany(VetCompany vetCompany) throws BusinessException {
       if (vetCompany.getCompanyLicense()== null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Lisence");
        }
        if (vetCompany.getCompanyName()== null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Company NAME");
        }
        if (vetCompany.getCompanyPhone()== null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Company PHONE");
        }
        if (vetCompany.getCompanyAddress()== null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Company Address");
        }
        try {
            vetCompanyDAL.createVetCompany(vetCompany);
        } catch (Exception e) {
            throw new BusinessException("Failed to create Vet Company",e);
        }
    }

    public List<VetCompany> getAllVetCompany() throws BusinessException, SQLException {
          List<VetCompany> vetCom = vetCompanyDAL.getAllVetCompany();
      try{
            for (VetCompany com : vetCom) {
                System.out.println(com.getCompanyLicense() + ", " + com.getCompanyName());
            }
      }catch(Exception e){
          System.out.println("Failed to retrieve All Vet Companies . "+e);
      }
        return vetCom;
    }
   
    public VetCompany getVetCompanyByCompanyLicense(String companylicense) throws BusinessException {
        if (companylicense == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Company Lisence");
        }
        try {
            return vetCompanyDAL.getVetCompanyByCompanyLicense(companylicense);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vet company by license",e);
        }
    }

    public VetCompany getVetCompanyByCompanyName(String companyName) throws BusinessException {
       if (companyName == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Company Name");
        }
        try {
            return vetCompanyDAL.getVetCompanyByCompanyName(companyName);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vet company by name ",e);
        }
    }

    public VetCompany getVetCompanyByCompanyCity(String companyCity) throws BusinessException {
        if (companyCity == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Company City");
        }
        try {
            return vetCompanyDAL.getVetCompanyByCompanyCity(companyCity);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vet company by city",e);
        }
    }

    public VetCompany getVetCompanyByCompanyPhone(String companyPhone) throws BusinessException {
        if (companyPhone == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Company Phone");
        }
        try {
            return vetCompanyDAL.getVetCompanyByCompanyPhone(companyPhone);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vet company by phone",e);
        }
    }

    public VetCompany getVetCompanyByCompanyAddress(String companyAddress) throws BusinessException {
         if (companyAddress == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Company Address");
        }
        try {
            return vetCompanyDAL.getVetCompanyByCompanyAddress(companyAddress);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Vet company by address",e);
        }
    }

    public void updateVetCompany(VetCompany vetCompany) throws BusinessException {
       if (JOptionPane.showConfirmDialog(null, "Are you sure ?", " Vet Company Updated", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            vetCompanyDAL.updateVetCompany(vetCompany);
        } catch (Exception e) {
            throw new BusinessException("Failed to update Vet company",e);
        }
    }

    public void deleteVetCompany(String companyLicense) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", " Vet Company deleted", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            vetCompanyDAL.deleteVetCompany(companyLicense);
        } catch (Exception e) {
            throw new BusinessException("Failed to delete  Vet company",e);
        }
    }
}
