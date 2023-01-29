import java.util.*;

public class subset {
    public static void sub(String str) {
        if (str.isEmpty()) {
            return;
        }
        System.out.print(sub(str.substring(1)));
        System.out.print(str.charAt(0) + sub(str.substring(1)));
    }

    public static void main(String[] args) {
        String str = "Lalit";
        sub(str);
    }
}