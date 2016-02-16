//import scanner for user input
import java.util.Scanner;
import java.util.ArrayList;

public class CommissionCalculator {

    // Main Class, used to prompt user for annual sales and output totals
    public static void main(String[] args) {

        // number of sales persons   
        final int salesPeople = 2;

        //Creates and arraylist of SalePerson
        ArrayList < SalesPerson > arrayPerson = new ArrayList < > (salesPeople);
    
        //Builds SalesPerson objects
        for (int i = 1; i <= salesPeople; i++) {
            SalesPerson xSalesPerson = new SalesPerson();
            arrayPerson.add(xSalesPerson); //Makes another Salesperson
        }

        //Outputs objects for review
        for (int i = 0; i <= (salesPeople - 1); i++) {
            SalesPerson xSalesPerson = arrayPerson.get(i);
            xSalesPerson.outputAll();
        }

        
        //find highest sales number
  
        double highest = 0, lowest = 0;
        String highestSalesPerson = "", secondHighestSalesPerson = "";

        
        for (int i = 0; i <= (salesPeople - 1); i++) {    //Finds and sets highest sales and person
            SalesPerson xSalesPerson = arrayPerson.get(i);
            if ((xSalesPerson.getAnnualSales()) > highest) {
                highest =(xSalesPerson.getAnnualSales());
                highestSalesPerson =(xSalesPerson.getName());
            }
        }

        for (int h = 0; h <= (salesPeople - 1); h++) {    //Finds and sets second highest sales and person

            SalesPerson xSalesPerson = arrayPerson.get(h);
            if (((xSalesPerson.getAnnualSales()) <= highest) && ( highestSalesPerson!= (xSalesPerson.getName()))) {
                lowest =(xSalesPerson.getAnnualSales());
                secondHighestSalesPerson =(xSalesPerson.getName());
            }
        }

        // declare highest and lowest seller


        System.out.println("The highest annual sales was $" + highest + ". This was" + " achieved by " + highestSalesPerson);
        System.out.println("The lowest annual sales was $" + lowest + ". This was" + " achieved by " + secondHighestSalesPerson + ".\n");

        double diff = highest - lowest;

        // declare difference between the highest and lowest seller

        System.out.println(secondHighestSalesPerson + " needs to increase his sales " + "by $ " + (diff + 1) + " to make more than " + highestSalesPerson);
    }
}


//_______________________________________________________________________


class SalesPerson {
    private double salary, annualSales;
    private String name;
    
    public SalesPerson() { //Constructor
        salary = 30000;
        build();
    }
    //Getters and Setters
    public void setAnnualSales(double tempD) {
        annualSales = tempD; // Accepts input
    }

    public double getAnnualSales() {
        return annualSales;
    }
    
    public void setName(String tempS) {
        name = tempS;
    }

    public String getName() {
        return name;
    }

//Working Methods//*******************************************************************
    public void build() {
        System.out.println("Building Salesperson...\n");
        Scanner sc = new Scanner(System.in ); // Creates scanner object
        
        System.out.print("Enter the sales person's name:");        
        String tempS = sc.nextLine();        
        setName(tempS);

        
        System.out.print("Enter " + name + "'s annual sales amount: $");
        double tempD = sc.nextDouble();
        setAnnualSales(tempD);
        sc.close();

    }

    public void outputAll() {
        System.out.println("Sales person:" + "\t" + name);
        System.out.println("Salary:" + "\t\t" + "$" + salary);
        System.out.println("Annual sales:" + "\t" + "$" + annualSales);
    }

}
