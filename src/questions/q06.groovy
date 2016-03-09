package questions

/**
 * Created by 01011996 on 3/9/16.
 */
def two_complement = []
def base = 2
while(base < 30001){
  two_complement.add(base)
  base *= 2
}
def count = 0
(2..10000).findAll({it%2==0}).each{
  def ans = calcCollatz(it, (it*3+1), two_complement)
  if(ans != null) {
    // ans satisfy Collatz
    count++
  }
}
println("Total numbers of collatz: ${count}")

def calcCollatz(int init, int n, List<Integer> two_complement){
  if(two_complement.contains(n) && n < init){
    return null;
  }
  if(init == n ){
    return init;
  }
  if(n % 2 != 1){
    calcCollatz(init, (int)(n/2), two_complement)
  }else{
    calcCollatz(init, ((n*3)+1), two_complement)
  }
}
