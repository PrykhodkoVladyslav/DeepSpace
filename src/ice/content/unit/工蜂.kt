package ice.content.unit

import ice.world.content.unit.IceUnitType
import mindustry.ai.UnitCommand
import mindustry.gen.BuildingTetherPayloadUnit
import universecore.util.toColor

class 工蜂 :IceUnitType("unit_workerBee", BuildingTetherPayloadUnit::class.java) {
  init {
    localization {
      zh_CN {
        localizedName = "工蜂"
        description = "轻型空中工程单位.配备精密的模块化建造系统,负责大型单位的建造与装配任务"
      }
      en {
        localizedName = "Worker Bee"
        description = "Light airborne engineering unit. Equipped with a precision modular construction system, it is responsible for the assembly and construction of large units."
      }
      uk_UA {
        localizedName = "Бджола-робітниця"
        description = "Легкий повітряний інженерний підрозділ. Оснащений високоточним модульним будівельним комплексом, призначеним для складання та спорудження великих бойових одиниць."
      }
    }
    defaultCommand = UnitCommand.assistCommand

    flying = true
    health = 360f
    armor = 1f
    hitSize = 6f
    speed = 1.5f
    drag = 0.05f
    envDisabled = 0
    engineSize = 2f
    engineOffset = 5.5f
    outlineColor = "313131".toColor()
    hidden = true
    isEnemy = false
    targetable = false
    lowAltitude = true
    useUnitCap = true
    createWreck = false
    createScorch = false
    logicControllable = false
    playerControllable = false
    allowedInPayloads = false
  }
}