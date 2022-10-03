class Alumno():
    def __init__(self, nombre, nota) -> None:
        self.nombre = nombre
        self.nota = nota
        self.cond = ""
        if self.nota >= 6:
            self.cond = "aprobado"
        else: self.cond = "desaprobado"
        
    def __str__(self) -> str:
        return "El alumno {} tiene la nota {} por lo tanto se encuentra {}".format(self.nombre, self.nota, self.cond)
        
alumno0 = Alumno("Gaston Zolorzano", 9.5)
print(alumno0)
alumno1 = Alumno("Nahuel Diaz", 4)
print(alumno1)