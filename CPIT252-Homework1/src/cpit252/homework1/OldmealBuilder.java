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
public class  OldmealBuilder implements mealBuilder{

    
    private meal Meal;

    public OldmealBuilder() {
        this.Meal = new meal();
    }

    @Override
    public void buildAvaliable() {
     Meal.setAvaliable(Boolean.TRUE);
    }

    @Override
    public void buildName() {
      Meal.setName("Burger");
    }

    @Override
    public void buildPrice() {
        Meal.setPrice(9.99);     
    }
    public meal getMeal()
    {
        return Meal;
    }

}
