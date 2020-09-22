# **Padrões de Projeto**
# Template Method
O template method é um padrão de projeto classificado como comportamental. Ele define um esqueleto de um algoritmo na classe principal, porém permite que subclasses modifiquem determinadas etapas desse algoritmo.

Este padrão é utilizado quando se tem classes diferentes que tem trechos de código, ou funções, muito similares, porém em determinadas etapas da classe o algoritmo realmente implementa algo muito especifico a ela.  Caso o algoritmo dessas classes possa ser dividido em etapas, a utilização do template method poderia padronizar as etapas similares e apenas declarar ou implementar um default das etapas mais especificas, que seriam implementados ou sobrescritos pelas suas subclasses. Dessa forma há uma simplificação e redução do código, facilitando a manipulação dessas subclasses por outros objetos.

Estrutura:

![Estrutura template method](https://i.ibb.co/fXDrg15/template-method.png)

*OBS*: Imagem retirada das notas de aula do professor João Ronaldo Cunha

-- --

Participantes:

    - FrameworkClass
      - É a classe que define o template method, ou seja, define o esqueleto e as etapas do algoritmo e implementa as etapas padrões. Cada etapa é definida como um método, que são invocados por um outro método que chama as etapas na sequencia desejada.


    - ApplicationClassOne/ApplicationClassTwo
        - É a classe que herda de FrameworkClass e redefine as etapas necessárias.



# Exemplo:
O código de exemplo implementa uma aplicação que dá orientações de treinamento para atletas remotamente, a classe OrientaçãoTreinamento é a FrameworkClass, que define o esqueleto do algoritmo, implementando alguns métodos que são padrões para todos atletas, e definindo os métodos que poderão ser sobrescritos pelas subclasses. As classes Judoca e Maratonista são ApplicationClassOne e ApplicationClassTwo, herdam de OrientaçãoTreinamento e sobrescreve as etapas que são necessárias para seu correto funcionamento.
A classe Main, apenas implementa testes dessas classes.

[Open](https://github.com/GTdelgado/Padroes_de_projetos/tree/master/TEMPLATE%20METHOD/sample%20code)
