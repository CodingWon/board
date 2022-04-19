package org.zerock.board.dto;


public class ListDTO {

    private int page;
    private int size;
    private int skip;
    private String type;
    private String keyword;

    public ListDTO(){
        page = 1;
        size = 10;
    }

    //사용자가 악의적으로 page를 입력 했을 때
    public void setPage(int page) {
        this.page = page < 1 ? 1 : page;
    }

    public void setSize(int size) {
        this.size = size < 10 ? 10 : size;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getSkip() {
        return (page-1) * size;
    }

    public String getTypes() {
        return type;
    }

}
