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
public class CPIT252Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mealBuilder old = new OldmealBuilder();

	menu Menu = new menu(old);
        
        Menu.creatMeal();
        meal BurgerMeal = new meal();
	 BurgerMeal = Menu.getmeal();

        
        System.out.println( BurgerMeal.getName());
        System.out.println(BurgerMeal.getPrice());
        if(BurgerMeal.getAvaliable() == false)
        {
            System.out.println("is not avaliable currently");
        }else
        System.out.println("it's avaliable");

    }
    
}
