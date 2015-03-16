import distance._

object Main {
	def main(args: Array[String]) {
		val jaccard = new Jaccard()
		val emd = new EarthMover()
		val set1 = Set(1,2,3)
		val set2 = Set(2,3,4,5)
		println("The Jaccard index is " + jaccard.index(set1, set2))
		println("The Jaccard distance is "+ jaccard.distance(set1, set2))
		println(emd.distance())
	}
}


