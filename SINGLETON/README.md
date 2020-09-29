# **Padrões de Projeto**
# Singleton
O Singleton é um padrão do tipo criacional, ele define que existira apenas uma instância concorrente de uma classe, durante o ciclo de vida da aplicação.

Este padrão é utilizável quando é necessário controlar a maneira que uma classe é instanciada, garantindo que essa instancia seja transparente para o programa, no singleton o construtor da classe é protegido, para que se possa controlar sua instanciação, assim todo o programa usara o singleton para acessar os comportamentos nele definidos.


**Aplicabilidade**
Este padrão é utilizado quando há a necessidade de acesso a um recurso a partir de uma instancia, e quando um recurso é muito utilizado, mas é necessário ter somente uma instância.
Por exemplo: 
  - Acesso a arquivos que só suportam um leitor concorrente.
  - Classes de serviço para acesso a APIs ou outros mecanismos do programa.
  
**Estrutura:**

![Estrutura Singleton](https://refactoring.guru/images/patterns/diagrams/singleton/structure-pt-br.png)

*OBS*: Imagem retirada do site [refactoring.guru](https://refactoring.guru/pt-br/design-patterns/singleton)

-- --

**Participantes:**
  - Singleton (O construtor da classe é privado, e a classe declara um método getInstance para ser obtido uma instancia do objeto)
  - Client (É quem utiliza o singleton, obtendo a instancia do único objeto desta classe)


**Variações**
  - Eager, a classe implementa um método static para se obter um singleton, que é instanciado quando a classe é carregada no programa, então caso ocorra algum erro na instanciação a aplicação quebra.
  - Static Block, similar ao Eager, mas a instancia é declarada dentro de um static block com try cath, permitindo que aja alguma tratativa caso ocorra algum erro na instanciação.
  - Lazy, o singleton é instanciado quando é utilizado o método getInstance pela primeira vez, gerando uma Região Critica, que em situações multi-thread pode ser obtida mais de uma instancia do singleton, sendo necessário um acesso sincronizado

**Exemplo:**
No código de exemplo é implementado um programa para ler e escrever em um arquivo de texto, implementado na classe MyFile(Singleton Lazy), onde diferentes objetos na classe Main (Client) recebem a mesma instancia de MyFile. 

[Open]()
