def gradingStudents(grades: Array[Int]): Array[Int] = {
    val helper = (x: Int) => if ((x % 5 == 3 || x % 5 == 4) && (x > 37)) x / 5 * 5 + 5 else x
    grades.map(helper)
    }
