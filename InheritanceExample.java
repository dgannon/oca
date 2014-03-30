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

interface Trainable {
    public void attendTraining(String[] trainingSchedule);
}

interface Interviewer{
    public void conductInterview();
}
