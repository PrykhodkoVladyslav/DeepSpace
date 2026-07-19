package ice.content.unit.flying.rain

import arc.graphics.Color

import ice.world.content.unit.IceUnitType
import mindustry.entities.bullet.LightningBulletType
import mindustry.gen.Sounds

class 雨滴 :IceUnitType("unit_raindrop") {
  init {
    localization {
      zh_CN {
        localizedName = "雨滴"
        description = "轻型空中突击单位.发射速射电弧攻击敌人"
        details = "从小小的雨滴开始"
      }
      en {
        localizedName = "Raindrop"
        description = "Light aerial assault unit. Fires rapid electric arcs to attack enemies."
        details = "It all begins with a tiny raindrop."
      }
      uk_UA {
        localizedName = "Крапля"
        description = "Легкий повітряний штурмовий підрозділ. Випускає швидкострільні електричні дуги для атаки ворогів."
        details = "Усе починається з маленької краплі."
      }
    }
    circleTarget = true
    lowAltitude = true
    flying = true
    health = 55f
    hitSize = 7f
    speed = 3.1f
    accel = 0.08f
    drag = 0.04f
    engineOffset = 4.5f

    setWeapon {
      x = 2f
      y = 4f
      reload = 5f
      shootCone = 360f
      shootSound = Sounds.shootSpectre
      bullet = LightningBulletType().apply {
        damage = 13f
        lightningLength = 10
        lightningColor = Color.valueOf("FEEBB3")
      }
    }
  }
}