package com.lj.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lj.goods.domain.Goods;
import com.lj.goods.domain.Typee;
import com.lj.goods.service.GoodsService;
import com.lj.goods.vo.GoodsVO;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String  getlist(Model model,String name,Integer gids[]) {
		List<GoodsVO> list = service.selects(name,gids);
		model.addAttribute("list", list);
		return "list";
	}
	
	//跳转到添加页面
	//@RequestMapping(value = "add",method = RequestMethod.GET)
	@GetMapping("add")
	public String add(Model model) {
		List<Typee> typees = service.gettypees();
		model.addAttribute("typees", typees);
		return "add";
	}
	@ResponseBody
	@RequestMapping("addgoods")
	public Object addgoods(Goods goods,int sid[]) {
		System.out.println(goods);
		System.out.println(sid);
		
		try {
			service.addgoods(goods,sid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
}
