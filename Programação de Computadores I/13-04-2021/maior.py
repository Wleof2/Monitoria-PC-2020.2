def maiorNumero(vetor):
    tamanho = len(vetor)

    if(tamanho <= 0):
        return None

    maior = vetor[0]

    for i in range(1, tamanho):
        if(maior < vetor[i]):
            maior = vetor[i]

    return maior


vetor = [1, -6, 4, 10, 9]
print(maiorNumero(vetor))
