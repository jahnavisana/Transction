package service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.Acknowledgement;
import dto.Transctionrequest;
import entity.PaymentInfo;
import entity.UserInfo;
import repository.PaymentInfoRepository;
import repository.UserInfoRepository;
import utils.PaymentUtils;

@Service
public class paying {
	
	@Autowired
	private UserInfoRepository userinforepository;
	@Autowired
	private PaymentInfoRepository paymentinforepository;
	public  Acknowledgement paymoney(Transctionrequest request) 
		{
			Acknowledgement acknowledgement=null;
			UserInfo userInfo=request.getUserinfo();
			userInfo=userinforepository.save(userInfo);
			PaymentInfo paymentInfo=request.getPaymentinfo();
			PaymentUtils.validateCreditLimit(paymentInfo.getSenderid(),userInfo.getPayment());

	        paymentInfo.setAmount(UserInfo.getPayment());
	        paymentinforepository.save(paymentInfo);
	        return new Acknowledgement("SUCCESS", userInfo);
		
		}
	} 
