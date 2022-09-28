#Calculo de año bisiesto extraido de wikipedia.

def bisiesto(age):
    if age % 4 == 0 and (age % 100 != 0 or age % 400 == 0):
        print(f"El año {age} es bisiesto")
    else :print(f"El año {age} no es bisiesto")

age : int = int(input("Vamos a averiguar si un año es bisiesto, o no. Coloca un año por favor"))
bisiesto(age)