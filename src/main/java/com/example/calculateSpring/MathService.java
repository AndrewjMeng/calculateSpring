package com.example.calculateSpring;

import java.util.ArrayList;

public class MathService {

    public String getSum(String[] n) {
        int sum = 0;
        ArrayList<String> result = new ArrayList<String>();
        for(String x: n) {
            result.add(x);
            sum += Integer.parseInt(x);
        }
        return String.join(" + ",result) + " = " + sum;
    }

    public String CalculateInfo(String operation, int x, int y) {
        String operationSign;
        int answer;
        switch(operation) {
            case "add":
                operationSign = "+";
                answer = Math.addExact(x,y);
                break;
            case "subtract":
                operationSign = "-";
                answer = Math.subtractExact(x,y);
                break;
            case "multiply":
                operationSign = "*";
                answer = Math.multiplyExact(x,y);
                break;
            case "divide":
                operationSign = "/";
                answer = Math.floorDiv(x,y);
                break;
            default:
                operationSign = "+";
                answer = Math.addExact(x,y);

        }

        return String.format("%s %s %s = %d",  x , operationSign, y, answer);

    }
}
