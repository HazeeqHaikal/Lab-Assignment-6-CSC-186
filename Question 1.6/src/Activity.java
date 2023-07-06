public class Activity {
    private String activityName;
    private char organiser;
    private double budget;
    private String date;

    public Activity(String activityName, char organiser, double budget, String date) {
        this.activityName = activityName;
        this.organiser = organiser;
        this.budget = budget;
        this.date = date;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public char getOrganiser() {
        return this.organiser;
    }

    public void setOrganiser(char organiser) {
        this.organiser = organiser;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return "Activity Name: " + this.activityName + "\nOrganiser: " + this.organiser + "\nBudget: " + this.budget
                + "\nDate: " + this.date;
    }
}
