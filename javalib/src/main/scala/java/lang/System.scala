package java.lang

import java.io.{InputStream, PrintStream}
import java.util.Properties

final class System private()

object System {
  def arraycopy(src: Object, srcPos: scala.Int, dest: Object,
      destPos: scala.Int, length: scala.Int): Unit = ???
  def identityHashCode(x: Object): scala.Int = ???
  def getenv(name: String): String = ???
  def clearProperty(key: String): String = ???
  def getProperties(): Properties = ???
  def getProperty(key: String): String = ???
  def getProperty(key: String, default: String): String = ???
  def setProperty(key: String, value: String): String = ???
  var in: InputStream = _
  var out: PrintStream = _
  var err: PrintStream = _
}