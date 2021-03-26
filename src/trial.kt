fun main() {
    var marks= 93
    var grade: String
    grade= if(marks>= 90)
        "A"
    else if(marks>=80)
        "B"
    else if(marks>=70)
        "C"
    else if(marks>=60)
        "D"
    else if(marks>=50)
        "E"
    else
        "F"
    println("your grade is: $grade")
}