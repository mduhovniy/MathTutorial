package info.duhovniy.mathtutorial.dto;


import java.util.List;

import lombok.Value;

@Value
public class Expression {

    private String id;

    private String levelName;

    private int rating;

    // time limit for solution
    private int maxTimeInSeconds;

    // Expression Pattern
    private List<String> body;

    private int min;
    private int max;
    // Number of digits after dot, NULL == 0
    private int rank;
    // Temporary field for result of evaluated expression to verify on client
    private double tempResult;
}