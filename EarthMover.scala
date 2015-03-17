package distance {

	class EarthMover {


		def distance(arr1: Array[Double], arr2: Array[Double]): Double = {
			var lastDistance = 0.0
			var totalDistance = 0.0
			var currentDistance = 0.0
			var i = 0
			while(i < arr1.length){
				currentDistance = (arr1(i) + lastDistance) - arr2(i)
				totalDistance += Math.abs(currentDistance)
				lastDistance = currentDistance
				i += 1
			}
			return currentDistance

		}

		def funcDistance(list1: List[Double], list2: List[Double]): Double = {
			def go(ls1: List[Double], ls2: List[Double], total: Double, last: Double): Double ={
				if(ls1 == Nil) total
				else {
					val lastD = ls1.head + last - ls2.head
					go(ls1.tail, ls2.tail, total + Math.abs(lastD), lastD )
				}
			}
			go(list1, list2, 0.0, 0.0)
		}

		def greatestVal(ls: List[Int]): Int ={
			ls.foldLeft(0) {(a, i) => if(a> i) a else i }			
		}

		def minEMD(ls1: List[Double], ls2: List[Double]):Double = {
			def getMinDistanceList(list1: List[Double], list2: List[Double], newList: List[Double]): List[Double] = {
				if(list1 == Nil) newList
				else {
					val lowestDistance = list1.foldLeft(0.0) {(a, i ) => if(Math.abs(a - list2.head) < Math.abs(i - list2.head)) a else i}
					getMinDistanceList(list1 diff List(lowestDistance), list2.tail, newList++List(lowestDistance))
				}
			}
			val orderedList = getMinDistanceList(ls1, ls2, Nil)
			println(orderedList)
			def loop(list: List[Double], list2: List[Double], total: Double): Double = {
				if(list ==Nil) total
				else loop(list.tail, list2.tail, Math.abs(list.head - list2.head) + total)
			}
			loop(orderedList,ls2, 0)

			
		}
	}
}