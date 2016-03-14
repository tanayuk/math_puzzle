package questions

import java.text.SimpleDateFormat

/**
 * Created by tanayuk on 3/10/16.
 */

def currentDate = new GregorianCalendar(1964,9,10)
def dateFormatter = new SimpleDateFormat("yyyyMMdd")
while(currentDate.before(new GregorianCalendar(2020,6,25))){
  //println(currentDate.getTime().toString())
  if(Integer.toBinaryString(dateFormatter.format(currentDate.getTime()).toInteger())
    == Integer.toBinaryString(dateFormatter.format(currentDate.getTime()).reverse().toInteger())){
    println dateFormatter.format(currentDate.getTime())
  }
  currentDate.add(Calendar.DATE, 1)
}

