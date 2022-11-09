package T4;

public class Q1 {
    interface Printable {
        void print();
    }
    class Letter implements Printable {
        private String text;
        Letter(String text) {
            this.text = text;
        }
        public void print() {
            System.out.println("text: " + text);
        }
    }
    class Student implements Printable {
        private String name;
        private String grades[] = new String[5];
        Student(String name, String grades[]) {
            this.name = name;
            int i = 0;
// copy the first 5 elements of argument to instance field grades
            while (i < 5 && i < grades.length) {
                this.grades[i] = grades[i];
                ++i;
            }
        }
        public void print() {
            System.out.println("name: " + name);
            System.out.print("grades: ");
            for (String s : grades)
                System.out.print(s + " ");
            System.out.println();
        }
    }
    public class PrintTest {
        public void main(String[] args) {
            String grades1[] = {"A", "B", "B", "A", "C"};
            Student s1 = new Student("John", grades1);
            s1.print();
            String grades2[] = new String[5];
            grades2[0] = "C";
            grades2[1] = "A";
            grades2[2] = "B";
            grades2[3] = "D";
            grades2[4] = "F";
            Student s2 = new Student("Helen", grades2);
            s2.print();
            Letter l1 = new Letter("myletter");
            l1.print();
        }
    }
}
