
public class Main {
    public static void main(String[] args) {
        String username = "admin_user";
        String password = "SecreT123!";  // Leaked credential

        System.out.println("Connecting to database as user: " + username);
        if ("SecreT123!".equals(password)) {
            System.out.println("Connected successfully.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
