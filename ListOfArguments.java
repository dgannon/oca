class Employee {
    private String name;
    public void setName(String val) {
	name = val;
    }
    
    public int daysOffWork(int... days) {
	int daysOff = 0;
	for (int i = 0; i < days.length; i++)
	    daysOff += days[i];
	return daysOff;
    }
}

class ListOfArguments {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.daysOffWork(1,2,3,4));
	System.out.println(e.daysOffWork(1,2,3,4,5,6,7));
    }
}
