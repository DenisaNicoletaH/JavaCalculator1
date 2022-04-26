package com.example.javacalculator;

public class Operand implements Token{

    //Attributes
    //getter
    private double value;


    //Constructor
    public Operand(double value){
        this.value=value;
    }

    //Methods
    public final double getValue() {
        return value;
    }

    @Override
    public boolean isOperand() {
        return true;
    }

    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        return null;
    }
}
