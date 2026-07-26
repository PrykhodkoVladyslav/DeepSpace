package ice.world.meta

import mindustry.world.meta.StatCat

object IceStats {
  val 最大能量势 = getStat("maxEnergyPotential", IceStatCats.neutron) {
    localization {
      zh_CN {
        localizedName = "最大能量势"
      }
      en {
        localizedName = "Max Energy Potential"
      }
      uk_UA {
        localizedName = "Максимальний енергетичний потенціал"
      }
    }
  }
  val 最大结构尺寸 = getStat("maxStructureSize", IceStatCats.结构) {
    localization {
      zh_CN {
        localizedName = "最大结构尺寸"
      }
      en {
        localizedName = "Max Structure Size"
      }
      uk_UA {
        localizedName = "Максимальний розмір структури"
      }
    }
  }

  val 电磁脉冲伤害 = getStat("empDamage") {
    localization {
      zh_CN {
        localizedName = "电磁脉冲伤害"
      }
      en {
        localizedName = "EMP Damage"
      }
      uk_UA {
        localizedName = "Шкода ЕМІ"
      }
    }
  }
  val 修复 = getStat("repair", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "修复"
      }
      en {
        localizedName = "Repair"
      }
      uk_UA {
        localizedName = "Ремонт"
      }
    }
  }
  val 注能 = getStat("speedUp", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "注能"
      }
      en {
        localizedName = "Infusion"
      }
      uk_UA {
        localizedName = "Наповнення енергією"
      }
    }
  }
  val 修复量 = getStat("repairAmount", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "修复量"
      }
      en {
        localizedName = "Repair Amount"
      }
      uk_UA {
        localizedName = "Кількість ремонту"
      }
    }
  }
  val 反射率 = getStat("albedo", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "反射率"
      }
      en {
        localizedName = "Albedo"
      }
      uk_UA {
        localizedName = "Альбедо"
      }
    }
  }
  val 立场强度 = getStat("fieldStrength", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "立场强度"
      }
      en {
        localizedName = "Field Strength"
      }
      uk_UA {
        localizedName = "Сила поля"
      }
    }
  }
  val 无人机制造 = getStat("mechs", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "无人机制造"
      }
      en {
        localizedName = "Drone Production"
      }
      uk_UA {
        localizedName = "Виробництво дронів"
      }
    }
  }
  val 格挡数量 = getStat("resistCont", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "格挡数量"
      }
      en {
        localizedName = "Block Count"
      }
      uk_UA {
        localizedName = "Кількість блокувань"
      }
    }
  }
  val 伤害减免 = getStat("damagereduction", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "伤害减免"
      }
      en {
        localizedName = "Damage Reduction"
      }
      uk_UA {
        localizedName = "Зменшення шкоди"
      }
    }
  }
  val 生命值恢复 = getStat("regenAmount", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "生命值恢复"
      }
      en {
        localizedName = "Health Regeneration"
      }
      uk_UA {
        localizedName = "Відновлення здоров’я"
      }
    }
  }
  val 连锁伤害 = getStat("chaindamage") {
    localization {
      zh_CN {
        localizedName = "连锁伤害"
      }
      en {
        localizedName = "Chain Damage"
      }
      uk_UA {
        localizedName = "Ланцюгова шкода"
      }
    }
  }
  val 护甲降低 = getStat("reducearmor") {
    localization {
      zh_CN {
        localizedName = "护甲降低"
      }
      en {
        localizedName = "Armor Reduction"
      }
      uk_UA {
        localizedName = "Зниження броні"
      }
    }
  }
  val 生命上限降低 = getStat("reducemaxhealth") {
    localization {
      zh_CN {
        localizedName = "生命上限降低"
      }
      en {
        localizedName = "Max Health Reduction"
      }
      uk_UA {
        localizedName = "Зниження максимального здоров’я"
      }
    }
  }
  val 斩杀生命值 = getStat("killhealth") {
    localization {
      zh_CN {
        localizedName = "斩杀生命值"
      }
      en {
        localizedName = "Execute Threshold"
      }
      uk_UA {
        localizedName = "Поріг страти"
      }
    }
  }
  val 单位数量 = getStat("unitcap") {
    localization {
      zh_CN {
        localizedName = "单位数量"
      }
      en {
        localizedName = "Unit Cap"
      }
      uk_UA {
        localizedName = "Ліміт юнітів"
      }
    }
  }
  val 百分比护盾伤害 = getStat("percentshielddamage") {
    localization {
      zh_CN {
        localizedName = "百分比护盾伤害"
      }
      en {
        localizedName = "Percent Shield Damage"
      }
      uk_UA {
        localizedName = "Відсоткова шкода щиту"
      }
    }
  }
  val 最小护盾伤害 = getStat("minshielddamage") {
    localization {
      zh_CN {
        localizedName = "最小护盾伤害"
      }
      en {
        localizedName = "Minimum Shield Damage"
      }
      uk_UA {
        localizedName = "Мінімальна шкода щиту"
      }
    }
  }
  val 可连接建筑 = getStat("linkBlocks", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "可连接建筑"
      }
      en {
        localizedName = "Linkable Structures"
      }
      uk_UA {
        localizedName = "З’єднувані споруди"
      }
    }
  }
  val 最大连接 = getStat("maxLinks", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "最大连接"
      }
      en {
        localizedName = "Max Links"
      }
      uk_UA {
        localizedName = "Макс. кількість з’єднань"
      }
    }
  }
  val 营养浓度 = getStat("nutrientConcentration") {
    localization {
      zh_CN {
        localizedName = "营养浓度"
      }
      en {
        localizedName = "Nutrient Concentration"
      }
      uk_UA {
        localizedName = "Концентрація поживних речовин"
      }
    }
  }
  val 反射概率基数 = getStat("baseDeflectChance") {
    localization {
      zh_CN {
        localizedName = "反射概率基数"
      }
      en {
        localizedName = "Base Deflection Chance"
      }
      uk_UA {
        localizedName = "Базовий шанс відбиття"
      }
    }
  }
  val 建造时间花费 = getStat("cost") {
    localization {
      zh_CN {
        localizedName = "建造时间花费"
      }
      en {
        localizedName = "Build Time Cost"
      }
      uk_UA {
        localizedName = "Витрати часу на будівництво"
      }
    }
  }
  val 建筑血量系数 = getStat("healthScaling") {
    localization {
      zh_CN {
        localizedName = "建筑血量系数"
      }
      en {
        localizedName = "Structure Health Scaling"
      }
      uk_UA {
        localizedName = "Коефіцієнт здоров’я споруди"
      }
    }
  }
  val 硬度 = getStat("hardness") {
    localization {
      zh_CN {
        localizedName = "硬度"
      }
      en {
        localizedName = "Hardness"
      }
      uk_UA {
        localizedName = "Твердість"
      }
    }
  }
  val 是否用于建造 = getStat("buildable") {
    localization {
      zh_CN {
        localizedName = "是否用于建造"
      }
      en {
        localizedName = "Buildable"
      }
      uk_UA {
        localizedName = "Можна будувати"
      }
    }
  }
  val 状态效果 = getStat("effect") {
    localization {
      zh_CN {
        localizedName = "状态效果"
      }
      en {
        localizedName = "Status Effect"
      }
      uk_UA {
        localizedName = "Ефект стану"
      }
    }
  }
  val 破甲 = getStat("armorBreak") {
    localization {
      zh_CN {
        localizedName = "破甲"
      }
      en {
        localizedName = "Armor Break"
      }
      uk_UA {
        localizedName = "Пробиття броні"
      }
    }
  }
  val 状态持续时间 = getStat("statusTime") {
    localization {
      zh_CN {
        localizedName = "状态持续时间"
      }
      en {
        localizedName = "Status Duration"
      }
      uk_UA {
        localizedName = "Тривалість ефекту"
      }
    }
  }
  val 秒 = getStat("seconds") {
    localization {
      zh_CN {
        localizedName = "秒"
      }
      en {
        localizedName = "Seconds"
      }
      uk_UA {
        localizedName = "сек."
      }
    }
  }
  val 范围 = getStat("radius", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "范围"
      }
      en {
        localizedName = "Range"
      }
      uk_UA {
        localizedName = "Радіус"
      }
    }
  }

  val 状态 = getStat("status") {
    localization {
      zh_CN {
        localizedName = "状态"
      }
      en {
        localizedName = "Status"
      }
      uk_UA {
        localizedName = "Стан"
      }
    }
  }
  val 生产进度 = getStat("productionProgress") {
    localization {
      zh_CN {
        localizedName = "生产进度"
      }
      en {
        localizedName = "Production Progress"
      }
      uk_UA {
        localizedName = "Прогрес виробництва"
      }
    }
  }
  val 能否超速 = getStat("canOverSpeed") {
    localization {
      zh_CN {
        localizedName = "能否超速"
      }
      en {
        localizedName = "Can Overdrive"
      }
      uk_UA {
        localizedName = "Можна прискорити"
      }
    }
  }
  val 发射数量 = getStat("shots") {
    localization {
      zh_CN {
        localizedName = "发射数量"
      }
      en {
        localizedName = "Shots"
      }
      uk_UA {
        localizedName = "Кількість пострілів"
      }
    }
  }
  val 预热 = getStat("warmup") {
    localization {
      zh_CN {
        localizedName = "预热"
      }
      en {
        localizedName = "Warmup"
      }
      uk_UA {
        localizedName = "Розігрів"
      }
    }
  }

  val 公告 = getStat("publicInfo") {
    localization {
      zh_CN {
        localizedName = "公告"
      }
      en {
        localizedName = "News"
      }
      uk_UA {
        localizedName = "Новини"
      }
    }
  }
  val 研究 = getStat("research") {
    localization {
      zh_CN {
        localizedName = "研究"
      }
      en {
        localizedName = "Research"
      }
      uk_UA {
        localizedName = "Дослідження"
      }
    }
  }
  val 数据 = getStat("datas") {
    localization {
      zh_CN {
        localizedName = "数据"
      }
      en {
        localizedName = "Data"
      }
      uk_UA {
        localizedName = "Дані"
      }
    }
  }
  val 成就 = getStat("achievement") {
    localization {
      zh_CN {
        localizedName = "成就"
      }
      en {
        localizedName = "Achievements"
      }
      uk_UA {
        localizedName = "Досягнення"
      }
    }
  }
  val 遗物 = getStat("remains") {
    localization {
      zh_CN {
        localizedName = "遗物"
      }
      en {
        localizedName = "Relics"
      }
      uk_UA {
        localizedName = "Реліквії"
      }
    }
  }
  val 模组 = getStat("mod") {
    localization {
      zh_CN {
        localizedName = "模组"
      }
      en {
        localizedName = "Mod"
      }
      uk_UA {
        localizedName = "Мод"
      }
    }
  }
  val 捐赠 = getStat("contribute") {
    localization {
      zh_CN {
        localizedName = "捐赠"
      }
      en {
        localizedName = "Donate"
      }
      uk_UA {
        localizedName = "Пожертвувати"
      }
    }
  }
  val 设置 = getStat("settings") {
    localization {
      zh_CN {
        localizedName = "设置"
      }
      en {
        localizedName = "Settings"
      }
      uk_UA {
        localizedName = "Налаштування"
      }
    }
  }
  val 关闭 = getStat("close") {
    localization {
      zh_CN {
        localizedName = "关闭"
      }
      en {
        localizedName = "Close"
      }
      uk_UA {
        localizedName = "Закрити"
      }
    }
  }

  val 连接 = getStat("links") {
    localization {
      zh_CN {
        localizedName = "连接 {0}/{1}"
      }
      en {
        localizedName = "Links {0}/{1}"
      }
      uk_UA {
        localizedName = "З’єднання {0}/{1}"
      }
    }
  }

  val 连接范围 = getStat("linkRange", IceStatCats.流体传输) {
    localization {
      zh_CN {
        localizedName = "连接范围"
      }
      en {
        localizedName = "Link Range"
      }
      uk_UA {
        localizedName = "Радіус з’єднання"
      }
    }
  }
  val 传输速度 = getStat("transportSpeed", IceStatCats.流体传输) {
    localization {
      zh_CN {
        localizedName = "传输速度"
      }
      en {
        localizedName = "Transfer Speed"
      }
      uk_UA {
        localizedName = "Швидкість передачі"
      }
    }
  }

  val 正面免伤 = getStat("frontReduceHarm", StatCat.function) {
    localization {
      zh_CN {
        localizedName = "正面免伤"
      }
      en {
        localizedName = "Front Damage Reduction"
      }
      uk_UA {
        localizedName = "Зменшення шкоди спереду"
      }
    }
  }
  val 伤害 = getStat("damage") {
    localization {
      zh_CN {
        localizedName = "伤害"
      }
      en {
        localizedName = "Damage"
      }
      uk_UA {
        localizedName = "Шкода"
      }
    }
  }
  val 拦截伤害 = getStat("interceptDamage") {
    localization {
      zh_CN {
        localizedName = "拦截伤害"
      }
      en {
        localizedName = "Intercept Damage"
      }
      uk_UA {
        localizedName = "Шкода перехоплення"
      }
    }
  }
  val 拦截范围 = getStat("interceptRange") {
    localization {
      zh_CN {
        localizedName = "拦截范围"
      }
      en {
        localizedName = "Intercept Range"
      }
      uk_UA {
        localizedName = "Радіус перехоплення"
      }
    }
  }
  val 钻探等级 = getStat("drillLevel", StatCat.crafting) {
    localization {
      zh_CN {
        localizedName = "钻探等级"
      }
      en {
        localizedName = "Drill Tier"
      }
      uk_UA {
        localizedName = "Рівень бура"
      }
    }
  }
  val 百分比治疗 = getStat("percentHealth") {
    localization {
      zh_CN {
        localizedName = "百分比治疗"
      }
      en {
        localizedName = "Percent Healing"
      }
      uk_UA {
        localizedName = "Відсоткове лікування"
      }
    }
  }
  val 最小治疗 = getStat("minhealth") {
    localization {
      zh_CN {
        localizedName = "最小治疗"
      }
      en {
        localizedName = "Minimum Healing"
      }
      uk_UA {
        localizedName = "Мінімальне лікування"
      }
    }
  }
  val 百分比伤害 = getStat("percentdamage") {
    localization {
      zh_CN {
        localizedName = "百分比伤害"
      }
      en {
        localizedName = "Percent Damage"
      }
      uk_UA {
        localizedName = "Відсоткова шкода"
      }
    }
  }
  val 最小伤害 = getStat("mindamage") {
    localization {
      zh_CN {
        localizedName = "最小伤害"
      }
      en {
        localizedName = "Minimum Damage"
      }
      uk_UA {
        localizedName = "Мінімальна шкода"
      }
    }
  }

  val 主菜单 = getStat("mainMenu") {
    localization {
      zh_CN {
        localizedName = "主菜单"
      }
      en {
        localizedName = "Main Menu"
      }
      uk_UA {
        localizedName = "Головне меню"
      }
    }
  }
  val 作者 = getStat("author") {
    localization {
      zh_CN {
        localizedName = "作者"
      }
      en {
        localizedName = "Author"
      }
      uk_UA {
        localizedName = "Автор"
      }
    }
  }
  val 亲爱的贡献者 = getStat("contributors") {
    localization {
      zh_CN {
        localizedName = "亲爱的贡献者"
      }
      en {
        localizedName = "Contributors"
      }
      uk_UA {
        localizedName = "Учасники"
      }
    }
  }
  val 版本 = getStat("version") {
    localization {
      zh_CN {
        localizedName = "版本"
      }
      en {
        localizedName = "Version"
      }
      uk_UA {
        localizedName = "Версія"
      }
    }
  }
  val 版本发布日期 = getStat("releaseDate") {
    localization {
      zh_CN {
        localizedName = "版本发布日期"
      }
      en {
        localizedName = "Release Date"
      }
      uk_UA {
        localizedName = "Дата випуску"
      }
    }
  }

  val 支持详情 = getStat("support.info") {
    localization {
      zh_CN {
        localizedName = "首先,谢谢您愿意点开这个页面,若您喜欢这个mod,您的支持将是我们继续这个项目的莫大动力"
      }
      en {
        localizedName = "First of all, thank you for opening this page. If you enjoy this mod, your support will be a huge motivation for us to continue this project."
      }
      uk_UA {
        localizedName = "Перш за все, дякуємо, що відкрили цю сторінку. Якщо вам подобається цей мод, ваша підтримка стане для нас великою мотивацією продовжувати цей проєкт."
      }
    }
  }
  val 支持github = getStat("support.star") {
    localization {
      zh_CN {
        localizedName = "如果您想要支持这个mod,我们比较推荐您从下面的这个按钮跳转到这个项目的github页面,并为我们点亮一个star"
      }
      en {
        localizedName = "If you'd like to support this mod, we recommend using the button below to visit the project's GitHub page and give it a star."
      }
      uk_UA {
        localizedName = "Якщо ви хочете підтримати цей мод, радимо скористатися кнопкою нижче, щоб перейти на сторінку GitHub проєкту та поставити зірку."
      }
    }
  }
  val 支持githubStar = getStat("support.githubStar") {
    localization {
      zh_CN {
        localizedName = "前往mod的github页面,并点亮一个star"
      }
      en {
        localizedName = "Go to the mod's GitHub page and give it a star"
      }
      uk_UA {
        localizedName = "Перейти на сторінку GitHub моду та поставити зірку"
      }
    }
  }
  val 支持捐赠 = getStat("support.donate") {
    localization {
      zh_CN {
        localizedName = "如果您认为我们的作品值得您提供物质上的支持,您可以通过爱发电或者patreon来向我们提供赞助,我们无意要求您为我们的工作买单,但是如果您愿意为我们的所做给予肯定,我们亦会万分感激."
      }
      en {
        localizedName = "If you believe our work is worth financial support, you can sponsor us via Afdian or Patreon. We do not expect you to pay for our work, but we would be extremely grateful for your support."
      }
      uk_UA {
        localizedName = "Якщо ви вважаєте, що наша робота заслуговує на фінансову підтримку, ви можете підтримати нас через Afdian або Patreon. Ми не очікуємо, що ви будете платити за нашу працю, але будемо щиро вдячні за вашу підтримку."
      }
    }
  }
  val 爱发电 = getStat("afdian") {
    localization {
      zh_CN {
        localizedName = "爱发电"
      }
      en {
        localizedName = "Afdian"
      }
      uk_UA {
        localizedName = "Afdian"
      }
    }
  }
  val Patreon = getStat("patreon") {
    localization {
      zh_CN {
        localizedName = "Patreon"
      }
      en {
        localizedName = "Patreon"
      }
      uk_UA {
        localizedName = "Patreon"
      }
    }
  }
  val 支持爱发电 = getStat("support.afdian") {
    localization {
      zh_CN {
        localizedName = "来自中国的玩家可以选择通过爱发电赞助"
      }
      en {
        localizedName = "Players from China can choose to support us via Afdian"
      }
      uk_UA {
        localizedName = "Гравці з Китаю можуть підтримати нас через Afdian"
      }
    }
  }
  val 支持patreon = getStat("support.patreon") {
    localization {
      zh_CN {
        localizedName = "通过patreon赞助我们"
      }
      en {
        localizedName = "Support us via Patreon"
      }
      uk_UA {
        localizedName = "Підтримати нас через Patreon"
      }
    }
  }

  val 可选输入 = getStat("optionalInputs", IceStatCats.其他) {
    localization {
      zh_CN {
        localizedName = "可选输入"
      }
      en {
        localizedName = "Optional Inputs"
      }
      uk_UA {
        localizedName = "Додаткові ресурси"
      }
    }
  }
  val 未选择 = getStat("noSelect") {
    localization {
      zh_CN {
        localizedName = "未选择"
      }
      en {
        localizedName = "Not Selected"
      }
      uk_UA {
        localizedName = "Не вибрано"
      }
    }
  }

  val 物品 = getStat("item") {
    localization {
      zh_CN {
        localizedName = "物品"
      }
      en {
        localizedName = "Item"
      }
      uk_UA {
        localizedName = "Предмет"
      }
    }
  }
  val 流体 = getStat("liquid") {
    localization {
      zh_CN {
        localizedName = "流体"
      }
      en {
        localizedName = "Liquid"
      }
      uk_UA {
        localizedName = "Рідина"
      }
    }
  }
  val 热量 = getStat("heat") {
    localization {
      zh_CN {
        localizedName = "热量"
      }
      en {
        localizedName = "Heat"
      }
      uk_UA {
        localizedName = "Тепло"
      }
    }
  }

  fun getStat(localizedName: String, cat: StatCat = StatCat.general, block: IceStat.() -> Unit): IceStat {
    return IceStat(localizedName, cat).apply {
      block(this)
    }
  }
}