package codeiq

/**
 *
 * Bingo pattern
 *   5 6 7 8 9
 * 0
 * 1
 * 2
 * 3 11
 * 4         10
 *
 * Created by tanayuk on 4/19/16.
 */

// Scanner
Scanner cin=new Scanner(System.in)

// Reading from stdin
int[][][] bingo = new int[4][5][5]
(0..3).each { personNum ->
  def input = cin.nextLine().split(",")
  def count = 0
  (0..4).each { verticalNum ->
    (0..4).each { horizontalNum ->
      bingo[personNum][verticalNum][horizontalNum] = Integer.valueOf(input[count])
      count++
    }
  }
}
// Answering
println(calcMinimumNum(bingo))

def calcMinimumNum(int[][][] bingo) {
  def min = 75
  (0..11).each { pattern1 ->
    (0..11).each { pattern2 ->
      (0..11).each { pattern3 ->
        (0..11).each { pattern4 ->
          def aAndB = getTargetNumbers(getBingoNumbers(bingo[0],pattern1),getBingoNumbers(bingo[1], pattern2))
          def cAndD = getTargetNumbers(getBingoNumbers(bingo[2], pattern3), getBingoNumbers(bingo[3], pattern4))
          def targetNumbers = getTargetNumbers(aAndB,cAndD)

          if(targetNumbers.size() <= min){
            //println("Minimum is updated with ${targetNumbers.size()} with numbers: ${targetNumbers.sort()}")
            min = targetNumbers.size()
          }
        }
      }
    }
  }
  return min
}

/**
 * Get bingo numbers based on pattern defined in Javadoc
 *
 * @param bingoBoard
 * @param pattern
 * @return bingo array
 */
def getBingoNumbers(int[][] bingoBoard, int pattern) {
  if (pattern < 5) {
    // horizontal bingo
    return Arrays.asList(bingoBoard[pattern])
  } else if (pattern < 10) {
    // vertical bingo
    return bingoBoard.collect { it[pattern - 5] }
  } else if (pattern == 10) {
    // left top to right bottom
    return Arrays.asList(bingoBoard[0][0], bingoBoard[1][1], bingoBoard[2][2], bingoBoard[3][3], bingoBoard[4][4])
  } else if (pattern == 11) {
    // right top to left bottom
    return Arrays.asList(bingoBoard[0][4], bingoBoard[1][3], bingoBoard[2][2], bingoBoard[3][1], bingoBoard[4][0])
  } else {
    return
  }
}

/**
 * Return intersection and differences of list
 * @param x
 * @param y
 * @return list of numbers
 */
def getTargetNumbers(List x, List y) {
  def commons = x.intersect(y)
  def difference = x.plus(y)
  difference.removeAll(commons)
  return commons.plus(difference)
}
