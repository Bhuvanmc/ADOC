
var greeting="hello"
fun getGreeting1() = greeting
fun getGreeting2():String{
    return "hi"
}
fun printAlert(type:String, description:String)=println("$type $description")
fun main(args: Array<String>) {
    println("Welcome to Alerts")
    val type:String = "Query_Overload"
    var user:String = "User1"
    var cost=10000
    var avg_cost=15000

    var level = if(cost>avg_cost){ "critical" }else{ "intermediate"}
    var description:String="$user $cost $level"

    println("${getGreeting1()} ${getGreeting2()}")
    printAlert(type, description)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}