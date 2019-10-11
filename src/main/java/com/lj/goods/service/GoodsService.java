package com.lj.goods.service;

import java.util.List;

import com.lj.goods.domain.Goods;
import com.lj.goods.domain.Typee;

public interface GoodsService {

	List selects(String name, Integer[] gids);

	List<Typee> gettypees();

	boolean addgoods(Goods goods, int[] sid);

}
