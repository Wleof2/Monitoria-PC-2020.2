#AULA 27/03

quantidade = input("Digite a quantidade:\n")
quantidade = int(quantidade)

faces = [0, 0, 0, 0, 0, 0]

for i in range(quantidade):
    face = input("Digite o valor sorteado:\n")
    face = int(face)    # 1 2 3 4 5 6

    indice = face - 1   # 0 1 2 3 4 5
    faces[indice] += 1

comprimento = len(faces)

for i in range(comprimento):
    face = i + 1
    quantidade = faces[i]

    mensagem = "Faces {0}: {1}"
    mensagem = mensagem.format(face, quantidade)

    print(mensagem)
