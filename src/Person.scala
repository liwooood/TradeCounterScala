/*
scalac hello.scala
scala hello
*/

class Person(val firstName:String, val lastName:String)
{
	private var position : String = _
	
	override def toString() : String = 
	{
		firstName + " " + lastName
	}
}

