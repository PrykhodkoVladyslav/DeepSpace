package ice.content

import ice.world.content.item.IceItem
import ice.world.content.item.OreItem
import universecore.ui.bundle.localization

@Suppress("unused")
object IItems {
  fun load() = Unit
  val 脊髓末梢 = IceItem("item_spinalCordEnding", "bf3e47") {
    nutrientConcentration = 0.2f
    localization {
      zh_CN {
        localizedName = "脊髓末梢"
        description = "一种神经传导组织生物材料,一般从生物质中提取.可用于强化机械单位的反应速度与攻击精准度"
      }
      en {
        localizedName = "Spinal Cord Endings"
        description =
          "A neuroconductive tissue biomaterial, generally extracted from biomass. It can be used to enhance the reaction speed and attack accuracy of mechanical units."
      }
      uk_UA {
        localizedName = "Закінчення спинного мозку"
        description =
          "Біоматеріал нервової провідної тканини, який зазвичай добувають із біомаси. Використовується для підвищення швидкості реакції та точності атак механічних одиниць."
      }
    }
  }
  val 无名肉块 = IceItem("item_namelessCut", "bf3e47") {
    localization {
      zh_CN {
        localizedName = "无名肉块"
        description = "一种有机生物材料,表面布满跳动的血管"
        details = "我们以为北极只是冷,但是没想到,寒冷竟也能如此饥饿..."
      }
      en {
        localizedName = "Nameless Flesh"
        description = "An organic biomaterial with pulsating blood vessels covering its surface"
        details = "We thought the Arctic was merely cold, but we never imagined that the cold itself could be so hungry..."
      }
      uk_UA {
        localizedName = "Безіменна м'ясо"
        description = "Органічний біоматеріал з пульсуючими кровеносними судинами, які покривають його поверхню"
        details = "Ми думали, що Арктика — це просто холодно, але ми ніколи не уявляли, що холод сам по собі може бути таким голодним..."
      }
    }
    nutrientConcentration = 0.5f
  }
  val 碎骨 = IceItem("item_bonesNap", "bf3e47") {
    nutrientConcentration = 0.1f
    localization {
      zh_CN {
        localizedName = "碎骨"
        description = "一种经过粉碎处理的骨质生物材料,表面布满裂痕与强化接合点.可作为廉价的结构填充材料,或进一步强化为高硬度复合材料"
      }
      en {
        localizedName = "Crushed Bones"
        description =
          "A pulverized bone biomaterial covered with cracks and reinforced joints. Can be used as cheap structural filler or further refined into high-hardness composite materials."
      }
      uk_UA {
        localizedName = "Подрібнені кістки"
        description =
          "Подрібнений кістковий біоматеріал, вкритий тріщинами та зміцненими вузлами. Може використовуватися як дешевий конструкційний наповнювач або бути додатково зміцнений до високоміцного композитного матеріалу."
      }
    }
  }
  val 肌腱 = IceItem("item_muscleTendon", "bf3e47") {
    nutrientConcentration = 0.25f
    localization {
      zh_CN {
        localizedName = "肌腱"
        description = "一种高强度的纤维束生物材料,经过改造后具备惊人的弹性与韧性"
        details = "牛皮糖?"
      }
      en {
        localizedName = "Muscle Tendon"
        description = "A high-strength fibrous biomaterial with remarkable elasticity and toughness after modification."
        details = "Chewy candy?"
      }
      uk_UA {
        localizedName = "Сухожилля"
        description = "Високоміцний волокнистий біоматеріал, який після модифікації набуває надзвичайної еластичності та міцності."
        details = "Жувальна цукерка?"
      }
    }
  }
  val 骨钢 = IceItem("item_fleshSteel", "bf3e47") {
    nutrientConcentration = 0.15f
    localization {
      zh_CN {
        localizedName = "骨钢"
        description = "一种由血肉与骸骨组成的复合生物材料,坚硬且有微弱光泽,用于建造自愈型建筑"
      }
      en {
        localizedName = "Bone Steel"
        description =
          "A composite biomaterial made of flesh and bone, hard with a faint sheen, used for constructing self-healing structures."
      }
      uk_UA {
        localizedName = "Кісткова сталь"
        description =
          "Композитний біоматеріал із плоті та кісток. Твердий, із легким блиском, використовується для будівництва самовідновлюваних споруд."
      }
    }
  }

  val 金珀沙 = IceItem("item_goldSand", "f8efad") {
    hardness = 1
    localization {
      zh_CN {
        localizedName = "金珀沙"
        description =
          "一种闪耀着金色光泽的沙粒,其中混有微量琥珀结晶,在光照下会浮现半透明的琥珀色光晕.经适当工艺处理后,可从中提取出多种矿物质"
      }
      en {
        localizedName = "Amber Gold Sand"
        description =
          "Golden-gleaming sand particles mixed with trace amber crystals, revealing translucent amber halos under light. Various minerals can be extracted through proper processing."
      }
      uk_UA {
        localizedName = "Бурштиновий золотий пісок"
        description =
          "Піщинки із золотистим блиском, що містять сліди кристалів бурштину. На світлі вони випромінюють напівпрозоре бурштинове сяйво. Після належної обробки з них можна видобути різноманітні мінерали."
      }
    }
  }
  val 黄玉髓 = IceItem("item_canaryStone", "f5c782") {
    hardness = 1
    localization {
      zh_CN {
        localizedName = "黄玉髓"
        description = "一种淡黄色的半透明玉石,质地温润,可加工析出其他矿物"
      }
      en {
        localizedName = "Canary Chalcedony"
        description = "A pale yellow translucent jade with a warm, smooth texture that can be processed to extract other minerals."
      }
      uk_UA {
        localizedName = "Жовтий халцедон"
        description = "Світло-жовтий напівпрозорий халцедон із гладкою, теплою текстурою, який можна обробляти для видобутку інших мінералів."
      }
    }
  }
  val 红冰 = IceItem("item_redIce", "ff7171") {
    radioactivity = 0.05f
    localization {
      zh_CN {
        localizedName = "红冰"
        description = "一种红色的放射性晶体,内部含有不稳定的能量结构,在受到外部刺激时可能引发剧烈释放"
      }
      en {
        localizedName = "Red Ice"
        description =
          "A red radioactive crystal containing unstable energy structures that may cause violent energy release when externally stimulated."
      }
      uk_UA {
        localizedName = "Червоний лід"
        description =
          "Червоний радіоактивний кристал, що містить нестабільні енергетичні структури, які можуть спричинити потужний викид енергії під дією зовнішнього впливу."
      }
    }
  }
  val 晶状孢芽 = IceItem("item_crystallineSpore", "52578a") {
    flammability = 0.2f
    hardness = 1
    localization {
      zh_CN {
        localizedName = "晶状孢芽"
        description = "一种半透明的晶体状孢子,内部含有稳定的能量结构,可用于制造光学设备或能量传导材料"
      }
      en {
        localizedName = "Crystalline Spore"
        description =
          "A translucent crystal-like spore with stable internal energy structures, usable for manufacturing optical devices or energy-conducting materials."
      }
      uk_UA {
        localizedName = "Кристалічна спора"
        description =
          "Напівпрозора кристалоподібна спора зі стабільними внутрішніми енергетичними структурами, придатна для виготовлення оптичних пристроїв або енергопровідних матеріалів."
      }
    }
  }
  val 灼热孢团 = IceItem("item_pyroSpore", "eac73e") {
    explosiveness = 0.1f
    flammability = 0.4f
    localization {
      zh_CN {
        localizedName = "灼热孢团"
        description = "一种团状高温孢子,内部含有可燃物质,可作为燃料或爆炸物的原料使用"
      }
      en {
        localizedName = "Pyro Spore Cluster"
        description =
          "A cluster of high-temperature spores containing combustible substances, usable as fuel or raw material for explosives."
      }
      uk_UA {
        localizedName = "Піроспорове скупчення"
        description =
          "Скупчення високотемпературних спор, що містять легкозаймисті речовини. Може використовуватися як паливо або сировина для вибухових речовин."
      }
    }
  }
  val 寂温疮体 = IceItem("item_lonelyHeatSoreSpore", "b3f1ff") {
    flammability = -0.1f
    localization {
      zh_CN {
        localizedName = "寂温疮体"
        description = "一种奇特的低温孢子,表面覆盖有冰晶,可稳定吸收并传导热能,可用于冷却系统构建或低温材料的制备"
      }
      en {
        localizedName = "Cryo Sore Spore"
        description =
          "A peculiar low-temperature spore covered with ice crystals that can stably absorb and conduct heat energy, usable for cooling system construction or low-temperature material preparation."
      }
      uk_UA {
        localizedName = "Кріоспора"
        description =
          "Незвичайна низькотемпературна спора, вкрита кристалами льоду, здатна стабільно поглинати й проводити теплову енергію. Використовується для створення систем охолодження та виробництва кріогенних матеріалів."
      }
    }
  }
  val 腐败孢团 = IceItem("item_rottenSpore", "a09bbd") {
    radioactivity = 0.1f
    flammability = 0.3f
    localization {
      zh_CN {
        localizedName = "腐败孢团"
        description = "一种团状腐烂孢子,持续散发着恶臭,可用于制造肥料或燃料"
      }
      en {
        localizedName = "Rotten Spore Cluster"
        description = "A cluster of rotting spores that continuously emits foul odors, usable for manufacturing fertilizer or fuel."
      }
      uk_UA {
        localizedName = "Гнильне спорове скупчення"
        description = "Скупчення гниючих спор, що постійно виділяє смердючий запах. Може використовуватися для виробництва добрив або палива."
      }
    }
  }
  val 血囊孢子 = IceItem("item_bloodSpore", "ffa0a0") {
    radioactivity = 0.05f
    hardness = 1
    frames = 5
    frameTime = 15f
    localization {
      zh_CN {
        localizedName = "血囊孢子"
        description = "一种采集自殷红树的单胞繁殖体孢子,生物结构极不稳定,在适宜条件下可能分化为[red]其他植株[]"
      }
      en {
        localizedName = "Blood Sac Spore"
        description =
          "A unicellular reproductive spore harvested from crimson trees, with extremely unstable biological structures that may differentiate into [red]other plants[] under suitable conditions."
      }
      uk_UA {
        localizedName = "Спора кривавого мішка"
        description =
          "Одноклітинна репродуктивна спора, зібрана з багряних дерев. Її біологічна структура надзвичайно нестабільна й за сприятливих умов може перетворитися на [red]інші рослини[]."
      }
    }
  }
  val 石英 = OreItem("item_quartz", "ffffff", 1) {
    localization {
      zh_CN {
        localizedName = "石英"
        description = "一种高硬度半透明晶体,质地纯净且常呈现玻璃光泽.对极端酸性环境具备优异的耐受性,常用于腐蚀性区域的设备建造"
      }
      en {
        localizedName = "Quartz"
        description =
          "A high-hardness translucent crystal with pure composition and glassy luster. Possesses excellent resistance to extreme acidic environments, commonly used for equipment construction in corrosive areas."
      }
      uk_UA {
        localizedName = "Кварц"
        description =
          "Напівпрозорий кристал високої твердості з чистою структурою та характерним скляним блиском. Має відмінну стійкість до надзвичайно кислотних середовищ і широко використовується для виготовлення обладнання, що працює в корозійних умовах."
      }
    }
  }
  val 生煤 = OreItem("item_rawCoal", "#7D7D7D", 2) {
    flammability = 0.7f
    localization {
      zh_CN {
        localizedName = "生煤"
        description = "一种未经精炼的原煤,杂质含量较高,燃烧效率有限.可作为基础燃料直接使用,亦可通过进一步加工提升纯度与热值"
      }
      en {
        localizedName = "Raw Coal"
        description =
          "Unrefined raw coal with high impurity content and limited combustion efficiency. Can be used directly as basic fuel or further processed to improve purity and calorific value."
      }
      uk_UA {
        localizedName = "Неочищене вугілля"
        description =
          "Неочищене кам'яне вугілля з високим вмістом домішок і обмеженою ефективністю горіння. Може використовуватися безпосередньо як базове паливо або бути додатково перероблене для підвищення чистоти й теплотворної здатності."
      }
    }
  }
  val 焦炭 = IceItem("item_coke", "#6A6A69") {
    hardness = 1
    explosiveness = 1.5f
    flammability = 1.8f
    radioactivity = 0f
    localization {
      zh_CN {
        localizedName = "焦炭"
        description =
          "一种经处理后的碳质材料,相较于原煤具有更高的碳含量与热值,杂质少,燃烧更为彻底,在冶炼工业中作为补充热源及碳素材料被广泛使用"
      }
      en {
        localizedName = "Coke"
        description =
          "A processed carbon material with higher carbon content and calorific value compared to raw coal, with fewer impurities and more complete combustion. Widely used in smelting industry as a supplementary heat source and carbon material."
      }
      uk_UA {
        localizedName = "Кокс"
        description =
          "Оброблений вуглецевий матеріал із вищим вмістом вуглецю та більшою теплотворною здатністю, ніж неочищене вугілля. Містить менше домішок, згорає повніше й широко використовується в металургії як додаткове джерело тепла та вуглецевий матеріал."
      }
    }
  }
  val 燃素水晶 = IceItem("item_phlogistonCrystal", "b38f8d") {
    explosiveness = 0.3f
    localization {
      zh_CN {
        localizedName = "燃素水晶"
        description = "一种蕴含高能量的晶体,燃烧时能释放大量热能,是高效燃料的重要原料"
      }
      en {
        localizedName = "Phlogiston Crystal"
        description =
          "A high-energy crystal that releases large amounts of thermal energy when burned, an important raw material for high-efficiency fuel."
      }
      uk_UA {
        localizedName = "Кристал флогістону"
        description =
          "Кристал із високим запасом енергії, який під час горіння вивільняє величезну кількість теплової енергії. Є важливою сировиною для виробництва високоефективного палива."
      }
    }
  }

