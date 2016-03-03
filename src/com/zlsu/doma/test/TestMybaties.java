package com.zlsu.doma.test;

import java.util.List;

import org.junit.Test;

import com.zlsu.dao.PersionDao;
import com.zlsu.dao.imp.PersionDaoImp;
import com.zlsu.doma.Persion;

public class TestMybaties {

	@Test
	public void testFindAll() {
		PersionDao persionDao=new PersionDaoImp();
		List<Persion> persions = persionDao.findAll();
		for(Persion persion:persions){
			System.out.println(persion.getName());
		}
	}
	@Test
	public void insert(){
		PersionDao persionDao=new PersionDaoImp();
		Persion persion = new Persion();
		persion.setAge(11);
		persion.setName("Õ¹");
		persion.setAddress("Â·»¢");
        persionDao.insert(persion);
	}

}
