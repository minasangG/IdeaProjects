package SDPT;

import java.sql.SQLOutput;

public class CStudent {

    String firstname, lastname, year, course, section;
    double midtermGrade, finalGrade;

    public CStudent(String firstName, String lastName,
                    String year, String course,
                    String section, double midtermGrade,
                    double finalGrade) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;

    }
    void introduceSelf() {
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
        System.out.println("Section: " + section);

    }
    void evaluateGrade() {
        float endGameAverage = (float) ((midtermGrade + finalGrade) / 2);
        System.out.println("Average: " + endGameAverage);
        //String result = "";

        if (endGameAverage > 100) {
            System.out.println("Invalid Grade! Taena_mo");
        } else if (endGameAverage >= 98)
            System.out.println("With Highest Honors");
        else if (endGameAverage >= 95)
            System.out.println("With High Honors");
        else if (endGameAverage >= 90)
            System.out.println("With Honors");
        else if (endGameAverage >= 75)
            System.out.println("Passed");
        else
            System.out.println("Palakol");
        System.out.println(" ");

        //System.out.println("Result: " + result);

    }
}
