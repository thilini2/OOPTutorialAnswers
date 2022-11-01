public class Employee {

    private String name;
    private double salary;


    public  String getName(String name){
        return name;
    }

    public double getSalary(double salary){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public Employee(){
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name , double salary){
        this.name =  name;
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "\nName: "  + this.name + "\nSalary" + "\n";
    }


}
