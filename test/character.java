package test;

public class character {
    
    String firstname, lastname, year, course, section;
    float midtermGrade, finalGrade;
    
    character(String firstname, String lastname, String year, String course,
              String section, float midtermGrade, float finalGrade) {
        
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;

    }
    void introduceself() {
        System.out.println();
        System.out.println("***** THIS IS YOUR INFORMATION *****");
        System.out.println();
        System.out.println("Name    : " + firstname + " " + lastname);
        System.out.println("Course  : " + course);
        System.out.println("Year    : " + year);
        System.out.println("Section : " + section);
        
    }
    void evaluateGrade() {
        float average = (midtermGrade + finalGrade) / 2;
        System.out.println("Average : " + average);
        
        String remarks = "";
        
        if(average > 100) remarks = "Invalid Grade";
        else if(average >= 98) remarks = "With Highest Honors";
        else if(average >= 95) remarks = "With High Honors";
        else if(average >= 90) remarks = "With Honors";
        else if(average >= 75) remarks = "Passed";
        else remarks = "Failed"; 
        
        System.out.println("Remarks : " + remarks);
        
        
        
        
        
    }
    
        
   
    
    
}
