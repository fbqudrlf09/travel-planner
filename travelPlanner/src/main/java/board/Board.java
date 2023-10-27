package board;

import lombok.Data;

@Data
public class Board {

    private Long id;

    private Long visitCount;

    private Long productTime;

    private String boardName;

    private String[] context;
}
