package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.`a card can be serialized to a file`
import cl.ravenhill.kygo.`a card can be serialized to a string`
import cl.ravenhill.kygo.effects.DrawCardsEffect
import cl.ravenhill.kygo.effects.ModifyHealthEffect
import cl.ravenhill.kygo.serializer.XmlCardSerializer
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class MagicCardTest : FunSpec({
  lateinit var player: Player

  beforeTest {
    player = Player(
      "Jaiva", 8000, mutableListOf(
        MagicCard(
          "Saucepan of Avidity",
          "Draw 2 cards",
          DrawCardsEffect(2),
          XmlCardSerializer()
        ),
        MagicCard(
          "Crimson Beverage",
          "Heal 500 HP",
          ModifyHealthEffect(500),
          XmlCardSerializer()
        )
      )
    )
  }

  test("Crimson Beverage should heal 500 HP") {
    val crimsonBeverage = MagicCard(
      "Crimson Beverage",
      "Heal 500 HP",
      ModifyHealthEffect(500),
      XmlCardSerializer()
    )
    player.health shouldBe 8000
    crimsonBeverage.useOn(player)
    player.health shouldBe 8500
  }

  test("Indigo Potion should heal 400 HP") {
    val indigoPotion = MagicCard(
      "Indigo Potion",
      "Heal 400 HP",
      ModifyHealthEffect(400),
      XmlCardSerializer()
    )
    player.health shouldBe 8000
    indigoPotion.useOn(player)
    player.health shouldBe 8400
  }

  test("Saucepan of Avidity should draw 2 cards") {
    val saucepanOfAvidity = MagicCard(
      "Saucepan of Avidity",
      "Draw 2 cards",
      DrawCardsEffect(2),
      XmlCardSerializer()
    )
    player.hand shouldBe emptyList()
    saucepanOfAvidity.useOn(player)
    player.hand.size shouldBe 2
    player.deck.size shouldBe 0
  }

  include(`a card can be serialized to a string`(
    MagicCard(
      "Saucepan of Avidity",
      "Draw 2 cards",
      DrawCardsEffect(2),
      XmlCardSerializer()
    ),
    """
      |<Card>
      | <name>Saucepan of Avidity</name>
      | <text>Draw 2 cards</text>
      |</Card>
      """.trimMargin()
  ))
  include(`a card can be serialized to a file`(
    MagicCard(
      "Saucepan of Avidity",
      "Draw 2 cards",
      DrawCardsEffect(2),
      XmlCardSerializer()
    ),
    "saucepan_of_avidity.xml",
    """
      |<Card>
      | <name>Saucepan of Avidity</name>
      | <text>Draw 2 cards</text>
      |</Card>
      """.trimMargin()
  ))
})