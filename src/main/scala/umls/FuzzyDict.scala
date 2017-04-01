package umls
import dictann.AhoCorasickRedis
import scala.io.Source
class FuzzyDict(textFile:String) {
  def wordList = Source.fromFile(textFile)
    .getLines()
    .map(line => line.split("\t")(1)).toList

  def ahoDict(): AhoCorasickRedis = {
    val aho = new AhoCorasickRedis()
    aho.prepare(wordList)
    return aho
  }
}
