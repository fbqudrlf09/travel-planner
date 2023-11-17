package org.travelPlanner.controller;

import org.travelPlanner.model.Board;
import org.springframework.web.bind.annotation.*;
import org.travelPlanner.model.Member;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {

    // 여행 보드 리스트
    @GetMapping
    public List<Board> getBoards() {

        List<Board> boards = new ArrayList<>();

        return boards;
    }

    // 새로운 여행 보드 추가
    @PostMapping
    public Board postBoard(@RequestBody Board board) {

        // 기존 리스트에 보드 추가
        Board newBoard = board;


        return newBoard;
    }

    // 해당 id의 여행 보드 검색
    @GetMapping("/{boarId}")
    public Board getBoard(@PathVariable Long boardId) {

        //boardId를 통해 boardList에서 Board 반환
        Board board = new Board();
        board.setBoardName("test1");
        board.setId(1L);

        return board;
    }

    // 해당 id의 여행 보드 수정 요청
    @PutMapping("/{boardId}")
    public Board putBoard(@PathVariable Long itemId, @RequestBody Board board) {

        // boardList에서 boardId검색 후 업데이트
        return board;
    }

    // 해당 id의 여행 보드 삭제
    @DeleteMapping("/{boardId}")
    public Board deleteBoard(@PathVariable Long itemId) {
        //boardList에서 boardId 검색 후 삭제
        Board board = new Board();
        board.setId(1L);
        board.setBoardName("Test1");

        return board;
    }
}
