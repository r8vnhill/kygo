package cl.ravenhill.kygo

import cl.ravenhill.kygo.cards.Card
import io.kotest.core.spec.style.funSpec
import io.kotest.matchers.shouldBe
import java.io.File

fun `a card can be serialized to a string`(card: Card, serializedString: String) =
  funSpec {
    test("a card can be serialized to a string") {
      card.serialize() shouldBe serializedString
    }
  }

fun `a card can be serialized to a file`(
  card: Card,
  filename: String,
  serializedString: String
) = funSpec {
  lateinit var file: File

  beforeTest {
    file = File(filename)
  }

  afterTest {
    file.delete()
  }

  test("a card can be serialized to a file") {
    card.toFile(filename)
    file.readText() shouldBe serializedString
  }
}