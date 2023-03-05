package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player
import cl.ravenhill.kygo.cards.MonsterCard
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
        MonsterCard(
          "Light Magician",
          "The ultimate sorcerer with a powerful attack",
          2500
        ),
        MonsterCard(
          "White-eyes Blue Dragon",
          "Legendary dragon of destruction",
          3000
        ),
      )
    )
    player.hand.size shouldBe 0
    drawCardsEffect.useOn(player)
    player.hand.size shouldBe 2
  }
})