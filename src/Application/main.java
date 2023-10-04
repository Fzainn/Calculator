package Application;

import java.util.Scanner;

public class main  {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculator c = new Calculator();
        c.showMenue();
        System.out.println("Enter your choise:");
        int choices = input.nextInt();
        System.out.println("Enter two Numbers:");
        Double num1 = input.nextDouble();
        Double num2 = input.nextDouble();

        switch (choices) {
            case 1:
                c.SumNum(num1,num2);
                break;
            case 2:
                c.SubNum(num1,num2);
                break;
            case 3:
                c.DivNum(num1,num2);
                break;
            case 4:
                c.MultNum(num1,num2);
                break;

        }


    }
}
