from enum import Enum

class BinaryOp(Enum):
  ADD = 0
  SUB = 1
  MUL = 2
  DIV = 3

class Binary:
  
	def __init__(self, op:BinaryOp, left, right) -> None:
		pass
	
	def __str__(self) -> str:
		pass

