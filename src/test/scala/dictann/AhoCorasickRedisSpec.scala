package dictann

import org.scalatest._
/**
  * Created by shawn on 3/29/17.
  */

class AhoCorasickRedisSpec extends FlatSpec{

  it should "be true" in {
    val aho = new AhoCorasickRedis()
    aho.prepare(List("Seahawks", "Broncos", "Super Bowl"))
    val matches = aho.search(
      "The Seahawks defeated the Broncos at the Super Bowl.")
    Console.println("matches=" + matches)
    assert(3 === matches.size)
    assert(matches.contains("Seahawks"))
    assert(matches.contains("Broncos"))
    assert(matches.contains("Super Bowl"))
  }
}
