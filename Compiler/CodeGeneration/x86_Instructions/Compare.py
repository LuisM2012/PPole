from enum import Enum

class CompareOp(Enum):
  EQ = 0
  NE = 1
  LT = 2
  LE = 3
  GT = 4
  GE = 5

class Compare:
  
	def __init__(self, op:CompareOp, left, right) -> None:
		pass
	
	def __str__(self) -> str:
		pass
