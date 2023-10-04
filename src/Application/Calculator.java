package Application;

class Calculator
{
    public void showMenue () {
        System.out.println("Welcome to our system..! ");
        System.out.println("\t1- Sum two Numbers");
        System.out.println("\t2- Subtract two Numbers");
        System.out.println("\t3- Divide two Numbers");
        System.out.println("\t4- Multiply two Numbers");
    }
    public void SumNum(Double num1, Double num2) {
        Double sum = num1 + num2;
        System.out.println("The Sum of numbers is :" + sum);
    }


    public void SubNum(Double num1, Double num2) {
        Double sub = num1 - num2;
        System.out.println("The Subtract of your Numbers is :" + sub);
    }

    public void DivNum(Double num1, Double num2) {
        Double div = num1 / num2;
        System.out.println("The division of your Numbers is:" + div);
    }

    public void MultNum(Double num1, Double num2) {
        Double multi = num1 * num2;
        System.out.println("The Multiply of Numbers is:" + multi);
    }
}
