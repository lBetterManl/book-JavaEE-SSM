package com.hbut.hanson.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * ClassName: Cost <br/>
 * date: 2018年4月11日 下午4:39:43 <br/>
 *
 * @author Hanson
 * @version 
 * @since JDK 1.8
 * @see 资费
 */
public class Cost {
    private Integer costId;

    private String name;

    private Long baseDuration;

    private BigDecimal baseCost;

    private BigDecimal unitCost;

    private String status;

    private String descr;

    private Timestamp creatTime;

    private Timestamp startTime;

    private String costType;

	public Integer getCostId() {
		return costId;
	}

	public void setCostId(Integer costId) {
		this.costId = costId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getBaseDuration() {
		return baseDuration;
	}

	public void setBaseDuration(Long baseDuration) {
		this.baseDuration = baseDuration;
	}

	public BigDecimal getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(BigDecimal baseCost) {
		this.baseCost = baseCost;
	}

	public BigDecimal getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Timestamp getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Timestamp creatTime) {
		this.creatTime = creatTime;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public String getCostType() {
		return costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
	}

	@Override
	public String toString() {
		return "Cost [costId=" + costId + ", name=" + name + ", baseDuration=" + baseDuration + ", baseCost=" + baseCost
				+ ", unitCost=" + unitCost + ", status=" + status + ", descr=" + descr + ", creatTime=" + creatTime
				+ ", startTime=" + startTime + ", costType=" + costType + "]";
	}

    
}