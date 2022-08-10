// if class doesn't define any constructor, then compiler will supply a constructor for creating object, that constructor is known as
// "default constructor".
public class Employee {
    //attributes
    String employeeName;
    int employeeCode;
    double salary;
    String dob;
    int age;

    Employee(String employeeName, int employeeCode, double salary, String dob, int age){
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.salary = salary;
        this.dob = dob;
        this.age = age;

    }
}
// when method or constructor variable or (parameters) are named similar to instance variable, they will shadow them. That means inside that block instance
// variable can not be accessed by name; to overcome this problem we usr ths keyword.

//this keyword is used to refer current abject
// this. memberName





























   /* public double calculateSalaryHike(double hikePercentage){
        return salary + (salary * hikePercentage/100);
    }
    public void display(){
        System.out.println("Displaying employee details");
        System.out.println("employeeName = " + employeeName);
        System.out.println("employeeCode = " + employeeCode);
        System.out.println("age = " + age);
        System.out.println("dob = " + dob);
        System.out.println("salary = " + salary);
    }

    public static void main(String[] args) {
        //declaring an object
        Employee employee ;
        //instantiation of object
        employee = new Employee();// calling constructor
        System.out.println("employee.employeeName = " + employee.employeeName);
        System.out.println("employee.employeeCode = " + employee.employeeCode);
        System.out.println("employee.age = " + employee.age);
        System.out.println("employee.dob = " + employee.dob);
        System.out.println("employee.salary = " + employee.salary);

        //accessing member function
        System.out.println("printed display method");
        employee.display();

        //assigning value to instance variable
        employee.employeeName = "Vaibhav";
        employee.employeeCode = 1234;
        employee.dob = "05/11/1983";
        employee.age = 38;
        employee.salary = 10000;


        System.out.println("employee.employeeName = " + employee.employeeName);
        System.out.println("employee.employeeCode = " + employee.employeeCode);
        System.out.println("employee.age = " + employee.age);
        System.out.println("employee.dob = " + employee.dob);
        System.out.println("employee.salary = " + employee.salary);

        //creating second object
        Employee employee1 = new Employee();
        employee1.display();

        employee1.employeeName = "Ramesh";
        employee1.display();

    }
}*/

//create the same demo code
// add one more behavior in the Employee class, that behavior is, the class will display all its attributes,
// on output screen