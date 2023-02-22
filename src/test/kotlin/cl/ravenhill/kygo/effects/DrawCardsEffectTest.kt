package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.cards.MagicCard
import cl.ravenhill.kygo.serializer.XmlCardSerializer
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class DrawCardsEffectTest : FunSpec({
  lateinit var drawCardsEffect: DrawCardsEffect

  beforeTest {
    drawCardsEffect = DrawCardsEffect(2)
  }

  test("DrawCardsEffect should draw the given amount of cards") {
    val player = Player(
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
    player.hand.size shouldBe 0
    drawCardsEffect.useOn(player)
    player.hand.size shouldBe 2
  }
})