# **Padrões de Projeto**
# Memento
O Memento é um padrão de projeto do tipo comportamental. Busca permitir capturar e externalizar um estado interno de um objeto, mantendo seu encapsulamento, assim o objeto pode ser restaurado para o estado capturado mais tarde.

Esse padrão de projeto é utilizado quando há a necessidade de registrar o estado interno de um objeto, implementando mecanismos de checkpoints e de desfazer operações em caso de erros. Porém é importante manter o encapsulamento do objeto, então deve-se tomar cuidados para não comprometer esse encapsulamento.
O padrão então fornece mecanismos para atender a essa necessidade mantendo as devidas guardas com o princípio do encapsulamento da Orientação a Objetos.

Sendo assim é utilizado quando se tem a necessidade de criar pontos de restauração de estados e permitir que o programa se recupere de erros.

Estrutura:

![Estrutura template method](https://refactoring.guru/images/patterns/diagrams/memento/structure2.png)

*OBS*: Imagem retirada do site [Refectoring Guru](https://refactoring.guru/pt-br/design-patterns/memento)

-- --

Participantes:

    - Memento
      - Classe que representa um snapshot, que contém o estado de um objeto, que pode ser restaurado em um Originator, possuindo métodos para obter e definir o estado de um Memento.


    - Originator
        - Classe onde o estado atual é mantido, defini métodos para criar um memento com o estado atual do Originator, também implementa um método para setar seu estado a partir de um memento.
    
    - Caretaker
      - Classe auxiliar que é responsável por armazenar e restaurar o estado do Originator por meio do objeto memento, mantendo uma lista de mementos sem modificá-los.


# Exemplo:
O código de exemplo implementa uma conta bancaria, originator(Conta.java), que a cada operação de deposito ou saque gera um objeto memento (MementoConta.java) com o estado da conta anteriormente a esta operação, permitindo que este estado seja restaurado. Um objeto Caretaker (CareTackerConta.java) fica responsabilizado de receber os mementos, com o estado do originator, e armazená-los em uma lista.
[Open]()
