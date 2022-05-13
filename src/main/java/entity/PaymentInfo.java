package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Payment_Info")
public class PaymentInfo {
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2",strategy="org.hibernate.id.UUIDGenerator")
    private String paymentId;
	private String details;
	private double amount;
	private Long senderid;
	private Long receiverid;
	private Long transctionid;
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getSenderid() {
		return senderid;
	}
	public void setSenderid(Long senderid) {
		this.senderid = senderid;
	}
	public Long getReceiverid() {
		return receiverid;
	}
	public void setReceiverid(Long receiverid) {
		this.receiverid = receiverid;
	}
	public Long getTransctionid() {
		return transctionid;
	}
	public void setTransctionid(Long transctionid) {
		this.transctionid = transctionid;
	}
}
