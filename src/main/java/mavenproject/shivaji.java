package mavenproject;

public class UserAuth {
	

    public static boolean authenticate(String username, String password) {
        System.out.println("Shivaji changed file");
        return username.equals(STORED_USERNAME) && password.equals(STORED_PASSWORD);
    }


}
