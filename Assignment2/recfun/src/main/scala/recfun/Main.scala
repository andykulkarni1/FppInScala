package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
    if (c < 0) 0
    else if (r == 1 || c == r) 1
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)


  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
    def loop(chars:List[Char],nesting:Int):Boolean = {
      if(chars.isEmpty)
        nesting == 0
      else if( nesting < 0)
        false
      else if(chars.head == '(')
        loop(chars.tail,nesting +1)
      else if(chars.head == ')')
        loop(chars.tail,nesting -1)
      else
        loop(chars.tail,nesting)


    }

    loop(chars,0)



  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) 1

    else if((money < 0 ) || coins.isEmpty)
      0
    else
      countChange(money,coins.tail) + countChange(money-coins.head,coins)



  }
}