  val 铬铁矿 = OreItem("item_chrome", "768a9a", 3) {
    localization {
      zh_CN {
        localizedName = "铬铁矿"
        description = "一种重要的铬矿石,表面呈现金属至亚金属光泽.含有高比例铬成分,是生产不锈钢与耐热合金的主要原料之一"
      }
      en {
        localizedName = "Chromite"
        description =
          "An important chromium ore with metallic to submetallic luster. Contains high proportion of chromium and is one of the main raw materials for producing stainless steel and heat-resistant alloys."
      }
      uk_UA {
        localizedName = "Хроміт"
        description =
          "Важлива хромова руда з металевим або напівметалевим блиском. Містить високий вміст хрому та є однією з основних сировин для виробництва нержавіючої сталі й жаростійких сплавів."
      }
    }
  }
  val 赤铁矿 = OreItem("item_hematite", "c6a699", 2) {
    localization {
      zh_CN {
        localizedName = "赤铁矿"
        description = "一种重要的铁矿石,呈红褐色,具有较高的铁含量,是合成碳素钢的主要原料之一"
      }
      en {
        localizedName = "Hematite"
        description =
          "An important iron ore with reddish-brown color and high iron content, one of the main raw materials for synthesizing carbon steel."
      }
      uk_UA {
        localizedName = "Гематит"
        description =
          "Важлива залізна руда червонувато-бурого кольору з високим вмістом заліза. Є однією з основних сировин для виробництва вуглецевої сталі."
      }
    }
  }
  val 方铅矿 = OreItem("item_galena", "8c7fa9", 2) {
    radioactivity = 0.1f
    localization {
      zh_CN {
        localizedName = "方铅矿"
        description = "一种重要的铅矿石,呈立方晶体结构,常伴有银等贵金属,具有弱放射性.是提炼铅的主要原料之一"
      }
      en {
        localizedName = "Galena"
        description =
          "An important lead ore with cubic crystal structure, often accompanied by precious metals like silver, with weak radioactivity. One of the main raw materials for lead extraction."
      }
      uk_UA {
        localizedName = "Галеніт"
        description =
          "Важлива свинцева руда з кубічною кристалічною структурою, яка часто містить срібло та інші дорогоцінні метали. Має слабку радіоактивність і є однією з основних сировин для добування свинцю."
      }
    }
  }
  val 黄铜矿 = OreItem("item_copperPyrites", "eac73e", 2) {
    localization {
      zh_CN {
        localizedName = "黄铜矿"
        description = "一种重要的铜矿石,呈黄铜色金属光泽,常伴有金和银等贵金属.是提炼铜的主要原料之一"
      }
      en {
        localizedName = "Chalcopyrite"
        description =
          "An important copper ore with brass-yellow metallic luster, often accompanied by precious metals like gold and silver. One of the main raw materials for copper extraction."
      }
      uk_UA {
        localizedName = "Халькопірит"
        description =
          "Важлива мідна руда з латунно-жовтим металевим блиском, що часто містить золото, срібло та інші дорогоцінні метали. Є однією з основних сировин для добування міді."
      }
    }
  }
  val 闪锌矿 = OreItem("item_sphalerite", "578c80", 2) {
    localization {
      zh_CN {
        localizedName = "闪锌矿"
        description = "一种重要的铜矿石,纯闪锌矿近于无色,但通常因含铁而呈浅黄,浅绿,随含铁量的增加而变深.是提炼锌的主要原料之一"
      }
      en {
        localizedName = "Sphalerite"
        description =
          "An important zinc ore. Pure sphalerite is nearly colorless, but it usually appears light yellow or light green due to iron content, becoming darker as the iron concentration increases. It is one of the main raw materials for zinc extraction."
      }
      uk_UA {
        localizedName = "Сфалерит"
        description =
          "Важлива цинкова руда. Чистий сфалерит майже безбарвний, але зазвичай має світло-жовтий або світло-зелений відтінок через вміст заліза, який темнішає зі збільшенням його кількості. Є однією з основних сировин для добування цинку."
      }
    }
  }
  val 金矿 = OreItem("item_goldOre", "f8df87", 3) {
    localization {
      zh_CN {
        localizedName = "金矿"
        description = "一种珍贵的金矿石,虽整体含量虽不高,但仍是提取贵重金属的核心来源之一"
      }
      en {
        localizedName = "Gold Ore"
        description =
          "A precious gold ore that, despite its relatively low overall content, remains one of the core sources for extracting precious metals."
      }
      uk_UA {
        localizedName = "Золота руда"
        description =
          "Цінна золота руда, яка, незважаючи на відносно низький загальний вміст золота, залишається одним із головних джерел видобутку дорогоцінних металів."
      }
    }
  }
  val 锆英石 = OreItem("item_azorite", "8c3e2d", 4) {
    localization {
      zh_CN {
        localizedName = "锆英石"
        description = "一种坚硬的硅酸盐矿石,呈短柱状,广泛用于陶瓷工业与耐火材料制备.是提取锆的主要原料之一"
      }
      en {
        localizedName = "Zircon"
        description =
          "A hard silicate ore with short prismatic crystals, widely used in the ceramic industry and refractory material production. One of the main raw materials for zirconium extraction."
      }
      uk_UA {
        localizedName = "Циркон"
        description =
          "Тверда силікатна руда з короткопризматичними кристалами, широко використовується в керамічній промисловості та виробництві вогнетривких матеріалів. Є однією з основних сировин для видобутку цирконію."
      }
    }
  }
  val 硫钴矿 = OreItem("item_linnaeite", "cfecf1", 3) {
    localization {
      zh_CN {
        localizedName = "硫钴矿"
        description = "一种重要的钴矿石,常带粉红色调,立方体或八面体晶形.是提炼钴的主要原料之一"
        details = "这玩意儿比钻石难啃\n——采矿队长R-42的日志"
      }
      en {
        localizedName = "Linnaeite"
        description =
          "An important cobalt ore, often with pinkish tones and cubic or octahedral crystal forms. One of the main raw materials for cobalt extraction."
        details = "This stuff is harder to chew than diamonds\n— Mining Captain R-42's log"
      }
      uk_UA {
        localizedName = "Ліннеїт"
        description =
          "Важлива кобальтова руда, часто з рожевим відтінком і кубічною або октаедричною кристалічною формою. Є однією з основних сировин для видобутку кобальту."
        details = "Цю штуку важче розгризти, ніж алмаз\n— Журнал капітана гірничої команди R-42"
      }
    }
  }
  val 铱锇矿 = OreItem("item_iridiumosm", "656565", 4) {
    localization {
      zh_CN {
        localizedName = "铱锇矿"
        description = "一种稀有的铱锇矿石,表面呈黯淡金属光泽,含有铱和锇,是提炼这两种金属的主要原料之一"
      }
      en {
        localizedName = "Iridium Osmium Ore"
        description =
          "A rare iridium-osmium ore with dull metallic luster, containing both iridium and osmium. It is one of the main raw materials for extracting these two metals."
      }
      uk_UA {
        localizedName = "Іридієво-осмієва руда"
        description =
          "Рідкісна іридієво-осмієва руда з тьмяним металевим блиском, що містить іридій та осмій. Є однією з основних сировин для видобутку цих двох металів."
      }
    }
  }
  val 铈硅石 = OreItem("item_cerite", "BFC8E2", 2) {
    localization {
      zh_CN {
        localizedName = "铈硅石"
        description = "一种稀土矿石,常呈黄褐色至红褐色.含有较高比例的铈元素,是提炼铈的主要原料之一"
      }
      en {
        localizedName = "Cerite"
        description =
          "A rare earth ore, commonly appearing yellowish-brown to reddish-brown. Contains a high proportion of cerium and is one of the main raw materials for cerium extraction."
      }
      uk_UA {
        localizedName = "Церит"
        description =
          "Рідкісноземельна руда, що зазвичай має жовтувато-коричневий або червоно-коричневий колір. Містить високий вміст церію та є однією з основних сировин для його видобутку."
      }
    }
  }
  val 铝土矿 = IceItem("item_alumina", "c0c0c0") {
    localization {
      zh_CN {
        localizedName = "铝土矿"
        description = "一种富含氧化铝的矿石，是提炼铝的主要原料"
      }
      en {
        localizedName = "Bauxite"
        description = "An ore rich in aluminum oxide, serving as the primary raw material for aluminum extraction."
      }
      uk_UA {
        localizedName = "Боксит"
        description = "Руда, багата на оксид алюмінію, що є основною сировиною для видобутку алюмінію."
      }
    }
  }
  val 铀原矿 = OreItem("item_uranium_rawore", "#95B564", 4) {
    explosiveness = 0f
    flammability = 0f
    radioactivity = 0.04f
    localization {
      zh_CN {
        localizedName = "铀原矿"
        description = "一种铀矿石,呈浅绿色沥青光泽,经处理离心后可分离出铀的两种常见同位素"
        details = "尽管是放射性元素的矿物,但在矿石中的铀密度还不足以产生致命的辐射...什么？你问我为什么手上的小盒子在哒哒响？"
      }
      en {
        localizedName = "Raw Uranium Ore"
        description =
          "A uranium ore with light green asphaltic luster that can be separated into two common uranium isotopes through centrifugal processing."
        details =
          "Although it's a radioactive mineral, the uranium density in the ore isn't sufficient to produce lethal radiation... What? You're asking why the little box in my hand is clicking?"
      }
      uk_UA {
        localizedName = "Необроблена уранова руда"
        description =
          "Уранова руда зі світло-зеленим смолистим блиском, з якої після обробки та центрифугування можна виділити два поширені ізотопи урану."
        details =
          "Хоча це мінерал радіоактивного елемента, концентрація урану в руді все ще недостатня для створення смертельно небезпечного випромінювання... Що? Ти питаєш, чому маленька коробочка в моїй руці клацає?"
      }
    }
  }
  val 黑晶石 = OreItem("item_black_crystone", "808080", 3) {
    explosiveness = 0f
    flammability = 0f
    radioactivity = 0f
    localization {
      zh_CN {
        localizedName = "黑晶石"
        description = "一种深色矿石,表面呈现玻璃至半金属光泽.内部富含多种金属化合物,经提炼后可分离出多种有用金属元素"
        details = "这个名字听起来实在是很像游戏里的魔法道具...你们地质学上给矿物起名都这么随意么？孔雀石？黑曜石？"
      }
      en {
        localizedName = "Black Crystone"
        description =
          "A dark ore with glassy to submetallic luster. Rich in various metal compounds internally, which can be separated into multiple useful metallic elements after refining."
        details =
          "This name really sounds like a magical item from a game... Do geologists really name minerals so casually? Malachite? Obsidian?"
      }
      uk_UA {
        localizedName = "Чорний кристоліт"
        description =
          "Темна руда зі скляним або напівметалевим блиском. Містить велику кількість різних сполук металів, які після очищення можна розділити на корисні металеві елементи."
        details =
          "Ця назва справді звучить як магічний предмет із гри... Геологи справді так невимушено називають мінерали? Малахіт? Обсидіан?"
      }
    }
  }

