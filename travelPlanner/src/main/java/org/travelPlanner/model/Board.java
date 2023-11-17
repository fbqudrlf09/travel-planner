package org.travelPlanner.model;

import lombok.Data;

import java.util.List;

@Data
public class Board {

    private Long id;

    private Long visitCount;

    private Long productTime;

    private String boardName;

    private List<String> context;
}
