package ice.content.block.effect

import ice.world.content.blocks.effect.LostBox
import mindustry.type.Category
import mindustry.world.meta.Env

class 遗弃匣 :LostBox("lostBox") {
  init {
    localization {
      zh_CN {
        localizedName = "遗弃匣"
      }
      en {
        localizedName = "Lost Box"
      }
      uk_UA {
        localizedName = "Загублена скринька"
      }
    }
    size = 2
    envEnabled = Env.any
    category = Category.effect

  }
}