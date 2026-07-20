package ice.content.block.effect

import ice.world.content.blocks.effect.OrientationProjector

class 定向超速器 :OrientationProjector("orientationProjector") {
  init {
    localization {
      zh_CN {
        localizedName = "定向超速器"
        description = "提升范围内选定链接的建筑的工作效率,链接数量有限"
      }
      en {
        localizedName = "Orientation Overdrive Projector"
        description = "Boosts the working efficiency of selected linked buildings within range. Link count is limited."
      }
      uk_UA {
        localizedName = "Орієнтований прискорювач"
        description = "Підвищує робочу ефективність обраних з'єднаних споруд у радіусі дії. Кількість з'єднань обмежена."
      }
    }
    size = 2
    buildSize = 5
    range = 8 * 20f
  }
}