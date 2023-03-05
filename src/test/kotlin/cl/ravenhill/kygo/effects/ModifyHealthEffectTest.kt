package cl.ravenhill.kygo.effects

import cl.ravenhill.kygo.Player
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class ModifyHealthEffectTest : FunSpec({
  lateinit var modifyHealthEffect: ModifyHealthEffect

  beforeTest {
    modifyHealthEffect = ModifyHealthEffect(500)
  }

  test("ModifyHealthEffect should modify health by the given amount") {
    val player = Player("Jaiva", 8000, mutableListOf())
    player.health shouldBe 8000
    modifyHealthEffect.useOn(player)
    player.health shouldBe 8500
  }
})