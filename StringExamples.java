class StringExamples {

    public static void main(String[] args) {
    String intro = "Example code illustrating all the String/StringBuilder/StringBuffer methods needed to know to pass the Oracle OCA Exam.\n";
    System.out.println(intro);

    //Different ways to declair a string and its default value.
    String testString01;
    //System.out.println("The default value for a String object is "+ testString01);

    //Different ways to Create String Objects
    String str1 = new String("This is a test String Object!");
    String str2 = "This is anoter test String Object created via literals";
    

    //Java utilizez a String Pool for optimization reasons.  This leads to 
    //intresting results when compairing string references.
    String amIEqualString1 = new String("Testing if these are the same object");
    String amIEqualString2 = new String("Testing if these are the same object");
    System.out.println("Is amIEqualString1 the same object as amIEqualString2 ");
    System.out.println(amIEqualString1==amIEqualString2);

    String amIEqualString3 = "Testing if these are the same object";
    String amIEqualString4 = "Testing if these are the same object";
    System.out.println("Is amIEqualString3 the same object as amIEqualString4 ");
    System.out.println( amIEqualString3==amIEqualString4);

    StringMethodExamples();
    StringBuilderExamples();
    }

    public static void StringMethodExamples(){
    String testString = "  This is a String object's methods    ";
    System.out.println("testString = " + testString);

    //charAt
    System.out.println("The charAt at index 3 in testString is " +
                       testString.charAt(3));

    //indexOf
    System.out.println("The indexOf m in testString is " +
                       testString.indexOf('m'));
    System.out.println("The results of of indexOf z in testString is " +
                     testString.indexOf("indexOfTakesCharAndStringArguments"));
    //substring
    System.out.println("The results of substring(2,8) is |" +
                       testString.substring(2,8) +
                       " | notice that it grabbed positions upto but not " +
                       "including position 8!!!");
    //trim
    System.out.println("Trim cuts off whitespace from front and back! " +
                       testString.trim());
    //length
    System.out.println("Length is a Method (not field!) testString is " +
                       testString.length() + " characters long");
    //startsWith & endsWith
    System.out.println("startsWith allows you to boolean test to see if a " +
                       "String starts or ends with a value.");
    System.out.println("Does testString start and end with a blank?");
    System.out.println(testString.startsWith(" ") && testString.endsWith(" "));
    }

    public static void StringBuilderExamples() {
    
        System.out.println("The StringBuilder is the mutable(chageable) " +
                           "class.  It has a higher performance cost.");
        StringBuilder testSb1 = new StringBuilder();
        System.out.println("TestSb1's value is currently: " + testSb1);
        //append
        testSb1.append(true);
        testSb1.append(10);
        testSb1.append('a');
        testSb1.append(20.99);
        testSb1.append("A String literal");
        System.out.println("After appending a literal value for each type " +
                           "testSb1's value is now: " + testSb1);
        //insert
        System.out.println("Insert allows you to put stuff anywhere in a " +
                           "StringBuilder Object.  For example:");
        System.out.println(testSb1.insert(7, "I AM INSERT! ALL YOUR STRING ARE BELONG TO US!!!"));

        //delete & deleteCharAt
        System.out.println("delete and deleteCharAt remove characters. " +
                           testSb1.delete(7,100));
        // There is no trim method in the StringBuilder class!
        //reverse
        System.out.println("reverse prints the revers! Example: " + 
                           testSb1.reverse());
        //replace
        System.out.println("Replace sequence of characters by positions Ex: " +
                           testSb1.replace(3,5, "_THIS IS REPLACEMENT TEXT_"));
        //subSequence
        System.out.println("subSequence retrives a segment of a " +
                           "StringBuilder object.  This method returns a " +
                           "CharSequence object. Ex: " + 
                           testSb1.subSequence(3,9));
  

    }  
}
