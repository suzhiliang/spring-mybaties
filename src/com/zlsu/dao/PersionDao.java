package com.zlsu.dao;

import java.util.List;

import com.zlsu.doma.Persion;

public interface PersionDao {
	public List<Persion> findAll();
	public void insert(Persion persion);
	public void updata(Persion persion);
	public void deleteByid(int id);
}
