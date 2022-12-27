package com.driver;

public class Pizza {

    private int price; //calculating bill price
    private Boolean isVeg;
    private String bill; //string final bill with order detail and price eg. Delux pizza    400

    private int cheesePrice;

    private int toppingPrice;

    private int takeAwayPrice;

    boolean ischeeseAdded;
    boolean isToppingAdded;
    boolean isPaperbagAdded;
    boolean BillGenerated;

    public Pizza(Boolean isVeg){ //main se call hoga, ki isVeg =true or false
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice=80;
        this.takeAwayPrice=20;

        if(isVeg==true){
            this.price = 300;  //base price
            this.toppingPrice = 70;
        }
        else {
            this.price=400;
            this.toppingPrice=120;
        }

        this.ischeeseAdded =false;
        this.isPaperbagAdded=false;
        this.isToppingAdded=false;
        this.BillGenerated=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseAdded==false){
            this.price =this.price + this.cheesePrice;
        ischeeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price =this.price+ this.toppingPrice;
            isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperbagAdded==false){
            this.price =this.price+ this.takeAwayPrice;
            isPaperbagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(BillGenerated==false){

            if(ischeeseAdded==true) {
                this.bill= this.bill+"Extra Cheese Added:"+ this.cheesePrice+"\n";
            }
            if(isToppingAdded==true){
                this.bill=this.bill+"Extra Toppings Added:"+this.toppingPrice+"\n";
            }
            if(isPaperbagAdded==true){
                this.bill = this.bill+"Paperbag Added:"+this.takeAwayPrice+"\n";
            }

            this.bill = this.bill+ "Total Price:"+ this.price+"\n";
            BillGenerated=true;
        }

        return this.bill;
    }
}
