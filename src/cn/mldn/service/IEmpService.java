package cn.mldn.service;

import java.util.List;
import java.util.Map;
/*
 * 由于业务层。。。
 */
import cn.mldn.entity.Empo;

public interface IEmpService {
	public boolean insert(Empo vo) throws Exception; 
	public boolean update(Empo vo) throws Exception; 
	public boolean delete(Integer id) throws Exception; 
	public Empo get(Integer id)throws Exception;
	public List<Empo> list() throws Exception;
	public Map<String, Object> list(String column,String keyWord,int currentPage,int lineSize)throws Exception;
}
