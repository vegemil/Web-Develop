package com.euna.first;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/*")
public class ConfitApiController {

	@Inject
	ConfigApiService apiService;
	
	@RequestMapping("list")
    public String list(ModelMap model){
        List<ConfigApi> list = apiService.list();
        model.addAttribute("lists",list);
        return "list";
        
    }
}
