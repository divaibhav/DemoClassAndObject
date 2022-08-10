// but for classes available in java.lang package, we do not need import statement

import java.util.Random;


public class AutoGenerateLogic {
    public static void main(String[] args) {
        // generating a number
        //ClassName.methodName();-> calling an static method of the given Class, known by ClassName
        Math.random();//-> calling a static method of the given Math class, rando is the method in Math
       int number =  (int)(Math.random()*10);
        //System.out.println(number);

        Random obj = new Random();
        for (int i = 0; i < 50; i++) {
            System.out.print(obj.nextLong(1000000000000L)+", ");
        }



    }

    public static void disply() {
    }

    public void show(){

    }
    public void doNotShow(){
        // calling a non-static method from non-static method of same class by using
        show();
    }
}
