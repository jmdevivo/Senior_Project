
package distance {
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

}