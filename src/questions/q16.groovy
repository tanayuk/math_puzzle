package questions

/**
 * Groovy script to answer Q16.
 * [1] Base condition
 * Satisfying String Length: S
 * Square area = S^2/16 (i)
 * Required condition: ab+cd = S^2/16 (ii), where a is width, b is height in first rectangle,
 * and c is width, d is height in second rectangle.
 * From above, S must be divided by 4, and root of ab+cd must be an integer.
 *
 * Created by tanayuk on 3/17/16.
 */
def answerMapList = new HashMap<String, Map>()
(5..500).findAll({ it % 4 == 0 }).each { stringLength ->
  def squareArea = (stringLength / 4).pow(2)
  (1..(stringLength / 2) - 1).findAll({it % 2 == 0}).each { a ->
    // From 2a + 2b = S, (S-2a) has to satisfy even number.
    if ((stringLength - (2 * a)) % 2 == 0) {
      b = (stringLength - 2 * a) / 2
      (1..(stringLength /2) -1).findAll({it % 2 == 0}).each{ c->
        if((stringLength - (2*a)) % 2 == 0){
          d = (stringLength - 2 * c) / 2
          // This satisfy the summation of both rectangle
          if(Math.sqrt((a*b)+(c*d)) - Math.floor(Math.sqrt((a*b)+(c*d))) < 2*Double.MIN_VALUE){
            // But if a=c or b=c, both rectangles are same shape, thus ignoring
            if(a == c || b == c){
              // Do nothing
            }else if(answerMapList.containsKey(squareArea)){
              // Do nothing
            }
            else{
              answerMapList["${squareArea}"] = ['a':a,'b':b,'c':c,'d':d]
            }
          }
        }
      }
    }
  }
}

println(answerMapList)
