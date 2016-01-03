package wdl4s.command

import wdl4s.expression.WdlFunctions
import wdl4s.values.WdlValue
import wdl4s.Declaration

trait CommandPart {
  def instantiate(declarations: Seq[Declaration], parameters: Map[String, WdlValue], functions: WdlFunctions[WdlValue]): String
}