  val 低碳钢 = IceItem("item_lowCarbonSteel", "d4d7e4") {
    localization {
      zh_CN {
        localizedName = "低碳钢"
        description = "一种含碳量较低的钢质金属材料,具有优异的塑性和韧性,是建筑和机械制造的常用基础材料"
      }
      en {
        localizedName = "Low Carbon Steel"
        description =
          "A steel metal material with low carbon content, possessing excellent plasticity and toughness, commonly used as a basic material in construction and mechanical manufacturing."
      }
      uk_UA {
        localizedName = "Низьковуглецева сталь"
        description =
          "Сталева металева конструкційна речовина з низьким вмістом вуглецю, що має відмінну пластичність і міцність. Широко використовується як базовий матеріал у будівництві та машинобудуванні."
      }
    }
  }
  val 高碳钢 = IceItem("item_highCarbonSteel", "bedfee") {
    localization {
      zh_CN {
        localizedName = "高碳钢"
        description = "一种含碳量较高的钢质金属材料,硬度优于低碳钢,适合用于制造需要高强度的建筑和部件"
      }
      en {
        localizedName = "High Carbon Steel"
        description =
          "A steel metal material with high carbon content, harder than low carbon steel, suitable for manufacturing high-strength structures and components."
      }
      uk_UA {
        localizedName = "Високовуглецева сталь"
        description =
          "Сталева металева речовина з високим вмістом вуглецю, що має вищу твердість порівняно з низьковуглецевою сталлю. Підходить для виготовлення високоміцних конструкцій і деталей."
      }
    }
  }
  val 铜锭 = IceItem("item_copperIngot", "d99d73") {
    localization {
      zh_CN {
        localizedName = "铜锭"
        description = "一种以优异导电性和导热性著称的金属材料,质地柔软且延展性良好.是电力设备和热交换系统的重要材料"
      }
      en {
        localizedName = "Copper Ingot"
        description =
          "A metal material renowned for its excellent electrical and thermal conductivity, with a soft texture and good ductility. An important material for electrical equipment and heat exchange systems."
      }
      uk_UA {
        localizedName = "Мідний злиток"
        description =
          "Металевий матеріал, відомий своєю чудовою електропровідністю та теплопровідністю, м'який і добре піддається деформації. Важливий матеріал для електричного обладнання та теплообмінних систем."
      }
    }
  }
  val 铅锭 = IceItem("item_leadIngot", "8c7fa9") {
    localization {
      zh_CN {
        localizedName = "铅锭"
        description = "一种高密度金属材料,具有出色的辐射防护能力,既可用于防护设施,也可作为重型武器的材料"
        details = "从挡住辐射到砸穿装甲,这份量从来不会让人失望"
      }
      en {
        localizedName = "Lead Ingot"
        description =
          "A high-density metal material with excellent radiation shielding capabilities, usable both for protective facilities and as material for heavy weapons."
        details = "From blocking radiation to crushing armor, this weight never disappoints."
      }
      uk_UA {
        localizedName = "Свинцевий злиток"
        description =
          "Високощільний металевий матеріал із чудовими властивостями захисту від радіації. Використовується як у захисних конструкціях, так і як матеріал для важких виробів."
        details = "Від блокування радіації до пробивання броні — ця вага ніколи не розчаровує."
      }
    }
  }
  val 锌锭 = IceItem("item_zincIngot", "578c80") {
    localization {
      zh_CN {
        localizedName = "锌锭"
        description = "一种兼具牺牲阳极保护与加热超塑性的金属材料.既可作为装甲镀层大幅延长载具寿命,又能制成高能锌空气电池为单位护盾供电"
        details = "防锈?试试用锌箔包裹EMP炸弹:)"
      }
      en {
        localizedName = "Zinc Ingot"
        description =
          "A metal material combining sacrificial anode protection and superplasticity when heated. Can be used as armor plating to significantly extend vehicle lifespan, or made into high-energy zinc-air batteries to power unit shields."
        details = "Rust prevention? Try wrapping EMP bombs in zinc foil :)"
      }
      uk_UA {
        localizedName = "Цинковий злиток"
        description =
          "Металевий матеріал, що поєднує захист за принципом жертовного анода та надпластичність при нагріванні. Може використовуватися як броньове покриття для значного подовження терміну служби техніки або для виготовлення високоенергетичних цинк-повітряних батарей, що живлять щити підрозділів."
        details = "Захист від іржі? Спробуйте обгорнути ЕМІ-бомби цинковою фольгою :)"
      }
    }
  }
  val 黄铜锭 = IceItem("item_brassIngot", "eac73e") {
    localization {
      zh_CN {
        localizedName = "黄铜锭"
        description = "一种铜合金,有较高的强度和耐腐蚀性,用于制造各种结构零和连接件"
      }
      en {
        localizedName = "Brass Ingot"
        description =
          "A copper alloy with high strength and corrosion resistance, used for manufacturing various structural components and connectors."
      }
      uk_UA {
        localizedName = "Латунний злиток"
        description =
          "Мідний сплав із високою міцністю та стійкістю до корозії, що використовується для виготовлення різноманітних конструкційних деталей і з'єднувальних елементів."
      }
    }
  }
  val 铬锭 = IceItem("item_chromeIngot", "C8C8E4") {
    localization {
      zh_CN {
        localizedName = "铬锭"
        description = "一种轻质高硬度的金属材料,具有优异的耐腐蚀性,用于制造高强度建筑和防护装备"
      }
      en {
        localizedName = "Chromium Ingot"
        description =
          "A lightweight, high-hardness metal material with excellent corrosion resistance, used for manufacturing high-strength structures and protective equipment."
      }
      uk_UA {
        localizedName = "Хромовий злиток"
        description =
          "Легкий металевий матеріал із високою твердістю та чудовою стійкістю до корозії. Використовується для виготовлення високоміцних конструкцій і захисного обладнання."
      }
    }
  }
  val 金锭 = IceItem("item_goldIngot", "f8df87") {
    localization {
      zh_CN {
        localizedName = "金锭"
        description = "一种贵重金属材料,具有优异的导电性.多用于制作电子部件与能量传导部件"
      }
      en {
        localizedName = "Gold Ingot"
        description =
          "A precious metal material with excellent electrical conductivity. Widely used for manufacturing electronic components and energy conduction parts."
      }
      uk_UA {
        localizedName = "Золотий злиток"
        description =
          "Цінний металевий матеріал із чудовою електропровідністю. Широко використовується для виготовлення електронних компонентів та елементів передачі енергії."
      }
    }
  }
  val 铝锭 = IceItem("item_aluminium", "#C0ECFF") {
    cost = 0.9f
    localization {
      zh_CN {
        localizedName = "铝锭"
        description = "一种耐低温的常见金属材料,质地轻盈,经处理后强度显著提升.是航空航天领域广泛使用的结构材料"
        details = "在大多数小质量的行星上,铝的丰富度通常都是在金属元素中排序最靠前的"
      }
      en {
        localizedName = "Aluminium Ingot"
        description =
          "A common low-temperature-resistant metal material with a lightweight structure and significantly improved strength after processing. Widely used as a structural material in aerospace applications."
        details =
          "On most low-mass planets, aluminium abundance typically ranks among the highest of metallic elements."
      }
      uk_UA {
        localizedName = "Алюмінієвий злиток"
        description =
          "Поширений металевий матеріал, стійкий до низьких температур, із малою масою та значно підвищеною міцністю після обробки. Широко використовується як конструкційний матеріал в аерокосмічній галузі."
        details =
          "На більшості маломасивних планет вміст алюмінію зазвичай належить до найвищих серед металевих елементів."
      }
    }
  }
  val 钴锭 = IceItem("item_cobaltIngot", "b3f1ff") {
    localization {
      zh_CN {
        localizedName = "钴锭"
        description = "一种具备良好耐高温与耐腐蚀特性的金属材料,广泛用于建筑结构及精密测量仪器的制造"
      }
      en {
        localizedName = "Cobalt Ingot"
        description =
          "A metal material with excellent high-temperature resistance and corrosion resistance, widely used in the manufacture of structural components and precision measuring instruments."
      }
      uk_UA {
        localizedName = "Кобальтовий злиток"
        description =
          "Металевий матеріал із високою стійкістю до високих температур і корозії, широко використовується для виготовлення конструкційних елементів та високоточних вимірювальних приладів."
      }
    }
  }
  val 铪锭 = IceItem("item_hafniIngot", "f7e5f3") {
    localization {
      zh_CN {
        localizedName = "铪锭"
        description = "一种稀有的高熔点金属材料,在能量传导和高温环境中表现出色,是高级能量设备的关键材料"
      }
      en {
        localizedName = "Hafnium Ingot"
        description =
          "A rare high-melting-point metal material that excels in energy conduction and high-temperature environments, serving as a key material for advanced energy equipment."
      }
      uk_UA {
        localizedName = "Гафнієвий злиток"
        description =
          "Рідкісний металевий матеріал із високою температурою плавлення, що демонструє чудові властивості в передачі енергії та високотемпературних середовищах. Є ключовим матеріалом для передового енергетичного обладнання."
      }
    }
  }
  val 铈锭 = IceItem("item_ceriumIngot", "BFC8E2") {
    explosiveness = 0.25f
    flammability = 1.2f
    radioactivity = 0.6f
    healthScaling = 0.6f
    localization {
      zh_CN {
        localizedName = "铈锭"
        description = "一种广泛应用的金属材料,用于研磨抛光剂,特种玻璃及推进器零件等"
      }
      en {
        localizedName = "Cerium Ingot"
        description =
          "A widely used metal material employed in grinding and polishing agents, specialty glass, and thruster components."
      }
      uk_UA {
        localizedName = "Церієвий злиток"
        description =
          "Широко використовуваний металевий матеріал, що застосовується у шліфувальних і полірувальних засобах, спеціальному склі та деталях двигунів."
      }
    }
  }
  val 钍锭 = IceItem("item_thoriumIngot", "f9a3c7") {
    radioactivity = 1f
    localization {
      zh_CN {
        localizedName = "钍锭"
        description = "一种放射性金属材料,具有高能量密度,常用于核反应堆和核武器"
      }
      en {
        localizedName = "Thorium Ingot"
        description =
          "A radioactive metal material with high energy density, commonly used in nuclear reactors and nuclear weapons."
      }
      uk_UA {
        localizedName = "Торієвий злиток"
        description =
          "Радіоактивний металевий матеріал із високою енергетичною щільністю, що зазвичай використовується в ядерних реакторах і ядерній промисловості."
      }
    }
  }
  val 铱锭 = IceItem("item_iridium", "#E4EFEF") {
    cost = 2.5f
    localization {
      zh_CN {
        localizedName = "铱锭"
        description = "一种强度极高的稀有金属材料,其复合物具备核能的半导体特性(类似硅在电子工业中的半导体特性),是精密核电路制造的核心材料"
      }
      en {
        localizedName = "Iridium Ingot"
        description =
          "An extremely strong rare metal material whose compounds possess nuclear semiconductor properties (similar to silicon's semiconductor properties in the electronics industry), serving as the core material for precision nuclear circuit manufacturing."
      }
      uk_UA {
        localizedName = "Іридієвий злиток"
        description =
          "Надзвичайно міцний рідкісний металевий матеріал, сполуки якого мають властивості ядерних напівпровідників (подібно до напівпровідникових властивостей кремнію в електронній промисловості). Є ключовим матеріалом для виробництва високоточних ядерних схем."
      }
    }
  }
  val 钴钢 = IceItem("item_cobaltSteel", "c5d1e0") {
    localization {
      zh_CN {
        localizedName = "钴钢"
        description = "一种钴合金,具备优异的耐高温与耐腐蚀性能,质地坚硬且结构稳定.常用于高强度建筑结构及防护装备的制造"
      }
      en {
        localizedName = "Cobalt Steel"
        description =
          "A cobalt alloy with excellent high-temperature resistance and corrosion resistance, hard in texture and structurally stable. Commonly used in manufacturing high-strength structural components and protective equipment."
      }
      uk_UA {
        localizedName = "Кобальтова сталь"
        description =
          "Кобальтовий сплав із чудовою стійкістю до високих температур і корозії, твердою структурою та високою стабільністю. Широко використовується для виготовлення високоміцних конструкційних елементів і захисного обладнання."
      }
    }
  }

