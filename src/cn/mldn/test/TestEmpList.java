package cn.mldn.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cn.mldn.entity.Empo;
import cn.mldn.factory.Servicefactory;

public class TestEmpList {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map=Servicefactory.getIEmpService().list("ename", "", 1, 2);
		List<Empo> all=(List<Empo>) map.get("allEmps");
		Integer count=(Integer)  map.get("empCount");
		System.out.println("总数量是： "+count);
		Iterator<Empo> iter=all.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
	}

}
