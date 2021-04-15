

nomes = ["Joao", "Maria", "Pedro", "Jose"]
notas = [[2, 3, 4, 5], [2, 3, 5], [2, 4, 5], [2, 3, 4]]

def somarVetor(vetor):
    soma = 0

    for valor in vetor:
        soma += valor

    return soma

qntAlunos = 4

for i in range(qntAlunos):
    soma = somarVetor(notas[i])
    nome = nomes[i]

    print(nome, soma)
