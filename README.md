# Batismo de Java
Repositório voltado aos estudos de Java do curso Batismo de 
Java do Java10x.
## Assuntos
### Variáveis, tipagem de dados
Variável => Caixinha que guardamos nosso dado. Ou seja, 
alocamos valores.

**Java sempre requer um ponto e vírgula no final.**

Java é uma linguagem fortemente tipada, ele exige que você 
diga o tipo da variável antes de declarar a variável.<br>
Exemplo:<br>
String nome = 'Naruto';
<br><br>
String => texto.<br>
int => número inteiro.<br>
double => número de ponto flutuante de 64 bits e precisão 
          dupla.<br>
float => números de ponto flutuante.<br>
boolean => verdadeiro ou falso.<br>

### Dados Primitivos
int: Números inteiros.<br>
float: Números de ponto flutuante de precisão simples.<br>
double: Números de ponto flutuante de precisão dupla. <br>
char: Um único caractere.<br>
boolean: Valores verdadeiros ou falsos.<br>
byte: Números inteiros pequenos. <br>
short: Números inteiros menores que um int. <br>
Long: Números inteiros maiores que um int. <br>
<br>
O que é um package?<br>
São como a pasta do computador. Ou seja, São subcompartimentos de 
um compartimento (projeto) maior.
<br><br>
**Java é uma linguagem verbosa.**
<br><br>
**Int tem um valor máximo de 2 147 483 647**
<br><br>
**O tipo de dado Long sempre inicia com uma letra maiúscula e no fim do dado tem um L** <br>
Exemplo:<br>
```
Long saldoBancario = 999999L;
```
**String é um tipo de dado que é declarado com a letra maiúscula também.** <br>
Exemplo: <br>
```
String nome = "Naruto";
```
<br><br>
Diferença print e println no Java:
System.out.print() => Não quebra a linha no final
System.out.println() => Imprime o texto e já coloca uma 
quebra de linha no final
<br><br>

Dados primitivos <br>
```
São tipos de dados que de maneira geral recebem métodos de
maneira padrão
```
<br><br>
Dados não primitivos <br>
```
São tipos de dados em que pode-se colocar métodos para fazer 
alterações na variável sem que seja mudado seu escopo.
```
<br><br>
O que são métodos?
```
Métodos são características que iremos colocar dentro das 
nossas variáveis.
```
<br><br>
### Dados não primitivos e dados primitivos
Em dados não primitivos podemos atribuir métodos para alterar
a sua variável.
Dados primitivos não temos métodos para receber.
