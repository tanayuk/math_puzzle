package questions

/**
 * Created by tanayuk on 4/13/16.
 */
def addressList = []
cleanUp(0, addressList)

def cleanUp(int moveCount, List addressList){
  println(addressList)
  def direction = ['R','L','F','B']
  if(moveCount == 0){
    addressList.add([0,0])
  }
  if(moveCount == 3){
    return
  }
  direction.each {
    def last = addressList.last()
    if (it == 'R') {
      if(!addressList.contains([last[0] + 1, last[1]])) addressList.add([last[0] + 1, last[1]])
      cleanUp(moveCount + 1, addressList)
    } else if (it == 'L') {
      addressList.add([last[0] - 1, last[1]])
      cleanUp(moveCount + 1, addressList)
    } else if (it == 'F') {
      addressList.add([last[0], last[1] + 1])
      cleanUp(moveCount + 1, addressList)
    } else {
      addressList.add([last[0], last[1] - 1])
      cleanUp(moveCount + 1, addressList)
    }
  }
}
