package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.serializer.CardSerializer

/**
 * A monster card.
 *
 * @property attack The attack of the card.
 *
 * @param name The name of the card.
 * @param text The text of the card.
 * @param attack The attack of the card.
 * @param serializer The serializer to use for this card.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class MonsterCard(
  name: String,
  text: String,
  val attack: Int,
  serializer: CardSerializer
) : AbstractCard(name, text, serializer) {

  fun attack(player: Player) = player.takeDamage(this.attack)

  override fun serializeWith(serializer: CardSerializer) =
    serializer.serializeMonsterCard(this)
}