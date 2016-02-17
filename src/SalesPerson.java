import java.util.Scanner;

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


    }

    public void outputAll() {
        System.out.println("Sales person:" + "\t" + name);
        System.out.println("Salary:" + "\t\t" + "$" + salary);
        System.out.println("Annual sales:" + "\t" + "$" + annualSales);
    }

}
