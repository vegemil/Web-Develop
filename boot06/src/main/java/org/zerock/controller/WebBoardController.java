package org.zerock.controller;



import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.WebBoard;
import org.zerock.persistence.WebBoardRepository;
import org.zerock.vo.PageMaker;
import org.zerock.vo.PageVO;


@Controller
@RequestMapping("/boards/")
@Log
public class WebBoardController{
	
	@Autowired
	private WebBoardRepository repo;

	@GetMapping("/list")
	public void list(@ModelAttribute("pageVO") PageVO vo, Model model) {
		Pageable page = vo.makePageable(0, "bno");
		Page<WebBoard> result = repo.findAll(repo.makePredicate(vo.getType(), vo.getKeyword()), page);
		
//		log.info("" + page);
//		log.info("" + result);
		
		log.info("TOTAL PAGE NUMBER : " + result.getTotalPages());
		
		model.addAttribute("result", new PageMaker(result));
	}
}