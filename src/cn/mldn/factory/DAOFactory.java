package cn.mldn.factory;

import java.sql.Connection;

import cn.mldn.dao.IEmpoDAO;
import cn.mldn.dao.impl.EmpDAOImpl;

public class DAOFactory {
	public static IEmpoDAO getIEmpDAOIstance(Connection conn) {
		return new EmpDAOImpl(conn);
	}
	
}
