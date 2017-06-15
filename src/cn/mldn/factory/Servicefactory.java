package cn.mldn.factory;

import cn.mldn.service.IEmpService;
import cn.mldn.service.impl.EmpServiceImpl;

public class Servicefactory {
	public static IEmpService getIEmpService() {
		return new EmpServiceImpl();
	}
}
