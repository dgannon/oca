import java.util.ArrayList;
import java.util.ListIterator;

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
        System.out.println("Printing myArrayList Object with enhanced for loop.");
        for (String element : myArrayList){
            System.out.println(element);
        }

        //Example code of how the iterators work.
        System.out.println("Pringting myArrayList with a ListIterator object.");
        ListIterator<String> iterator = myArrayList.listIterator();  //Get the Iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //How to modify/replace items in ArrayList objects
        myArrayList.set(1, "I have replaced this item!");
        printArrayList(myArrayList); //Should print ArrayList with new item.

        //Deleteing items from an ArrayList Object
        myArrayList.remove(3);
        myArrayList.remove("one");
        System.out.println("Deleting index 3 and String object \"One\"");
        printArrayList(myArrayList);
    }

    public static void printArrayList(ArrayList list) {
        System.out.println("Refacored ArrayList print to method for code reuse.");
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
