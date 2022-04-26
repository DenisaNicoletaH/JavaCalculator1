package com.example.javacalculator;

public interface Token {

   public abstract boolean isOperand();


   Operand evaluate(Operand op1, Operand op2);
}



