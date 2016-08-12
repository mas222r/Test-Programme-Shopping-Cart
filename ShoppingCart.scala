package com.capgemini.scala.ddct.programme

/** This defines our Shopping cart trait.
  *
  * author : Abdul Suboor Mohammed 
  */
trait ShoppingCart 
{
  /** cost price of each apple */
  val eachApplePrice:Double = 0.6
  
  /** cost price of each orange */
  val eachOrangePrice:Double=0.25
  
  /** This gives actual total cost of shopping cart before simple offer
    *
    * @param apples user added apples 
    * @param oranges user added oranges
    * @return The total cost of shopping cart. 
    */
  def actualTotalCostBeforeOffer(apples:Int,oranges:Int):Double
  
 /** This gives actual total cost of shopping cart after simple offer
    *
    * @param apples user added apples 
    * @param oranges user added oranges
    * @return The total cost of shopping cart after simple offer. 
    */
  def actualTotalCostAfterSimpleOffer(apples:Int,oranges:Int):Double
  
}