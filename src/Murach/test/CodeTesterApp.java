package murach.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        // calculate and display a total
        String productCode = "Android";
        String description = "Murach\'s Android Programming";
        String firstName = "Kevin";
        String lastName = "Baxter";
        double price = 57.50;
        int quantity = 2;
        double percent = 0.075;
        double total = price * quantity;
        double amount = total * percent;
        double grandTotal = total + amount;
        
        String message = 
        		"Name:	  " + firstName + " " + lastName +"\n" +
            "Code:     " + productCode + "\n" +
        		"Description: " + description + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n" +
            "Tax Percent: "+ percent + "\n" +
            "Tax Amount: "  + amount + "\n" +
            "Grand Total: " + grandTotal;
        System.out.println(message);

        // display your name        
        // TODO: add code here
        
        // calculate and display an average        
        // TODO: add code here

        // display a goodbye message
        System.out.println("Bye!");
    }
}
