package com.example.javacalculator;


public class Addition extends Operator {


    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double addition=(op1.getValue() + op2.getValue());
        return new Operand(addition);
    }
}
