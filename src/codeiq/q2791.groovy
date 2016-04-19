package codeiq

/**
 * Created by tanayuk on 4/18/16.
 */

def input = "${System.in.newReader().readLine()}"
def n = Integer.valueOf(input)
def map = []

(1..n).each{
  map.add("${System.in.newReader().readLine()}".split(""))
}

(1..n).each { vertical ->
  (1..n).each { horisontal ->

  }
}


def simulateCharge(List boarPosition, List feedPosition, List map){

}
