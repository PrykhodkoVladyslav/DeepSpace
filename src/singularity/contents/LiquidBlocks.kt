package singularity.contents

import arc.func.Boolf3
import ice.content.IItems
import universecore.ui.bundle.localization
import mindustry.content.Items
import mindustry.game.Team
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.Block
import mindustry.world.Tile
import singularity.world.blocks.liquid.ClusterConduit
import singularity.world.blocks.liquid.ClusterValve
import singularity.world.blocks.liquid.ConduitRiveting

class LiquidBlocks {
  fun load() {
    集束导管 = ClusterConduit("cluster_conduit").apply {
      localization {
        zh_CN {
          localizedName = "集束导管"
          description = "内置了四条管道的装甲导管，需要导管铆来分束管道"
        }
        en {
          localizedName = "Bundle Conduit"
          description = "An armored conduit containing four built-in pipelines. Requires conduit rivets to separate the pipelines."
        }
        uk_UA {
          localizedName = "Пучковий трубопровід"
          description = "Броньований трубопровід із чотирма вбудованими каналами. Для розділення каналів потрібні заклепки трубопроводу."
        }
      }
      requirements(Category.liquid, ItemStack.with(Items.titanium, 8, IItems.气凝胶, 10, IItems.铝锭, 10))
      liquidCapacity = 10f
      liquidPressure = 1.05f
      health = 360
    }
    导管铆 = FakeBlock(object :ConduitRiveting("conduit_riveting") {
      init {
        localization {
          zh_CN {
            localizedName = "导管铆"
            description = "用于分束以及接入集束导管道,为每一条子管道提供侧向输入/输出配置功能"
          }
          en {
            localizedName = "Conduit Rivet"
            description = "Used to split and connect bundle conduits, providing side input/output configuration for each sub-conduit."
          }
          uk_UA {
            localizedName = "Заклепка трубопроводу"
            description = "Використовується для розділення та підключення пучкових трубопроводів, надаючи кожному окремому каналу можливість налаштування бічного введення та виведення."
          }
        }
        requirements(Category.liquid, ItemStack.with(Items.plastanium, 18, IItems.气凝胶, 10, IItems.铝锭, 16))
        liquidCapacity = 10f
        health = 300
      }
    }) { tile: Tile?, team: Team?, rotation: Int? ->
      val build = tile!!.build
      build is ClusterConduit.ClusterConduitBuild && build.rotation == rotation
    }
    流体过滤阀 = FakeBlock(object :ClusterValve("filter_valve") {
      init {
        localization {
          zh_CN {
            localizedName = "流体过滤阀"
            description = "用于按流体类型分流液体，每一条子管道可独立配置液体类型与侧向输入/输出模式"
          }
          en {
            localizedName = "Fluid Filter Valve"
            description = "Used to split liquids by fluid type. Each sub-pipeline can independently configure fluid type and side input/output modes"
          }
          uk_UA {
            localizedName = "Клапан фільтрації рідин"
            description = "Використовується для розподілу рідин за типом. Кожен підканал може окремо налаштовувати тип рідини та режими бічного введення/виведення"
          }
        }
        requirements(Category.liquid, ItemStack.with(Items.titanium, 10, IItems.气凝胶, 15, Items.graphite, 12))
        liquidCapacity = 10f
        health = 300
      }
    }) { tile: Tile?, _: Team?, rotation: Int? ->
      val build = tile!!.build
      build is ClusterConduit.ClusterConduitBuild && build.rotation == rotation
    }
  }

  class FakeBlock(maskedBlock: Block, placeValid: Boolf3<Tile?, Team?, Int?>?) :
    universecore.world.blocks.FakeBlock(maskedBlock, placeValid) {
    init {
      maskedBlock.alwaysUnlocked = true
    }
  }

  companion object {
    /**集束管道 */
    var 集束导管: Block? = null

    /**管道铆 */
    var 导管铆: Block? = null

    /**过滤阀 */
    var 流体过滤阀: Block? = null

  }
}