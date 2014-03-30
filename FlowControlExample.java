import java.util.ArrayList;

class FlowControlExample {

    public static void main(String[] args) {
        ifAndIfElseExample();
        switchStatementsExample();
        loopExamples();
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

    public static void loopExamples(){
        // The For Loop
        int countTo = 10;
        for(int i=1; i<=countTo;i++)
            System.out.println("Counting to 10... Currently its "+i);
    
        // A Nested For Loop
        int rows = 5;
        int columns = 10;
        for(int i=1; i<=rows; i++) {
            System.out.print("Row "+ i +" |");
            for(int j=1; j<=columns; j++){
                System.out.print("[" + j + "]"); 
            }
            System.out.println("|");
        }

        // The Enhanced For Loop
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
        
        for (String element : myList) {
            System.out.println(element);
        }

    }

}
