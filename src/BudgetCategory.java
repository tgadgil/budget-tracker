public class BudgetCategory {
    private String cat;
    private double budget;
    private double spent;

    public BudgetCategory(String cat, double budget, double spent) {
        this.cat = cat;
        this.budget = budget;
        this.spent = spent;
    }

    public String getCat() {
        return cat;
    }

    public double getBudget() {
        return budget;
    }

    public double getSpent() {
        return spent;
    }

    public String toString() {
        String catStyle = "\n=====================\n" + cat.toUpperCase() + "\n---------------------";
        String budgetStyle = "Budget: $" + budget;
        String actualStyle = "Actual: $" + spent; 
        String report = catStyle + "\n" + budgetStyle + "\n" + actualStyle;
        return report;
    }
}