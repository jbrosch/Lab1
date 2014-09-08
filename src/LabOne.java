    import java.util.Scanner;


    public class LabOne {

    public static double PV(double annual_return2, double years_retired, double required_income, double monthly_SSI){

    return (required_income-monthly_SSI)*((1-Math.pow(1+annual_return2/12,-years_retired*12))/(annual_return2/12));

    }

    public static double PMT(double years2work, double annual_return1, double PV){ 

    double rate = annual_return1/12;

    double A = PV*rate;

    double exp = Math.pow(1+rate,years2work*12)-1;

    return A/exp;

    
    }

    public static void main(String[] args) {

    // TODO Auto-generated method stub

    //Create a Scanner

    Scanner input = new Scanner(System.in);


    //Enter annual interest rate

    System.out.print("Enter annual interest rate: ");

    double annualInterestRate = input.nextDouble();

    //annual interest rate

    System.out.print("Enter number of years you plan to draw: ");

    double yearsToDraw = input.nextDouble();

    //required income

    System.out.print("Enter your required income: ");

    double requiredIncome = input.nextDouble();

    //SSI

    System.out.print("Enter your expected SSI amount: ");

    int expectedSSI = input.nextInt();

    //	Display results

    double PV = PV(annualInterestRate,yearsToDraw,requiredIncome,expectedSSI);

    System.out.println("You will need to save $"+PV);

    System.out.print("Enter your years to work: ");

    double yearsToWork = input.nextDouble();

    System.out.print("Enter the annual interest for deposit: ");

    double depositInterest = input.nextDouble();
    
    System.out.println("You will need to deposit $" + PMT(yearsToWork,depositInterest,PV)+"per month");
    }
    }

   


