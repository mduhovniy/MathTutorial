package info.duhovniy.mathtutorial.dto;


import java.util.List;

import lombok.Data;

@Data
public class Expression {

    private final String id;

    private final String levelName;

    private final int rating;

    // time limit for solution
    private final int maxTimeInSeconds;

    // Expression Pattern
    private final List<String> body;

    private final int min;
    private final int max;
    // Number of digits after dot, NULL == 0
    private final int rank;
    // Temporary field for result of evaluated expression to verify on client
    private final double tempResult;
}