package com.zlsu.service;

import java.util.List;

import com.zlsu.doma.Persion;

public interface PersionService {
	void insert(Persion persion);
	void deleteById(int id);
	void updata(Persion persion);
	List<Persion> findAll();
}
