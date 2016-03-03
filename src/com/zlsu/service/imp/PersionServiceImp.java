package com.zlsu.service.imp;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zlsu.dao.PersionDao;
import com.zlsu.doma.Persion;
import com.zlsu.service.PersionService;

@Service("persionService")
public class PersionServiceImp implements PersionService {

	private PersionDao persionDao;

	public PersionDao getPersionDao() {
		return persionDao;
	}

	@Resource
	public void setPersionDao(PersionDao persionDao) {
		this.persionDao = persionDao;
	}

	@Override
	public void insert(Persion persion) {
		persionDao.insert(persion);
	}

	@Override
	public void deleteById(int id) {
		persionDao.deleteByid(id);
	}

	@Override
	public void updata(Persion persion) {
		persionDao.updata(persion);
	}

	@Override
	public List<Persion> findAll() {
		return persionDao.findAll();
	}

}
