from enum import Enum

class UnaryOp(Enum):
  INC = 0
  DEC = 1
  NEG = 2
  NOT = 3

class Unary:
  
	def __init__(self, op:UnaryOp, operand) -> None:
		pass
	
	def __str__(self) -> str:
		pass

