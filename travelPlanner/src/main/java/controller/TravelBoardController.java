package controller;

import board.Board;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/boards")
public class TravelBoardController {

    // 여행 보드 리스트
    @GetMapping()
    public List<Board> viewBoards() {

        List<Board> boards = new ArrayList<>();

        return boards;
    }

    // 새로운 여행 보드 추가
    @PostMapping()
    public String addNewBoard(@RequestBody Board board) {

        // 기존 리스트에 보드 추가

        return "ok";
    }

    // 해당 id의 여행 보드 검색
    @GetMapping("/{boarId}")
    public Board viewBoard(@PathVariable Long boardId) {

        //boardId를 통해 boardList에서 Board 반환
        Board board = new Board();

        return board;
    }

    // 해당 id의 여행 보드 수정 요청
    @PutMapping("/{boardId}")
    public void updateBoard(@PathVariable Long itemId, @RequestBody Board board) {

        // boardList에서 boardId검색 후 업데이트
        return;
    }

    // 해당 id의 여행 보드 삭제
    @DeleteMapping("/{boardId}")
    public void deleteBoard(@PathVariable Long itemId) {
        //boardList에서 boardId 검색 후 삭제

        return;
    }
}
