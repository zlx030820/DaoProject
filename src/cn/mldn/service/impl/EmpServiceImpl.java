package cn.mldn.service.impl;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import cn.mldn.dao.IEmpoDAO;
import cn.mldn.entity.Empo;
import cn.mldn.factory.DAOFactory;
import cn.mldn.jdbc.DatabaseConnection;
import cn.mldn.service.IEmpService;

public class EmpServiceImpl implements IEmpService{
private DatabaseConnection  dbc=new DatabaseConnection();

	/**
	 * @param args
	 */
	@Override
	public boolean insert(Empo vo) throws Exception {
		// TODO Auto-generated method stub
		try {
			Connection conn=this.dbc.getConnection();
			IEmpoDAO dao=DAOFactory.getIEmpDAOIstance(conn);
			if (dao.findById(vo.getEmpo())==null) {
				return dao.doCreate(vo);
			}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally{
			this.dbc.close();
			
		}
	}

	@Override
	public boolean update(Empo vo) throws Exception {
		try {
			
			return DAOFactory.getIEmpDAOIstance(this.dbc.getConnection()).doUpdate(vo);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally{
			this.dbc.close();
			
		}
	}

	public boolean delete(int id) throws Exception {
		try {
			return DAOFactory.getIEmpDAOIstance(this.dbc.getConnection()).doRemove(id);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally{
			this.dbc.close();
			
		}
	}

	@Override
	public Empo get(Integer id) throws Exception {
		try {
			return DAOFactory.getIEmpDAOIstance(this.dbc.getConnection()).findById(id);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally{
			this.dbc.close();
			
		}
	}

	@Override
	public List<Empo> list() throws Exception {
		try {
			return DAOFactory.getIEmpDAOIstance(this.dbc.getConnection()).findAll();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally{
			this.dbc.close();
			
		}
	}

	@Override
	public Map<String, Object> list(String column, String keyWord,
			int cyrrentPage, int lineSize) throws Exception {
		try {
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("allEmps", DAOFactory.getIEmpDAOIstance(this.dbc.getConnection()).findAll(column, keyWord, cyrrentPage, lineSize));
			map.put("empCount", DAOFactory.getIEmpDAOIstance(this.dbc.getConnection()).getAllCount(column, keyWord));
			
			return map;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally{
			this.dbc.close();
			
		}
	}

}
