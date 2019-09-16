package com.fs.po;

import java.sql.Date;

public class User {
    private Integer id;
    private String name;
    private String sex;
    private Float height;
    private Date birthday;

	public User() {
		super();
	}
	public User(String name, String sex, Float height, Date birthday) {
		super();
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.birthday = birthday;
	}
	public User(Integer id, String name, String sex, Float height, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", height=" + height + ", birthday=" + birthday
				+ "]";
	}
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
    public Float getHeight() {
        return height;
    }
    public void setHeight(Float height) {
        this.height = height;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}