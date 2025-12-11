package Pattern;

import java.io.*;

class ExTransient implements Serializable {
    private String username;

    // Transient password: It will not be serialized
    private transient String password;

    // Constructor to initialize the username and password
    public ExTransient(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters for username and password
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password != null ? password : "default_password"; // Return default password
    }

    // Method to simulate saving password in database (for demonstration purposes)
    public String saveToDatabase() {
        return "Database stores original password: " + password;
    }

    // Serialization method
    public static void serializeObject(ExTransient exTransient, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(exTransient);
            System.out.println("Object serialized to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization method
    public static ExTransient deserializeObject(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            ExTransient deserializedUser = (ExTransient) in.readObject();

            // Set the default password after deserialization
            deserializedUser.password = "default_password";
            return deserializedUser;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // Create an instance of ExTransient with a username and password
        ExTransient user = new ExTransient("john_doe", "securePassword123");

        // Print original data
        System.out.println(user.saveToDatabase());

        // Serialize the object
        String filename = "user_data.ser";
        serializeObject(user, filename);

        // Deserialize the object
        ExTransient deserializedUser = deserializeObject(filename);
        if (deserializedUser != null) {
            // Print username and default password
            System.out.println("Username: " + deserializedUser.getUsername());
            System.out.println("Password: " + deserializedUser.getPassword());
        }
    }
}
