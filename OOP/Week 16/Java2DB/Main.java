import java.sql.*;

public class Main {
    
    public String dbURl;
    public Connection connection;

    public Main(String dbURL) {
        this.dbURl = dbURL; 
        
        try {
            connection = DriverManager.getConnection(this.dbURl);
        } catch (SQLException error) {
            error.printStackTrace();
        }
    }

    public void getRows() {
        String query = "SELECT * FROM data";
        try {

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while (result.next()) {

                int rollNumber = result.getInt("Rollno");
                String name = result.getString("Naam");
                String email = result.getString("Email");
                String contact = result.getString("contact");
                
                System.out.println(Integer.toString(rollNumber));
                System.out.println(name);
                System.out.println(email);
                System.out.println(contact);
                
            }

        } catch (SQLException error) {
            error.printStackTrace();
        }
    }

    public void insertRow(String name, String email, String contact) {
        String query = String.format("INSERT INTO data(Naam, Email, contact) Values('%s', '%s', '%s')", name, email, contact);
        try {
            Statement statement = connection.createStatement();

            int row = statement.executeUpdate(query);

            if (row >= 0) {
                System.out.println(row);
            }

        } catch (SQLException error) {
            error.printStackTrace();
        }

    }

    public static void main(String args[]) {

        Main database = new Main("jdbc:ucanaccess:///home/badr/SEM-2-OOP/OOP/Week 16/Java2DB/MyDB.accdb");      
        
        database.getRows();
        database.insertRow("Akbar", "Akbar@gmail.com", "4222");
        database.getRows();

    }


}