package questions

/**
 * Created by tanayuk on 4/13/16.
 */
def addressList = []
cleanUp(0, [])




def cleanUp(int moveCount, List addressList){
  def direction = ['R','L','F','B']
  if(moveCount == 0){
    addressList.add([0,0])
  }
  if(moveCount == 12){
    return
  }
  direction.each{
    if(it == 'R'){
      def last = addressList.last()
      addressList.add([last[0] + 1, last[1]])
    }else if(it == 'L'){
      def last = addressList.last()
      addressList.add([last[0] -1, last[1]])
    }
  }


}
