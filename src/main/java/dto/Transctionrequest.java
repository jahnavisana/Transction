package dto;

import entity.PaymentInfo;
import entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transctionrequest {
private UserInfo userinfo;
private PaymentInfo paymentinfo;
public UserInfo getUserinfo() {
	return userinfo;
}
public void setUserinfo(UserInfo userinfo) {
	this.userinfo = userinfo;
}
public PaymentInfo getPaymentinfo() {
	return paymentinfo;
}
public void setPaymentinfo(PaymentInfo paymentinfo) {
	this.paymentinfo = paymentinfo;
}

}
