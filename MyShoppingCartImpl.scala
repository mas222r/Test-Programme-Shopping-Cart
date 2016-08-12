package com.capgemini.scala.ddct.programme

/** Shopping cart Implementation class.
  *
  * author : Abdul Suboor Mohammed 
  */
class MyShoppingCartImpl extends ShoppingCart
{
  
   /** This gives actual total cost of shopping cart before simple offer
    *
    * @param apples user added apples 
    * @param oranges user added oranges
    * @return The total cost of shopping cart. 
    */
  def actualTotalCostBeforeOffer(apples:Int,oranges:Int):Double =
  {
    val totalCartCostBeforeoffer = eachApplePrice * apples + eachOrangePrice * oranges
    println("Total Price before simple offer  : "+totalCartCostBeforeoffer)
    totalCartCostBeforeoffer
  }
  
  /** This gives actual total cost of shopping cart after simple offer
    *
    * @param apples user added apples 
    * @param oranges user added oranges
    * @return The total cost of shopping cart after simple offer. 
    */
  def actualTotalCostAfterSimpleOffer(apples:Int,oranges:Int):Double =
  {
     
     val totalAppleCostAfterOffer = (apples/2) * eachApplePrice + (apples%2) * eachApplePrice
             
     val totalOrangeCostAfterOffer = ((oranges)-(oranges/3))*eachOrangePrice
         
     val totalCostSimpleOffer = totalAppleCostAfterOffer + totalOrangeCostAfterOffer
     
     println("Total Price after simple offer  : "+totalCostSimpleOffer)
     
     totalCostSimpleOffer
  }
  
}