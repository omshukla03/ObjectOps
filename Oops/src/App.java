public class App {
    public static void main(String[] args) throws Exception {
        // Create an Object(P1,P2) of Class Person
        Person p1=new Person();
        p1.age=20;
        p1.name="Om";
        System.out.println(p1.age+" "+p1.name);

        Person  p2=new Person();
        p2.age=30;
        p2.name="Shukla";
        System.out.println(p2.age+" "+p2.name);


    }
}
//Create a Class Named Person
class Person{
    String name;
    int age;
}