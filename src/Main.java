import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "1234";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Conexiune reușită!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
