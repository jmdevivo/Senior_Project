import distance._

object Main {
	def main(args: Array[String]) {
		val jaccard = new Jaccard()
		val emd = new EarthMover()
		val set1 = Set(1,2,3)
		val set2 = Set(2,3,4,5)
		println("The Jaccard index is " + jaccard.index(set1, set2))
		println("The Jaccard distance is "+ jaccard.distance(set1, set2))
		println("The Earth Movers Distance is " + emd.distance(Array(1.0, 1.0, 2.0), Array(0.0, 1.0,2.0)))
		println("The functional EarthMover Distance function returns " + emd.minEMD(List(1.0, 1.0, 2.0), List(0.0, 1.0,2.0)))

	}
}


