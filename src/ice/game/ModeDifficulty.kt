package ice.game

import arc.graphics.Color
import ice.graphics.IceColor
import universecore.ui.bundle.Localizable

enum class ModeDifficulty(var color: Color) :Localizable {

  神赐(IceColor.y1) {
    init {
      localization {
        zh_CN {
          this.localizedName = "神赐"
          description = "{SICK=2}圣水淅沥,与神同行,乐园就在此处..."
        }

        en {
          this.localizedName = "Divine Grace"
          description = "{SICK=2}Holy water flows gently. Walk beside the Divine, and Paradise lies just ahead..."
        }

        uk_UA {
          this.localizedName = "Божественна благодать"
          description = "{SICK=2}Священна вода тихо струменіє. Ідіть поруч із Божественним — і Рай буде зовсім поруч..."
        }
      }
    }
  },
  洗礼(IceColor.b4) {
    init {
      localization {
        zh_CN {
            this.localizedName = "洗礼"
            description = "{HANG=2;2}福祸未分,命途难测,{ENDHANG}{JUMP}神谕者缄口不言"
        }

        en {
          this.localizedName = "Baptism"
          description = "{HANG=2;2}Blessing and calamity remain entwined; fate is unknowable.{ENDHANG}{JUMP}The Oracle remains silent."
        }

        uk_UA {
          this.localizedName = "Хрещення"
          description = "{HANG=2;2}Благословення й лихо ще не розділені, а доля залишається непередбачуваною.{ENDHANG}{JUMP}Оракул зберігає мовчання."
        }
      }
    }
  },
  棘罪(IceColor.r1) {
    init {
      localization {
        zh_CN {
            this.localizedName = "棘罪"
            description = "{SHAKE}{SPEED=0.4}圣光暗淡，神像蒙尘，亵渎者又将何去何从？"
        }

        en {
            this.localizedName = "Crown of Sin"
            description = "{SHAKE}{SPEED=0.4}The holy light grows dim, the sacred idol gathers dust. Where, then, shall the blasphemer find refuge?"
        }

        uk_UA {
            this.localizedName = "Терновий гріх"
            description = "{SHAKE}{SPEED=0.4}Святе світло згасає, священна статуя вкривається пилом. Куди ж тепер подасться блюзнір?"
        }
      }
    }
  };

  override var localizedName: String = ""
  override var description: String = ""
  override var details: String = ""
}