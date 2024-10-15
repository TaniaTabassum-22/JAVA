public class Parameter {

    public static void email(String emailId, String subject) {
        System.out.println("Email sent to: " + emailId + " with subject: " + subject);
    }

    public static void phoneCall(String mobNum, String name, String countryCode) {
        System.out.println("Calling " + name + " at " + countryCode + mobNum);
    }

    public static void login(String email, String password) {
        System.out.println("Logged in with email: " + email);
    }

    public static void main(String[] args) {
        
        email("tania@gmail.com", "Meeting Tomorrow");
        email("sam@gmail.com", "Project Update");
        email("tabassum@gmail.com", "Weekend Plans");

        System.out.println("\n");

        phoneCall("9876543210", "Tania", "+91");
        phoneCall("8765432109", "Sam", "+91");
        phoneCall("7654321098", "Tabassum", "+91");

        System.out.println("\n");
        
        login("tania@gmail.com", "passwordTania");
        login("sam@gmail.com", "passwordSam");
        login("tabassum@gmail.com", "passwordTabassum");
    }
}
