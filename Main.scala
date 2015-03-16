
object Main {
	def main(args: Array[String]) {
		val jaccard = new Jaccard()

		val set1 = Set(1,2,3)
		val set2 = Set(2,3,4,5)
		println("The Jaccard index is " + jaccard.index(set1, set2))
		println("The Jaccard distance is "+ jaccard.distance(set1, set2))
	}
}

class Jaccard {

	def index[A](a: Set[A], b: Set[A]): Double = {
		val union: Double = (a ++ b).size
		val intersect: Double = a.intersect(b).size
		return (intersect/union)
	}

	def distance[A](a: Set[A], b: Set[A]): Double = {
		return 1 - index(a, b) 
	}
}

class EarthMover {

	def distance(a: Int): Double = {

		if(a ==0){
			return 0
		}

	}

}