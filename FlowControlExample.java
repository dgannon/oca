import java.io.File;

class FlowControlExample {

    public static void main(String[] args) {
        ifAndIfElseExample();
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

}
