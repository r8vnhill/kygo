package cl.ravenhill.kygo.cards

import cl.ravenhill.kygo.Player
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class SaucepanOfAvidityTest : FunSpec({
  val initHealth = 8000
  lateinit var player: Player
  lateinit var saucepanOfAvidity: SaucepanOfAvidity

  beforeTest {
    player = Player(
      "Jaiva",
      initHealth,
      mutableListOf(CrimsonBeverage(), IndigoPotion())
    )
    saucepanOfAvidity = SaucepanOfAvidity()
  }

  test("Saucepan of Avidity should draw 2 cards") {
    player.hand shouldBe emptyList()
    saucepanOfAvidity.useOn(player)
    player.hand.size shouldBe 2
    player.deck.size shouldBe 0
  }
})
