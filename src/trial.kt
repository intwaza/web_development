fun main() {
    var marks= 93
    var grade: String
    grade= if(marks>= 90)
        "A"
    else if(marks>=80)
        "B"
    else if(marks>=70)
        "c"
    else if(marks>=60)
        "d"
    else if(marks>=50)
        "e"
    else
        "f"
    println("your grade is: $grade")
}