package com.headfirst.state.second;

public class GumballMachine {
     State soldOutState;
     State noQuarterState;
     State hasQuarterState;
     State soldState;
     State winnerState;

     State state;
     int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        }else {
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if(count > 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        return "\nGumballMachine{" +
                "count=" + count +
                '}';
    }
}
