from google.colab import files
# Abre o seletor de arquivos
uploaded = files.upload() 

# Pega o nome do arquivo enviado
nome_arquivo = list(uploaded.keys())[0]

numeros = []
with open(nome_arquivo, "r") as f:
    for linha in f:
        numeros.append(float(linha.strip()))

print('\nLista de numeros:\n')
print(numeros) #ou-> for numero in numeros:
               #        print(numero)
