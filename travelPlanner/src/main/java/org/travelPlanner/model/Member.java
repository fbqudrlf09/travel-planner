package org.travelPlanner.model;

import lombok.Data;

import java.util.List;

@Data
public class Member {

    private Long id;

    private String loginId;

    private String password;

    private String name;

    private List<Long> boardList;
}
