# AULA 03/04
# TP16-2

def imprimir(matriz):
    for linha in matriz:
        for valor in linha:
            print(valor, end=" ")

        print("")

def atualizar(matriz):
    linhas = len(matriz)
    colunas = len(matriz[0])

    for x in range(linhas):
        for y in range(colunas):
            matriz[x][y] = int(matriz[x][y] / 2)

matriz = [[13, 5, 93],
          [3, 51, 15]]

imprimir(matriz)
atualizar(matriz)
imprimir(matriz)
