package ice.content.unit

import ice.entities.bullet.base.BulletType
import ice.graphics.IceColor

import ice.world.content.unit.IceUnitType
import ice.world.meta.IceEffects
import mindustry.content.Fx
import mindustry.content.StatusEffects
import mindustry.content.UnitTypes
import mindustry.gen.Sounds

class 仆从 :IceUnitType("footman") {init {
  speed = 3.2f
  flying = true
  health = 2000f
  hitSize = 30f
  engineSize = 6f
  rotateSpeed = 5.2f
  engineOffset = 19f
  engineColor = IceColor.b4
  forceMultiTarget = true
  aiController = UnitTypes.flare.aiController
  setWeapon {
    x = -2f
    y = 8f
    bullet = BulletType(6.7f, 17f).apply {
      inaccuracy = 32f
      pierceBuilding = true
      ammoMultiplier = 3f
      hitSize = 7f
      lifetime = 18f
      pierce = true
      shootSound = Sounds.loopFire
      statusDuration = 60f * 10
      shootEffect = IceEffects.changeFlame(lifetime * speed)
      hitEffect = Fx.hitFlameSmall
      despawnEffect = Fx.none
      status = StatusEffects.burning
      keepVelocity = false
      hittable = false
    }
  }
  localization {
    zh_CN {
      localizedName = "仆从"
      description = "中型空中突击单位.喷射大范围高温等离子体攻击敌人.多用于打击密集小型敌人"
      details = "传教者的专属防空护卫\n确定是护卫不是火刑柱?"
    }
    en {
      localizedName = "Servitor"
      description = "Medium aerial assault unit. Emits a wide-area stream of high-temperature plasma to attack enemies. Primarily used for eliminating dense groups of small targets."
      details = "The Preacher's dedicated anti-air escort.\nAre you sure this is an escort and not a pyre?"
    }
    uk_UA {
      localizedName = "Служник"
      description = "Середній повітряний штурмовий підрозділ. Випускає широкосмуговий потік високотемпературної плазми для атаки ворогів. Переважно використовується для знищення щільних груп малих цілей."
      details = "Спеціальний зенітний супровідник Проповідника.\nВи впевнені, що це супровідник, а не вогнище?"
    }
  }
}
}