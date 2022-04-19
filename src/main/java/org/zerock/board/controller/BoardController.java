package org.zerock.board.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.board.dto.ListDTO;

@Log4j2
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("")
    public String basic(){
        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public void list(ListDTO listDTO, Model model){

        log.info("리스트......");
    }

}