  val 硫化合物 = IceItem("item_sulfurCompound", "ffaa5f") {
    flammability = 1.4f
    explosiveness = 0.4f
    localization {
      zh_CN {
        localizedName = "硫化合物"
        description =
          "硫素与金属化合而成的晶体常态下相对平和,但其受热分解后伴随发生剧烈化学反应,足以融毁多数材料.能够迸发出大量热能的可控燃素显然重要,因而硫化物得以被视作为一种重要材料,为工业或武器的方方面面所利用"
      }
      en {
        localizedName = "Sulfur Compound"
        description =
          "A crystalline compound formed by sulfur and metals that remains relatively stable under normal conditions, but undergoes violent chemical reactions when heated and decomposed, capable of melting most materials. As a controllable source of phlogiston capable of releasing vast amounts of thermal energy, sulfides are considered an important material and are utilized across various industrial and weapon applications."
      }
      uk_UA {
        localizedName = "Сполука сірки"
        description =
          "Кристалічна сполука сірки з металами, яка за звичайних умов залишається відносно стабільною, але під час нагрівання та розкладання супроводжується бурхливими хімічними реакціями, здатними розплавити більшість матеріалів. Як контрольоване джерело флогістону, що вивільняє величезну кількість теплової енергії, сульфіди вважаються важливим матеріалом і широко використовуються в промисловості та озброєнні."
      }
    }
  }
  val 爆炸化合物 = IceItem("item_explosiveCompound", "ff795e") {
    flammability = 0.4f
    explosiveness = 1.2f
    localization {
      zh_CN {
        localizedName = "爆炸化合物"
        description = "一种极端不稳定的化合物,为满足冲击武器需求而诞生的高能材料,爆炸威力极强,应避免长途运输与存储"
      }
      en {
        localizedName = "Explosive Compound"
        description =
          "An extremely unstable compound, a high-energy material developed to meet the demands of impact weapons. Its explosive power is exceptionally strong, and long-distance transportation and storage should be avoided."
      }
      uk_UA {
        localizedName = "Вибухова сполука"
        description =
          "Надзвичайно нестабільна сполука, високoенергетичний матеріал, створений для задоволення потреб ударного озброєння. Має надзвичайно високу вибухову потужність, тому слід уникати тривалого транспортування та зберігання."
      }
    }
  }
  val 低温化合物 = IceItem("item_lowTemperatureCompound", "C0ECFF") {
    charge = 0.1f
    localization {
      zh_CN {
        localizedName = "低温化合物"
        description = "一种在极端低温环境中凝结而成的化合物,具备优异的导热性能,常用于制造高效率的冷却系统"
      }
      en {
        localizedName = "Low-Temperature Compound"
        description =
          "A compound condensed in extremely low-temperature environments, featuring excellent thermal conductivity, commonly used for manufacturing high-efficiency cooling systems."
      }
      uk_UA {
        localizedName = "Низькотемпературна сполука"
        description =
          "Сполука, що утворюється шляхом конденсації в умовах надзвичайно низьких температур. Має чудову теплопровідність і широко використовується для створення високоефективних систем охолодження."
      }
    }
  }
  val 铈凝块 = IceItem("item_ceriumClot", "929DB5") {
    explosiveness = 1.5f
    flammability = 3.6f
    localization {
      zh_CN {
        localizedName = "铈凝块"
        description = "对碰撞和温度极为敏感的金属凝块,暴露于空气中极易自燃,需严格密封保存"
      }
      en {
        localizedName = "Cerium Clot"
        description =
          "A metal clot extremely sensitive to impact and temperature, highly prone to spontaneous combustion when exposed to air, requiring strict sealed storage."
      }
      uk_UA {
        localizedName = "Церієвий згусток"
        description =
          "Металевий згусток, надзвичайно чутливий до ударів і температури. При контакті з повітрям легко самозаймається, тому потребує суворого герметичного зберігання."
      }
    }
  }
  val 铱板 = IceItem("item_iridiumPlate", "656565") {
    localization {
      zh_CN {
        localizedName = "铱板"
        description = "已经完成了压铸工序的铱合金,具备极强的抗冲击性能,是一种优秀的各向异性介质,适用于精密核电路及高性能防护结构的制造"
      }
      en {
        localizedName = "Iridium Plate"
        description =
          "An iridium alloy that has undergone the die-casting process, possessing extremely high impact resistance. An excellent anisotropic material suitable for manufacturing precision nuclear circuits and high-performance protective structures."
      }
      uk_UA {
        localizedName = "Іридієва пластина"
        description =
          "Іридієвий сплав після завершення процесу лиття під тиском, що має надзвичайно високу ударостійкість. Є чудовим анізотропним матеріалом, придатним для виготовлення високоточних ядерних схем і високоефективних захисних конструкцій."
      }
    }
  }

