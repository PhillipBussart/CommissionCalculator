import java.util.ArrayList;
import java.util.Scanner;

public class SalesManager {

    int pop;
    double highestSalesAmount;
    String highestSalesPerson;
    double secondHighestSalesAmount;
    String secondHighestSalesPerson;



    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public double getHighestSalesAmount() {
        return highestSalesAmount;
    }

    public void setHighestSalesAmount(double highestSalesAmount) {
        this.highestSalesAmount = highestSalesAmount;
    }

    public String getHighestSalesPerson() {
        return highestSalesPerson;
    }

    public void setHighestSalesPerson(String highestSalesPerson) {
        this.highestSalesPerson = highestSalesPerson;
    }

    public double getSecondHighestSalesAmount() {
        return secondHighestSalesAmount;
    }

    public void setSecondHighestSalesAmount(double secondHighestSalesAmount) {
        this.secondHighestSalesAmount = secondHighestSalesAmount;
    }

    public String getSecondHighestSalesPerson() {
        return secondHighestSalesPerson;
    }

    public void setSecondHighestSalesPerson(String secondHighestSalesPerson) {
        this.secondHighestSalesPerson = secondHighestSalesPerson;
    }

    //Working Methods//*******************************************************************
    public void run() {
        Scanner input = new Scanner(System. in ); // Creates scanner object
        int tempI = 0;

        System.out.println("How many Sales Person would you like to build and " +
                "compare:");

        tempI = input.nextInt();
        setPop(tempI);

        System.out.println(getPop());

        ArrayList < SalesPerson > arrayPerson = new ArrayList < > (getPop());
        for (int i = 1; i <= getPop(); i++) {
            SalesPerson xSalesPerson = new SalesPerson();
            arrayPerson.add(xSalesPerson); //Makes another Salesperson
        }

        for (int i = 0; i <= (getPop() - 1); i++) {
            SalesPerson xSalesPerson = arrayPerson.get(i);
            xSalesPerson.outputAll();
        }

        //Compare mode


        System.out.println(getPop() + " sales person(s) have been created. \n");
        System.out.println("Now comapring the heighest two.");



        for (int i = 0; i <= (getPop() - 1); i++) {

            SalesPerson xSalesPerson = arrayPerson.get(i);
            if ((xSalesPerson.getAnnualSales()) > getHighestSalesAmount()) {
                setHighestSalesAmount(xSalesPerson.getAnnualSales());
                setHighestSalesPerson(xSalesPerson.getName());
            }
        }

        for (int h = 0; h <= (getPop() - 1); h++) {

            SalesPerson xSalesPerson = arrayPerson.get(h);
            if (((xSalesPerson.getAnnualSales()) <= getHighestSalesAmount()) && (getHighestSalesPerson() != (xSalesPerson.getName()))) {
                setSecondHighestSalesAmount(xSalesPerson.getAnnualSales());
                setSecondHighestSalesPerson(xSalesPerson.getName());
            }
        }


        System.out.println("\n\nThe highest sales was achieved by " + highestSalesPerson + " with " + highestSalesAmount + ".");
        System.out.println("The second highest sales was achieved by " + secondHighestSalesPerson + " with " + secondHighestSalesAmount + ".\n");


        System.out.println(secondHighestSalesPerson + " needs to make at least $" + ((highestSalesAmount - secondHighestSalesAmount) + 1) + ", to make more than " + highestSalesPerson + ".");

    }

}