package com.zlsu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zlsu.service.PersionService;

@Controller
public class PersionController {
	private PersionService persionService;

	public PersionService getPersionService() {
		return persionService;
	}
   // @Resource
	public void setPersionService(PersionService persionService) {
		this.persionService = persionService;
	}

	@RequestMapping("/list")
	public String findAll(ModelMap model) {
		model.addAttribute("list", persionService.findAll());
		return "list.jsp";
	}
}
