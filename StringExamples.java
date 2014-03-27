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
    }
}
