package codeiq

/**
 * Created by tanayuk on 3/24/16.
 */
def allowedDigit = ['1','2','3','4']
//def n = System.console().readLine()
Scanner cin=new Scanner(System.in)
def n=cin.nextLine()

def ansCount = 0
def startNumber = ""
for(int i = 1; i < Integer.valueOf(n); i++){
  startNumber+="1"
}
def endNumber = startNumber + "1"
def numberList = []
((Integer.valueOf(startNumber) + 1)..Integer.valueOf(endNumber)).each{ number ->
  def length = String.valueOf(number).length()
  if(String.valueOf(number).substring(length-1).toInteger() > 5){
    numberList.add(number * 9)
  }
}

numberList.each {
  def flag = true
  "${it}".split("").each{ digit ->
    if(!allowedDigit.contains(digit)){
      flag = false
    }
  }
  if(flag){
    ansCount++
  }
}
println(ansCount)
