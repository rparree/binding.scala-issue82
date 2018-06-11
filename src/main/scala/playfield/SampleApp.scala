package playfield

import com.thoughtworks.binding.Binding.Vars
import com.thoughtworks.binding.{Binding, FutureBinding, dom}
import org.scalajs.dom.{Node, document}

import scala.concurrent.Future
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

// uncomment the line below
// import com.thoughtworks.binding.dom

case class Foo(toto: String, baz: String)

@JSExportTopLevel("SampleApp")
object SampleApp {
    val data = Vars.empty[Foo]

    @JSExport
    def main(): Unit = {
        dom.render(document.body, table)
    }

    import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
    def getData : FutureBinding[Foo] = FutureBinding(Future(Foo("jenniy","dee")))

    @dom
    def table:Binding[Node] = {
        <div>hello</div>
    }

}