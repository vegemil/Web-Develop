package com.euna.first;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/*")
public class ConfitApiController {

	@Inject
	ConfigApiService apiService;
	
	@RequestMapping("list")
	public ModelAndView list() {
		
		List<ConfigApi> list = new ArrayList<ConfigApi>();
		ConfigApi confApi = new ConfigApi();
		confApi.setApiKey("abcdefg");
		confApi.setId("id1");
		confApi.setTitle("test");
		list.add(confApi);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list");
		mv.addObject("lists", list);
		return mv;
	}
}
