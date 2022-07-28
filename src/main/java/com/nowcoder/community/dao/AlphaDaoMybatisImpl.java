package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author 街道口译
 * @Date 2022/7/28 14:05
 * @Version 1.0
 **/

@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao{
	@Override
	public String select() {
		return "Mybatis";
	}
}
