package com.example.javacalculator;

public class Division extends Operator{


    @Override
    public Operand evaluate(Operand op1, Operand op2) {
            double division=(op1.getValue() / op2.getValue());
            return new Operand(division);
        }
    }
