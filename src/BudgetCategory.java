public class BudgetCategory {
    private String cat;
    private int budget;
    private double spent;

    public BudgetCategory(String cat, int budget, double spent) {
        this.cat = cat;
        this.budget = budget;
        this.spent = spent;
    }

    public String getCat() {
        return cat;
    }

    public int getBudget() {
        return budget;
    }

    public double getSpent() {
        return spent;
    }

    public String toString() {
        String catStyle = cat.toUpperCase();
        String budgetStyle = "Budget: " + budget;
        String actualStyle = "Actual: " + spent; 
        String report = catStyle + "\n" + budgetStyle + "\n" + actualStyle;
        return report;
    }
}