import java.io.File;

class FlowControlExample {

    public static void main(String[] args) {
        ifAndIfElseExample();
        switchStatementsExample();
    }

    public static void ifAndIfElseExample() {
        //Example if statement
        int score = 100;
        
        //Single execution line.
        if (score == 100)
            System.out.println("Your Score is " + score);

        //If Else
        if (score >=75){
            System.out.println("Your Score is " + score + " You Win!");
        } 
        else {
            System.out.println("Your Score is " + score + " You Loose!");
        }
    }

    public static void switchStatementsExample() {
       int marks = 20;
       switch (marks) {
           case 10: System.out.println("Switch Example is 10");
               break;
           case 20: System.out.println("Switch Example is 20");
               break;
           case 30: System.out.println("Switch Example is 30");
               break;
           default: System.out.println("Default");
               break;
       }   
    }

}
