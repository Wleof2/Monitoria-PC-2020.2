# AULA 03/04
# TP16-4

def potencia(x, y):
    resultado = 1;

    for i in range(y):
        resultado *=  x;

    return resultado

print("--------- POTÊNCIA xˆy ---------")

x = int(input("Digite o valor de x: \n"))
y = int(input("Digite o valor de y: \n"))

resultado = potencia(x, y)
print(resultado)