  val 石英玻璃 = IceItem("item_quartzGlass", "ebeef5") {
    localization {
      zh_CN {
        localizedName = "石英玻璃"
        description = "由高纯度石英熔制而成的玻璃,具备优异的耐高温性能和极低的热膨胀系数,能够有效抵御大部分化学反应侵蚀,是理想的反应容器"
      }
      en {
        localizedName = "Quartz Glass"
        description =
          "Glass made from high-purity fused quartz, featuring excellent high-temperature resistance and an extremely low thermal expansion coefficient. Effectively resists erosion from most chemical reactions, making it an ideal material for reaction vessels."
      }
      uk_UA {
        localizedName = "Кварцове скло"
        description =
          "Скло, виготовлене з високочистого плавленого кварцу, що має чудову стійкість до високих температур і надзвичайно низький коефіцієнт теплового розширення. Ефективно протистоїть впливу більшості хімічних реакцій, що робить його ідеальним матеріалом для реакційних посудин."
      }
    }
  }
  val 复合陶瓷 = IceItem("item_compositeCeramic", "ebeef5") {
    localization {
      zh_CN {
        localizedName = "复合陶瓷"
        description = "一种凭借超凡抗冲击性与热稳定性著称的复合材料.既可作为能量护盾发生器的核心基底材料,又能制成高速单位所需的耐热防护瓦"
      }
      en {
        localizedName = "Composite Ceramic"
        description =
          "A composite material renowned for its exceptional impact resistance and thermal stability. Can serve as the core substrate material for energy shield generators or be fabricated into heat-resistant protective tiles required by high-speed units."
      }
      uk_UA {
        localizedName = "Композитна кераміка"
        description =
          "Композитний матеріал, відомий надзвичайною ударостійкістю та термічною стабільністю. Може використовуватися як основний матеріал для підкладки генераторів енергетичних щитів або виготовлення жаростійкої захисної плитки для високошвидкісних підрозділів."
      }
    }
  }
  val 陶钢 = IceItem("item_potterySteel", "D6DEC6") {
    localization {
      zh_CN {
        localizedName = "陶钢"
        description = "复合装甲材料,能够快速且均匀地将电磁粒子辐射分散传导至装甲各处,从而大幅降低高强度动能冲击造成的局部破坏"
      }
      en {
        localizedName = "Ceramic Steel"
        description =
          "A composite armor material capable of rapidly and evenly dispersing electromagnetic particle radiation throughout the armor, significantly reducing localized damage caused by high-intensity kinetic impacts."
      }
      uk_UA {
        localizedName = "Керамічна сталь"
        description =
          "Композитний броньовий матеріал, здатний швидко й рівномірно розподіляти та передавати електромагнітне частинкове випромінювання по всій поверхні броні, значно зменшуючи локальні пошкодження від потужних кінетичних ударів."
      }
    }
  }
  val 石墨烯 = IceItem("item_graphene", "52578a") {
    localization {
      zh_CN {
        localizedName = "石墨烯"
        description = "超薄的单层碳原子材料,具有出色的导电性和机械强度,是高级电子设备的核心材料"
      }
      en {
        localizedName = "Graphene"
        description =
          "An ultra-thin single-layer carbon material with exceptional electrical conductivity and mechanical strength, serving as a core material for advanced electronic devices."
      }
      uk_UA {
        localizedName = "Графен"
        description =
          "Надтонкий одношаровий вуглецевий матеріал із чудовою електропровідністю та механічною міцністю. Є ключовим матеріалом для передових електронних пристроїв."
      }
    }
  }
  val 单晶硅 = IceItem("item_monocrystallineSilicon", "b0bac0") {
    localization {
      zh_CN {
        localizedName = "单晶硅"
        description = "一种高纯度的硅晶体,是制造高级电子设备和处理器的基础材料"
      }
      en {
        localizedName = "Monocrystalline Silicon"
        description =
          "A high-purity silicon crystal that serves as the foundational material for manufacturing advanced electronic devices and processors."
      }
      uk_UA {
        localizedName = "Монокристалічний кремній"
        description =
          "Високочистий кристал кремнію, що є основним матеріалом для виробництва передових електронних пристроїв і процесорів."
      }
    }
  }
  val 导能回路 = IceItem("item_conductingCircuit", "867F8C") {
    localization {
      zh_CN {
        localizedName = "导能回路"
        description = "将高纯度单晶硅回路蚀刻于放射性能级降低的钍基座中制成的能量传导组件,拥有极强的导能性与稳固性"
      }
      en {
        localizedName = "Conductive Circuit"
        description =
          "An energy conduction component made by etching high-purity monocrystalline silicon circuits onto thorium substrates with reduced radioactivity, possessing exceptional energy conductivity and stability."
      }
      uk_UA {
        localizedName = "Енергопровідний контур"
        description =
          "Компонент передачі енергії, виготовлений шляхом травлення високочистих монокристалічних кремнієвих схем на торієвій основі зі зниженим рівнем радіоактивності. Має надзвичайно високу провідність енергії та стабільність."
      }
    }
    charge = 0.8f
  }
  val 绿藻块 = IceItem("item_chlorella_block", "#6CB855") {
    explosiveness = 0.1f
    flammability = 1.2f
    localization {
      zh_CN {
        localizedName = "绿藻块"
        description = "一种经分离杂质后整合而成的绿藻细胞生物材料,可用于提取更有价值的绿藻素"
      }
      en {
        localizedName = "Chlorella Block"
        description =
          "A biological material composed of integrated chlorella cells after impurity separation, usable for extracting more valuable chlorella compounds."
      }
      uk_UA {
        localizedName = "Блок хлорели"
        description =
          "Біологічний матеріал, сформований з інтегрованих клітин хлорели після видалення домішок. Може використовуватися для видобування більш цінних речовин із хлорели."
      }
    }
  }
  val 绿藻素 = IceItem("item_chlorella", "#7BD261") {
    explosiveness = 1.2f
    flammability = 1.6f
    localization {
      zh_CN {
        localizedName = "绿藻素"
        description = "从绿藻细胞中分离出的生物活性成分,是绿藻进行光合作用的核心物质.用于将光合作用机制应用于工业生产"
      }
      en {
        localizedName = "Chlorella Essence"
        description =
          "A bioactive compound extracted from chlorella cells, serving as the core substance responsible for chlorella's photosynthesis. Used to apply photosynthetic mechanisms in industrial production."
      }
      uk_UA {
        localizedName = "Есенція хлорели"
        description =
          "Біологічно активний компонент, виділений із клітин хлорели, що є основною речовиною, яка забезпечує фотосинтез хлорели. Використовується для впровадження механізмів фотосинтезу в промислове виробництво."
      }
    }
  }
  val 碱石 = IceItem("item_alkali_stone", "#B0BAC0") {
    localization {
      zh_CN {
        localizedName = "碱石"
        description = "一种以碱石灰为主要成分的矿石,内部富含多种含氯金属盐类.用于电离处理分离出碱液与氯气"
        details =
          "通常来说,河流会携带附着在河床上的盐类物质,并汇入海洋或者湖泊,长久的积累使得水体中的盐浓度不断升高,进而形成高含盐量的海洋和咸水湖,绝大多数表面具有活跃水圈的星球都是符合这样的规律"
      }
      en {
        localizedName = "Alkali Stone"
        description =
          "An ore primarily composed of alkaline minerals, rich in various chlorine-containing metal salts. Used in electrolytic processing to separate alkaline solutions and chlorine gas."
        details =
          "Generally speaking, rivers carry salt compounds attached to riverbeds and transport them into oceans or lakes. Over long periods of accumulation, salt concentrations in water bodies continuously increase, eventually forming high-salinity oceans and salt lakes. Most planets with active hydrospheres follow this pattern."
      }
      uk_UA {
        localizedName = "Лужний камінь"
        description =
          "Руда, основним компонентом якої є лужне вапно, багата на різноманітні хлорвмісні солі металів. Використовується для електролітичної обробки з метою отримання лужного розчину та хлору."
        details =
          "Зазвичай річки переносять солі, що накопичуються на річковому дні, та несуть їх до океанів або озер. Тривале накопичення поступово підвищує концентрацію солей у водоймах, утворюючи моря з високою солоністю та солоні озера. Більшість планет з активною гідросферою дотримуються подібного процесу."
      }
    }
  }
  val 絮凝剂 = IceItem("item_flocculant", "ffffff") {
    localization {
      zh_CN {
        localizedName = "絮凝剂"
        description = "投入水中可形成大量多孔絮状胶质的化工材料,用于吸附或者分离固形物质,是重要的化工材料"
        details = "注意防潮\n请于阴凉环境储存,避免阳光直射\n保质期：六个月\n若不慎误食,请立即就医并向医师提供此说明书"
      }
      en {
        localizedName = "Flocculant"
        description =
          "A chemical material that forms large amounts of porous flocculent gel when added to water, used for adsorbing or separating solid substances. An important industrial chemical material."
        details =
          "Keep dry\nStore in a cool environment and avoid direct sunlight\nShelf life: six months\nIf accidentally ingested, seek medical attention immediately and provide this instruction sheet to the physician."
      }
      uk_UA {
        localizedName = "Флокулянт"
        description =
          "Хімічний матеріал, який при додаванні у воду утворює велику кількість пористого пластівчастого гелю. Використовується для адсорбції або відділення твердих речовин і є важливим промисловим хімічним матеріалом."
        details =
          "Берегти від вологи\nЗберігати в прохолодному місці, уникати прямих сонячних променів\nТермін придатності: шість місяців\nУ разі випадкового проковтування негайно звернутися за медичною допомогою та надати лікарю цю інструкцію."
      }
    }
  }

