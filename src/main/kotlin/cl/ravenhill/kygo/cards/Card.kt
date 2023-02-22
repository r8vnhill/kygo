package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.effects.Effect
import cl.ravenhill.kygo.serializer.CardSerializer


interface Card {
  val name: String
  val text: String
  val effect: Effect
  val serializer: CardSerializer
  fun toFile(filename: String)
  fun serialize(): String
  fun useOn(player: Player)
}