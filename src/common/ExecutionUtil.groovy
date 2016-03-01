package common

/**
 * Created by tanayuk on 02/03/2016.
 */
class ExecutionUtil {
  def static benchmark = { closure ->
    def start = System.currentTimeMillis()
    closure.call()
    def now = System.currentTimeMillis()
    now - start
  }
}
