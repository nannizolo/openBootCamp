class Vehiculo():
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas 
        self.puertas = puertas
    
class Coche(Vehiculo):
    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        self.color = color
        self.ruedas = ruedas 
        self.puertas = puertas
        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def mostrar(self):
        print("Vehiculo con color {},{} ruedas, {} puertas, {} Km/h, {} cc. ".format(self.color, self.ruedas, self.puertas, self.velocidad, self.cilindrada))

coche = Coche("Rojo", 4, 5, 145, 1.6)
coche.mostrar()





    