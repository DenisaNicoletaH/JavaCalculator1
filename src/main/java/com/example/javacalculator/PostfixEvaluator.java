package com.example.javacalculator;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class PostfixEvaluator {
    ;
    private ArrayList<Token> expression = new ArrayList<>();


    public void addToken(Token t) {
        expression.add(t);
    }

    public double evaluate() {

        ArrayDeque<Operand> arrayDeque = new ArrayDeque<>();
        for (Token t : expression){
            if (t.isOperand()) {
                //Pushing the the token to the stack and casting it
                arrayDeque.push((Operand) t);
            } else {
                //if less than 2 operands in order to do calculations
                if (arrayDeque.size() < 2) {
                    throw new ArithmeticException("Cannot be executed because there's less than 2 operands");
                }
                //Cast from a different class:theres no "new" in the line
                Operator operator=(Operator)t;
                //popping the  two operands from the stack
                Operand op1=arrayDeque.pop();
               Operand op2=arrayDeque.pop();
               //evaluating using the Operator
                Operand evaluation= operator.evaluate(op1,op2);
                //Pushing the results operands to stack
                arrayDeque.push(evaluation);
            }
        }
        if(arrayDeque.size() > 1){
            throw new ArithmeticException("meaningful message");
        }
        //change return?
        return arrayDeque.getLast().getValue();

    }
}


