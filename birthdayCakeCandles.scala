def birthdayCakeCandles(ar: Array[Int]): Int = {
        val _max = ar.max
        ar.filter(_ == _max).size
    }
