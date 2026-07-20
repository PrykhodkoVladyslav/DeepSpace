package ice.content.block

import arc.Core
import arc.graphics.Color
import arc.graphics.g2d.Draw
import arc.graphics.g2d.Fill
import arc.math.geom.Geometry
import ice.content.IItems
import ice.content.ILiquids
import ice.content.IStatus
import ice.game.EventType.addContentInitEvent
import ice.graphics.IceColor
import ice.shader.IceShader
import ice.type.Dup
import ice.world.content.blocks.environment.*
import ice.world.meta.IAttribute
import mindustry.Vars
import mindustry.content.Fx
import mindustry.entities.Effect
import mindustry.entities.Units
import mindustry.gen.Sounds
import mindustry.graphics.Drawf
import mindustry.graphics.Layer
import mindustry.world.Block
import mindustry.world.Tile
import mindustry.world.meta.Attribute
import universecore.ui.bundle.localization

@Suppress("unused")
object EnvironmentBlocks {
  fun load() = Unit
  val 多叶草 = Prop("leafyGrass").apply {
    localization {
      zh_CN {
        localizedName = "多叶草"
      }
      en {
        localizedName = "Leafy Grass"
      }
      uk_UA {
        localizedName = "Багатолиста трава"
      }
    }
  }
  val 地笼草 = Prop("cageGrass").apply {
    localization {
      zh_CN {
        localizedName = "地笼草"
      }
      en {
        localizedName = "Cage Grass"
      }
      uk_UA {
        localizedName = "Кліткова трава"
      }
    }
  }
  val 枯棕枝 = Prop("deadwoodGrass").apply {
    localization {
      zh_CN {
        localizedName = "枯棕枝"
      }
      en {
        localizedName = "Deadwood Grass"
      }
      uk_UA {
        localizedName = "Суха деревна трава"
      }
    }
  }
  val 绿羽 = Prop("featherGrass").apply {
    localization {
      zh_CN {
        localizedName = "绿羽"
      }
      en {
        localizedName = "Feather Grass"
      }
      uk_UA {
        localizedName = "Пір'яна трава"
      }
    }
  }
  val 草嫣红 = Prop("springGrassRed").apply {
    localization {
      zh_CN {
        localizedName = "草嫣红"
      }
      en {
        localizedName = "Spring Grass Red"
      }
      uk_UA {
        localizedName = "Весняна червона трава"
      }
    }
  }
  val 绯叶绮 = Prop("scarletLeaf").apply {
    localization {
      zh_CN {
        localizedName = "绯叶绮"
      }
      en {
        localizedName = "Scarlet Leaf"
      }
      uk_UA {
        localizedName = "Багряне листя"
      }
    }
  }
  val 叶嫣粉 = Prop("leafBlush").apply {
    localization {
      zh_CN {
        localizedName = "叶嫣粉"
      }
      en {
        localizedName = "Leaf Blush"
      }
      uk_UA {
        localizedName = "Листяний рум'янець"
      }
    }
  }
  val 血孢子丛 = Prop("bloodNeoplasmSporophore", Sounds.plantBreak).apply {
    localization {
      zh_CN {
        localizedName = "血孢子丛"
      }
      en {
        localizedName = "Blood Neoplasm Sporophore"
      }
      uk_UA {
        localizedName = "Спороносій кров'яної пухлини"
      }
    }
  }
  val 血晶尖刺 = TallBlock("bloodCrystalSpikes").apply {
    localization {
      zh_CN {
        localizedName = "血晶尖刺"
      }
      en {
        localizedName = "Blood Crystal Spikes"
      }
      uk_UA {
        localizedName = "Шипи кровавого кристала"
      }
    }
  }
  val 殷红树 = TreeBlock("bloodSporophoreTree").apply {
    attributes[IAttribute.血囊孢子] = 1f
    var range = 40f
    setUpdate { tile ->
      val mouseWorld = Core.input.mouseWorld()
      val tileWorld = Vars.world.tileWorld(mouseWorld.x, mouseWorld.y)
      if (tile == tileWorld) {
        Drawf.circles(tile.drawx(), tile.drawy(), range, IceColor.b4)
      }
      Units.nearby(Vars.player.team(), tile.worldx(), tile.worldy(), range) {
        it.apply(IStatus.寄生, 3 * 60f)
      }
    }
    localization {
      zh_CN {
        localizedName = "殷红树"
      }
      en {
        localizedName = "Crimson Sporophore Tree"
      }
      uk_UA {
        localizedName = "Багряне спороносійне дерево"
      }
    }
  }
  val 利芽 = TallBlock("edgeBud").apply {
    shadowOffset = -1f
    localization {
      zh_CN {
        localizedName = "利芽"
      }
      en {
        localizedName = "Edge Bud"
      }
      uk_UA {
        localizedName = "Крайній бутон"
      }
    }
  }
  val 红冰石 = Prop("redIceStone").apply {
    localization {
      zh_CN {
        localizedName = "红冰石"
      }
      en {
        localizedName = "Red Ice Stone"
      }
      uk_UA {
        localizedName = "Червоний лід"
      }
    }
  }
  val 灵液 = Floor("ichor").apply {
    liquidDrop = ILiquids.灵液
    cacheLayer = IceShader.ichor
    drownTime = 200f
    speedMultiplier = 0.4f
    isLiquid = true
    localization {
      zh_CN {
        localizedName = "灵液"
      }
      en {
        localizedName = "Ichor"
      }
      uk_UA {
        localizedName = "Іхор"
      }
    }
  }
  val 软红冰 = Floor("softRedIce").apply {
    cacheLayer = IceShader.softRedIceCache
    speedMultiplier = 0.5f
    localization {
      zh_CN {
        localizedName = "软红冰"
      }
      en {
        localizedName = "Soft Red Ice"
      }
      uk_UA {
        localizedName = "М'який червоний лід"
      }
    }
  }
  val 绿羽地 = Floor("sod").apply {
    localization {
      zh_CN {
        localizedName = "绿羽地"
      }
      en {
        localizedName = "Sod"
      }
      uk_UA {
        localizedName = "Дернина"
      }
    }
  }
  val 绿羽墙 = StaticWall("sodWall").apply {
    localization {
      zh_CN {
        localizedName = "绿羽墙"
      }
      en {
        localizedName = "Sod Wall"
      }
      uk_UA {
        localizedName = "Стіна з дернини"
      }
    }
  }
  val 金珀沙 = Floor("goldPearlGrit").apply {
    localization {
      zh_CN {
        localizedName = "金珀沙"
      }
      en {
        localizedName = "Gold Pearl Grit"
      }
      uk_UA {
        localizedName = "Золотий перлинний пісок"
      }
    }
    itemDrop = IItems.金珀沙
  }
  val 金珀沙水 = ShallowLiquid("goldPearlGritWater", 金珀沙).apply {
    localization {
      zh_CN {
        localizedName = "金珀沙水"
      }
      en {
        localizedName = "Gold Pearl Grit Water"
      }
      uk_UA {
        localizedName = "Вода золотого перлинного піску"
      }
    }
    itemDrop = IItems.金珀沙
  }
  val 金珀沙墙 = StaticWall("goldPearlGritWall").apply {
    localization {
      zh_CN {
        localizedName = "金珀沙墙"
      }
      en {
        localizedName = "Gold Pearl Grit Wall"
      }
      uk_UA {
        localizedName = "Стіна із золотого перлинного піску"
      }
    }
  }
  val 皎月银沙石块 = Prop("silverSandStone").apply {
    localization {
      zh_CN {
        localizedName = "皎月银沙石块"
      }
      en {
        localizedName = "Silver Sand Stone"
      }
      uk_UA {
        localizedName = "Срібний місячний пісковик"
      }
    }
  }
  val 皎月银沙 = Floor("silverSand").apply {
    localization {
      zh_CN {
        localizedName = "皎月银沙"
      }
      en {
        localizedName = "Silver Sand"
      }
      uk_UA {
        localizedName = "Срібний пісок"
      }
    }
  }
  val 皎月银沙水 = ShallowLiquid("silverSandWater", 皎月银沙).apply {
    localization {
      zh_CN {
        localizedName = "皎月银沙水"
      }
      en {
        localizedName = "Silver Sand Water"
      }
      uk_UA {
        localizedName = "Вода срібного місячного піску"
      }
    }
  }
  val 皎月银沙墙 = StaticWall("silverSandWall").apply {
    localization {
      zh_CN {
        localizedName = "皎月银沙墙"
      }
      en {
        localizedName = "Silver Sand Wall"
      }
      uk_UA {
        localizedName = "Стіна зі срібного місячного піску"
      }
    }
  }
  val 风蚀沙柱 = TallBlock("windErodedSandPillar").apply {
    localization {
      zh_CN {
        localizedName = "风蚀沙柱"
      }
      en {
        localizedName = "Wind Eroded Sand Pillar"
      }
      uk_UA {
        localizedName = "Вітровий піщаний стовп"
      }
    }
  }
  val 风蚀砂地 = Floor("windErodedGrit").apply {
    localization {
      zh_CN {
        localizedName = "风蚀砂地"
      }
      en {
        localizedName = "Wind Eroded Grit"
      }
      uk_UA {
        localizedName = "Вітровий піщаний ґрунт"
      }
    }
  }
  val 风蚀沙地 = Floor("windErodedSand").apply {
    decoration = 风蚀沙柱
    localization {
      zh_CN {
        localizedName = "风蚀沙地"
      }
      en {
        localizedName = "Wind Eroded Sand"
      }
      uk_UA {
        localizedName = "Вітровий пісок"
      }
    }
  }
  val 风蚀沙水 = ShallowLiquid("windErodedSandWater", 风蚀沙地).apply {
    localization {
      zh_CN {
        localizedName = "风蚀沙水"
      }
      en {
        localizedName = "Wind Eroded Sand Water"
      }
      uk_UA {
        localizedName = "Вода вітрового піску"
      }
    }
  }
  val 风蚀沙深水 = ShallowDeepLiquid("windErodedSandDeepWater", 风蚀沙地).apply {
    localization {
      zh_CN {
        localizedName = "风蚀沙深水"
      }
      en {
        localizedName = "Wind Eroded Sand Deep Water"
      }
      uk_UA {
        localizedName = "Глибока вода вітрового піску"
      }
    }
  }
  val 风蚀沙墙 = StaticWall("windErodedSandWall").apply {
    localization {
      zh_CN {
        localizedName = "风蚀沙墙"
      }
      en {
        localizedName = "Wind Eroded Sand Wall"
      }
      uk_UA {
        localizedName = "Стіна з вітрового піску"
      }
    }
  }
  val 风蚀喷口 = SteamVent("windErodedSand-vent").apply {
    parent = 风蚀沙地.also { blendGroup = it }
    attributes.set(Attribute.steam, 1f)
    localization {
      zh_CN {
        localizedName = "风蚀喷口"
      }
      en {
        localizedName = "Wind Eroded Vent"
      }
      uk_UA {
        localizedName = "Вітровий вентиль"
      }
    }
  }
  val 光辉板岩 = Floor("brillianceSlate").apply {
    localization {
      zh_CN {
        localizedName = "光辉板岩"
      }
      en {
        localizedName = "Brilliance Slate"
      }
      uk_UA {
        localizedName = "Світлий сланець"
      }
    }
  }
  val 光辉板岩水 = ShallowLiquid("brillianceSlateWater", 光辉板岩).apply {
    localization {
      zh_CN {
        localizedName = "光辉板岩水"
      }
      en {
        localizedName = "Brilliance Slate Water"
      }
      uk_UA {
        localizedName = "Вода світлого сланцю"
      }
    }
  }
  val 光辉板岩墙 = StaticWall("brillianceSlateWall").apply {
    localization {
      zh_CN {
        localizedName = "光辉板岩墙"
      }
      en {
        localizedName = "Brilliance Slate Wall"
      }
      uk_UA {
        localizedName = "Стіна зі світлого сланцю"
      }
    }
  }
  val 云英石柱 = Prop("greisenPillar").apply {
    localization {
      zh_CN {
        localizedName = "云英石柱"
      }
      en {
        localizedName = "Greisen Pillar"
      }
      uk_UA {
        localizedName = "Грейзеновий стовп"
      }
    }
  }
  val 云英岩 = Floor("greisen").apply {
    localization {
      zh_CN {
        localizedName = "云英岩"
      }
      en {
        localizedName = "Greisen"
      }
      uk_UA {
        localizedName = "Грейзен"
      }
    }
  }
  val 云英岩水 = ShallowLiquid("greisenWater", 云英岩).apply {
    localization {
      zh_CN {
        localizedName = "云英岩水"
      }
      en {
        localizedName = "Greisen Water"
      }
      uk_UA {
        localizedName = "Вода грейзену"
      }
    }
  }
  val 云英岩深水 = ShallowDeepLiquid("greisenDeepWater", 云英岩).apply {
    localization {
      zh_CN {
        localizedName = "云英岩深水"
      }
      en {
        localizedName = "Greisen Deep Water"
      }
      uk_UA {
        localizedName = "Глибока вода грейзену"
      }
    }
  }
  val 云英岩墙 = StaticWall("greisenWall").apply {
    localization {
      zh_CN {
        localizedName = "云英岩墙"
      }
      en {
        localizedName = "Greisen Wall"
      }
      uk_UA {
        localizedName = "Стіна з грейзену"
      }
    }
  }
  val 红土石块 = Prop("redDirStone").apply {
    localization {
      zh_CN {
        localizedName = "红土石块"
      }
      en {
        localizedName = "Red Dirt Stone"
      }
      uk_UA {
        localizedName = "Камінь червоного ґрунту"
      }
    }
  }
  val 红土 = Floor("redDir").apply {
    localization {
      zh_CN {
        localizedName = "红土"
      }
      en {
        localizedName = "Red Dirt"
      }
      uk_UA {
        localizedName = "Червоний ґрунт"
      }
    }
  }
  val 红土墙 = StaticWall("redDirWall").apply {
    localization {
      zh_CN {
        localizedName = "红土墙"
      }
      en {
        localizedName = "Red Dirt Wall"
      }
      uk_UA {
        localizedName = "Стіна з червоного ґрунту"
      }
    }
  }
  val 流纹岩 = Floor("liparite").apply {
    localization {
      zh_CN {
        localizedName = "流纹岩"
      }
      en {
        localizedName = "Liparite"
      }
      uk_UA {
        localizedName = "Ліпарит"
      }
    }
  }
  val 流纹岩水 = ShallowLiquid("lipariteWater", 流纹岩).apply {
    localization {
      zh_CN {
        localizedName = "流纹岩水"
      }
      en {
        localizedName = "Liparite Water"
      }
      uk_UA {
        localizedName = "Вода ліпариту"
      }
    }
  }
  val 流纹岩墙 = StaticWall("lipariteWall").apply {
    localization {
      zh_CN {
        localizedName = "流纹岩墙"
      }
      en {
        localizedName = "Liparite Wall"
      }
      uk_UA {
        localizedName = "Стіна з ліпариту"
      }
    }
  }
  val 潮汐石 = Floor("nightTideStone").apply {
    localization {
      zh_CN {
        localizedName = "潮汐石"
      }
      en {
        localizedName = "Night Tide Stone"
      }
      uk_UA {
        localizedName = "Камінь нічного приливу"
      }
    }
  }
  val 潮汐水石 = ShallowLiquid("nightTideStoneWater", 潮汐石).apply {
    localization {
      zh_CN {
        localizedName = "潮汐水石"
      }
      en {
        localizedName = "Night Tide Stone Water"
      }
      uk_UA {
        localizedName = "Вода каменю нічного приливу"
      }
    }
  }
  val 潮汐石墙 = StaticWall("nightTideStoneWall").apply {
    localization {
      zh_CN {
        localizedName = "潮汐石墙"
      }
      en {
        localizedName = "Night Tide Stone Wall"
      }
      uk_UA {
        localizedName = "Стіна з каменю нічного приливу"
      }
    }
  }
  val 潮汐喷口 = SteamVent("nightTideStone-vent").apply {
    parent = 潮汐石.also { blendGroup = it }
    attributes.set(Attribute.steam, 1f)
    localization {
      zh_CN {
        localizedName = "潮汐喷口"
      }
      en {
        localizedName = "Night Tide Vent"
      }
      uk_UA {
        localizedName = "Вентиль нічного приливу"
      }
    }
  }
  val 侵蚀层地 = Floor("erosionalSlate").apply {
    localization {
      zh_CN {
        localizedName = "侵蚀层地"
      }
      en {
        localizedName = "Erosional Slate"
      }
      uk_UA {
        localizedName = "Ерозійний сланець"
      }
    }
  }
  val 侵蚀层地水 = ShallowLiquid("erosionalSlateWater", 侵蚀层地).apply {
    localization {
      zh_CN {
        localizedName = "侵蚀层地水"
      }
      en {
        localizedName = "Erosional Slate Water"
      }
      uk_UA {
        localizedName = "Вода ерозійного сланцю"
      }
    }
  }
  val 侵蚀层地墙 = StaticWall("erosionalSlateWall").apply {
    localization {
      zh_CN {
        localizedName = "侵蚀层地墙"
      }
      en {
        localizedName = "Erosional Slate Wall"
      }
      uk_UA {
        localizedName = "Стіна з ерозійного сланцю"
      }
    }

  }

