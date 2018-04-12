package com.hbut.hanson.entity;

/**
 * ClassName: Module <br/>
 * date: 2018年4月11日 下午4:40:13 <br/>
 *
 * @author Hanson
 * @version 
 * @since JDK 1.8
 * @see 功能模块
 */
public class Module {
    private Integer moduleId;

    private String name;

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", name=" + name + "]";
	}

    
    
    
}