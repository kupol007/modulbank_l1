import java.util.*
val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)

fun main(args: Array<String>){
    val m=9 
    val n=9 
    print ("    |")
    
    for (i in 1..9) {
        print (" $i  |")
    }
    println()
    println("--------------------------------------------------")
    
    for (i in 1..9) {
    print(" $i  |")
	
        for (j in 1..9) {
	if(i*j<10){
	print(" ${i*j}  |")
        }   else {
	print(" ${i*j} |")
	}
	}
    println()
    println("--------------------------------------------------")
 }
}

/*
    | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 
--------------------------------------------------
 1  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  |
 
-----------------------------------------------
 9  | 9  | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 |
*/
