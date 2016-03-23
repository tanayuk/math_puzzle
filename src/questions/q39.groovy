package questions
/**
 * Use cascaded numbers as board where 0 is white, and 1 is black.
 * Until same status of board found, continue playing all patterns.
 * While playing game, 2 data types are used.
 *
 * 1: nodeList - This will check if same board status shown already or not.
 * Structure-> ("000000000","000000001", ...)
 *
 * 2: ansMap - This keeps tree of choices
 * Structure-> ([1]:"111100100",[1,1]:"000000000")
 *
 * Created by tanayuk on 3/22/16.
 */
def emptyBoard = "00000000000000000000"
def nodeList = []
def ansMap
//recursiveFlip(emptyBoard)
println(getReverseTarget(14))


def recursiveFlip(board){
  (1..16).each{ position ->
    def playedBoard = playReverse(position, board)
    recursiveFlip(playedBoard)
  }
}
/**
 * Returns cascaded location to 4 * 4 map
 *
 * @param loc
 * @return coordinate as map formatting (x, y)
 */
def locToCoordinate(int loc){
  return loc < 5 ? ["${loc}": '1'] : loc < 9 ? ["${loc - 4}": '2'] : loc < 13 ? ["${loc - 8}": '3'] : ["${loc - 12}": '4']
}

/**
 * Play reverse game by specifying touching position as 1st argument,
 * and current board status as 2nd argument.
 *
 * @param position
 * @param board
 * @return board after play as cascaded 9 binaries.
 */
def playReverse(int position, String board){
  def reverseTarget = getReverseTarget(position)
  reverseTarget.each{flipPosition->

  }
}

/**
 * (Tested)
 * Returns position where box should be flipped.
 *
 * @param position
 * @return targets i.e. [1,2,3,4,5,9,13]
 */
def getReverseTarget(int position){
  def targets = []
  if(position < 5){
    targets.addAll((1..4))
    (1..3).each {
      targets.add(position + 4 * it)
    }
  }else if(position < 9){
    targets.addAll((5..8))
    (-1..2).each {
      targets.add(position + 4 * it)
    }
  }else if(position < 13){
    targets.addAll((9..12))
    (-2..1).each {
      targets.add(position + 4 * it)
    }
  }else{
    targets.addAll((13..16))
    (-3..-1).each{
      targets.add(position + 4 * it)
    }
  }
  return targets
}
