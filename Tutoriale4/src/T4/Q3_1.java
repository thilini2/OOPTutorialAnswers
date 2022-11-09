package T4;
import java.util.ArrayList;

public class Q3_1 {
import java.util.Collections;
    public class ComparableTest {
        public static void main(String[] args) {
// create three different bank account objects
            BankAccount ba1 = new BankAccount(100.0);
            BankAccount ba2 = new BankAccount(50.0);
            BankAccount ba3 = new BankAccount(20.0);
// put bank accounts into a list
            ArrayList<BankAccount> list = new ArrayList<BankAccount>();
            list.add(ba1);
            list.add(ba2);
            list.add(ba3);
// call the library sort method
            Collections.sort(list);
// print out the sorted list
            for (BankAccount b : list)
                System.out.println(b.getBalance());
        }
    }
}
