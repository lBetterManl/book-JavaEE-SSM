package com.hbut.hanson.entity;

import java.util.Date;

/**
 * ClassName: Account <br/>
 * date: 2018年4月11日 下午4:38:25 <br/>
 *
 * @author Hanson
 * @version 
 * @since JDK 1.8
 * @see 账号财务
 */
public class Account {
    private Integer accountId;

    private Integer recommenderAccountId;

    private String loginUserName;

    private String loginPassword;

    private int status;

    private Date createDate;

    private Date pauseDate;

    private Date closeDate;

    private String realName;

    private String idcardNo;

    private Date birthDate;

    private String gender;

    private String occupation;

    private String telephone;

    private String email;

    private String mailAddress;

    private String zipCode;

    private String qq;

    private Date lastLoginTime;

    private String lastLoginIp;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getRecommenderAccountId() {
		return recommenderAccountId;
	}

	public void setRecommenderAccountId(Integer recommenderAccountId) {
		this.recommenderAccountId = recommenderAccountId;
	}

	public String getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getPauseDate() {
		return pauseDate;
	}

	public void setPauseDate(Date pauseDate) {
		this.pauseDate = pauseDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdcardNo() {
		return idcardNo;
	}

	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", recommenderAccountId=" + recommenderAccountId + ", loginUserName="
				+ loginUserName + ", loginPassword=" + loginPassword + ", status=" + status + ", createDate="
				+ createDate + ", pauseDate=" + pauseDate + ", closeDate=" + closeDate + ", realName=" + realName
				+ ", idcardNo=" + idcardNo + ", birthDate=" + birthDate + ", gender=" + gender + ", occupation="
				+ occupation + ", telephone=" + telephone + ", email=" + email + ", mailAddress=" + mailAddress
				+ ", zipCode=" + zipCode + ", qq=" + qq + ", lastLoginTime=" + lastLoginTime + ", lastLoginIp="
				+ lastLoginIp + "]";
	}
        
}