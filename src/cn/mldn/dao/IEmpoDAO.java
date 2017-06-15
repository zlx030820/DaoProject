package cn.mldn.dao;

import java.util.List;

import cn.mldn.entity.Empo;

public interface IEmpoDAO {
	public boolean doCreate(Empo vo)throws Exception;
	public boolean doUpdate(Empo vo)throws Exception;
	public boolean doRemove(Integer id)throws Exception;
	
	public Empo findById(Integer id)throws Exception;
	public List<Empo> findAll()throws Exception ;
	public List<Empo> findAll(String column,String keyWord,Integer currentPage,Integer lineSize)throws Exception ;
	public Integer getAllCount(String column,String keyWord)throws Exception;
		
}
