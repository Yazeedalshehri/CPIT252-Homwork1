/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit252.homework1;

/**
 *
 * @author yaaz4
 */
public class meal {
        private String Name;
	private double Price;
	private Boolean Avaliable;
	
	
	public meal() {}

	public void setName(String name) { Name = name;}	
	
	public void setPrice(double price)  {Price = price;}

	public void setAvaliable(Boolean avaliable) {Avaliable = avaliable;}

	
	
	public String getName() {return Name;}
	public double getPrice() {return Price;}
	public boolean getAvaliable() {return Avaliable;}
	
      
    
}
