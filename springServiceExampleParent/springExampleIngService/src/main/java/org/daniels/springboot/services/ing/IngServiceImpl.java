package org.daniels.springboot.services.ing;

import org.daniels.springboot.services.DefaultService;
import org.springframework.stereotype.Service;

@Service
public class IngServiceImpl implements DefaultService{

	@Override
	public String moneyService() {
		return "my money from ING Service";
	}

	@Override
	public String currencyService() {
		return "my currency from ING Service";
	}



}
