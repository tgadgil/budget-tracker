import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class BudgetApp {
    public static void main(String[] args) {

    /*  BudgetCategory Groceries = new BudgetCategory("Groceries", 1200, 250.55);
        //testing
        System.out.println(Groceries.getCat());
        System.out.println(Groceries.getBudget());
        System.out.println(Groceries.getSpent());
        System.out.println(Groceries);
    */    
        //ArrayList for budget categories
        List<BudgetCategory> categories = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            //new budgetcategory object
            BudgetCategory cat1 = new BudgetCategory(category, limit, spent);
            //add new objects to categories ArrayList
            categories.add(cat1);

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);
            // System.out.println("The budget limit for " + category + " was: " + limitString + 
            //                     " but the actual spend was " + spentString);
        }
        System.out.println(categories);
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        return -1;
    }
}
