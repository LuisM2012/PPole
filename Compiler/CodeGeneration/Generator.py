from Translator.Model.Translation import Translation
from Translator.Model.Program import Program
import MemoryManager


class Generator:
	def __init__(self) -> None:
		self.memoryManager = None
		self.out = None

	'''
	Call to generate the program to file.
	'''
	def generate(self, program:Program, file:str) -> None:
		# Open file
		self.out = open(file, "w")
		
		# Recurse over instructions and write code
		self.memoryManager = MemoryManager(self.out)
		self.addGlobals(program.getGlobals())
		self.start(program.getStart())

		# Close file
		self.out.close()

	'''
	Call to add all global variables in memory
	'''
	def addGlobals(self, globals:set(Translation)):
		for variable in globals:
			self.memoryManager.addGlobal(variable)
	
	'''
	Call to start code traversal. This will traverse in DFS to print code for instructions.
	'''
	def start(self, start:Translation):
		pass

	'''
	Call to add a function.
	'''
	def addFunction(self, function):
		pass

	'''
	Call to a class.
	'''
	def addClass(self, definition):
		pass

	