package org.thp.thehive.dto.v0

import play.api.libs.json.{Json, OFormat, OWrites}

case class InputTag(namespace: String, predicate: String, value: Option[String], description: Option[String], colour: Option[Int])

object InputTag {
  implicit val writes: OWrites[InputTag] = Json.writes[InputTag]
}

case class OutputTag(namespace: String, predicate: String, value: Option[String], description: Option[String], colour: Int)

object OutputTag {
  implicit val format: OFormat[OutputTag] = Json.format[OutputTag]
}
