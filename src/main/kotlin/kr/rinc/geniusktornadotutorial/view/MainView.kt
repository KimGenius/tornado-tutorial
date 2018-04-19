package kr.rinc.geniusktornadotutorial.view

import kr.rinc.geniusktornadotutorial.app.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }

}