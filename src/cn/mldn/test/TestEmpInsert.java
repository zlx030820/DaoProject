package cn.mldn.test;

import java.util.Date;

import cn.mldn.entity.Empo;
import cn.mldn.factory.Servicefactory;

public class TestEmpInsert {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Empo vo=new Empo();
		vo.setEmpo(2999);
		vo.setEname("zhehej");
		vo.setHiredate(new Date());
		vo.setSal(1000.000);
		vo.setJob("df");
		vo.setComm(1000.00);
		System.out.println(Servicefactory.getIEmpService().insert(vo));
	}
}
