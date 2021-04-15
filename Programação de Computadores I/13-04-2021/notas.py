
nomes = []
notas = []

alunos = 1
disciplinas = 4

for i in range(alunos):
    nome = input("Digite o nome do aluno:\n")
    nomes.append(nome)

    notas.append([])

    for x in range(disciplinas):
        mensagem = "Digite a nota da disciplina {0}: \n".format(
            chr(65 + x)
        )

        nota = int(input(mensagem))
        notas[i].append(nota)

for i in range(alunos):
    print("ALUNO:", nomes[i])

    print("NOTAS:", end="\t")
    for x in range(disciplinas):
        print(x, end="\t")
    print()
