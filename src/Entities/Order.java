package Entities;

import java.util.Date;

import Entities.enums.OrdenStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrdenStatus status;

	public Order(Integer id, Date moment, OrdenStatus status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdenStatus getStatus() {
		return status;
	}

	public void setStatus(OrdenStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
