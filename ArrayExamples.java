class ArrayExamples {

     public static void main(String[] args){
         System.out.println("This is an example prgram to demoinstrate the " +
                            "Array class and its features to pass the Oracle" +
                            "OCA Exam.");

         System.out.println("\nCreating an Array involves 3 steps: " +
                            "\n1 - Declairing the Array " +
                            "\n2 - Allocating the Array " +
                            "\n3 - Initializing the array elements.");

         //Declairing the Array
         int intArray[];
         String[] strArray[];
         int[] multiArray[];
         int a3DArray[][][];
         int[] is3DAllowedLikeThis[][];  //Weird but it compiles... :|

         //Allocation of the Array
         intArray = new int[5];
         strArray = new String[250][];
         // Can't compile until 1st dimension is defined
         //multiArray = new int[][52];
         is3DAllowedLikeThis = new int[10][10][];
         System.out.println("All Array values are set to default content " +
                            intArray[4]);

         //Array Initialization - use loops
         for(int i=0;i<intArray.length; i++) {
             intArray[i] = i;
         }

         for(int i=intArray.length-1; i>=0; i--) {
            System.out.println("Counting Down intArray[" + intArray[i] + 
            "] = " + intArray[i]);
         }


         // Using the enhanced for loop
         for (int element : intArray) {
             System.out.println("Element: " + element);
         }

         // Putting all three steps into 1 line of code
         int intarray2[] = {6,1,9,9,2,9,5,0,7,9};
         String[] strArray2 = {"Summer", "Winter"};
         int multiArray2[][] = { {0,1}, {3,4,5} };
     }

}

// Here are Array Samples using Interfaces as the Array Type
interface MyInterface{}
class MyClass1 implements MyInterface{}
class MyClass2 implements MyInterface{}

class Test {
    MyInterface[] interfaceArray = new MyInterface[]
                                      {
					new MyClass1(),
                                        null,
                                        new MyClass2()
                                      };
}

abstract class Vehicle{}
class Car extends Vehicle{}
class Bus extends Vehicle{}

class Test2 {
    Vehicle[] vehicleArray = {new Car(),
                              new Bus(),
                              null};
}
