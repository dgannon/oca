//package com.dustingannon.code;

class InheritanceExample{
    public static void main(String[] args){
        System.out.println("This is a driver class demoinstrating inheritance");
        Employee myEmployee = new Employee();
        Programmer myProgrammer = new Programmer();
        Manager myManager = new Manager();

        myProgrammer.attendTraining(new String[] {"English 101","Spanish 100"});
        myManager.conductInterview();
        myManager.attendTraining(new String[] {"Modelnetics","Java 100","MBA 100"});
        HRExecutive myHRExecutive = new HRExecutive();
        myHRExecutive.conductInterview();

        // Demo accessing a child class by it's parrent class variable type
        Employee emp = new HRExecutive();
        // emp.specialization = new String[] {"Staffing","Getting Rich"};
        // Above doesnt work, below does because its part of the Employee class
        emp.name = "Jane Testcase";

        Interviewer emp2 = new HRExecutive();
        // emp2.name = "This should fail as this defined interface doesn't know about this field.";
        // Above doesnt work, below is an example of what does as Interviewer knowes about the interface methods but not the derived classes variables.
        emp2.conductInterview();
    }
}

class Employee {
    Employee() {
        System.out.println("Object Created - Employee");
    }
    String name;
    String Address;
    String phoneNumber;
    float experience;
}

class Programmer extends Employee implements Trainable{
    Programmer() {
        System.out.println("Object Created - Programmer");
    }
    String[] programmingLanguages;
    void writeCode() {}

    public void attendTraining(String[] trainingSchedule){
        System.out.println("Prog - attendTraining");
        for(String element : trainingSchedule)
            System.out.println("Training in " + element);

    }
}

class Manager extends Employee implements Interviewer, Trainable{
    Manager() {
        System.out.println("Object Created - Manager");
    }    
    int teamSize;
    void reportProjectStatus() {}

    public void conductInterview(){
        System.out.println("Mgr - conductInterview");
    }

    public void attendTraining(String[] trainingSchedule){
        System.out.println("Mgr - attendTraining");
        for(String element : trainingSchedule)
            System.out.println("Training in " + element);
    }
}

class HRExecutive extends Employee implements Interviewer{
    String[] specialization;

    HRExecutive(){
        System.out.println("Object Created - HRExecutive");
    }
    public void conductInterview() {
        System.out.println("HRExecutive - conducting intervew");
    }
}

interface Trainable {
    public void attendTraining(String[] trainingSchedule);
}

interface Interviewer{
    public void conductInterview();
}
