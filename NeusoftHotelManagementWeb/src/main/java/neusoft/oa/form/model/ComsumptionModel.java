package neusoft.oa.form.model;

import org.apache.ibatis.type.Alias;

@Alias("FComsumption")
public class ComsumptionModel {
	private int id = 0;
	private int checkID = 0;
	private int goodsID = 0;
	private int count = 0;
	private int perPrice = 0;
	private int totalPrice = 0;
	private int employeeID = 0;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCheckID() {
		return checkID;
	}
	public void setCheckID(int checkID) {
		this.checkID = checkID;
	}
	public int getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPerPrice() {
		return perPrice;
	}
	public void setPerPrice(int perPrice) {
		this.perPrice = perPrice;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
