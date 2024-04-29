package task1;

import task1.AbstractFantasy;
import task1.Dream;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // Assuming these are the attributes of the task1.Fantasy class
    private String sakartvelo1;
    private String performance2;
    private String studentName;

    // Constructor to initialize attributes
    public Fantasy(String sakartvelo1, String performance2, String studentName) {
        this.sakartvelo1 = sakartvelo1;
        this.performance2 = performance2;
        this.studentName = "Shalikashvili Mariam";
    }

    @Override
    public String getSakartvelo1() {
        return sakartvelo1;
    }

    @Override
    public String getPerformance2() {
        return performance2;
    }

    @Override
    public String methodPizza3(String argInorganic5) {
        // Example implementation: Concatenate argument with student name
        return "Pizza with " + argInorganic5 + " requested by " + studentName;
    }

    @Override
    public List<String> methodCalculator4(String argDepreciation6) {
        // Example implementation: Split the argument and return as a list
        return List.of(argDepreciation6.split(","));
    }

    @Override
    public String toString() {
        // Example implementation: String representation of task1.Fantasy object
        return "task1.Fantasy[studentName='" + studentName + "', sakartvelo1='" + sakartvelo1 + "', performance2='" + performance2 + "']";
    }
}
