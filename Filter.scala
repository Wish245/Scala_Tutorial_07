object Filter {
  def filterPrime(numbers: List[Int]): List[Int] = {
    def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else if (n == 2) true
        else !((2 to Math.sqrt(n).toInt) exists (n % _ == 0))
    }

    numbers.filter(number => isPrime(number))
  }
  def main(args:Array[String]):Unit={
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(inputList)
    println(primeNumbers) 
  }
}
