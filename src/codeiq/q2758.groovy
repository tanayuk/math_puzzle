package codeiq

/**
 * Created by tanayuk on 26/03/2016.
 */
def input = "${System.in.newReader().readLine()}".split(" ")
def n = Integer.valueOf(input[0])
def m = Integer.valueOf(input[1])

def field = new int[n+1][m+1]

