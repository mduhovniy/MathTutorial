package info.duhovniy.mathtutorial.dto;


import java.util.List;

import lombok.Value;

@Value
public class Expression {

    String id;

    String levelName;

    int rating;

    // time limit for solution
    int maxTimeInSeconds;

    // Expression Pattern
    List<String> body;

    int min;
    int max;
    // Number of digits after dot, NULL == 0
    int rank;
    // Temporary field for result of evaluated expression to verify on client
    double tempResult;
}