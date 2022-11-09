package T4;
import java.util.*;

public class Passport extends card{
    private String birthLocation;
    private int expirationYear;
    public boolean isExpired() {
// find out the current year
        GregorianCalendar calendar = new GregorianCalendar();
        int current_year = calendar.get(Calendar.YEAR);
        if (expirationYear < current_year)
            return true;
        else
            return false;
    }
}
