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
	}
}