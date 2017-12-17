
package assignment2;

/**
 *
 * @author Dylan
 */
public class Assignment2 {
    //declare arrays so all methods can call them
    private static String[] students;
    private static double[][] grades;
    private static double[] studentsAvg;
    
    public static void main(String[] args) {
        initializeData();
        displayData();
        highestAvg();
        below50Avg();
    }
    
    /**
     * Method that initializes 5 students and grades for 5 courses and populates data.
     */
    public static void initializeData() {
        //Give students array some values
        students = new String[] {"James", "Luke", "Alex", "Jenny","Blake"};
        
        //give 2D grades array some values
        grades = new double[][] {{98, 72, 85, 77, 90},{25,49,26,77,60},{13,8,46,52,28},{77,81,85,69,88},{48,55,64,77,52}}; 
    }
    
    /**
     * Method that takes the data from initializeData() and displays it to the screen.
     */
    public static void displayData() {
        System.out.printf("%-8s %-10s %-10s %-10s %-10s %-10s %n", "Student", "Course 1", "Course 2", "Course 3", "Course 4", "Course 5");
        
        for(int i = 0; i<students.length; i++) {
            System.out.printf("%-9s",students[i]);
            for(int j = 0; j<grades.length; j++) {
                System.out.printf("%-11.0f",grades[i][j]);
            }
            System.out.println("");
        }
    }
    
    /**
     * Method that will calculate what student has the highest overall average and display it to the screen.
     */
    public static void highestAvg() {
        double student1Avg = (grades[0][0] + grades[0][1] + grades[0][2] + grades[0][3] + grades[0][4]) / 5;
        double student2Avg = (grades[1][0] + grades[1][1] + grades[1][2] + grades[1][3] + grades[1][4]) / 5;
        double student3Avg = (grades[2][0] + grades[2][1] + grades[2][2] + grades[2][3] + grades[2][4]) / 5;
        double student4Avg = (grades[3][0] + grades[3][1] + grades[3][2] + grades[3][3] + grades[3][4]) / 5;
        double student5Avg = (grades[4][0] + grades[4][1] + grades[4][2] + grades[4][3] + grades[4][4]) / 5;
        
        studentsAvg = new double[] {student1Avg, student2Avg, student3Avg, student4Avg, student5Avg};
        
        double highestAvg = studentsAvg[0];
        
        for (int i=1; i<studentsAvg.length; i++)
        {
            if (studentsAvg[i]>highestAvg)
            {
                highestAvg = studentsAvg[i];
            }
        }
        
        String highestAvgStudent;
        
        if(highestAvg == student1Avg) {
            highestAvgStudent = students[0];
        } else if(highestAvg == student2Avg) {
            highestAvgStudent = students[1];
        } else if(highestAvg == student3Avg) {
            highestAvgStudent = students[2];
        } else if(highestAvg == student4Avg) {
            highestAvgStudent = students[3];
        } else {
            highestAvgStudent = students[4];
        }
        
        System.out.printf("The student with the highest average (%.1f) is %s%n", highestAvg, highestAvgStudent);
    }
    
    /**
     * Method that will calculate which student(s)' overall average is below 50% and display it to the screen.
     */
    public static void below50Avg() {
        
    }
    
}
