package com.hbut.hanson.entity;

import java.sql.Timestamp;

/**
 * ClassName: Service <br/>
 * date: 2018年4月11日 下午4:41:18 <br/>
 *
 * @author Hanson
 * @version 
 * @since JDK 1.8
 * @see 服务财务
 */
public class Service {
    private Integer serviceId;

    private Integer accountId;

    private String hostIp;

    private String serverUserName;

    private String password;

    private char status;

    private Timestamp createDate;

    private Timestamp pauseDate;

    private Timestamp closeDate;

    private Integer costId;

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getHostIp() {
		return hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public String getServerUserName() {
		return serverUserName;
	}

	public void setServerUserName(String serverUserName) {
		this.serverUserName = serverUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getPauseDate() {
		return pauseDate;
	}

	public void setPauseDate(Timestamp pauseDate) {
		this.pauseDate = pauseDate;
	}

	public Timestamp getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Timestamp closeDate) {
		this.closeDate = closeDate;
	}

	public Integer getCostId() {
		return costId;
	}

	public void setCostId(Integer costId) {
		this.costId = costId;
	}

	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", accountId=" + accountId + ", hostIp=" + hostIp
				+ ", serverUserName=" + serverUserName + ", password=" + password + ", status=" + status
				+ ", createDate=" + createDate + ", pauseDate=" + pauseDate + ", closeDate=" + closeDate + ", costId="
				+ costId + "]";
	}

}