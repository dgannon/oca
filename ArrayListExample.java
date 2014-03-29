import java.util.ArrayList;

class ArrayListExample {

    public static void main(String[] args){

        System.out.println("Example class that demoinstrates the ArrayList class");

        ArrayList<String> myArrayList = new ArrayList<String>();

        //How to add items to an ArrayList object.
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("four");
        myArrayList.add(2, "three");

        //How to Access elements of an ArrayList Object
        for (String element : myArrayList){
            System.out.println(element);
        }
    }
}
