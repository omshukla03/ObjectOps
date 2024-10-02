


public class App {
    public static void main(String[] args) throws Exception {
        
         Person p1=new Person(20,"Om Shukla");
         Person p2=new Person();
         p2.name="Om";
         p2.age=20;


         System.out.println(Person.count);
    
      
        
 
     }
 }

 class Person{
     String name;
     int age;

     static int count;

//	Checking Our Default Constructor
        public Person(){
            count++;
            System.out.println("Creating an Object");
        }

        //Constructor overloading
        public Person(int newAge,String name){
            this();
                this.name=name;
                age=newAge;
        }

 
 }