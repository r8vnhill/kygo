package cl.ravenhill.kygo.serializer
import cl.ravenhill.kygo.cards.Card
import java.io.File
/**
 * Abstract class for card serializers.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 */
abstract class AbstractCardSerializer : CardSerializer {
  override fun serialize(card: Card) = card.serializeWith(this)

  override fun toFile(card: Card, filename: String) {
    val file = File(filename)
    file.writeText(serialize(card))
  }
}