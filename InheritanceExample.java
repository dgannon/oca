//package com.dustingannon.code;

class InheritanceExample{
    public static void main(String[] args){
        System.out.println("This is a driver class demoinstrating inheritance");
        Employee myEmployee = new Employee();
        Programmer myProgrammer = new Programmer();
        Manager myManager = new Manager();
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

class Programmer extends Employee {
    Programmer() {
        System.out.println("Object Created - Programmer");
    }
    String[] programmingLanguages;
    void writeCode() {}
}

class Manager extends Employee {
    Manager() {
        System.out.println("Object Created - Manager");
    }    
    int teamSize;
    void reportProjectStatus() {}
}
