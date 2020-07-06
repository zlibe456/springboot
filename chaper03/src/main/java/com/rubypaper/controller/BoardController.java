package com.rubypaper.controller;

import com.rubypaper.domain.BoardVO;
import com.rubypaper.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/hello")
    public String hello(String name){
        return boardService.hello(name);
    }

    @GetMapping("/getBoard")
    public BoardVO getBoard(){
        return  boardService.getBoard();
    }

    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList(){
        return boardService.getBoardList();
    }
}
