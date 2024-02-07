package sept.eight.util;

import java.util.Calendar;

public class SuperDataUtil {
    public static int currentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
