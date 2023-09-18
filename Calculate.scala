object Calculate {
  def calculateSquare(numbers: List[Int]): List[Int] = {
     numbers.map(number => number * number)
    }

    def main(args:Array[String]):Unit={
        val inputList = List(1, 2, 3, 4, 5)
        val squaredNumbers = calculateSquare(inputList)
        println(squaredNumbers) 
    }
}
