package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private String bill = "";
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeAwayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
            bill += "Base Price Of The Pizza: 300\n";
        }
        else{
            price = 400;
            bill += "Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            price += 80;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded) {
            price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: 80\n";
        }
        if(isExtraToppingAdded){
            if(isVeg){
                bill += "Extra Toppings Added: 70\n";
            }
            else{
                bill += "Extra Toppings Added: 120\n";
            }
        }
        if(isTakeAwayAdded){
            bill += "Paper bag Price = 20\n";
        }
        bill += "Total Price: "+price;
        return this.bill;
    }
}
