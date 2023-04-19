class Translation:
	pass

class Work:
	pass

class Pair:
	def printCode(self, code:Translation):
		print("transl")

	def printCode(self, code:Work):
		print("work")


class Translation:
	next = None

		
	def __init__(self, next:Translation) -> None:	
		self.next = next
		
	def getNext(self:Translation):
		return self.next
	

pair = Pair()
work = Work()
trans = Translation(None)

pair.printCode(trans)