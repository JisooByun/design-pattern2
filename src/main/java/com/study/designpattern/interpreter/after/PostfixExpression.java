package com.study.designpattern.interpreter.after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character,Integer> context);

    //static method 가능

}
