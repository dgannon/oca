import java.util.ArrayList;

//package com.dustingannon.code;

class InheritanceExample{
    public static void main(String[] args){
        System.out.println("This is a driver class demoinstrating inheritance");
        Programmer myProgrammer = new Programmer();
        Manager myManager = new Manager();

        myProgrammer.attendTraining(new String[] {"English 101","Spanish 100"});
        myManager.conductInterview();
        myManager.attendTraining(new String[] {"Modelnetics","Java 100","MBA 100"});
        HRExecutive myHRExecutive = new HRExecutive();
        myHRExecutive.conductInterview();

        Interviewer emp2 = new HRExecutive();
        // emp2.name = "This should fail as this defined interface doesn't know about this field.";
        // Above doesnt work, below is an example of what does as Interviewer knowes about the interface methods but not the derived classes variables.
        emp2.conductInterview();

        // Using this new found power its possible to define arrays and ArrayLists of objects that share a base class or interface!
        ArrayList<Interviewer> interviewTeam = new ArrayList<Interviewer>();
        interviewTeam.add(myManager);
        interviewTeam.add(myHRExecutive);
        interviewTeam.add(emp2);
        System.out.println("***Team Interview***");
        for(Interviewer element : interviewTeam)
            element.conductInterview();
        

        //Polymorphism example
        System.out.println("***Team Project Starts***");
        // Create Team
        Employee teamMember1 = new Programmer();
        Employee teamMember2 = new Manager();
        Employee teamMember3 = new HRExecutive();
        // Build Team ArrayList
        ArrayList<Employee> myTeam = new ArrayList<>();
        myTeam.add(teamMember1);
        myTeam.add(teamMember2);
        myTeam.add(teamMember3);
        // Start the project
        for(Employee element : myTeam)
            element.startProjectWork();
       
    }
}

abstract class Employee {
    Employee() {
        System.out.println("Object Created - Employee");
    }
    String name;
    String Address;
    String phoneNumber;
    float experience;

    public void reachOffice(){
        System.out.println("reached office - Gurgaon, India");
    }

    public abstract void startProjectWork();
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

    public void startProjectWork() {
        defineClasses();
        unitTestCode();
    }
    
    private void defineClasses() { System.out.println("define classes"); }
    private void unitTestCode() { System.out.println("unit test code"); }
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

    public void startProjectWork() {
        meetingWithCustomer();
        defineProjectSchedule();
        assignRespToTeam();
    }

    private void meetingWithCustomer() { System.out.println("meet Customer"); }
    private void defineProjectSchedule() { System.out.println("Project Schedule"); }
    private void assignRespToTeam() { System.out.println("team work starts"); }
}

class HRExecutive extends Employee implements Interviewer{
    String[] specialization;

    HRExecutive(){
        System.out.println("Object Created - HRExecutive");
    }
    public void conductInterview() {
        System.out.println("HRExecutive - conducting intervew");
    }

    public void startProjectWork() { System.out.println("Go Golfing"); }
}

interface Trainable {
    public void attendTraining(String[] trainingSchedule);
}

interface Interviewer{
    public void conductInterview();
}