  val 核废料 = IceItem("item_nuclear_waste", "#AAB3AE") {
    hardness = 1
    radioactivity = 0.25f
    localization {
      zh_CN {
        localizedName = "核废料"
        description = "核反应后残留的放射性物质,仍具有较强的辐射性.虽已无太大核能利用价值,但仍能作为提炼铱元素的非常规来源"
      }
      en {
        localizedName = "Nuclear Waste"
        description =
          "Radioactive material remaining after nuclear reactions, still possessing strong radiation. Although it has limited value for nuclear energy applications, it can serve as an unconventional source for iridium extraction."
      }
      uk_UA {
        localizedName = "Ядерні відходи"
        description =
          "Радіоактивні матеріали, що залишаються після ядерних реакцій і все ще мають сильне випромінювання. Хоча вони вже не мають значної цінності для використання ядерної енергії, можуть слугувати нетрадиційним джерелом для видобування іридію."
      }
    }
  }
  val 岩层沥青 = IceItem("item_rock_bitumen", "#808A73") {
    localization {
      zh_CN {
        localizedName = "岩层沥青"
        description = "一种从地壳深层钻取的沥青状矿石,质地粘稠,内含有多种重矿物成分"
        details =
          "矿石碎屑在某些条件下会自发的富集并成块,大部分都会形成矿层,但许多未成型的矿屑被粘度很高的胶体裹挟时会在深层底层中形成沥青状的矿石胶结物,成分复杂"
      }
      en {
        localizedName = "Rock Bitumen"
        description =
          "An asphalt-like ore extracted from deep within the Earth's crust, with a viscous texture containing various heavy mineral components."
        details =
          "Under certain conditions, ore fragments can spontaneously accumulate and form solid masses. Most develop into ore deposits, but many unformed fragments trapped within highly viscous colloids can form asphalt-like mineral concretions in deep geological layers, resulting in complex compositions."
      }
      uk_UA {
        localizedName = "Гірський бітум"
        description =
          "Асфальтоподібна руда, що видобувається з глибоких шарів земної кори. Має в'язку структуру та містить різноманітні важкі мінеральні компоненти."
        details =
          "За певних умов уламки руди можуть самостійно накопичуватися та утворювати масиви. Більшість із них формує рудні пласти, але багато несформованих мінеральних уламків, захоплених високов'язкими колоїдами, утворюють асфальтоподібні рудні конкреції у глибоких шарах, що мають складний склад."
      }
    }
  }
  val 铀原料 = IceItem("item_uranium_rawmaterial", "#B5D980") {
    radioactivity = 0.1f
    localization {
      zh_CN {
        localizedName = "铀原料"
        description = "铀矿石的化学冶炼中间物,经过增热离心可以制造燃料级的铀235和高纯度的铀238"
      }
      en {
        localizedName = "Uranium Raw Material"
        description =
          "An intermediate product from the chemical processing of uranium ore, which can be used to produce fuel-grade uranium-235 and high-purity uranium-238 through thermal centrifugation."
      }
      uk_UA {
        localizedName = "Уранова сировина"
        description =
          "Проміжний продукт хімічної переробки уранової руди, який за допомогою термічного центрифугування може бути використаний для отримання урану-235 паливного класу та високочистого урану-238."
      }
    }
  }
  val 铱金混合物 = IceItem("item_iridium_mixed_rawmaterial", "#AECBCB") {
    localization {
      zh_CN {
        localizedName = "铱金混合物"
        description = "一种含有铱金属氧化物固体化合物,经过加工提纯可以获得冶炼铱的进一步中间物"
        details =
          "在足够高压的核裂变反应中,原子核的衰变和四处弹射的中子总是能带来一些令人意想不到的东西,它们会残留在核废料里,等待着变成更有用的东西"
      }
      en {
        localizedName = "Iridium Compound Mixture"
        description =
          "A solid compound containing iridium metal oxides, which can be further processed and purified to obtain intermediate materials for iridium smelting."
        details =
          "In sufficiently high-pressure nuclear fission reactions, nuclear decay and scattered neutrons can always produce unexpected elements. These substances remain in nuclear waste, waiting to be transformed into something more useful."
      }
      uk_UA {
        localizedName = "Іридієва суміш"
        description =
          "Тверда сполука, що містить оксиди іридію. Після подальшої обробки та очищення може бути перетворена на проміжний матеріал для виплавки іридію."
        details =
          "У ядерних реакціях поділу за достатньо високого тиску розпад атомних ядер і нейтрони, що розлітаються в усі боки, завжди можуть створювати несподівані елементи. Вони залишаються в ядерних відходах, очікуючи перетворення на більш корисні речовини."
      }
    }
  }
  val 氯铱酸盐 = IceItem("item_iridium_chloride", "#CBE0E0") {
    localization {
      zh_CN {
        localizedName = "氯铱酸盐"
        description = "一种高纯度含铱化合物,经过煅烧脱氯后可以得到产品铱"
        details = "几乎所有行星上都有铱,但它们几乎都下沉到了行星的核部,只有少量与铂族金属聚合伴生为矿物构成,可利用量极少"
      }
      en {
        localizedName = "Iridium Chloride Salt"
        description =
          "A high-purity iridium-containing compound that yields pure iridium after calcination and dechlorination."
        details =
          "Iridium exists on almost all planets, but most of it has sunk into planetary cores. Only small amounts remain associated with platinum group metals as mineral deposits, making it extremely scarce and difficult to extract."
      }
      uk_UA {
        localizedName = "Хлорид іридію"
        description =
          "Високочиста іридійвмісна сполука, з якої після прожарювання та видалення хлору можна отримати чистий іридій."
        details =
          "Іридій присутній майже на всіх планетах, але більша його частина опустилася до планетарних ядер. Лише невеликі кількості утворюють мінеральні поклади разом із металами платинової групи, тому доступні запаси надзвичайно малі."
      }
    }
  }

  val 强化合金 = IceItem("item_strengthening_alloy", "#B1B1B0") {
    localization {
      zh_CN {
        localizedName = "强化合金"
        description = "一种各项性能均衡优异的合金,具备极高的结构强度与抗性,广泛应用于各类领域"
      }
      en {
        localizedName = "Reinforced Alloy"
        description =
          "An alloy with excellently balanced properties, possessing extremely high structural strength and resistance, widely applied across various fields."
      }
      uk_UA {
        localizedName = "Посилений сплав"
        description =
          "Сплав із чудово збалансованими властивостями, що має надзвичайно високу конструкційну міцність і стійкість. Широко застосовується в різних галузях."
      }
    }
  }
  val 电子元件 = IceItem("item_integratedCircuit", "53565c") {
    localization {
      zh_CN {
        localizedName = "电子元件"
        description = "精密的电子器件,是制造高级设备和处理器的基础材料"
      }
      en {
        localizedName = "Electronic Component"
        description =
          "Precision electronic components that serve as fundamental materials for manufacturing advanced equipment and processors."
      }
      uk_UA {
        localizedName = "Електронний компонент"
        description =
          "Високоточні електронні пристрої, що є основними матеріалами для виробництва передового обладнання та процесорів."
      }
    }
  }
  val 气凝胶 = IceItem("item_aerogel", "#D5EBEE") {
    localization {
      zh_CN {
        localizedName = "气凝胶"
        description = "硅基结构的超轻材料.内部由大量细微蜂窝状孔洞填充,具备强度高,密度极小,绝缘绝热等优异特性,广泛应用于各领域"
      }
      en {
        localizedName = "Aerogel"
        description =
          "An ultra-lightweight silicon-based material filled with numerous microscopic honeycomb-like pores, featuring high strength, extremely low density, and excellent insulation and thermal insulation properties, widely used across various fields."
      }
      uk_UA {
        localizedName = "Аерогель"
        description =
          "Надлегкий матеріал на основі кремнієвої структури, заповнений великою кількістю мікроскопічних пор у формі бджолиних сот. Має високу міцність, надзвичайно низьку щільність, чудові теплоізоляційні та електроізоляційні властивості, широко застосовується в різних галузях."
      }
    }
  }

