//import scanner for user input
import java.util.ArrayList;

public class CommissionCalculator {

    // Main Class, used to prompt user for annual sales and output totals
    public static void main(String[] args) {

        // number of sales persons   
        final int salesPeople = 4;

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

        System.out.println("The application is ready to close");
    }

}

