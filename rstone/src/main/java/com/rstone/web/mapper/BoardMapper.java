package com.rstone.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rstone.web.domain.ArticleDTO;
import com.rstone.web.domain.MemberDTO;
@Repository
public interface BoardMapper {
	public void insert(ArticleDTO p) ;
	public List<?> selectList(Map<?,?>p) ;
	public List<?> selectSome(Map<?,?>p) ;
	public ArticleDTO selectOne(ArticleDTO p) ;
	public int count(Map<?,?>p) ;
	public void update(ArticleDTO p) ;
	public void delete(ArticleDTO p) ;
	public int countPaging();
	public int listSearchCount();
	public ArticleDTO listCriteria();
	public ArticleDTO listPage();
	public List<ArticleDTO> listSearch();
}
