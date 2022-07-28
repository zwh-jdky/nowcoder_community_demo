package com.nowcoder.community.service;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author 街道口译
 * @Date 2022/7/28 15:34
 * @Version 1.0
 **/

@Service
public class DiscussPostService {
	
	@Autowired
	private DiscussPostMapper discussPostMapper;
	
	public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit){
		return discussPostMapper.selectDiscussPosts(userId,offset,limit);
	}
	
	public int findDiscussPostRows(int userId){
		return discussPostMapper.selectDiscussPostRows(userId);
	}
}
