package rs.set.sac;

/**
 * Created by set.rs on 23-May-17.
 */

public class LoginValidator {

    public static boolean isValidUsername(String username) {
        if (!username.isEmpty()) return true;
        else return false;
    }
}
