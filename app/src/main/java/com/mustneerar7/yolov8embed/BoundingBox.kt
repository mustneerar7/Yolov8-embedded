package com.mustneerar7.yolov8embed

data class BoundingBox(
  val x1: Float,              // Distance from the left edge of the image to the left edge of the bounding box.
  val y1: Float,              // Distance from the top edge of the image to the top edge of the bounding box.
  val x2: Float,              // Distance from the left edge of the image to the right edge of the bounding box.
  val y2: Float,              // Distance from the top edge of the image to the bottom edge of the bounding box.
  val cx: Float,              // X-coordinate of the center of the bounding box.
  val cy: Float,              // Y-coordinate of the center of the bounding box.
  val w: Float,               // Width of the bounding box.
  val h: Float,               // Height of the bounding box.
  val cnf: Float,             // Confidence of the bounding box.
  val cls: Int,               // Class of the bounding box.
  val clsName: String         // Name of the class of the bounding box.
)