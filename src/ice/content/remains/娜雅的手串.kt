package ice.content.remains

import ice.content.IUnitTypes
import ice.type.Remains
import mindustry.type.UnitType
import mindustry.world.meta.Stats
import universecore.world.ability.InterceptAbilty

class 娜雅的手串 :Remains("remains_naya_bracelet") {
  init {
    localization {
      zh_CN {
        localizedName = "娜雅的手串"
        description = "一串温润的玉石手串,在帝国任职期间由娜雅赠予"
        effect = "核心机增加拦截护盾"
      }
      en {
        localizedName = "Naya's Bracelet"
        description = "A smooth jade bracelet gifted by Naya during your service in the Empire."
        effect = "Grants the Core unit an interceptor shield."
      }
      uk_UA {
        localizedName = "Браслет Наї"
        description = "Гладкий нефритовий браслет, подарований Наєю під час служби в Імперії."
        effect = "Надає ядру перехоплювальний щит."
      }
    }

    val units = IUnitTypes.getCoreUnits()
    var map = HashMap<UnitType, InterceptAbilty>()
    units.forEach {
      map[it] = InterceptAbilty(40f, it.hitSize + 5)
    }
    install = {
      units.forEach {
        it.abilities.addUnique(map[it])
        it.stats = Stats()
        it.checkStats()
      }
    }
    uninstall = {
      units.forEach {
        it.abilities.remove(map[it])
        it.stats = Stats()
        it.checkStats()
      }
    }
  }
}