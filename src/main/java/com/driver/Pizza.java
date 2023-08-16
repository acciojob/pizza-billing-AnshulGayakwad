/*package com.driver;

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
*/

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeaway;
    private final int paperbagPrice;
    private final int basePrice;
    private final int extraCheesePrice;
    private final int extraToppingsPriceVeg;
    private final int extraToppingsPriceNonVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.basePrice = 300;
        } else {
            this.price = 400;
            this.basePrice = 400;
        }
        this.paperbagPrice = 20;
        this.extraCheesePrice = 80;
        this.extraToppingsPriceNonVeg = 120;
        this.extraToppingsPriceVeg = 70;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            this.extraCheese = true;
            this.price += extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings && isVeg) {
            this.price += extraToppingsPriceVeg;
            this.extraToppings = true;
        } else if(!extraToppings && !isVeg) {
            this.price += extraToppingsPriceNonVeg;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            this.takeaway = true;
            this.price += paperbagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if(extraCheese){
            sb.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");
        }
        if(extraToppings && isVeg) {
            sb.append("Extra Toppings Added: ").append(extraToppingsPriceVeg).append("\n");
        } else if (extraToppings && !isVeg) {
            sb.append("Extra Toppings Added: ").append(extraToppingsPriceNonVeg).append("\n");
        }
        if(takeaway){
            sb.append("Paperbag Added: ").append(paperbagPrice).append("\n");
        }
        sb.append("Total Price: ").append(this.price).append("\n");
        this.bill = sb.toString();
        return this.bill;
    }
}