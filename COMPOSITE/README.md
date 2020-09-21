# **Padrões de Projeto**
# Composite

O composite é um padrão de projeto classificado como estrutural. Ele permite que se modifique a estrutura do objeto, compondo-os em estrutura de árvores e então trabalha-los como uma arvore, representando hierarquias todo parte.

O uso desse padrão de projeto faz sentido quando aplicação possua uma estrutura hierárquica, requerendo funcionalidades genéricas para toda a hierarquia, tratando composições e objetos individuas da mesma maneira.

Um exemplo básico seria uma estrutura de arquivos e pastas, onde se tem a necessidade de descobrir um peso de uma pasta, que contém arquivos e outras pastas, que podem conter outros arquivos e pastas. O padrão composite sugere que se trabalhe com as classes a partir de uma interface comum, que declara os métodos necessários para a manipulação da estrutura, no caso um método para se obter o tamanho de um arquivo ou de uma pasta. A classe de pastas e arquivos implementariam esses métodos, e uma terceira classe cliente, trabalharia com todos os elementos através da interface composite.

Estrutura:

![Estrutura padrão coposite](https://refactoring.guru/images/patterns/diagrams/composite/structure-pt-br.png)

*OBS:* Imagem retirada do site: [refactoring.guru](https://refactoring.guru/pt-br/design-patterns/composite)
-- --

Participantes:

    - Component
      - Declara a interface para os objetos da composição, podendo implementar comportamentos padrões para todas as classes, declara também uma interface para gerenciar os componentes filho
  

    - Leaf
      - Objetos da composição que não possuem filhos, que definem comportamentos para objetos primitivos da composição.


    - Composite
      - Objetos da composição que possuem filhos, definindo comportamentos adequados, armazenando e implementando operações relacionadas a filhos definidas na interface.


    - Client
      - Manipula todos os elementos através da interface component, trabalhando da mesma forma com elementos simples ou elementos compostos da arvore.
