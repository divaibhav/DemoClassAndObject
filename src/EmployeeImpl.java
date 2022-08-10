public class EmployeeImpl {
    public static void main(String[] args) {
        Employee e1 = new Employee("vai",10,30,"01/02/1995",42);
        display(e1);

        Employee e2 = new Employee("Ramesh", 1110,4500,"12/12/50",72);
        display(e2);
        Employee e3 = new Employee("Suresh",1132,4500, "05/05/88", 25);
        display(e3);
    }
    public static void display(Employee object){
        System.out.println("employeeName = " + object.employeeName);
        System.out.println("employeeCode = " + object.employeeCode);
        System.out.println("salary = " + object.salary);
        System.out.println("dob = " + object.dob);
        System.out.println("age = " + object.age);

    }
}