  val 铀238 = IceItem("item_uranium_238", "#7CA73D") {
    radioactivity = 0.4f
    localization {
      zh_CN {
        localizedName = "铀-238"
        description = "俗称贫铀的放射性同位素,硬度较高且结构致密.可用作中子反射板及动能穿甲弹头,亦可吸收中子后衰变为更有用的钚-239"
        details =
          "无论在哪一个星球上,自然状态下的铀238总是占据铀的绝大部分的丰富度,所幸它可以转变为更有用的东西,如果全部都用来造穿甲弹和防弹装甲之类的话,保有量可能可以用到下个地质纪..."
      }
      en {
        localizedName = "Uranium-238"
        description =
          "A radioactive isotope commonly known as depleted uranium, with high hardness and a dense structure. Can be used for neutron reflector plates and kinetic penetrator warheads, or absorb neutrons and decay into the more useful plutonium-239."
        details =
          "On any planet, naturally occurring uranium-238 always makes up the vast majority of uranium abundance. Fortunately, it can be transformed into more useful materials. If all of it were used for armor-piercing projectiles and protective armor, the reserves could potentially last until the next geological epoch..."
      }
      uk_UA {
        localizedName = "Уран-238"
        description =
          "Радіоактивний ізотоп, відомий як збіднений уран, що має високу твердість і щільну структуру. Може використовуватися як матеріал для відбивачів нейтронів і кінетичних бронебійних сердечників, а також поглинати нейтрони з подальшим перетворенням на більш корисний плутоній-239."
        details =
          "На будь-якій планеті природний уран-238 завжди становить переважну більшість запасів урану. На щастя, його можна перетворити на корисніші матеріали. Якби весь цей ресурс використовувався лише для виготовлення бронебійних снарядів і захисної броні, його запасів могло б вистачити до наступної геологічної епохи..."
      }
    }
  }
  val 铀235 = IceItem("item_uranium_235", "#B5D980") {
    hardness = 2
    radioactivity = 1.6f
    localization {
      zh_CN {
        localizedName = "铀-235"
        description = "一种主要的裂变核燃料,同时也是天然的中子放射源"
      }
      en {
        localizedName = "Uranium-235"
        description =
          "A primary fissile nuclear fuel and a natural source of neutron radiation."
      }
      uk_UA {
        localizedName = "Уран-235"
        description =
          "Основне ядерне паливо, що здатне підтримувати реакцію поділу, а також природне джерело нейтронного випромінювання."
      }
    }
  }
  val 钚239 = IceItem("item_plutonium_239", "#D1D19F") {
    radioactivity = 1.6f
    localization {
      zh_CN {
        localizedName = "钚-239"
        description = "由铀-238吸收中子后衰变而成的强放射性同位素,与铀-235同为常用的裂变核燃料"
        details = "尽管铀238可以转换为钚239,但也许你需要一个不小规模的反应堆阵列才能实现量产钚239了"
      }
      en {
        localizedName = "Plutonium-239"
        description =
          "A highly radioactive isotope formed when uranium-238 absorbs neutrons and subsequently decays. It is commonly used as fissile nuclear fuel alongside uranium-235."
        details =
          "Although uranium-238 can be converted into plutonium-239, achieving large-scale production may require a substantial reactor array."
      }
      uk_UA {
        localizedName = "Плутоній-239"
        description =
          "Високорадіоактивний ізотоп, що утворюється після поглинання нейтронів ураном-238 і подальшого розпаду. Разом з ураном-235 є одним із найпоширеніших видів палива для ядерного поділу."
        details =
          "Хоча уран-238 можна перетворити на плутоній-239, для його промислового виробництва, ймовірно, знадобиться велика система реакторів."
      }
    }
  }
  val 相位封装氢单元 = IceItem("item_encapsulated_hydrogen_cell", "#9EFFC6") {
    hardness = 2
    explosiveness = 2.4f
    flammability = 1.8f
    localization {
      zh_CN {
        localizedName = "相位封装氢单元"
        description = "由相位材料包裹的氢中子靶丸,可在核反应堆中接收中子并转化为核燃料"
        details =
          "相位物的中子光路学结构会将中子聚焦到中心存储氢的空腔,以最大化中央接收到的中子流,在中子流的轰击下,大量氢原子会转化为较为容易发生核聚变反应的同位素,继而参与核聚变"
      }
      en {
        localizedName = "Phase-Encapsulated Hydrogen Cell"
        description =
          "A hydrogen neutron target pellet encapsulated by phase material, capable of receiving neutrons in nuclear reactors and converting them into nuclear fuel."
        details =
          "The neutron-optical structure of phase material focuses neutrons into the central hydrogen storage cavity, maximizing the neutron flux received at the core. Under neutron bombardment, large numbers of hydrogen atoms are converted into isotopes more suitable for fusion reactions, allowing them to subsequently participate in nuclear fusion."
      }
      uk_UA {
        localizedName = "Фазово-інкапсульована воднева комірка"
        description =
          "Воднева нейтронна мішень, оточена фазовим матеріалом, здатна приймати нейтрони в ядерному реакторі та перетворюватися на ядерне паливо."
        details =
          "Нейтронно-оптична структура фазового матеріалу фокусує нейтрони до центральної порожнини зберігання водню, максимізуючи потік нейтронів у центрі. Під дією нейтронного опромінення велика кількість атомів водню перетворюється на ізотопи, які легше вступають у реакції ядерного синтезу, після чого беруть участь у процесі термоядерної реакції."
      }
    }
  }
  val 相位封装氦单元 = IceItem("item_encapsulated_helium_cell", "#F9FFDE") {
    hardness = 2
    explosiveness = 0.3f
    localization {
      zh_CN {
        localizedName = "相位封装氦单元"
        description = "由相位材料包裹的氦中子靶丸,可在核反应堆中接收中子并转化为核燃料"
        details =
          "相位物的中子光路学结构会将中子聚焦到中心存储氦的空腔,以最大化中央接收到的中子流,在中子流的轰击下,大量氦原子会转化为较为容易发生核聚变反应的同位素,继而参与核聚变"
      }
      en {
        localizedName = "Phase-Encapsulated Helium Cell"
        description =
          "A helium neutron target pellet encapsulated by phase material, capable of receiving neutrons in nuclear reactors and converting them into nuclear fuel."
        details =
          "The neutron-optical structure of phase material focuses neutrons onto the central helium storage cavity to maximize the neutron flux received at the center. Under neutron bombardment, a large number of helium atoms are converted into isotopes that more readily undergo fusion reactions, subsequently participating in nuclear fusion."
      }
      uk_UA {
        localizedName = "Фазово-інкапсульована гелієва комірка"
        description =
          "Гелієва нейтронна мішень, оточена фазовим матеріалом, здатна приймати нейтрони в ядерному реакторі та перетворюватися на ядерне паливо."
        details =
          "Нейтронно-оптична структура фазового матеріалу фокусує нейтрони до центральної порожнини зберігання гелію, максимізуючи нейтронний потік у центрі. Під дією нейтронного опромінення велика кількість атомів гелію перетворюється на ізотопи, які легше вступають у реакції ядерного синтезу, після чого беруть участь у термоядерному процесі."
      }
    }
  }
  val 氢聚变燃料 = IceItem("item_hydrogen_fusion_fuel", "#83D6A0") {
    hardness = 2
    explosiveness = 2.4f
    flammability = 1.8f
    radioactivity = 0f
    localization {
      zh_CN {
        localizedName = "氢聚变燃料"
        description = "一种核燃料,压缩氢原子同位素,原子性质易于发生聚变,属轻核聚变燃料"
      }
      en {
        localizedName = "Hydrogen Fusion Fuel"
        description =
          "A nuclear fuel composed of compressed hydrogen isotopes with atomic properties favorable for fusion reactions, classified as a light nuclear fusion fuel."
      }
      uk_UA {
        localizedName = "Водневе термоядерне паливо"
        description =
          "Ядерне паливо, що складається зі стиснених ізотопів водню, атомні властивості яких сприяють перебігу реакцій синтезу. Належить до легкого термоядерного палива."
      }
    }
  }
  val 氦聚变燃料 = IceItem("item_helium_fusion_fuel", "#D0D6B7") {
    hardness = 2
    explosiveness = 0.3f
    localization {
      zh_CN {
        localizedName = "氦聚变燃料"
        description = "一种核燃料,压缩氦原子同位素,原子性质易于发生聚变,属轻核聚变燃料"
      }
      en {
        localizedName = "Helium Fusion Fuel"
        description =
          "A nuclear fuel composed of compressed helium isotopes with atomic properties favorable for fusion reactions, classified as a light nuclear fusion fuel."
      }
      uk_UA {
        localizedName = "Гелієве термоядерне паливо"
        description =
          "Ядерне паливо, що складається зі стиснених ізотопів гелію, атомні властивості яких сприяють перебігу реакцій синтезу. Належить до легкого термоядерного палива."
      }
    }
  }

  val 浓缩铀235核燃料 = IceItem("item_concentration_uranium_235", "#95B564") {
    hardness = 4
    explosiveness = 12f

    radioactivity = 2.4f
    localization {
      zh_CN {
        localizedName = "封装铀-235"
        description = "一种经高度浓缩并超低温封装的铀核燃料,可在超过常温的临界压缩状态下稳定存储,是反应堆的主要燃料之一"
      }
      en {
        localizedName = "Encapsulated Uranium-235"
        description =
          "A highly enriched uranium nuclear fuel encapsulated at ultra-low temperatures, capable of stable storage under critical compression conditions beyond normal temperatures, serving as one of the primary fuels for reactors."
      }
      uk_UA {
        localizedName = "Інкапсульований уран-235"
        description =
          "Високозбагачене ядерне паливо на основі урану, інкапсульоване за наднизьких температур. Здатне стабільно зберігатися в умовах критичного стиснення, що перевищують звичайну температуру, і є одним із основних видів палива для реакторів."
      }
    }
  }
  val 浓缩钚239核燃料 = IceItem("item_concentration_plutonium_239", "#B0B074") {
    hardness = 4
    explosiveness = 12f

    radioactivity = 2.4f
    localization {
      zh_CN {
        localizedName = "封装钚-239"
        description = "一种经高度浓缩并超低温封装的钚核燃料,可在超过常温的临界压缩状态下稳定存储,是反应堆的主要燃料之一"
      }
      en {
        localizedName = "Encapsulated Plutonium-239"
        description =
          "A highly enriched plutonium nuclear fuel encapsulated at ultra-low temperatures, capable of stable storage under critical compression conditions beyond normal temperatures, serving as one of the primary fuels for reactors."
      }
      uk_UA {
        localizedName = "Інкапсульований плутоній-239"
        description =
          "Високозбагачене ядерне паливо на основі плутонію, інкапсульоване за наднизьких температур. Здатне стабільно зберігатися в умовах критичного стиснення, що перевищують звичайну температуру, і є одним із основних видів палива для реакторів."
      }
    }
  }

