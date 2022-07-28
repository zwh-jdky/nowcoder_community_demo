package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author 街道口译
 * @Date 2022/7/28 14:03
 * @Version 1.0
 **/

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
	@Override
	public String select() {
		return "Hibernate";
	}
}
