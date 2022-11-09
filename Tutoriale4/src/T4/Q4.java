package T4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q4 {
    class MyComparator implements Comparator<BankAccount> {
        public int compare(BankAccount b1, BankAccount b2) {
            if (b1.balance < b2.balance)
                return -1;
            else if (b1.balance > b2.balance)
                return 1;
            else
                return 0;
        }
    }
    class BankAccount {
        double balance;
        BankAccount(double bal) {
            balance = bal;
        }
    }
    class ComparatorExample {
        public void main(String[] args) {
            BankAccount ba1 = new BankAccount(20000.0);
            BankAccount ba2 = new BankAccount(200.0);
            BankAccount ba3 = new BankAccount(550.0);
// put bank accounts into a list
            ArrayList<BankAccount> list = new ArrayList<BankAccount>();
            list.add(ba1);
            list.add(ba2);
            list.add(ba3);
// call the library sort method
            Collections.sort(list, new MyComparator());
// print out the sorted list
            for (BankAccount b : list)
                System.out.println(b.balance);
        }
    }
}
