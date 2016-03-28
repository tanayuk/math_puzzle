package questions

/**
 * Created by tanayuk on 02/03/2016.
 */

(1000..9999).each{
  def original = it.toString()
  operands = ['','+','-','/','*']
  def reverse = it.toString().reverse()
  operands.each{ operand1 ->
    def formula = original.substring(0,1) + operand1 + original.substring(1)
    operands.each{ operand2 ->
      if(operand1 == ''){
        // i.e. 1234
        formula = formula.substring(0,2) + operand2.toString() + formula.substring(2)
      }else{
        // i.e. 1+234
        formula = formula.substring(0,3) + operand2.toString() + formula.substring(3)
      }
      operands.each{ operand3 ->
        if(formula.length() == 4){
          // i.e. 1234
          formula = formula.substring(0,3) + operand3.toString() + formula.substring(3)
        }else if(formula.length() == 5){
          // i.e. 1+234 or 12+34
          formula = formula.substring(0,4) + operand3.toString() + formula.substring(4)
        }else{
          // i.e. 1+2+34
          formula = formula.substring(0,5) + operand3.toString() + formula.substring(5)
        }
        if(formula =~ /\/0/){
          formula = '0'
        }
        // To avoid octal calculation
        formula.replace('08','8').replace('09','9')

        if(formula.length() > 4 && evaluate(formula.toString()) == Integer.valueOf(reverse)){
          println("Original Formula (${formula}) results to ${reverse}")
          // This is for 1000
          formula = original
        }else{
          formula = original
        }
      }
    }
  }
}
