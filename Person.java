package GuviJavaPractices3;

public class Person {
    String Name = "Thirumalaivasan Perumal";
    int Age = 23;

    public void getPersonDetails(){
        System.out.println(Name);
        System.out.println(Age);
    }

    Person(){
        System.out.println(Name);
        System.out.println(Age);
    }
    public static void main(String[] args){
        Person myObj= new Person();
        myObj.getPersonDetails();
    }
}
