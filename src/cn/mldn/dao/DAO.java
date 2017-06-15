package cn.mldn.dao;

import java.util.List;

import cn.mldn.entity.Empo;

public interface DAO<K,V> {
	public boolean doCreate(K vo)throws Exception;
	public boolean doUpdate(K vo)throws Exception;
	public boolean doRemove(Integer id)throws Exception;
	
	public Empo findById(Integer id)throws Exception;
	public List<Empo> findAll()throws Exception ;
	public List<Empo> findAll(String column,String keyWord,Integer currentPage,Integer lineSize)throws Exception ;
	public Integer getAllCount(String column,String keyWord)throws Exception;
		
}
