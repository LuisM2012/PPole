class Instruction:
  code = ""

  def __init__(self) -> None:
    pass

  def getCode(self) -> str:
    return self.code

  def __str__(self) -> str:
    return f"[{self.__class__.__name__}] {self.code}"
