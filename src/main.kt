fun main() {
var mercedes=Car("Benz","8 Sedan","Polar White",5)
    mercedes.carry(5)
    mercedes.carry(15)
    mercedes.identity("grey","benz","sedan")
    println(mercedes.calculateparkingfees(3))
    var bus=Bus("Minibus","2x","black",10)
    println(bus.maxtripfare(70.0))
    println(bus.calculateparkingfees(10))






}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
fun carry(people:Int){
   var x=people-capacity
    if(capacity>=people) {
println("carrying $people passangers")
    }
    else {
println("over capacity by $x people")
    }
   }
    fun identity(color: String,make: String,model: String){
    println("I am a $color,$make,$model")
    }
open fun calculateparkingfees(hours:Int):Int {
var multiply=hours*20
     return multiply
 }
}
class Bus( make:String, model: String, color: String, capacity: Int):Car(make,model,color,capacity){
    fun maxtripfare(fare:Double):Double{
        var maximumfare=fare*10
       return maximumfare

    }

    override fun calculateparkingfees(hours: Int): Int {
        //return super.calculateparkingfees(hours)
        var product=hours*10
        return product
    }

    }

