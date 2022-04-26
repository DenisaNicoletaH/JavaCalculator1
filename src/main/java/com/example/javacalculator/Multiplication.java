package com.example.javacalculator;

public class Multiplication extends Operator{

    @Override
    public boolean isOperand() {
        return false;
    }

    @Override
    public Operand evaluate(Operand op1, Operand op2) {
            double multiplication=(op1.getValue() * op2.getValue());
            return new Operand(multiplication);
        }
    }

