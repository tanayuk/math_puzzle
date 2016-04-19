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

int[][][] bingo = new int[4][5][5]

(0..3).each{ personNum ->
  def input = "${System.in.newReader().readLine()}".trim().split(",")
  def count = 0
  println("Person No: ${personNum}")
  (0..4).each{ verticalNum->
    (0..4).each{ horizontalNum->
      bingo[personNum][verticalNum][horizontalNum] = Integer.valueOf(input[count])
      count++
    }
  }
}

println(calcMinimumNum(bingo))

def calcMinimumNum(int[][][] bingo){
  (0..11).each { pattern->
    if(pattern < 5){

    }
  }
}

def getBingoNumbers(int[][] bingoBoard, int pattern){
  if(pattern < 5){
    return bingoBoard[pattern]
  }else if(pattern < 10){
    return bingoBoard[]
  }
}
