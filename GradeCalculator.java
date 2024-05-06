import java. util. *;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter number of Subjects: ");
        int total_sub = sc.nextInt();
        int Totalmark = 0;
        for(int i = 0;i < total_sub;i++){
            System.out.print("Enter Mark in subject "+(i+1)+" :");
            int mark = sc.nextInt();
            Totalmark+=mark;
        }
        float Average_mark = (float)Totalmark / total_sub;
        char grade;
        if(Average_mark >= 90)grade = 'O';
        else if(Average_mark >= 80)grade = 'A';
        else if(Average_mark >= 70)grade = 'B';
        else if(Average_mark >= 60)grade = 'C';
        else if(Average_mark >= 50)grade = 'D';
        else grade = 'E';
        System.out.println();
        System.out.println("Total Marks Scored: "+Totalmark);
        System.out.println("Average Percentage: "+Average_mark);
        System.out.println("Grade: "+grade);
    }
}