  val 火成岩 = Floor("igneousRocks").apply {
    localization {
      zh_CN {
        localizedName = "火成岩"
      }
      en {
        localizedName = "Igneous Rocks"
      }
      uk_UA {
        localizedName = "Вулканічні породи"
      }
    }
  }
  val 炎晶矿脉 = Floor("incandescent-crystal-vein").apply {
    localization {
      zh_CN {
        localizedName = "炎晶矿脉"
      }
      en {
        localizedName = "Incandescent Crystal Vein"
      }
      uk_UA {
        localizedName = "Порука інкандесцентного кристалу"
      }
    }
    blendGroup = 火成岩
    attributes.set(Attribute.heat, 0.35f)
  }
  val 炎晶脉搏 = Floor("incandescent-crystal-vein-heat").apply {
    localization {
      zh_CN {
        localizedName = "炎晶脉搏"
      }
      en {
        localizedName = "Incandescent Crystal Pulse"
      }
      uk_UA {
        localizedName = "Пульса інкандесцентного кристалу"
      }
    }
    blendGroup = 火成岩
    attributes.set(Attribute.heat, 0.85f)
  }
  val 燃素晶簇 = TallBlock("phlogistonCrystalCluster").apply {
    localization {
      zh_CN {
        localizedName = "燃素晶簇"
      }
      en {
        localizedName = "Phlogiston Crystal Cluster"
      }
      uk_UA {
        localizedName = "Кластер флогістону"
      }
    }
  }
  val 晶石地 = Floor("crystalStone").apply {
    localization {
      zh_CN {
        localizedName = "晶石地"
      }
      en {
        localizedName = "Crystal Stone"
      }
      uk_UA {
        localizedName = "Кристалічний камінь"
      }
    }
    attributes.set(IAttribute.沥青, 0.1f)
  }
  val 晶石地水 = ShallowLiquid("crystalStoneWater", 晶石地).apply {
    localization {
      zh_CN {
        localizedName = "晶石地水"
      }
      en {
        localizedName = "Crystal Stone Water"
      }
      uk_UA {
        localizedName = "Вода кристалічного каменю"
      }
    }
  }
  val 晶石墙 = StaticWall("crystalStoneWall").apply {
    localization {
      zh_CN {
        localizedName = "晶石墙"
      }
      en {
        localizedName = "Crystal Stone Wall"
      }
      uk_UA {
        localizedName = "Стіна з кристалічного каменю"
      }
    }
  }
  val 幽灵簇 = Seaweed("clusterGhosts").apply {
    localization {
      zh_CN {
        localizedName = "幽灵簇"
      }
      en {
        localizedName = "Cluster Ghosts"
      }
      uk_UA {
        localizedName = "Скупчення привидів"
      }
    }
  }
  val 幽冥蕨 = TallBlock("ghostGrassFern").apply {
    localization {
      zh_CN {
        localizedName = "幽冥蕨"
      }
      en {
        localizedName = "Ghost Grass Fern"
      }
      uk_UA {
        localizedName = "Примарна папороть"
      }
    }
  }
  val 缠怨花 = TreeBlock("ghostGrassFlower").apply {
    localization {
      zh_CN {
        localizedName = "缠怨花"
      }
      en {
        localizedName = "Ghost Grass Flower"
      }
      uk_UA {
        localizedName = "Квітка примарної трави"
      }
    }
  }
  val 幽灵草 = Floor("ghostGrass").apply {
    localization {
      zh_CN {
        localizedName = "幽灵草"
      }
      en {
        localizedName = "Ghost Grass"
      }
      uk_UA {
        localizedName = "Примарна трава"
      }
    }
  }
  val 幽灵草水 = ShallowLiquid("ghostGrassWater", 幽灵草).apply {
    localization {
      zh_CN {
        localizedName = "幽灵草水"
      }
      en {
        localizedName = "Ghost Grass Water"
      }
      uk_UA {
        localizedName = "Вода примарної трави"
      }
    }
  }
  val 幽灵草深水 = ShallowDeepLiquid("ghostGrassDeepWater", 幽灵草).apply {
    localization {
      zh_CN {
        localizedName = "幽灵草深水"
      }
      en {
        localizedName = "Ghost Grass Deep Water"
      }
      uk_UA {
        localizedName = "Глибока вода примарної трави"
      }
    }
  }
  val 幽灵草墙 = StaticWall("ghostGrassWall").apply {
    localization {
      zh_CN {
        localizedName = "幽灵草墙"
      }
      en {
        localizedName = "Ghost Grass Wall"
      }
      uk_UA {
        localizedName = "Стіна з примарної трави"
      }
    }
  }
  val 灰烬地 = Floor("ash").apply {
    localization {
      zh_CN {
        localizedName = "灰烬地"
      }
      en {
        localizedName = "Ash"
      }
      uk_UA {
        localizedName = "Попіл"
      }
    }
  }
  val 灰烬地水 = ShallowLiquid("ashWater", 灰烬地).apply {
    localization {
      zh_CN {
        localizedName = "灰烬地水"
      }
      en {
        localizedName = "Ash Water"
      }
      uk_UA {
        localizedName = "Вода попелу"
      }
    }
  }
  val 灰烬墙 = StaticWall("ashWall").apply {
    localization {
      zh_CN {
        localizedName = "灰烬墙"
      }
      en {
        localizedName = "Ash Wall"
      }
      uk_UA {
        localizedName = "Стіна з попелу"
      }
    }
  }
  val 钢铁地板1 = Floor("steelFloor1").apply {
    localization {
      zh_CN {
        localizedName = "钢铁地板1"
      }
      en {
        localizedName = "Steel Floor 1"
      }
      uk_UA {
        localizedName = "Сталева підлога 1"
      }
    }
  }
  val 钢铁墙1 = StaticWall("steelFloorWall1").apply {
    localization {
      zh_CN {
        localizedName = "钢铁墙1"
      }
      en {
        localizedName = "Steel Wall 1"
      }
      uk_UA {
        localizedName = "Сталева стіна 1"
      }
    }
  }
  val 钢铁地板2 = Floor("steelFloor2").apply {
    localization {
      zh_CN {
        localizedName = "钢铁地板"
      }
      en {
        localizedName = "Steel Floor"
      }
      uk_UA {
        localizedName = "Сталева підлога"
      }
    }
  }
  val 钢铁墙2 = StaticWall("steelFloorWall2").apply {
    localization {
      zh_CN {
        localizedName = "钢铁墙"
      }
      en {
        localizedName = "Steel Wall"
      }
      uk_UA {
        localizedName = "Сталева стіна"
      }
    }
  }
  val 精钢甲板 = Floor("steelFloor3").apply {
    localization {
      zh_CN {
        localizedName = "精钢甲板"
      }
      en {
        localizedName = "Steel Deck"
      }
      uk_UA {
        localizedName = "Сталевий настил"
      }
    }
  }
  val 跨界钢板 = TiledFloor("bridgeSteel", 9).apply {
    localization {
      zh_CN {
        localizedName = "跨界钢板"
      }
      en {
        localizedName = "Bridge Steel"
      }
      uk_UA {
        localizedName = "Мостова сталь"
      }
    }
  }
  val 跨界钢板墙 = StaticWall("bridgeSteelWall").apply {
    localization {
      zh_CN {
        localizedName = "跨界钢板墙"
      }
      en {
        localizedName = "Bridge Steel Wall"
      }
      uk_UA {
        localizedName = "Стіна з мостової сталі"
      }
    }
  }
  val 供能板 = Floor("powerBoard").apply {
    localization {
      zh_CN {
        localizedName = "供能板"
      }
      en {
        localizedName = "Power Board"
      }
      uk_UA {
        localizedName = "Енергетична панель"
      }
    }
  }
  val 供能墙 = StaticWall("powerWall").apply {
    localization {
      zh_CN {
        localizedName = "供能墙"
      }
      en {
        localizedName = "Power Wall"
      }
      uk_UA {
        localizedName = "Енергетична стіна"
      }
    }
  }
  val 诅咒之地 = Floor("curseLand").apply {
    localization {
      zh_CN {
        localizedName = "诅咒之地"
      }
      en {
        localizedName = "Curse Land"
      }
      uk_UA {
        localizedName = "Проклята земля"
      }
    }
  }
  val 诅咒之墙 = StaticWall("curseWall").apply {
    localization {
      zh_CN {
        localizedName = "诅咒之墙"
      }
      en {
        localizedName = "Curse Wall"
      }
      uk_UA {
        localizedName = "Проклята стіна"
      }
    }
  }
  val 新月岩 = Floor("crescent").apply {
    localization {
      zh_CN {
        localizedName = "新月岩"
      }
      en {
        localizedName = "Crescent Rock"
      }
      uk_UA {
        localizedName = "Камінь нового місяця"
      }
    }
  }
  val 新月岩水 = ShallowLiquid("crescentWater", 新月岩).apply {
    localization {
      zh_CN {
        localizedName = "新月岩水"
      }
      en {
        localizedName = "Crescent Water"
      }
      uk_UA {
        localizedName = "Вода нового місяця"
      }
    }
  }
  val 新月岩墙 = StaticWall("crescentWall").apply {
    localization {
      zh_CN {
        localizedName = "新月岩墙"
      }
      en {
        localizedName = "Crescent Wall"
      }
      uk_UA {
        localizedName = "Кам'яна стіна нового місяця"
      }
    }
  }
  val 新月喷口 = SteamVent("crescent-vent").apply {
    effectSpacing = 30f
    effect = Effect(140f) { e ->
      Draw.color(Color.valueOf("acb4eb"), Color.valueOf("d8ddff"), e.fin())
      Draw.alpha(e.fslope() * 0.78f)
      val length = 3f + e.finpow() * 10f
      Fx.rand.setSeed(e.id.toLong())
      for(i in 0..<Fx.rand.random(3, 5)) {
        Fx.v.trns(Fx.rand.random(360f), Fx.rand.random(length))
        Fill.circle(e.x + Fx.v.x, e.y + Fx.v.y, Fx.rand.random(1.2f, 3.5f) + e.fslope() * 1.1f)
      }
    }.layer(Layer.darkness - 1)
    parent = 新月岩.also { blendGroup = it }
    attributes.set(Attribute.steam, 1f)
    localization {
      zh_CN {
        localizedName = "新月喷口"
      }
      en {
        localizedName = "Crescent Vent"
      }
      uk_UA {
        localizedName = "Вентиль нового місяця"
      }
    }
  }
  val 凌冰尖刺 = TallBlock("tortureIceSpikes").apply {
    localization {
      zh_CN {
        localizedName = "凌冰尖刺"
      }
      en {
        localizedName = "Torture Ice Spikes"
      }
      uk_UA {
        localizedName = "Шипи з морозного льоду"
      }
    }
  }
  val 凌冰石块 = Prop("tortureIceStone").apply {
    localization {
      zh_CN {
        localizedName = "凌冰石块"
      }
      en {
        localizedName = "Torture Ice Stone"
      }
      uk_UA {
        localizedName = "Камінь з морозного льоду"
      }
    }
  }
  val 霜寒草 = Prop("frostbiteGrass").apply {
    localization {
      zh_CN {
        localizedName = "霜寒草"
      }
      en {
        localizedName = "Frostbite Grass"
      }
      uk_UA {
        localizedName = "Морозна трава"
      }
    }
  }
  val 凌冰 = Floor("tortureIce").apply {
    localization {
      zh_CN {
        localizedName = "凌冰"
      }
      en {
        localizedName = "Torture Ice"
      }
      uk_UA {
        localizedName = "Мучильний лід"
      }
    }
}
    attributes.set(IAttribute.寒冷, 1f)
  }
  val 凌冰水 = ShallowLiquid("tortureIceWater", 凌冰).apply {
    localization {
      zh_CN {
        localizedName = "凌冰水"
      }
      en {
        localizedName = "Torture Ice Water"
      }
      uk_UA {
        localizedName = "Вода мучильного льоду"
      }
    }
    attributes.set(IAttribute.寒冷, 0.7f)
  }
  val 凌冰深水 = ShallowDeepLiquid("tortureIceDeepWater", 凌冰).apply {
    localization {
      zh_CN {
        localizedName = "凌冰深水"
      }
      en {
        localizedName = "Torture Ice Deep Water"
      }
      uk_UA {
        localizedName = "Глибока вода мучильного льоду"
      }
    }
    attributes.set(IAttribute.寒冷, 0.8f)
  }
  val 凌冰墙 = StaticWall("tortureIceWall").apply {
    localization {
      zh_CN {
        localizedName = "凌冰墙"
      }
      en {
        localizedName = "Torture Ice Wall"
      }
      uk_UA {
        localizedName = "Мучильна стіна"
      }
    }
  }
  val 血浅滩 = Floor("bloodShoal").apply {
    albedo = 0.9f
    shallow = true
    isLiquid = true
    cacheLayer = IceShader.thickBlood
    liquidDrop = ILiquids.浓稠血浆
    statusDuration = 50f
    speedMultiplier = 0.8f
    supportsOverlay = true
    status = IStatus.染血
    statusDuration = 60 * 3f
    addContentInitEvent {
      wall = 肿瘤墙
    }
    localization {
      zh_CN {
        localizedName = "血浅滩"
      }
      en {
        localizedName = "Blood Shoal"
      }
      uk_UA {
        localizedName = "Кривава мілина"
      }
    }
  }
  val 血池 = object :Floor("thickBlood") {

    override fun drawBase(tile: Tile) {
      Dup.foors.addUnique(tile)
      super.drawBase(tile)
    }

  }.apply {
    speedMultiplier = 0.5f
    status = IStatus.染血
    statusDuration = 60 * 3f
    liquidDrop = ILiquids.浓稠血浆
    shallow = true
    isLiquid = true
    cacheLayer = IceShader.thickBlood
    supportsOverlay = true
    addContentInitEvent {
      wall = 肿瘤墙
    }
    localization {
      zh_CN {
        localizedName = "血池"
      }
      en {
        localizedName = "Thick Blood"
      }
      uk_UA {
        localizedName = "Густа кров"
      }
    }
  }
  val 深血池 = Floor("deepThickBlood").apply {
    speedMultiplier = 0.2f
    liquidDrop = ILiquids.浓稠血浆
    liquidMultiplier = 1.5f
    status = IStatus.染血
    shallow = true
    isLiquid = true
    statusDuration = 60 * 4f
    drownTime = 200f
    cacheLayer = IceShader.thickBlood
    supportsOverlay = true
    addContentInitEvent {
      wall = 肿瘤墙
    }
    localization {
      zh_CN {
        localizedName = "深血池"
      }
      en {
        localizedName = "Deep Thick Blood"
      }
      uk_UA {
        localizedName = "Глибока густа кров"
      }
    }
  }
  val 浓稠深血池 = Floor("denseDeepThickBlood").apply {
    speedMultiplier = 0.4f
    liquidDrop = ILiquids.浓稠血浆
    liquidMultiplier = 1.5f
    status = IStatus.染血
    shallow = true
    isLiquid = true
    statusDuration = 60 * 4f
    drownTime = 200f
    cacheLayer = IceShader.bloodShallow
    addContentInitEvent {
      wall = 肿瘤墙
    }
    localization {
      zh_CN {
        localizedName = "浓稠深血池"
      }
      en {
        localizedName = "Dense Deep Thick Blood"
      }
      uk_UA {
        localizedName = "Щільна глибока густа кров"
      }
    }
  }
  val 肿瘤地 = Floor("bloodNeoplasma").apply {
    decoration = 血孢子丛
    localization {
      zh_CN {
        localizedName = "肿瘤地"
      }
      en {
        localizedName = "Blood Neoplasma"
      }
      uk_UA {
        localizedName = "Кривава нейоплазма"
      }
    }
  }
  val 碎骨地 = Floor("brokenBone").apply {
    localization {
      zh_CN {
        localizedName = "碎骨地"
      }
      en {
        localizedName = "Broken Bones"
      }
      uk_UA {
        localizedName = "Подрібнені кісток"
      }
    }
  }
  val 碎骨墙 = StaticWall("brokenBoneWall").apply {
    localization {
      zh_CN {
        localizedName = "碎骨墙"
      }
      en {
        localizedName = "Broken Bone Wall"
      }
      uk_UA {
        localizedName = "Стіна подрібнених кісток"
      }
    }
  }
  val 血沙石块 = Prop("bloodSandStone").apply {
    localization {
      zh_CN {
        localizedName = "血沙石块"
      }
      en {
        localizedName = "Blood Sand Stone"
      }
      uk_UA {
        localizedName = "Кривавий пісковий камінь"
      }
    }
  }
  val 殷血粗沙 = Floor("bloodSand").apply {
    localization {
      zh_CN {
        localizedName = "殷血粗沙"
      }
      en {
        localizedName = "Blood Sand"
      }
      uk_UA {
        localizedName = "Кривавий пісок"
      }
    }
  }
  val 殷血粗沙墙 = StaticWall("bloodSandWall").apply {
    localization {
      zh_CN {
        localizedName = "殷血粗沙墙"
      }
      en {
        localizedName = "Blood Sand Wall"
      }
      uk_UA {
        localizedName = "Кривава піскова стіна"
      }
    }
  }
  val 骸骨地 = Floor("humanBones").apply {
    localization {
      zh_CN {
        localizedName = "骸骨地"
      }
      en {
        localizedName = "Human Bones"
      }
      uk_UA {
        localizedName = "Людські кістки"
      }
    }
  }
  val 血痂地 = Floor("bloodScars").apply {
    addContentInitEvent {
      wall = 肿瘤墙
    }
    localization {
      zh_CN {
        localizedName = "血痂地"
      }
      en {
        localizedName = "Blood Scars"
      }
      uk_UA {
        localizedName = "Криваві шрами"
      }
    }
  }
  val 血痂岩 = Floor("bloodScarsStone").apply {
    localization {
      zh_CN {
        localizedName = "血痂岩"
      }
      en {
        localizedName = "Blood Scars Stone"
      }
      uk_UA {
        localizedName = "Кривавий шрамовий камінь"
      }
    }
  }
  val 血蚀岩石块 = Prop("bloodmoriteStone").apply {
    localization {
      zh_CN {
        localizedName = "血蚀岩石块"
      }
      en {
        localizedName = "Bloodmorite Stone"
      }
      uk_UA {
        localizedName = "Кривавий моритовий камінь"
      }
    }
  }
  val 血蚀岩 = Floor("bloodmorite").apply {
    decoration = 血蚀岩石块
    localization {
      zh_CN {
        localizedName = "血蚀岩"
      }
      en {
        localizedName = "Bloodmorite"
      }
      uk_UA {
        localizedName = "Кривавий морит"
      }
    }
  }
  val 血蚀墙 = StaticWall("bloodmoriteWall").apply {
    localization {
      zh_CN {
        localizedName = "血蚀墙"
      }
      en {
        localizedName = "Bloodmorite Wall"
      }
      uk_UA {
        localizedName = "Кривава моритова стіна"
      }
    }
  }
  val 肿瘤墙 = StaticWall("bloodNeoplasmaWall").apply {
    localization {
      zh_CN {
        localizedName = "肿瘤墙"
      }
      en {
        localizedName = "Blood Neoplasma Wall"
      }
      uk_UA {
        localizedName = "Кривава нейоплазмова стіна"
      }
    }
  }
  val 红冰 = Floor("redIce").apply {
    localization {
      zh_CN {
        localizedName = "红冰"
      }
      en {
        localizedName = "Red Ice"
      }
      uk_UA {
        localizedName = "Червоний лід"
      }
    }
  }
  val 红冰墙 = StaticWall("redIceWall").apply {
    localization {
      zh_CN {
        localizedName = "红冰墙"
      }
      en {
        localizedName = "Red Ice Wall"
      }
      uk_UA {
        localizedName = "Червона крижана стіна"
      }
    }
  }
  val 赤雪 = Floor("bloodIceSnow").apply {
    localization {
      zh_CN {
        localizedName = "赤雪"
      }
      en {
        localizedName = "Blood Ice Snow"
      }
      uk_UA {
        localizedName = "Кривавий сніг"
      }
    }
  }
  val 红霜石块 = Prop("bloodSnowStone").apply {
    localization {
      zh_CN {
        localizedName = "红霜石块"
      }
      en {
        localizedName = "Blood Snow Stone"
      }
      uk_UA {
        localizedName = "Кривавий сніговий камінь"
      }
    }
  }
  val 红霜 = Floor("bloodSnow").apply {
    localization {
      zh_CN {
        localizedName = "红霜"
      }
      en {
        localizedName = "Blood Snow"
      }
      uk_UA {
        localizedName = "Кривавий сніг"
      }
    }
  }
  val 红霜墙 = StaticWall("bloodSnowWall").apply {
    localization {
      zh_CN {
        localizedName = "红霜墙"
      }
      en {
        localizedName = "Blood Snow Wall"
      }
      uk_UA {
        localizedName = "Кривава снігова стіна"
      }
    }
  }
  val 肿瘤喷口 = BloodNeoplasmaVent("bloodNeoplasmaVent").apply {
    parent = 肿瘤地.also { blendGroup = it }
    attributes.set(Attribute.steam, 1f)
    effect = Fx.none
    localization {
      zh_CN {
        localizedName = "肿瘤喷口"
      }
      en {
        localizedName = "Blood Neoplasma Vent"
      }
      uk_UA {
        localizedName = "Кривавий нейоплазмовий вентиль"
      }
    }
  }
  val 肿瘤井 = object :Prop("bloodNeoplasmaWell") {
    override fun drawBase(tile: Tile) {
      Geometry.d8.forEach {
        if (Vars.world.tile(tile.x + it.x, tile.y + it.y)?.block() != this) return
      }
      super.drawBase(tile)
    }
  }.apply {
    breakable = false
    alwaysReplace = false
    instantDeconstruct = true
    allowRectanglePlacement = true
    unitMoveBreakable = false
    localization {
      zh_CN {
        localizedName = "肿瘤井"
      }
      en {
        localizedName = "Blood Neoplasma Well"
      }
      uk_UA {
        localizedName = "Кривава пухлинна криниця"
      }
    }
  }
  val 肉瘤菇 = TallBlock("bloodBall").apply {
    localization {
      zh_CN {
        localizedName = "肉瘤菇"
      }
      en {
        localizedName = "Blood Ball"
      }
      uk_UA {
        localizedName = "М'ясна пухлина-гриб"
      }
    }
  }
  val 血蚀囊胚 = TallBlock("bloodBlastocyst").apply {
    localization {
      zh_CN {
        localizedName = "血蚀囊胚"
      }
      en {
        localizedName = "Blood Blastocyst"
      }
      uk_UA {
        localizedName = "Кривавий бластоцист"
      }
    }
  }
  val 缚肉树 = TallBlock("bloodFleshTree").apply {
    localization {
      zh_CN {
        localizedName = "缚肉树"
      }
      en {
        localizedName = "Blood Flesh Tree"
      }
      uk_UA {
        localizedName = "Криваве м'ясне дерево"
      }
    }
  }
  val 摄魂墙 = Block("soulCapturing").apply {
    solid = true
    breakable = true
    localization {
      zh_CN {
        localizedName = "摄魂墙"
      }
      en {
        localizedName = "Soul Capturing Wall"
      }
      uk_UA {
        localizedName = "Стіна захоплення душ"
      }
    }
  }
}
