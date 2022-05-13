package dto;

import entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Acknowledgement {

public Acknowledgement(String string, UserInfo userInfo2) {
		// TODO Auto-generated constructor stub
	}
public UserInfo getUserinfo() {
	return userinfo;
}
public void setUserinfo(UserInfo userinfo) {
	this.userinfo = userinfo;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private String status;
private UserInfo userinfo;
}
