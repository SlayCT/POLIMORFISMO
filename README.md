# 📚 Atividade 11 — Polimorfismo

Atividade desenvolvida na disciplina de **Técnicas de Programação**, com foco no conceito de **Polimorfismo** na Programação Orientada a Objetos (POO), utilizando a linguagem Java.

## 🎯 Objetivo

Praticar os conceitos de polimorfismo por meio da sobrescrita e sobrecarga de métodos, compreendendo como um mesmo método pode apresentar diferentes comportamentos.

A atividade trabalha dois exercícios:

* 🚗 **Sobrescrita de métodos:** classe `Veiculo` e subclasses `Carro` e `Bicicleta`, com diferentes implementações do método `mover()`.
* 🧮 **Sobrecarga de métodos:** classe `Calculadora`, com três versões do método `somar()`, utilizando diferentes quantidades e tipos de parâmetros.

## 🛠️ Tecnologias utilizadas

* ☕ Java
* 💻 Programação Orientada a Objetos (POO)
* 🔗 Herança e Polimorfismo
* `@Override` e sobrecarga de métodos


## 📚 Exercícios

**1 - Explique como a sobrescrita de métodos permite comportamentos diferentes para objetos da mesma hierarquia.**

A sobrescrita permite que uma subclasse tenha sua própria versão de um método que já existe na classe principal, então mesmo que as classes: Carro e Bicicleta herdem de Veiculo, cada uma pode executar o método mover( ) de uma maneira diferente. Isso é um exemplo de polimorfismo, pois o mesmo método apresenta comportamentos diferentes dependendo do objeto


**2 - Descreva o mecanismo de sobrecarga de métodos e como ele difere da sobrescrita em termos de polimorfismo.**

**Sobrecarga:** Acontece quando criamos vários métodos com o mesmo nome, mas com quantidades ou tipos de parâmetros diferentes e o Java identifica qual método deve executar de acordo com os argumentos recebidos.

**Sobrescrita:** Acontece quando uma subclasse redefine um método herdado da classe principal, mantendo sua assinatura.

**Diferença:** A sobrecarga acontece dentro da mesma classe ou entre classes, utilizando assinaturas diferentes.
As duas são formas de polimorfismo, pois permitem utilizar o mesmo nome de método em diferentes situações.

---

📌 **Atividade acadêmica — Técnicas de Programação**
