# 🦇 Projeto: Animação de Morcego em Java

## 📖 Sobre o projeto

Este projeto consiste em uma animação de um morcego desenvolvida em **Java**, utilizando as bibliotecas **Swing** e **AWT** para criação da interface gráfica e renderização dos elementos.

O objetivo foi praticar conceitos de programação gráfica, animação e eventos em Java, explorando o uso da classe `Graphics2D`, do componente `JPanel` e da classe `Timer` para atualizar continuamente a tela.

Durante a execução, o morcego possui um movimento de bater as asas, criado por meio de funções matemáticas, proporcionando uma animação simples e fluida.

---

## 🎯 Objetivos

* Praticar programação gráfica em Java.
* Utilizar o framework Swing para interfaces gráficas.
* Aprender o funcionamento do método `paintComponent()`.
* Criar animações utilizando `javax.swing.Timer`.
* Manipular formas geométricas com `Graphics2D`.
* Explorar conceitos de atualização de tela através do método `repaint()`.

---

## ⚙️ Funcionamento

O programa utiliza um `Timer` que executa uma ação aproximadamente a cada **30 milissegundos**. A cada atualização:

1. O ângulo das asas é alterado.
2. O método `repaint()` é chamado.
3. O método `paintComponent()` redesenha o morcego na tela.
4. O movimento das asas é calculado utilizando a função `Math.sin()`.

Esse processo cria o efeito de animação contínua.

---

## 📂 Estrutura do projeto

```text
morcego/
│
├── Bat.java          // Classe responsável pela animação
└── Main.java         // Classe responsável por iniciar a aplicação
```

---

## ▶️ Como executar

1. Clone este repositório.
2. Abra o projeto em uma IDE Java (como Eclipse, IntelliJ IDEA ou NetBeans).
3. Execute a classe `Main`.
4. A janela da aplicação será aberta exibindo a animação do morcego.

---

## 🎥 Referência

Este projeto foi desenvolvido como atividade de aprendizado com base no tutorial disponível no YouTube:

**Tutorial:** https://youtu.be/mCqLdqsIaaI?si=CMIEf__WrJVZLri2

Todos os créditos pelo conteúdo didático pertencem ao autor do vídeo. Este projeto foi adaptado para fins de estudo e prática da linguagem Java.

---

## 👩‍💻 Autora

Desenvolvido por **Carolina Ribeiro** como prática de programação gráfica utilizando Java.
