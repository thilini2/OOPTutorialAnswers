public class Concat {
    public static void main(String[] args){
        String animal1="quick brown fox";
        String animal2="lazy dog";
        String article="the";
        String action="jumps over";

        String total=article.concat("").concat(
                animal1).concat("").concat(action).concat(
                        "the").concat(animal2);
        //article + " " + animal1 + " " + action + " the " + animal2;
        System.out.println(total);
        System.out.println("Length of string: " + total.length());
    }
}
