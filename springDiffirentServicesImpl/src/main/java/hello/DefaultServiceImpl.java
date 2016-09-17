package hello;

import org.springframework.stereotype.Service;

@Service
public class DefaultServiceImpl implements DefaultService{

	@Override
	public String ingService() {
		return "Running ING Service";
	}

	@Override
	public String mBankService() {
		return "Running mBank Service";
	}

	@Override
	public String pkobpService() {
		return "Running PKO BP Service";
	}

}
