//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Class and objects
    static int a =10;
    public static void main(String[] args) {
        int a=20;
        //creating Object for main class
        Main main = new Main();
        //Printing main object
        System.out.println(main);
        //prints local variable
        System.out.println(a);
        //prints static variable
        System.out.println(Main.a);

        //Abstraction Example
        BMW bmw = new BMW();
        System.out.println(bmw);
        bmw.musicCompany();
        bmw.hornSound();

        //Encapsulation
        Employee navnith = new Employee();
        System.out.println(navnith);
        navnith.setEmpid(2081123);
        System.out.println(navnith.getEmpid());
        navnith.setEname("Navneeth Kumar");
        System.out.println(navnith.getEname());

        //Inheritance
        Mobile iphone = new Mobile();
        System.out.println(iphone);
        System.out.println(iphone.imei_number);
        System.out.println(iphone.getLifeSpan());
        iphone.getBatteryPercentage();

        //polymorphism
        Calculation calculation = new Calculation();
        System.out.println(calculation);
        System.out.println(calculation.sum(10,20));
        System.out.println(calculation.sum(10.0,20.0));
        System.out.println(calculation.sum(10,20, 30));

    }
}