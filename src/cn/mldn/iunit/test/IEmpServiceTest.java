package cn.mldn.iunit.test;

import static org.junit.Assert.*;

import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;

import cn.mldn.entity.Empo;
import cn.mldn.factory.Servicefactory;

public class IEmpServiceTest {

	@Test
	public void testInsert() {
		try {
			Empo vo=new Empo();
			vo.setEmpo(2999);
			vo.setEname("zhehej");
			vo.setHiredate(new Date());
			vo.setSal(1000.000);
			vo.setJob("df");
			vo.setComm(1000.00);
			TestCase.assertTrue(Servicefactory.getIEmpService().insert(vo));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		try {
			Empo vo=new Empo();
			vo.setEmpo(2999);
			vo.setEname("jhjj");
			vo.setHiredate(new Date());
			vo.setSal(1000.000);
			vo.setJob("df");
			vo.setComm(-1000.00);
			TestCase.assertTrue(Servicefactory.getIEmpService().update(vo));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() throws Exception {
		TestCase.assertTrue(Servicefactory.getIEmpService().delete(7899));
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testList() {
		fail("Not yet implemented");
	}

	@Test
	public void testListStringStringIntInt() {
		fail("Not yet implemented");
	}

}
