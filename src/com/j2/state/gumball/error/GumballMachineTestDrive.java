package com.j2.state.gumball.error;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        gumballMachine.kickMachine();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
        gumballMachine.repairMachine();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
    }
}
