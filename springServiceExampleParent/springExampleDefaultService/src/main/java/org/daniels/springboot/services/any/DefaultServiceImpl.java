package org.daniels.springboot.services.any;

import org.daniels.springboot.services.DefaultService;
import org.springframework.stereotype.Service;

@Service
public class DefaultServiceImpl implements DefaultService{

	@Override
	public String moneyService() {
		return "my money from Default Service";
	}

	@Override
	public String currencyService() {
		return "my currency from Default Service";
	}



}
