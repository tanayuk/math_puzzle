package questions
/**
 * Created by tanayuk on 07/03/2016.
 */
def ans = []
def map = []
// Defines false as tail, so true as head
(1..100).each { i -> map[i] = false }
def role = 2
while (true) {
  (1..100).each {
    if (it % role == 0) {
      map[it] = !map[it]
    }
  }
  if (role == 100) {
    break;
  }
  role++;
}
(1..100).each {
  if (!map[it]) {
    ans.add(it)
  }
}
println("Tailed cards are ${ans}")
