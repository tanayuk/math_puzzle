package questions

/**
 * Created by tanayuk on 3/17/16.
 */

(5..500).findAll({it % 2 == 0}).each{ stringLength ->
  def squareArea = (stringLength/2).pow(2)
  println(squareArea)

  def firstWidth
  def firstHeight
  def secondWidth
  def secondHeight
  def squareSide

}
