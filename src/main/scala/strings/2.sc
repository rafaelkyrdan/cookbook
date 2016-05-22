val foo =
  """ This is
    |multiple line
    |string
  """.stripMargin


val speech =
  """
    #Four score
    #and seven years ago
  """.stripMargin('#').replaceAll("\n", " ")

val s =
  """
    |This is known as
    |"multiline"
    |string
    |or 'heredoc' syntax
  """.stripMargin.replaceAll("\n", " ")





