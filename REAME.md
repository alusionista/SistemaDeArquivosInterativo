# Sistema de Arquivos Interativo - README

O Sistema de Arquivos Interativo é um projeto Java que oferece uma interface de linha de comando para explorar e interagir com os arquivos e diretórios do sistema operacional. Com esta aplicação, você pode navegar pelos diretórios, listar o conteúdo de um diretório, abrir arquivos de texto e obter detalhes sobre os arquivos.

## Requisitos

Para executar o Sistema de Arquivos Interativo, você precisará do seguinte:

- Java 8 ou superior instalado no seu sistema.

## Como Executar

1. Clone ou faça o download do repositório do projeto.

2. Abra um terminal ou prompt de comando.

3. Navegue até o diretório do projeto.

4. Compile o código-fonte com o seguinte comando:

```
javac -d bin src/com/alusionista/*.java
```

5. Após compilar o código, acesse o diretório "bin" com o comando:

```
cd bin
```

6. Execute o programa com o seguinte comando:

```
java com.alusionista.Application
```

7. O programa iniciará e exibirá uma mensagem de boas-vindas. Você pode começar a interagir digitando comandos no prompt.

## Comandos Disponíveis

A seguir, estão os comandos que você pode usar na interface do Sistema de Arquivos:

1. `LIST`: Lista o conteúdo do diretório atual.

2. `SHOW <nome_do_arquivo>`: Exibe o conteúdo de um arquivo de texto. (Exemplo: `SHOW arquivo.txt`)

3. `BACK`: Retorna ao diretório pai (diretório anterior).

4. `OPEN <nome_do_diretorio>`: Abre o diretório especificado. (Exemplo: `OPEN pasta`)

5. `DETAIL [nome_do_arquivo]`: Exibe detalhes sobre o arquivo especificado ou o arquivo atual se nenhum nome for fornecido.

6. `EXIT`: Encerra o Sistema de Arquivos Interativo.

## Observações

- O Sistema de Arquivos Interativo inicia no diretório raiz "C:". Tenha cuidado ao executar comandos que podem afetar o sistema de arquivos do seu computador.

- Certifique-se de digitar comandos corretamente para evitar exceções ou comportamentos inesperados.

- O programa só suporta a leitura de arquivos de texto (extensão .txt).

## Contribuição

Se você deseja contribuir para este projeto, sinta-se à vontade para abrir problemas ou enviar solicitações de pull no repositório do projeto.

---