  val 矩阵合金 = IceItem("item_matrix_alloy", "#929090") {
    localization {
      zh_CN {
        localizedName = "矩阵合金"
        description = "一种由大量纳米机器人聚合而成的可编程合金,机械强度较低,但能够自由变换形态甚至物态,具备极高的适应性与灵活性"
      }
      en {
        localizedName = "Matrix Alloy"
        description =
          "A programmable alloy formed by the aggregation of countless nanobots, with relatively low mechanical strength but capable of freely changing its shape and even state of matter, providing extremely high adaptability and flexibility."
      }
      uk_UA {
        localizedName = "Матричний сплав"
        description =
          "Програмований сплав, сформований з безлічі нанороботів. Має відносно низьку механічну міцність, але здатний вільно змінювати форму і навіть агрегатний стан, забезпечуючи надзвичайно високу адаптивність та гнучкість."
      }
    }
  }
  val 生物钢 = IceItem("item_biologicalSteel", "D75B6E") {
    localization {
      zh_CN {
        localizedName = "生物钢"
        description =
          "一种被强行抑制了绝大部分活性的生物材料.此材料制造的装甲具有整体无缝,附着性强,耐酸碱,防辐射,防腐蚀,耐冲击等的优异特性,只是...."
        details = "你真的要使用他吗?"
      }
      en {
        localizedName = "Biological Steel"
        description =
          "A biomaterial with the vast majority of its biological activity forcibly suppressed. Armor manufactured from this material possesses exceptional properties including seamless integration, strong adhesion, resistance to acids and alkalis, radiation shielding, corrosion resistance, and impact resistance. However..."
        details =
          "Are you sure you want to use this?"
      }
      uk_UA {
        localizedName = "Біологічна сталь"
        description =
          "Біоматеріал, у якому примусово пригнічено більшість біологічної активності. Броня, виготовлена з цього матеріалу, має чудові властивості: цілісну безшовну структуру, високу адгезію, стійкість до кислот і лугів, захист від радіації, корозійну стійкість та удароміцність. Однак..."
        details =
          "Ти справді хочеш це використовувати?"
      }
    }
    frames = 3
    transitionFrames = 13
    frameTime = 5f
    explosiveness = 0.75f
    flammability = 0.5f
    radioactivity = 0.1f
    charge = 0.4f
    cost = 2.4f
    healthScaling = 2.4f
  }
  val 肃正协议 = IceItem("item_solemnProtocol", "FF5845") {
    localization {
      zh_CN {
        localizedName = "肃正协议"
        description = "装载特定密匙的激活协议,授权后即可解锁高级军械的控制权限与制造权限"
      }
      en {
        localizedName = "Solemn Protocol"
        description =
          "An activation protocol loaded with specific keys that, once authorized, unlocks control and manufacturing permissions for advanced ordnance."
      }
      uk_UA {
        localizedName = "Протокол очищення"
        description =
          "Активаційний протокол із завантаженими спеціальними ключами. Після авторизації відкриває права керування та виробництва передового озброєння."
      }
    }
  }
  val FEX水晶 = IceItem("item_crystal_FEX", "#D2393E") {
    hardness = 3
    radioactivity = 0.4f
    cost = 1.25f
    localization {
      zh_CN {
        localizedName = "导能晶体"
        description = "一种高纯度低能阻晶体,中子导率与核性能均有显著提升,是核工业中不可或缺的核心材料"
      }
      en {
        localizedName = "Energy-Conducting Crystal"
        description =
          "A high-purity low-energy-resistance crystal with significantly enhanced neutron conductivity and nuclear performance, serving as an indispensable core material in the nuclear industry."
      }
      uk_UA {
        localizedName = "Енергопровідний кристал"
        description =
          "Високочистий кристал із низьким енергетичним опором, що має значно покращену нейтронну провідність і ядерні характеристики. Є незамінним ключовим матеріалом у ядерній промисловості."
      }
    }
  }
  val 充能FEX水晶 = IceItem("item_crystal_FEX_power", "#E34248") {
    localization {
      zh_CN {
        localizedName = "活化导能结晶"
        description = "一种经大量能量激发的高纯度低能阻晶体,性质极其不稳定,危险且难以储存,但在需要释放中子能的地方不可或缺"
        details =
          "严禁用任何致密介质接触激发态的导能结晶.在《中子工业操作管理条例》中,此类条目均以醒目字体特别标注.每一行警示背后,都是无法挽回的事故与代价"
      }
      en {
        localizedName = "Activated Energy-Conducting Crystal"
        description =
          "A high-purity low-energy-resistance crystal excited by massive energy input, extremely unstable in nature, dangerous and difficult to store, yet indispensable in applications requiring neutron energy release."
        details =
          "Strictly prohibited from contacting any dense medium while in an excited state. In the 'Neutron Industry Operation Management Regulations', such entries are specially marked with prominent warnings. Behind every warning line lies an irreversible accident and its consequences."
      }
      uk_UA {
        localizedName = "Активований енергопровідний кристал"
        description =
          "Високочистий кристал із низьким енергетичним опором, активований значною кількістю енергії. Має надзвичайно нестабільну природу, є небезпечним і складним для зберігання, але незамінний у місцях, де необхідне вивільнення нейтронної енергії."
        details =
          "Суворо заборонено контактувати з будь-яким щільним матеріалом у стані збудження. У «Правилах експлуатації нейтронної промисловості» такі пункти спеціально виділені помітним шрифтом. За кожним рядком попередження стоять незворотні аварії та їхні наслідки."
      }
    }
    hardness = 3
    explosiveness = 3.6f
    radioactivity = 3f
    cost = 1.35f
    frameTime = 9f
    transitionFrames = 6
    frames = 9
  }

  val 简并态中子聚合物 = IceItem("item_degenerate_neutron_polymer", "#FF7FE0") {
    localization {
      zh_CN {
        localizedName = "简并态中子聚合物"
        description =
          "由中子简并态构成的超高密度聚合物,硬度难以测量,韧性与塑性趋近于零.除作为极端环境下的结构材料外,亦是引力场技术的理想场源"
      }
      en {
        localizedName = "Degenerate Neutron Polymer"
        description =
          "An ultra-high-density polymer composed of neutron-degenerate matter, with hardness beyond practical measurement and toughness and plasticity approaching zero. Besides serving as a structural material in extreme environments, it is also an ideal field source for gravitational field technology."
      }
      uk_UA {
        localizedName = "Вироджений нейтронний полімер"
        description =
          "Надзвичайно щільний полімер, утворений з нейтронної виродженої матерії. Його твердість майже неможливо виміряти, а в'язкість і пластичність наближаються до нуля. Окрім використання як конструкційного матеріалу в екстремальних умовах, він також є ідеальним джерелом поля для технологій гравітаційного поля."
      }
    }
  }
  val 暮光合金 = IceItem("item_duskIngot", "deedff") {
    localization { 
      zh_CN {
        localizedName = "暮光合金"
        description = "一种在暮光时分呈现特殊光泽的合金,具有优异的能量传导特性,是高级能量设备的核心材料"
      }
      en {
        localizedName = "Dusk Alloy"
        description =
          "An alloy that exhibits a unique luster during twilight hours, possessing excellent energy conduction properties and serving as a core material for advanced energy equipment."
      }
      uk_UA {
        localizedName = "Сутінковий сплав"
        description =
          "Сплав, що набуває особливого блиску в сутінковий час. Має чудові властивості передачі енергії та є ключовим матеріалом для передового енергетичного обладнання."
      }
    }
    }
  }
  val 以太能 = IceItem("item_etherealEnergy", "E6C4EE") {
    localization {
      zh_CN {
        localizedName = "以太能"
        description =
          "封装容器中的高能粒子能量,在特定结构排列下注入相位能量后可影响时空结构.研究初期曾引发时空回溯,空间错位及乱序传送等现象"
        details =
          "在以太粒子以特定结构排列时注入相位能量,以太粒子会在法韦克内敛空间的能量辐射下,形成以伊塔宏粒子射线为场能的波态中子向心力场"
      }
      en {
        localizedName = "Ethereal Energy"
        description =
          "High-energy particle energy contained within a sealed vessel, capable of influencing spacetime structures when phase energy is injected under specific particle arrangements. Early research caused phenomena such as temporal regression, spatial displacement, and chaotic teleportation."
        details =
          "When ethereal particles are arranged in specific structures and injected with phase energy, they form a wave-state neutron centripetal field powered by Eta-macro particle radiation under the energy emission of Favre-Klein compact space."
      }
      uk_UA {
        localizedName = "Ефірна енергія"
        description =
          "Енергія високоефективних частинок, запечатана в спеціальному контейнері. Після введення фазової енергії за певного структурного розташування здатна впливати на структуру простору-часу. На ранніх етапах досліджень спричиняла такі явища, як зворотний перебіг часу, просторові зміщення та хаотичну телепортацію."
        details =
          "Коли ефірні частинки розташовані у визначених структурах і до них додається фазова енергія, під дією енергетичного випромінювання компактного простору Фавре-Клейна вони формують хвильове нейтронне доцентрове поле, джерелом енергії якого є промені частинок Іта-макро."
      }
    }
    frames = 2
    transitionFrames = 24
    frameTime = 6f
    radioactivity = 0.4f
    charge = 1f
    cost = 2.4f
    healthScaling = 0.8f
  }
  val 玳渊矩阵 = IceItem("item_abyssMatrix", "d7bdff") {
    localization {
      zh_CN {
        localizedName = "玳渊矩阵"
        description = "具有独特的能量传导和存储特性,是高级炮塔弹药的核心材料"
      }
      en {
        localizedName = "Abyss Matrix"
        description =
          "Possessing unique energy conduction and storage properties, serving as a core material for advanced turret ammunition."
      }
      uk_UA {
        localizedName = "Матриця Безодні"
        description =
          "Матеріал із унікальними властивостями передачі та зберігання енергії, що є ключовим компонентом боєприпасів для передових турельних систем."
      }
    }
  }
  val 反物质 = IceItem("item_anti_metter", "734CD2") {
    hardness = 12
    explosiveness = 64f
    localization {
      zh_CN {
        localizedName = "反物质"
        description = "由引力场约束隔绝的反物质,与正物质接触即发生完全湮灭并将质量转化为纯能量,危险性极高,广泛用于强攻击性武器"
        details =
          "通常每一个反物质储存单元都会具有一个独立的能源模块来维持约束力场,在远航星舰队伴随燃料仓库放出的耀眼的焰火消失后,停电被成为了携带反物质的情况下最危险的事"
      }
      en {
        localizedName = "Antimatter"
        description =
          "Antimatter constrained and isolated by gravitational fields, undergoing complete annihilation upon contact with normal matter and converting mass into pure energy. Extremely dangerous and widely used in high-destructive weapons."
        details =
          "Typically, every antimatter storage unit contains an independent power module to maintain the confinement field. After the brilliant fireworks released by fuel depots accompanying distant star fleets disappeared, power failure became the most dangerous situation when carrying antimatter."
      }
      uk_UA {
        localizedName = "Антиматерія"
        description =
          "Антиматерія, ізольована та утримувана гравітаційними полями. При контакті зі звичайною матерією вона повністю анігілює, перетворюючи масу на чисту енергію. Надзвичайно небезпечна та широко використовується у потужній наступальній зброї."
        details =
          "Зазвичай кожен блок зберігання антиматерії має окремий енергетичний модуль для підтримки поля утримання. Після того як яскраві феєрверки від паливних сховищ, що супроводжували далекі зоряні флоти, зникли, відключення живлення стало найнебезпечнішою ситуацією під час транспортування антиматерії."
      }
    }
  }
}
