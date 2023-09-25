package EnumeracoesComposicoes.java;

import java.util.Date;

public class Order {
	
	private Integer id;
	private Date moment;
	private Enum status;
	
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, Enum status) {
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

	public Enum getStatus() {
		return status;
	}

	public void setStatus(Enum status) {
		this.status = status;
	}
	
	
}
