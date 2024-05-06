import java. util. *;
public class Game {
    public static void main(String[] args) 
    {
        System.out.println("\n\nWelcome to Numbers Game..\n");
        Scanner sc = new Scanner(System.in);
        Random randomNum = new Random();
        Boolean play=true;
        int TotalScore=0;
        while(play)
        {
            int generatedNum = randomNum.nextInt(101);
            System.out.print("Enter the number from[1-100]: ");
            int num = sc.nextInt();
            System.out.println("Generated Number: "+generatedNum);
            if(num == generatedNum)
            {
                
                TotalScore+=50;
                System.out.println("You Won..");
                System.out.printf("Score: 50\nYour Score: %d\n\n",TotalScore);
                
            }
            else if(num > generatedNum)
            {
                int diff = num - generatedNum;
                if(diff < 15)
                {
                    TotalScore+=10;
                    System.out.printf("Score: 10\nYour Score: %d\n\n",TotalScore);
                }
                else
                {
                    TotalScore+=5;
                    System.out.printf("Score: 5\nYour Score: %d\n\n",TotalScore);
                }
                
            }
            else
            {
                int diff =generatedNum-num;
                if(diff < 15)
                {
                    TotalScore+=10;
                    System.out.printf("Score: 10\nYour Score: %d\n\n",TotalScore);
                }
                else
                {
                    TotalScore+=5;
                    System.out.printf("Score: 5\nYour Score: %d\n\n",TotalScore);
                }
                
            }
            System.out.print("If you want to play again :");
            String input=sc.next();
            if(!(input.equalsIgnoreCase("yes"))){
                play=false;
            }
        }
        System.out.println("Your Final Score: "+TotalScore);
        System.out.println("Well Played..!\nThanks for playing");
    }
}