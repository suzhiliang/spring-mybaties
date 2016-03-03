package com.zlsu.dao.imp;

import java.util.List;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.zlsu.dao.PersionDao;
import com.zlsu.doma.Persion;

@Repository("persionDao")
public class PersionDaoImp implements PersionDao {
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession = null;
	private PersionDao persionDao = null;

	public PersionDaoImp() {
		sqlSession = sqlSessionFactory.openSession();
		persionDao = sqlSession.getMapper(PersionDao.class);
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public List<Persion> findAll() {
		List<Persion> persions = persionDao.findAll();
		sqlSession.close();
		return persions;
	}

	@Override
	public void insert(Persion persion) {
		persionDao.insert(persion);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void updata(Persion persion) {
		persionDao.updata(persion);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void deleteByid(int id) {
		persionDao.deleteByid(id);
		sqlSession.commit();
		sqlSession.close();
	}

}
