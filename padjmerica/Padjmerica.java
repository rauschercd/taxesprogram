import java.util.Scanner;

public class Padjmerica
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double originalmoney;
        double money;
        double age;
        double kids;
        double discount;
        double tax;
        double tax1;
        double tax2;
        double tax3;
        double total;
        double finaltotal;

        System.out.println("How much money do you make?");
        originalmoney = scan.nextInt();

        System.out.println("How old are you?");
        age = scan.nextInt();

        System.out.println("How many children do you have?");
        kids = scan.nextInt();

        if(originalmoney < 10000) {
            total = 10000;
        } else if(originalmoney >= 10000 && originalmoney < 25000) {
            money = originalmoney - 10000;
            tax = money * 0.10;
            total = money - tax;
        } else if(originalmoney >= 25000 && originalmoney < 75000) {
            money = originalmoney - 25000;
            tax1 = 1500;
            tax = money * 0.20;
            total = originalmoney - tax - tax1;
        } else if(originalmoney >= 75000 && originalmoney < 250000) {
            money = originalmoney - 75000;
            tax1 = 1500;
            tax2 = 10000;
            tax = money * 0.30;
            total = originalmoney - tax - tax1 - tax2;
        } else {
            money = originalmoney - 75000;
            tax1 = 1500;
            tax2 = 10000;
            tax3 = 52500;
            tax = money * 0.30;
            total = originalmoney - tax - tax1 - tax2 - tax3;
        }

        System.out.println("Your total is: " + total);
    }
}