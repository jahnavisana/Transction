package utils;

import java.util.HashMap;
import java.util.Map;

import exception.InsufficentAmountException;

public class PaymentUtils {
private static Map<String,Double>paymentMap=new HashMap<>();
{
	paymentMap.put("1", (double) 10000);
	paymentMap.put("2", (double) 8000);
	paymentMap.put("3", (double) 4000);
	
}
public static boolean validateCreditLimit(Long long1 ,double paidAmount ) {
	if (paidAmount > paymentMap.get(long1)) {
		throw new InsufficentAmountException("Insufficient fund");
	}
	else {
		return true;
	}
}
}
