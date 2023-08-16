package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private String bill = "";
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeAwayAdded = false;
    private final int basePrice;
    private final int cheesePrice;
    private final int vegToppingPrice;
    private final int nonVegToppingPrice;
    private final int paperBagprice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            basePrice = 300;
        }
        else{
            this.price = 400;
            basePrice = 400;
        }
        cheesePrice = 80;
        paperBagprice = 20;
        vegToppingPrice = 70;
        nonVegToppingPrice = 120;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            this.price += cheesePrice;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded && isVeg) {
            this.price += vegToppingPrice;
            isExtraToppingAdded = true;
        }
        else if(!isExtraToppingAdded && !isVeg){
            this.price += nonVegToppingPrice;
            isExtraToppingAdded = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded) {
            this.price += paperBagprice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill += "Base Price Of The Pizza: "+basePrice+"\n";
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+cheesePrice+"\n";
        }
        if(isExtraToppingAdded && isVeg){
                bill += "Extra Toppings Added: " + vegToppingPrice + "\n";
        }
        else if(isExtraToppingAdded && !isVeg){
            bill += "Extra Toppings Added: " + nonVegToppingPrice + "\n";
        }
        if(isTakeAwayAdded){
            bill += "Paperbag Added: "+paperBagprice+"\n";
        }
        bill += "Total Price: "+this.price+"\n";

        return this.bill;
    }
}
