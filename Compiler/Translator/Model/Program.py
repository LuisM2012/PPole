import Translation

class Program:
	globalVars = None
	startPoint = None

	def __init__(self) -> None:
		self.globalVars = {}

	def getGlobals(self):
		return self.globalVars.keys()
	
	def addGlobal(self, variable):
		self.globalVars[variable] = None

	def setStart(self, start:Translation):
		self.startPoint = start

	def getStart(self) -> Translation:
		return self.startPoint