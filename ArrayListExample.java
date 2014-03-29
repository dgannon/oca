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
        addingListQuestions();
    }

    public static void printArrayList(ArrayList list) {
        System.out.println("Refacored ArrayList print to method for code reuse.");
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void addingListQuestions() {
        System.out.println("Testing how ArrayLists get added and what happens when modifiying the lists after the add");
        ArrayList<Integer> myList1 = new ArrayList<Integer>();
        int myInt1 = 1;
        int myInt2 = 2;
        myList1.add(myInt1);
        myList1.add(myInt2);
        System.out.println("myList1 had the following items");
        printArrayList(myList1);
        System.out.println("Changing the value of MyInt1 to see if list reflects that change.");
        myInt1 = 100;
        printArrayList(myList1);
        System.out.println(myInt1);
        System.out.println("Changing the value of the reference to myInt1 to see if variable value is updated.");
        for (Integer element : myList1) {
            element = element + 1;
        }
        printArrayList(myList1);
        System.out.println(myInt1);
    }
}
