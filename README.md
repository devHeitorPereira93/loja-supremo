# Desafio - Sistema de Loja Virtual "Estilo Supremo"

![Interior da Loja Estilo Supremo](An_elegant_and_stylish_men's_clothing_store_interi.jpg)

## Sobre a Loja
A **Estilo Supremo** é uma loja de moda masculina que oferece uma seleção de roupas, sapatos e acessórios de alta qualidade para homens que valorizam estilo e sofisticação. Com um ambiente moderno e acolhedor, a loja proporciona uma experiência de compra única.

## Objetivo
Desenvolver um sistema para a loja **Estilo Supremo** que permita aos clientes explorar produtos, aplicar promoções escalonadas e gerenciar seu saldo. O sistema também deve incluir funcionalidades administrativas para a equipe de funcionários.

---

## Estrutura do Desafio

### Etapa 1: Criação do Catálogo de Produtos
- Criar uma classe `Produto` com os atributos:
  - `nome`
  - `valor`
  - `descricao`
  - `marca`

- Criar subclasses para os itens específicos:
  - **Camisetas**: `tamanho`, `cor`, `material`, `marca`
  - **Calças**: `tamanho`, `cor`, `material`, `estilo`, `marca`
  - **Sapatos**: `tamanho`, `cor`, `material`, `tipo`, `marca`
  - **Relógios**: `cor`, `material da pulseira`, `resistência à água`, `marca`
  - **Bonés**: `cor`, `tamanho`, `material`, `marca`

---

### Etapa 2: Promoções Escalonadas
Definir as promoções baseadas na quantidade de itens e valor adicional da compra:

- Até **4 itens**: Preço normal
- **4 itens + 100 BRL em outros produtos**: 25% de desconto no item mais barato
- **5 itens + 200 BRL em outros produtos**: 50% de desconto no item mais barato
- **6 itens + 300 BRL em outros produtos**: O item mais barato é gratuito

---

### Etapa 3: Menu de Navegação e Carrinho de Compras
- **Explorar Produtos**: O cliente navega pelo catálogo e visualiza os detalhes dos produtos.
- **Adicionar ao Carrinho**: O cliente seleciona a quantidade e adiciona o item ao carrinho.
- **Visualizar Carrinho**: O carrinho exibe os produtos selecionados e o valor total, com promoções aplicadas.

---

### Etapa 4: Criação de Conta e Verificação de Saldo
- **Cadastro e Login**: O cliente pode criar uma conta ou fazer login.
- **Gerenciamento de Saldo**: O cliente pode depositar valores para fazer compras.
- **Verificação de Saldo**: A compra só é autorizada se o saldo for suficiente.

---

### Etapa 5: Menu Exclusivo para Funcionários
- **Adicionar Item**: Permite que os funcionários insiram novos produtos no catálogo.
- **Remover Item**: Permite que os funcionários removam itens que não estão mais disponíveis.

---

### Extras (Opcionais)
- **Histórico de Compras**: Na conta do cliente, adicionar uma seção que registra compras anteriores.
- **Filtros de Busca**: Permitir que o cliente filtre produtos por atributos específicos (ex.: cor, tamanho).

---

## Checklist do Aluno

### Etapa 1: Criação do Catálogo de Produtos
- [x] Criar a classe `Produto` com os atributos: `nome`, `valor`, `descricao`, `marca`
- [x] Criar subclasses para os itens (camisetas, calças, sapatos, relógios, bonés)

### Etapa 2: Promoções Escalonadas
- [X] Implementar promoções de acordo com a quantidade de itens e valor adicional de compra
- [X] Exibir o valor total com desconto (se aplicável)

### Etapa 3: Menu de Navegação e Carrinho de Compras
- [ ] Criar navegação para explorar produtos e ver detalhes
- [ ] Implementar a funcionalidade de adicionar produtos ao carrinho
- [ ] Exibir carrinho com valor total e aplicar promoções

### Etapa 4: Criação de Conta e Verificação de Saldo
- [ ] Implementar cadastro e login
- [ ] Adicionar função para depósito de saldo
- [ ] Verificar saldo antes de finalizar a compra

### Etapa 5: Menu Exclusivo para Funcionários
- [ ] Adicionar funcionalidade para inserir novos produtos
- [ ] Adicionar funcionalidade para remover produtos

### Extras (Opcionais)
- [ ] Histórico de Compras
- [ ] Filtros de Busca

---

Bom trabalho e aproveite o desafio!
