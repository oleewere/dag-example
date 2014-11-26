package com.oleewere.dag

class Dag[T](val root : Node[T])

class Node[T](val parents: List[Node[T]], val children: List[Node[T]], val props: Map[String, Any])
