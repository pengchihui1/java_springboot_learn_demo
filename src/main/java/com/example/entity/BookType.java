package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.util.CustomDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "t_book_type")
public class BookType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 10)
	private String name;// 图书名称

//    @NotNull(message = "排序号不能为空!")
	@Column(length = 10)
	private Integer orderNo;// 排序号不能为空

	// 创建时间
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDateTime;
	// 修改时间
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDateTime;

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
		this.name = name;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	@JsonSerialize(using = CustomDateTimeSerializer.class)
	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	@JsonSerialize(using = CustomDateTimeSerializer.class)
	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
}
