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
public class menu {

    private mealBuilder mealCreator ;
	
	public menu(mealBuilder mealCreator){
		this.mealCreator = mealCreator; 
	}
   
        
        public meal getmeal()
        {
            return this.mealCreator.getMeal();
        }
    
        public void creatMeal() 
	{
		this.mealCreator.buildName();
		this.mealCreator.buildPrice();
		this.mealCreator.buildAvaliable();
		
	}

}
