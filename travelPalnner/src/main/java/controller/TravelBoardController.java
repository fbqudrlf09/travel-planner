package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


public class TravelBoardController {

    @GetMapping("/board")
    public String viewBoards(Model model) {

        List<Board> items = new ArrayList<>();

        model.addAttribute("items", items);
        return "board/items";
    }

    @GetMapping("/board/items/{itemId}")
    public String viewItem(Model model) {

        Board board = new Board();
        String boardId = board.getboardId();

        model.addAttribute("board", board);

        return "board/item";
    }

    @GetMapping("/board/items/{itemId}/edit")
    public String editItem(@PathVariable Long itemId) {

        Board board = new Board();
        model.addAttribute("board", board);

        return "board/editBoard";
    }

    @PostMapping("/board/editBoard")
    public String editItem(@PathVariable Long itemId, @ModelAttribute Item item){

        // 데이터 업데이트

        return "redirect:/board/items/{itemId}";
    }
}
