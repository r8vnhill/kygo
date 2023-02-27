package cl.ravenhill.kygo.cards
import cl.ravenhill.kygo.serializer.CardSerializer
/**
 * Class for Trap cards.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
class TrapCard(name: String, text: String) : AbstractCard(name, text) {
  override fun serializeWith(serializer: CardSerializer) =
    serializer.serializeTrapCard(this)
}