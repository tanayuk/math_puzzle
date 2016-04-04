package codeiq

/**
 * Created by Yuki Tanaka on 3/31/16.
 */

@Grapes([
    @Grab(group = 'org.apache.commons', module = 'commons-math3', version = '3.2')
])

def totalPrice = 0
def menuPrices = []

Scanner cin = new Scanner(System.in)
def readCount = 0
while (cin.hasNext()) {
  def input = cin.nextLine()
  if("".equals(input)){
    break
  } else if (readCount == 0) {
    totalPrice = Integer.valueOf(input)
  } else {
    menuPrices.add(Integer.valueOf(input))
  }
  readCount++
}

println("totalPrice: ${totalPrice}")
println("menuPrices: ${menuPrices}")
