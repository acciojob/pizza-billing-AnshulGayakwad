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
            this.basePrice = 300;
        }
        else{
            this.price = 400;
            this.basePrice = 400;
        }
        this.cheesePrice = 80;
        this.paperBagprice = 20;
        this.vegToppingPrice = 70;
        this.nonVegToppingPrice = 120;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            this.price += this.cheesePrice;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded && isVeg) {
            this.price += this.vegToppingPrice;
            isExtraToppingAdded = true;
        }
        else if(!isExtraToppingAdded && !isVeg){
            this.price += this.nonVegToppingPrice;
            isExtraToppingAdded = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded) {
            this.price += this.paperBagprice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Base Price Of The Pizza: "+this.basePrice+"\n";
        if(isExtraCheeseAdded){
            this.bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
        }
        if(isExtraToppingAdded && isVeg){
            this.bill += "Extra Toppings Added: " + this.vegToppingPrice + "\n";
        }
        else if(isExtraToppingAdded && !isVeg){
            this.bill += "Extra Toppings Added: " + this.nonVegToppingPrice + "\n";
        }
        if(isTakeAwayAdded){
            this.bill += "Paperbag Added: "+this.paperBagprice+"\n";
        }
        this.bill += "Total Price: "+this.price+"\n";

        return this.bill;
    }
}
