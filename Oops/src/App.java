


public class App {
    public static void main(String[] args) throws Exception {
        
         Person p1=new Person();
         p1.age=20;
         p1.name="Om";
    
         Person  p2=new Person();
         p2.age=30;
         p2.name="Shukla";
       
        // Calling eat & walk methods(Functions) in p1  
        p1.eat();
        p2.walk();
        p2.walk(10);
 
     }
 }

 class Person{
     String name;
     int age;

    void walk(){
        System.out.println(name + " is Walking");
    }
    void eat(){
        System.out.println(name + " is Eating");
    }
    void walk(int steps){
        System.out.println(name + " is Walking " + steps + " steps");
    }
 }