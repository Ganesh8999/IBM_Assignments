package com.ibm.test.service;

import java.util.Map;

import com.ibm.test.bean.DaoClass;
import com.ibm.test.bean.Person;

public  class ServiceClass implements ServiceInterface {

	DaoClass dao = new DaoClass();
	
	@Override
	public boolean validateUserName(String userName) {
		if(userName.matches(userNamePattern))
			return true;
		else
			return false;
	}
	
public void storeIntoMap(Person person){
		dao.storeIntoMap(person);
		
	}
//	publ4ic void test(){
//		
//	}

	@Override
	public Map<Integer, Person> displayPersons() {
		
		return dao.displayPersons();
	}
	
	

}
