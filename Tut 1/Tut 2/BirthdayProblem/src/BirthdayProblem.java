public class BirthdayProblem {
    public static void main(String[] args) {
// how many runs we will execute the simulation
        int number_of_runs = 10000;
        int total_people = 0;
        for (int i=1; i<=number_of_runs; i++) {
            int people = singleRun();
            total_people = total_people + people;
        }
// the result is the average of the total
        System.out.println(total_people/number_of_runs);
    }
    public static int singleRun() {
/* position i of the array contains true if someone with
birthday on day i has already entered the room. Otherwise
it contains false. All elements are initially set to false */
        boolean birthdayInRoom[] = new boolean[365];
// how many people have entered the room so far
        
        int number_of_people = 0;
        while (true) {
            ++number_of_people; // 1 more person has entered the room
/* generate a random birthday in the range [0,364] simulating
that someone with that birthday enters the room */
            int day = (int) (365*Math.random()); // you can use java.util.Random instead
            if (birthdayInRoom[day]) // if true
                break;
            else
                birthdayInRoom[day] = true;
        }
        return number_of_people;
    }
}





