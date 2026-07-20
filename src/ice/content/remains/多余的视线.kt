package ice.content.remains

import ice.content.block.DefenseBlocks
import ice.core.IFiles.appendModName
import ice.graphics.IceColor
import ice.type.Remains
import mindustry.world.meta.Stats
import universecore.ui.effects.DynamicTextureDrawable

class 多余的视线 :Remains("remains_extra_gaze") {
  init {
    remainsColor = IceColor.r2
    localization {
      zh_CN {
        localizedName = "多余的视线"
        description = "同一片神经系统的两个节点,我们相认的媒介"
        effect = "相控雷达锁定上限+[10]"
      }
      en {
        localizedName = "Spare Sight"
        description = "Two nodes within the same nervous system—the medium through which we recognize one another."
        effect = "Phased radar lock-on limit +[10]."
      }
      uk_UA {
        localizedName = "Зайвий погляд"
        description = "Два вузли однієї нервової системи — засіб, завдяки якому ми впізнаємо одне одного."
        effect = "Максимальна кількість цілей фазованого радара +[10]."
      }
    }
    icon = DynamicTextureDrawable(name.appendModName()) {
      it.frameCount = 24
      it.frameDuration = 15f
    }
    install = {
      DefenseBlocks.相控雷达.maxTargetSize += 10
      DefenseBlocks.相控雷达.stats = Stats()
      DefenseBlocks.相控雷达.checkStats()
    }
    uninstall = {
      DefenseBlocks.相控雷达.maxTargetSize -= 10
      DefenseBlocks.相控雷达.stats = Stats()
      DefenseBlocks.相控雷达.checkStats()
    }
  }
}