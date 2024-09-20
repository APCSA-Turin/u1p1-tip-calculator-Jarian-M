package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        double totalTip = cost * (percent / 100.0); //Returns the cost multiplied by the percentage as a decimal, which in turn is the total tip amount//
        double totalBill = cost + totalTip; //Returns the total bill, which is the sum of the cost and the total tip//
        double costPerPerson = cost / people; //Returns the amount that each person has to pay before the tip is included//
        double tipPerPerson = totalTip / people; //Returns the total amount of the tip that each person has to pay//
        double totalCostPerPerson = totalBill / people; //Returns the total amount, including tip, that each person has to pay//
        String tTip = String.format("%.2f", totalTip); /*Initializes tTip to the value of totalTip rounded to the nearest hundredth.
        I learned how to round without using printf here: https://stackoverflow.com/questions/32303196/printing-first-3-decimal-places-without-rounding*/
        String tBill = String.format("%.2f", totalBill); //Initializes tBill to the value of totalBill rounded to the nearest hundredth//
        String cPP = String.format("%.2f", costPerPerson); //Initializes cPP to the value of costPerPerson rounded to the nearest hundredth//
        String tPP = String.format("%.2f", tipPerPerson); //Initializes tPP to the value of tipPerPerson rounded to the nearest hundredth//
        String tCPP = String.format("%.2f", totalCostPerPerson); //Initializes tCPP to the value of totalCostPerPerson rounded to the nearest hundredth//
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost).append("\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%").append("\n"); //I appended "\n" to make the cursor start on the next line after every printed item. I learned how to do this from Tyler Walters//
        result.append("Total tip: $" + tTip).append("\n");
        result.append("Total Bill with tip: $" + tBill).append("\n");
        result.append("Per person cost before tip: $" + cPP).append("\n");
        result.append("Tip per person: $" + tPP).append("\n");
        result.append("Total cost per person: $" + tCPP).append("\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}