object PascalTriangle {

  /**
    * "Pascal's Triangle"
    * 0 1 2 3 4
    * -----------
    * 1         |0
    * 1 1       |1
    * 1 2 1     |2
    * 1 3 3 1   |3
    * 1 4 6 4 1 |4
    * ________________________________________________
    * e.g. pascal(1, 2) = pascal(0, 1) + pascal(1, 1)
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}