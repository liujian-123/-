package com.lj.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lj.goods.domain.Goods;
import com.lj.goods.domain.Typee;

public interface GoodsMapper {

	List selects(@Param("name")String name,@Param("gids") Integer[] gids);

	List<Typee> gettypees();

	void addgoods(Goods goods);

	void addmedder(@Param("gid")int gid,@Param("sid") int sid);
	
}
