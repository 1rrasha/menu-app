package com.example.sec2_app3;

import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class DatabaseItems {

    private List<MenuItem> items = new ArrayList<MenuItem>();

    public DatabaseItems(){
        items.add(new MenuItem("Coffee", 10, "Hot Drinks"));
        items.add(new MenuItem("Tea", 8, "Hot Drinks"));
        items.add(new MenuItem("Iced Coffee", 12, "Cold Drinks"));
        items.add(new MenuItem("Iced Tea", 10, "Cold Drinks"));
        items.add(new MenuItem("Ham Sandwich", 15, "Sandwiches"));
        items.add(new MenuItem("Chicken Sandwich", 12, "Sandwiches"));
        items.add(new MenuItem("Espresso", 12, "Hot Drinks"));
        items.add(new MenuItem("Latte", 15, "Hot Drinks"));
        items.add(new MenuItem("Mocha", 14, "Hot Drinks"));
        items.add(new MenuItem("Cappuccino", 13, "Hot Drinks"));
        items.add(new MenuItem("Hot Chocolate", 12, "Hot Drinks"));
        items.add(new MenuItem("Chai Latte", 11, "Hot Drinks"));
        items.add(new MenuItem("Green Tea", 9, "Hot Drinks"));
        items.add(new MenuItem("Black Tea", 8, "Hot Drinks"));
        items.add(new MenuItem("Lemonade", 8, "Cold Drinks"));
        items.add(new MenuItem("Soda", 7, "Cold Drinks"));
        items.add(new MenuItem("Fruit Punch", 9, "Cold Drinks"));
        items.add(new MenuItem("Milkshake", 12, "Cold Drinks"));
        items.add(new MenuItem("Smoothie", 10, "Cold Drinks"));
        items.add(new MenuItem("Club Sandwich", 18, "Sandwiches"));
        items.add(new MenuItem("Vegetarian Sandwich", 13, "Sandwiches"));
        items.add(new MenuItem("Shawarma Sandwich", 14, "Sandwiches"));
        items.add(new MenuItem("Turkey Sandwich", 13, "Sandwiches"));
        items.add(new MenuItem("Grilled Cheese", 10, "Sandwiches"));
        items.add(new MenuItem("Tuna Sandwich", 12, "Sandwiches"));
        items.add(new MenuItem("Egg Salad Sandwich", 11, "Sandwiches"));
        items.add(new MenuItem("Pastrami Sandwich", 15, "Sandwiches"));

    }

    public List<MenuItem> getMenuItems(String category){
        List<MenuItem> result = new ArrayList<>();
        for(MenuItem m: items){
            if(m.getCategory().equals(category)){
                result.add(m);
            }
        }
        return result;


    }

    public String[] getCategories(){
        //assume we are reading data from database
        String[] categories = {"Hot Drinks", "Cold Drinks", "Sandwiches"};
        return categories;

    }


}
