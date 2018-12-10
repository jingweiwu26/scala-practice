def gradingStudents(grades: Array[Int]): Array[Int] = {
        /*
         * Write your code here.
         */
        val res = scala.collection.mutable.ArrayBuffer.empty[Int]

        def helper(grade:Int) : Int = {
            if (grade < 38) grade
            else if (grade % 5 == 3 || grade % 5 == 4) grade / 5 * 5 + 5
            else grade
        }

        for (grade <- grades) {res += helper(grade)}
        res.toArray
    }
