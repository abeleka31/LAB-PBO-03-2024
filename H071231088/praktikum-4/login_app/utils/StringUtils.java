package login_app.utils;

public class StringUtils {
    public static String buatNicname(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length == 1) {
            return fullName;
        } else {
            return names[1];
        }
    }

}
