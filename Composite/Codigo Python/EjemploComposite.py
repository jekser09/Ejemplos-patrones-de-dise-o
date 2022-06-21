class Materia:    
  
    def __init__(self, *args): 
        self.position = args[0] 
  
    def showDetails(self): 
        print("\t", end ="") 
        print(self.position) 
  
class Pensum: 
    def __init__(self, *args): 
        self.position = args[0] 
        self.children = [] 
  
    def add(self, child): 
        self.children.append(child) 
  
    def remove(self, child): 
        self.children.remove(child) 
  
    def showDetails(self): 
        print(self.position) 
        for child in self.children: 
            print("\t", end ="") 
            child.showDetails() 
  
if __name__ == "__main__": 
  
    topLevelMenu = Pensum("GeneralManager") 
    pensum1 = Pensum("Pensum ingenieria") 
    pensum2 = Pensum("Pensum administrador") 
    materia1 = Materia("Materia1") 
    materia2 = Materia("Materia2") 
    materia3 = Materia("Materia3") 
    materia4 = Materia("Materia4") 
    pensum1.add(materia1) 
    pensum1.add(materia2) 
    pensum2.add(materia3) 
    pensum2.add(materia4) 
    topLevelMenu.add(pensum1) 
    topLevelMenu.add(pensum2) 
    topLevelMenu.showDetails()