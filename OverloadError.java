class OverloadError{
    double calcAverage(double marks1, int marks2) {
        return (marks1 + marks2)/2.0;   
    }

    double calcAverage(int marks1, double marks2) {
        return (marks1 + marks2)/2.0;
    }

    public static void main(String[] args) {
        OverloadError x = new OverloadError();
        System.out.println(x.calcAverage(1.0, 2));
        System.out.println(x.calcAverage(1, 2.0));    
        System.out.println(x.calcAverage(1, 2));  //This line will break code because it doesn't know what overloaded method to call.
    }
}
