package com.cssweb.trade.counter

import akka.actor.{Props, ActorSystem}
import com.cssweb.trade.common.Message


object Main extends App{
	//def main(args : Array[String]):Unit=
	{
		val actorSystem = ActorSystem("HelloRemoteSystem");

		val actorHello = actorSystem.actorOf(Props[HelloActor], name = "RemoteActor");
		actorHello ! Message("server is running...")

	}
}


