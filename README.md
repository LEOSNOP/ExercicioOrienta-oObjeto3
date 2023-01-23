# Exercicio2 Orientação a Obejeto

Exercicio2

a) Construir a classe Transporte:

i) variáveis de instância (visibilidade protegida):
 Marca do Transporte (String marca)
 Modelo do Transporte (String modelo)
 Quilometragem (String quilometragem)
 Capacidade do Tanque (double capacidadeTanque)

ii) Métodos Públicos:
 Construtor default (padrão);
 Construtor com quatro parâmetros, cada um deverá receber valores que irão iniciar cada
variável de instância;
 mover, que recebe os quilômetros que deve se mover, aumentando sua quilometragem;
 abastecer, que recebe os litros que são colocados no tanque, adicionando à capacidade já
existente;
 exibir, para a visualização dos valores das variáveis de instância.


b) Construir a classe Automóvel:

i) Herdar da classe Transporte;

ii) Variável de instância (visibilidade privada):
 Placa (String placa)

iii) Métodos Públicos:

 Essa classe deverá conter os seguintes métodos:

 Um construtor default (padrão);

 Um construtor com parâmetros (contendo valores para as variáveis de instância da classe
Transporte e um valor da placa do automóvel) que inicie todas as variáveis de instância e
chame, para ajudá-lo nisso, o construtor da classe base;

 Sobrescrever o método moverSe, que aumenta a quilometragem percorrida, reduzindo 1 litro
do tanque a cada 8 quilômetros deslocados;

 exibir, para a visualização dos valores das variáveis de instância, invocando (chamando) o
método exibir da superclasse e depois exibindo sua placa;


c) Construir a classe Avião:

i) Herdar da classe Transporte;

ii) Variável de instância (visibilidade privada):

 Código (String codigo)

iii) Métodos Públicos:

 Um construtor default (padrão);

 Um construtor com parâmetros que inicie todas as variáveis de instância e chame, para ajudá-
lo nisso, o construtor da classe base (esse construtor recebe como parâmetros, valores para as
variáveis de instância da classe Transporte e um valor do código do Avião);

 Sobrescrever o método moverSe, que aumenta a quilometragem percorrida, reduzindo 10
litros do tanque a cada quilômetro deslocado;

 exibir, para a visualização dos valores das variáveis de instância, invocando (chamando) o
método exibir da superclasse e depois exibindo seu código.

d) Construir uma classe para testar a questão acima, onde, essa classe instanciará objetos das três classes
(Transporte, Automóvel e Avião) e executará os métodos sobrescritos moverSe e exibir
