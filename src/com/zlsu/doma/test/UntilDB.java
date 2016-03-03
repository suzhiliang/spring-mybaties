package com.zlsu.doma.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UntilDB {
	private static SqlSessionFactory instance = null;
	private UntilDB() {
	}
	private synchronized static void instance() {
		if (instance != null) {
			try {
				Reader reader = Resources
						.getResourceAsReader("Configuration.xml");
				instance = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		if(instance!=null){
			instance();
		}
		return instance;
	}

}
