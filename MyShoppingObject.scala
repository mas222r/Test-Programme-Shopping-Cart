package com.capgemini.scala.ddct.programme

import scala.io.StdIn
import scala.util.{Try}

/** A simple Object for testing Shopping cart Implementation.
  *
  * author : Abdul Suboor Mohammed 
  */
object MyShoppingObject extends App
{
 
  val userAddedApples = Try(StdIn.readLine("Add apple(s) to your shopping cart :\n").toInt).getOrElse(0)
  val userAddedOranges = Try(StdIn.readLine("Add orange(s) to your shopping cart :\n").toInt).getOrElse(0)
  val myShoppingCartImpl = new MyShoppingCartImpl
  myShoppingCartImpl.actualTotalCostBeforeOffer(userAddedApples, userAddedOranges)
  myShoppingCartImpl.actualTotalCostAfterSimpleOffer(userAddedApples, userAddedOranges)
  
}