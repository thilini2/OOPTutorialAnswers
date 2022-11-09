package T4;

public class CreditCard extends card {
    private int pinNumber;
    private int number;
    public boolean isExpired() {
// assume credit cards never expire
        return false;
    }

}
