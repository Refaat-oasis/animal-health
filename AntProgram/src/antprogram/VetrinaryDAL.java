/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class VetrinaryDAL {

    private Connection connection;

    public VetrinaryDAL(Connection connection) {
        this.connection = connection;
    }

    public void createVetrinary(Vetrinary vet) throws SQLException {
        String query = "INSERT INTO tblVetrinary (ID , first_name , last_name, phone_number, address, city, password) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vet.getVetID());
        statement.setString(2, vet.getVetFirstName());
        statement.setString(3, vet.getVetLastName());
        statement.setString(4, vet.getVetPhone());
        statement.setString(5, vet.getVetAddress());
        statement.setString(6, vet.getVetCity());
        statement.setString(7, vet.getVetPassword());
        statement.executeUpdate();
        statement.close();

    }

    public List<Vetrinary> getAllVetrinary() throws SQLException {
        List<Vetrinary> vets = new ArrayList<>();
        String query = "SELECT * FROM tblVetrinary";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Vetrinary vet = new Vetrinary();
            vet.setVetID(resultSet.getString("ID"));
            vet.setVetFirstName(resultSet.getString("first_name"));
            vet.setVetLastName(resultSet.getString("last_name"));
            vet.setVetPhone(resultSet.getString("phone_number"));
            vet.setVetAddress(resultSet.getString("address"));
            vet.setVetCity(resultSet.getString("city"));
            vet.setVetPassword(resultSet.getString("password"));

            vets.add(vet);
        }
        resultSet.close();
        statement.close();
        return vets;
    }

    public Vetrinary getVetrinaryByID(String vetID) throws SQLException {
        String query = "SELECT * FROM tblVetrinary WHERE ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetID);
        ResultSet resultSet = statement.executeQuery();
        Vetrinary vet = null;
        if (resultSet.next()) {
            vet = new Vetrinary();

            vet.setVetID(resultSet.getString("ID"));
            vet.setVetFirstName(resultSet.getString("first_name"));
            vet.setVetLastName(resultSet.getString("last_name"));
            vet.setVetPhone(resultSet.getString("phone_number"));
            vet.setVetAddress(resultSet.getString("address"));
            vet.setVetCity(resultSet.getString("city"));
            vet.setVetPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return vet;
    }

    public Vetrinary getVetrinaryByFirstName(String vetFirstName) throws SQLException {
        String query = "SELECT * FROM tblVetrinary WHERE first_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetFirstName);
        ResultSet resultSet = statement.executeQuery();
        Vetrinary vet = null;
        if (resultSet.next()) {
            vet = new Vetrinary();

            vet.setVetID(resultSet.getString("ID"));
            vet.setVetFirstName(resultSet.getString("first_name"));
            vet.setVetLastName(resultSet.getString("last_name"));
            vet.setVetPhone(resultSet.getString("phone_number"));
            vet.setVetAddress(resultSet.getString("address"));
            vet.setVetCity(resultSet.getString("city"));
            vet.setVetPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return vet;
    }

    public Vetrinary getVetrinaryByLastName(String vetLastName) throws SQLException {
        String query = "SELECT * FROM tblVetrinary WHERE last_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetLastName);
        ResultSet resultSet = statement.executeQuery();
        Vetrinary vet = null;
        if (resultSet.next()) {
            vet = new Vetrinary();

            vet.setVetID(resultSet.getString("ID"));
            vet.setVetFirstName(resultSet.getString("first_name"));
            vet.setVetLastName(resultSet.getString("last_name"));
            vet.setVetPhone(resultSet.getString("phone_number"));
            vet.setVetAddress(resultSet.getString("address"));
            vet.setVetCity(resultSet.getString("city"));
            vet.setVetPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return vet;
    }

    public Vetrinary getVetrinaryByPhone(String vetPhone) throws SQLException {
        String query = "SELECT * FROM tblVetrinary WHERE phone_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetPhone);
        ResultSet resultSet = statement.executeQuery();
        Vetrinary vet = null;
        if (resultSet.next()) {
            vet = new Vetrinary();

            vet.setVetID(resultSet.getString("ID"));
            vet.setVetFirstName(resultSet.getString("first_name"));
            vet.setVetLastName(resultSet.getString("last_name"));
            vet.setVetPhone(resultSet.getString("phone_number"));
            vet.setVetAddress(resultSet.getString("address"));
            vet.setVetCity(resultSet.getString("city"));
            vet.setVetPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return vet;
    }

    public Vetrinary getVetrinaryByAddress(String vetAddress) throws SQLException {
        String query = "SELECT * FROM tblVetrinary WHERE address = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetAddress);
        ResultSet resultSet = statement.executeQuery();
        Vetrinary vet = null;
        if (resultSet.next()) {
            vet = new Vetrinary();

            vet.setVetID(resultSet.getString("ID"));
            vet.setVetFirstName(resultSet.getString("first_name"));
            vet.setVetLastName(resultSet.getString("last_name"));
            vet.setVetPhone(resultSet.getString("phone_number"));
            vet.setVetAddress(resultSet.getString("address"));
            vet.setVetCity(resultSet.getString("city"));
            vet.setVetPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return vet;
    }

    public Vetrinary getVetrinaryByCity(String vetCity) throws SQLException {
        String query = "SELECT * FROM tblVetrinary WHERE city = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetCity);
        ResultSet resultSet = statement.executeQuery();
        Vetrinary vet = null;
        if (resultSet.next()) {
            vet = new Vetrinary();

            vet.setVetID(resultSet.getString("ID"));
            vet.setVetFirstName(resultSet.getString("first_name"));
            vet.setVetLastName(resultSet.getString("last_name"));
            vet.setVetPhone(resultSet.getString("phone_number"));
            vet.setVetAddress(resultSet.getString("address"));
            vet.setVetCity(resultSet.getString("city"));
            vet.setVetPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return vet;
    }

    public void updateVetrinary(Vetrinary vet) throws SQLException {
        String query = "UPDATE tblVetrinary SET ID = ?, first_name = ? , last_name = ?, phone_number = ?, address = ?, city = ?, password = ? WHERE ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vet.getVetID());
        statement.setString(2, vet.getVetFirstName());
        statement.setString(3, vet.getVetLastName());
        statement.setString(4, vet.getVetPhone());
        statement.setString(5, vet.getVetAddress());
        statement.setString(6, vet.getVetCity());
        statement.setString(7, vet.getVetPassword());
        statement.executeUpdate();
        statement.close();
    }

    public void deleteVetrinary(String vetID) throws SQLException {
        String query = "DELETE FROM tblVetrinary WHERE ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetID);
        statement.executeUpdate();
        statement.close();
    }

}
