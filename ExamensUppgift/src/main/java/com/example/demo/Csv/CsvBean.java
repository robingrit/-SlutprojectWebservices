package com.example.demo.Csv;




public class CsvBean {
	private String OrderDate;
	private String Region;
	private String Rep1;
	private String Rep2;
	private String Item;
	private String Units;
	private String UnitCost;
	private String Total;
	
	
	
	public CsvBean(String orderDate, String region, String rep1, String rep2, String item, String units, String unitCost,
			String total) {
		
		this.OrderDate = orderDate;
		this.Region = region;
		this.Rep1 = rep1;
		this.Rep2 = rep2;
		this.Item = item;
		this.Units = units;
		this.UnitCost = unitCost;
		this.Total = total;
		
	}
	
		
	public String toJasonString() {
		String pattern = "{\"OrderDate\":\"%s\",\"Region\":\"%s\",\"Rep1\":\"%s\",\"Rep2\":\"%s\""
				+ ",\"Item\":\"%s\",\"Units\":\"%s\",\"UnitCost\":\"%s\",\"Total\":\"%s\"}";
		 
		
		return String.format(pattern, getOrderDate(),getRegion(),
				getRep1(),getRep2(),getItem(),getUnits(),
				getUnitCost(),getTotal());
	}
	
	
	
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getRep1() {
		return Rep1;
	}
	public void setRep1(String rep1) {
		Rep1 = rep1;
	}
	public String getRep2() {
		return Rep2;
	}
	public void setRep2(String rep2) {
		Rep2 = rep2;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public String getUnits() {
		return Units;
	}
	public void setUnits(String units) {
		Units = units;
	}
	public String getUnitCost() {
		return UnitCost;
	}
	public void setUnitCost(String unitCost) {
		UnitCost = unitCost;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}















	



	public String getOrderDate() {
		return OrderDate;
	}



	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	
	

}
