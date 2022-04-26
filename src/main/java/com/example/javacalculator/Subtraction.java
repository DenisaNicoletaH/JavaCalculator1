package com.example.javacalculator;

public class Subtraction extends Operator{
    @Override
    public Operand evaluate(Operand op1, Operand op2) {
            double substraction=(op1.getValue() - op2.getValue());
            return new Operand(substraction);
        }
    }

