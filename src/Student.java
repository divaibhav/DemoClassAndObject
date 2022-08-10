// if class doesn't define any constructor, then compiler will supply a constructor for creating object, that constructor is known as
// "default constructor".

//default constructor is of type no-argument constructor
// default constructor will initialize all the attributes to default values
public class Student {
    int rollNo;
    String name;
    Student(){
        // not writing anything
        // initializing

    }

    public static void main(String[] args) {
        Student s1 = new Student();// calling the constructor
        System.out.println("s1.name = " + s1.name);
        System.out.println("s1.rollNo = " + s1.rollNo);
        Student s2 = new Student();
        System.out.println("s2.name = " + s2.name);
        System.out.println("s2.rollNo = " + s2.rollNo);

       /* s1.name = "Suresh";
        System.out.println("s1.name = " + s1.name);
        System.out.println("s1.rollNo = " + s1.rollNo);

        System.out.println("s2.name = " + s2.name);
        System.out.println("s2.rollNo = " + s2.rollNo);*/

    }
}
