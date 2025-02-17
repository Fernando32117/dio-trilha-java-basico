# ContaBanco  

## Desafio de Sintaxe  

Neste projeto, vamos exercitar o conteúdo apresentado no módulo de Sintaxe codificando um cenário onde será criada uma conta em banco.  

### Objetivo  

Criar um programa que recebe informações de conta bancária via terminal e exibe uma mensagem de agradecimento ao usuário com os dados informados.  

### Atributos da Conta  

Abaixo estão os atributos que o programa irá coletar do usuário:  

- **Numero:** Inteiro (Exemplo: 1021)  
- **Agencia:** Texto (Exemplo: 067-8)  
- **Nome Cliente:** Texto (Exemplo: MARIO ANDRADE)  
- **Saldo:** Decimal (Exemplo: 237.48)  

### Estrutura do Projeto  

Dentro do projeto, crie a classe `ContaTerminal.java`, que será responsável pela implementação do programa.  

### Instruções para o Usuário  

O programa irá solicitar que o usuário insira as seguintes informações através do terminal:  

1. **Número da Agência**:   
   - Mensagem: "Por favor, digite o número da Agência!"  
  
2. **Número da Conta**:   
   - Mensagem: "Por favor, digite o número da Conta!"  
  
3. **Nome do Cliente**:   
   - Mensagem: "Por favor, digite o nome do Cliente!"  
  
4. **Saldo**:   
   - Mensagem: "Por favor, digite o saldo!"  

### Exibição da Mensagem  

Após a coleta das informações, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."


Os campos entre colchetes `[ ]` devem ser substituídos pelas informações inseridas pelos usuários.  