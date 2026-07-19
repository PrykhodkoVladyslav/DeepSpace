package ice.content.unit

import arc.graphics.g2d.Draw
import ice.entities.bullet.RandomDamageBulletType
import ice.graphics.IceColor
import ice.world.content.unit.IceUnitType
import ice.world.meta.IceEffects
import mindustry.entities.part.DrawPart
import mindustry.gen.Sounds
import mindustry.gen.Unit
import mindustry.graphics.Layer
import mindustry.graphics.MultiPacker
import mindustry.graphics.MultiPacker.PageType

class 加百列 :IceUnitType("gabriel") {
  init {
    localization {
      zh_CN {
        localizedName = "加百列"
        description = "轻型空中工程单位.建造与开采效率较低,武装程度有限"
        details =
          "在教廷尚处襁褓的年代,信徒们在星系间流亡.没有家园,没有工业,没有武装.\n初代加百列诞生于这段最黑暗的岁月.\n它最初只是一具简陋的原型机,由废船上拆下的零件拼凑而成.\n这具粗劣的躯壳,被信徒们赋予了一个名字\"加百列\",传达神旨意的天使.\n教廷的所有胜利,皆由此开始.\n如今,从废船零件到合金躯壳,型号迭代了无数次,加百列却从未离开过前线."
      }
      en {
        localizedName = "Gabriel"
        description = "Light airborne engineering unit. Has relatively low construction and mining efficiency, with limited armament."
        details =
          "In the infancy of the Theocracy, the faithful wandered from star system to star system. They had no home, no industry, and no army.\nThe first Gabriel was born during those darkest days.\nAt first, it was nothing more than a crude prototype assembled from salvaged parts stripped from derelict ships.\nThis rough shell was given the name \"Gabriel\" by the faithful—the angel who delivers God's will.\nEvery victory of the Theocracy began here.\nToday, although its design has evolved countless times from salvaged scrap to alloy hulls, Gabriel has never left the front lines."
      }
      uk_UA {
        localizedName = "Гавриїл"
        description = "Легкий повітряний інженерний підрозділ. Має порівняно низьку ефективність будівництва й видобутку та обмежене озброєння."
        details =
          "У часи, коли Теократія лише зароджувалася, віряни поневірялися між зоряними системами. Вони не мали ані дому, ані промисловості, ані війська.\nПерший «Гавриїл» народився в ті найтемніші часи.\nСпочатку це був лише примітивний прототип, зібраний із деталей, знятих із покинутих кораблів.\nЦій грубій оболонці віряни дали ім'я «Гавриїл» — ангел, що несе Божу волю.\nСаме звідси почалися всі перемоги Теократії.\nСьогодні, попри незліченні покоління модернізацій — від уламків покинутих кораблів до сучасних легованих корпусів — «Гавриїл» ніколи не залишав передову."
      }
    }
    armor = 1f
    speed = 3.5f
    flying = true
    health = 150f
    hitSize = 13f
    mineTier = 2
    mineSpeed = 4f
    engineSize = 2.5f
    engineLayer = Layer.flyingUnitLow - 1f
    rotateSpeed = 7f
    itemCapacity = 30
    engineOffset = 6f
    circleTarget = true
    engineColor = IceColor.b4
    buildSpeed = 2f
    buildRange = 8 * 40f
    drag = 0.05f
    accel = 0.11f
    outlines = false
    setWeapon("weapon") {
      y += 0.8f
      x = 4.3f
      reload = 10f
      layerOffset = -0.2f
      rotateSpeed = 9f
      shootSound = Sounds.shootAlpha
      bullet = RandomDamageBulletType(8, 14, 3f).apply {
        backColor = IceColor.b4
        frontColor = IceColor.b4
        lightColor = IceColor.b4
        trailColor = IceColor.b4
        trailWidth = 1.2f
        trailLength = 4
        shootY += 1
        lifetime = 60f
        despawnEffect = IceEffects.基础子弹击中特效()
        hitEffect = despawnEffect
        homingPower = 0.05f
        homingRange = 50f
        shootEffect = IceEffects.squareAngle(color1 = IceColor.b4, color2 = IceColor.b5)
      }
    }
  }

  override fun drawOutline(unit: Unit) {
    Draw.z(Draw.z() - 1f)
    Draw.color(outlineColor)
    Draw.rect("$name-outline", unit.x, unit.y, unit.rotation - 90)
  }

  override fun createIcons(packer: MultiPacker) {
    super.createIcons(packer)
    for(weapon in weapons) {
      if (!weapon.name.isEmpty() && (minfo.mod == null || weapon.name.startsWith(minfo.mod.name)) && (weapon.top || !packer.isOutlined(
          weapon.name
        ) || weapon.parts.contains { p: DrawPart? -> p!!.under })
      ) {
        makeOutline(
          PageType.main,
          packer,
          weapon.region,
          !weapon.top || weapon.parts.contains { p: DrawPart? -> p!!.under },
          outlineColor,
          outlineRadius
        )
      }
    }
  }
}