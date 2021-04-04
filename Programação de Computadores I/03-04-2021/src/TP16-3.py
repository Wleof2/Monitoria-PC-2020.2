# AULA 03/04
# TP16-3

# IMPRIMIR O VETOR

def imprimir(vetor):
    # range(n) 0 ... n - 1

    # 1 2 3 4 5
    # [1, 2, 3, 4, 5]

    print("[", end="")

    comprimento = len(vetor)

    for i in range(comprimento):
        print(vetor[i], end="")

        if(i != comprimento - 1):
            print(end=", ")

    print("]")

# DOBRAR O VETOR

def dobrar(vetor):
    comprimento = len(vetor)
    for i in range(comprimento):
        vetor[i] = vetor[i] * 2

vetor = []
comprimento = 5

for i in range(comprimento):
    numero = int(input("Digite o número:\n"))
    vetor.append(numero)

imprimir(vetor)
dobrar(vetor)
imprimir(vetor)
