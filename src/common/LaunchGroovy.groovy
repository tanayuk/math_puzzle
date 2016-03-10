#!/usr/bin/env groovy
package common

/**
 * Created by 01011996 on 3/8/16.
 */
def scriptName = args[0]
def result = []
10.times {
  def start = System.currentTimeMillis()
  evaluate(new File(scriptName))
  def duration = System.currentTimeMillis() - start
  println("Execution duration: ${duration}ms.")
  result.add(duration)
}

println("Average: ${result.sum()/result.size()}ms\t\tMax: ${result.max()}ms\t\tMin: ${result.min()}ms")
