package ice.content.remains

import ice.content.IUnitTypes
import ice.type.Remains
import mindustry.Vars
import mindustry.world.meta.Stats

class 纯净水晶坠饰 :Remains("remains_pure_crystal_pendant") {
  val units = IUnitTypes.getCoreUnits()

  init {
    localization {
      zh_CN {
        localizedName = "纯净水晶坠饰"
        description = "一块天然形成,毫无杂质的透明白水晶"
        effect = "玩家核心机[免疫所有状态]"
      }
      en {
        localizedName = "Pure Crystal Pendant"
        description = "A naturally formed, flawless transparent white crystal."
        effect = "The player's Core unit is [immune to all status effects]."
      }
      uk_UA {
        localizedName = "Кулон із чистого кришталю"
        description = "Природно сформований прозорий білий кришталь без жодних домішок."
        effect = "Ядро гравця [невразливе до всіх статусних ефектів]."
      }
    }

    install = {
      units.forEach {
        it.immunities.addAll(Vars.content.statusEffects())
        it.stats = Stats()
        it.checkStats()
      }

    }
    uninstall = {
      units.forEach {
        it.immunities.clear()
        it.stats = Stats()
        it.checkStats()
      }
    }
  }
}