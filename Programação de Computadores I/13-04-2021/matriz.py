
from random import randint

def gerarMatriz(linhas, colunas, inicial, final):
    matriz = []

    for x in range(linhas):
        matriz.append([])
        for y in range(colunas):
            numero = randint(inicial, final)
            matriz[x].append(numero)

    return matriz

def imprimirMatriz(matriz):
    linhas = len(matriz)

    for x in range(linhas):
        colunas = len(matriz[x])
        for y in range(colunas):
            print(matriz[x][y], end="\t")

        print()

matriz = gerarMatriz(5, 5, 10, 99)
imprimirMatriz(matriz)
