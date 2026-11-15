# 📚 Atividade 11 á 12 — Polimorfismo

Atividade desenvolvida na disciplina de **Técnicas de Programação**, com foco no conceito de **Polimorfismo** na Programação Orientada a Objetos (POO), utilizando a linguagem Java.

## 🎯 Objetivo

Praticar os conceitos de polimorfismo por meio da sobrescrita de métodos, sobrecarga de métodos e construtores, compreendendo como diferentes comportamentos podem ser implementados utilizando o mesmo nome de método.

A atividade trabalha cinco exercícios:

- 🚗 **Sobrescrita de métodos:** classe `Veiculo` e subclasses `Carro` e `Bicicleta`, com diferentes implementações do método `mover()`.
- 🧮 **Sobrecarga de métodos:** classe `Calculadora`, com três versões do método `somar()`, utilizando diferentes quantidades e tipos de parâmetros.
- 📦 **Sobrecarga de construtores:** classe `Produto`, com três construtores que permitem criar objetos utilizando diferentes conjuntos de informações.
- 💳 **Sobrescrita de métodos em pagamentos:** classe `Pagamento` e subclasses `PagamentoCartao` e `PagamentoBoleto`, com diferentes implementações do método `processarPagamento()`.
- 🔄 **Sobrecarga de métodos em conversão:** classe `Conversor`, com três versões do método `converter()`, para temperaturas, distâncias e textos.

## 🛠️ Tecnologias utilizadas

- ☕ Java
- 💻 Programação Orientada a Objetos (POO)
- 🔗 Herança e Polimorfismo
- `@Override` e sobrescrita de métodos
- Sobrecarga de métodos e construtores
- `Scanner` para entrada de dados

---


## 📚 Exercícios

**1 - Explique como a sobrescrita de métodos permite comportamentos diferentes para objetos da mesma hierarquia.**

A sobrescrita permite que uma subclasse tenha sua própria versão de um método que já existe na classe principal, então mesmo que as classes `Carro` e `Bicicleta` herdem de `Veiculo`, cada uma pode executar o método `mover()` de uma maneira diferente. Isso é um exemplo de polimorfismo, pois o mesmo método apresenta comportamentos diferentes dependendo do objeto


**2 - Descreva o mecanismo de sobrecarga de métodos e como ele difere da sobrescrita em termos de polimorfismo.**

**Sobrecarga:** Acontece quando criamos vários métodos com o mesmo nome, mas com quantidades ou tipos de parâmetros diferentes e o Java identifica qual método deve executar de acordo com os argumentos recebidos.

**Sobrescrita:** Acontece quando uma subclasse redefine um método herdado da classe principal, mantendo sua assinatura.

**Diferença:** A sobrecarga acontece dentro da mesma classe ou entre classes, utilizando assinaturas diferentes.
As duas são formas de polimorfismo, pois permitem utilizar o mesmo nome de método em diferentes situações.

**3 - Como a sobrecarga de construtores facilita a criação de objetos?**

A sobrecarga de construtores **permite criar objetos da mesma classe utilizando diferentes quantidades de informações**. Assim, podemos instanciar um produto informando apenas o nome ou o nome e o preço ou todas as informações, incluindo a quantidade em estoque. Isso faz a **criação dos objetos mais flexível e permite inicializar os atributos de acordo com a necessidade**.

**4 - Como o polimorfismo por sobrescrita facilita a implementação de diferentes formas de pagamento?**

O polimorfismo permite que **diferentes classes** utilizem o mesmo método, mas com **comportamentos específicos**. Assim, cada forma de pagamento pode ter sua própria implementação de `processarPagamento()`. Isso **facilita a organização e manutenção do sistema**, pois podemos adicionar novas formas de pagamento sem precisar alterar o código da classe principal Pagamento.


**5 Como a sobrecarga permite implementar várias versões do método `converter()`?**

A sobrecarga permite **criar vários métodos com o mesmo nome, mas com diferentes tipos ou quantidades de parâmetros**. Dessa forma, podemos utilizar o método `converter()` para realizar diferentes operações, como converter temperaturas, distâncias e textos. **O Java identifica automaticamente qual versão deve ser executada de acordo com o tipo de dado recebido**.

---

📌 **Atividade acadêmica — Técnicas de Programação**
