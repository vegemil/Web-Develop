package org.zerock.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.vo.PageVO;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/boards/")
@Log
public class WebBoardController{
	
	@GetMapping("/list")
	public void list(PageVO vo) {
		Pageable page = vo.makePageable(0, "bno");
		log.info("list() called..." +page);
	}
}