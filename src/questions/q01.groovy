package questions
import common.ExecutionUtil

/**
 * Created by tanayuk on 02/03/2016.
 */

def duration = ExecutionUtil.benchmark {
  base = 11
  while (true) {
    if (base.toString() == base.toString().reverse()
      && Integer.toBinaryString(base) == Integer.toBinaryString(base).reverse()
      && Integer.toOctalString(base) == Integer.toOctalString(base).reverse()) {
      println("${base} is palindrome. Decimal: ${base}, Binary: ${Integer.toBinaryString(base)}, and Octal: ${Integer.toOctalString(base)}");
      break;
    }
    base += 2;
  }
};
println("ExecutionTime: ${duration}ms")
