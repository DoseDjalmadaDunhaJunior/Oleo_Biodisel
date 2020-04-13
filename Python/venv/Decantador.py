import time
EtOH = 0
Reator = 0
glicerina = 0
capacidade = 500
ocupado = 0 # vai ser usado para gastar a capacidade
Lancado = 0
saida_glicerina = 0 # tem que ser 2%
saida_EtOH = 0 # tem que ser 8%
saida_solucao = 0 # tem que ser 90%
pega = 0 # se o pega for 0 não é possivel pegar nada daqui
recebe = 0 # se o recebe for 0 não é possivel receber nada daqui

def espera(n): # essa função faz o sistema esperar o tempo passado
    time.sleep(n)

def entrada(reat,et):
    if(ocupado < 500):
        Reator + reat
        EtOH + et
    else:
        print('Estourou decantador')

def lancamento():
    p = 0
    if(Lancado >= 100):
        if(pega == 0):
            recebe = 0
            espera(5)
            recebe = 1

        else:
            pega = 0
            recebe = 0
            espera(5)
            pega= 1
            recebe = 1

    else:
        Lancado += 1
        if(glicerina >= 2 and saida_solucao >= 90):
            pega = 1

        else:
            pega = 0

        print('pode pegar a saida_solucao, EtOH e glicerina')

    return  p