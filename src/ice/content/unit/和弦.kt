package ice.content.unit

import arc.func.Func
import ice.ai.CarryTaskAI

import ice.world.content.unit.IceUnitType

class 和弦 :IceUnitType("chord") {
  init {
    localization {
      zh_CN {
        localizedName = "和弦"
        description = "轻型空中工程单位.配备大容量货舱与稳定悬挂系统,专精于物资运输任务.常三机编队协同作业"
      }
      en {
        localizedName = "Chord"
        description = "Light airborne engineering unit. Equipped with a high-capacity cargo bay and a stabilized suspension system, it specializes in logistics and material transport. Commonly operates in coordinated three-unit formations."
      }
      uk_UA {
        localizedName = "Акорд"
        description = "Легкий повітряний інженерний підрозділ. Оснащений містким вантажним відсіком і стабілізованою системою підвіски, спеціалізується на транспортуванні ресурсів. Зазвичай діє у складі скоординованої ланки з трьох машин."
      }
    }
    drag = 0.017f
    accel = 0.05f
    armor = 8f
    speed = 3.5f
    flying = true
    health = 60f
    hitSize = 12f
    isEnemy = false
    useUnitCap = false
    rotateSpeed = 3f
    lowAltitude = false
    itemCapacity = 40
    allowedInPayloads = false
    logicControllable = false
    playerControllable = false
    controller = Func { CarryTaskAI() }
  }
}
