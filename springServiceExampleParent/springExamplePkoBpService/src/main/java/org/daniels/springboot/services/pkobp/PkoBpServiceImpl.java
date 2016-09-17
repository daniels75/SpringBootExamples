package org.daniels.springboot.services.pkobp;

import org.daniels.springboot.services.DefaultService;
import org.springframework.stereotype.Service;

@Service
public class PkoBpServiceImpl implements DefaultService{

	@Override
	public String moneyService() {
		return "my money from PKO BP Service";
	}

	@Override
	public String currencyService() {
		return "my currency from PKO BP Service";
	}



}
