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
 * Created by 01011996 on 3/22/16.
 */
def emptyBoard = "00000000000000000000"
def nodeList = []
def ansMap
recursiveFlip(emptyBoard)

def recursiveFlip(board){
  (1..16).each{ position ->
    def playedBoard = playReverse(position, board)
    recursiveFlip(position)
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

def playReverse(position, board){

}
