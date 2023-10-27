package controller;

import board.Board;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RequestMapping("/board")
public class TravelBoardController {

    // 여행 보드 리스트
    @GetMapping()
    public String viewBoards(Model model) {

        List<Board> items = new ArrayList<>();

        model.addAttribute("items", items);
        return "items";
    }

    // 해당 id의 여행 보드
    @GetMapping("/items/{itemId}")
    public String viewItem(Model model) {

        Board board = new Board();
        String boardId = board.getBoardName();

        model.addAttribute("board", board);

        return "/item";
    }

    @GetMapping("/add")
    public String addItem(){
        return "/addForm";
    }

    @PostMapping("/add")
    public String addItem(Board board) {
        // board 리스트에 board 추가

        return "/items";
    }

    // 해당 id의 여행 보드 수정 요청
    @GetMapping("/items/{itemId}/edit")
    public String editItem(@PathVariable Long itemId, Model model) {
        Board board = new Board();
        model.addAttribute("board", board);

        return "/editBoard";
    }

    // 해당 id의 여행 보드 수정
    @PostMapping("/editBoard")
    public String editItem(@PathVariable Long itemId, @ModelAttribute Board item) {
        // 데이터 업데이트

        return "redirect:/items/{itemId}";
    }
}
