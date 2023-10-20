package board;


public class Board {

    private Long id;

    private Long visitCount;

    private Long productTime;

    private String boardName;

    private String[] context;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }

    public Long getProductTime() {
        return productTime;
    }

    public void setProductTime(Long productTime) {
        this.productTime = productTime;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String[] getContext() {
        return context;
    }

    public void setContext(String[] context) {
        this.context = context;
    }
}
