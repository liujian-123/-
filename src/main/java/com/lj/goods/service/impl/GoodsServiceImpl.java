package com.lj.goods.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lj.goods.dao.GoodsMapper;
import com.lj.goods.domain.Goods;
import com.lj.goods.domain.Typee;
import com.lj.goods.service.GoodsService;

@Service
public class GoodsServiceImpl  implements GoodsService{

	@Autowired
	private GoodsMapper mapper;
	
	@Override
	public List selects(String name, Integer[] gids) {
		// TODO Auto-generated method stub
		List list = mapper.selects(name,gids);
		return list;
	}

	@Override
	public List<Typee> gettypees() {
		// TODO Auto-generated method stub
		return mapper.gettypees();
	}

	@Override
	public boolean addgoods(Goods goods, int[] sid) {
		// TODO Auto-generated method stub
		
		mapper.addgoods(goods);
		if(sid!=null) {
			for (int i = 1; i < sid.length; i++) {
				mapper.addmedder(goods.getGid(),sid[i]);
			}
		}
		return false;
	}
	
	

}
