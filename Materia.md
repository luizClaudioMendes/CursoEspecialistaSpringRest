# Especialista Spring Rest
## Especialista Spring Rest
### iniciado em 26/10/2020
### terminado em ANDAMENTO

## Especialista Spring Rest

### 1.5. Preparando o ambiente de desenvolvimento: JDK e STS for Eclipse


#### Qual versão iremos usar?
Embora durante as gravações das aulas o instrutor tenha usado Java 12, atualmente a nossa recomendação é que você use Java 11. Entenda porquê:

Atualmente as versões do Java são lançadas a cada 6 meses. Isso é bem interessante por diversos motivos, como nos trazer novidades com mais frequência, por exemplo.

Dentre estas versões que são lançadas de 6 em 6 meses, também temos as versões de suporte de longo prazo, as chamadas versões LTS, que são lançadas de 3 em 3 anos.

As versões LTS do Java nos proporcionam mais estabilidade e um suporte por mais tempo. Por isso, neste curso nós recomendamos que você use Java 11, que é a versão LTS atual.

#### Fazendo download do OpenJDK
Para desenvolver aplicações servidoras com Java, precisamos do kit de desenvolvimento Java instalado (JDK).

Eu recomendo que você instale o OpenJDK, que é uma implementação da plataforma Java open source e gratuita, pronta para ser usada em produção.

Vamos usar o OpenJDK da AdoptOpenJDK, que fornece uma implementação do OpenJDK totalmente de graça e com suporte de longo prazo garantido.

Para começar, faça download do arquivo de instalação. Escolha a versão adequada para seu sistema operacional e deixe marcadas as opções OpenJDK 11 (LTS) e HotSpot.

#### Instalando o OpenJDK no Windows
Extraia o arquivo ZIP baixado em uma pasta qualquer. Essa extração criará a pasta "jdk-11.x.x".

Acesse o painel de controle e clique em "Sistema" e depois "Configurações avançadas do sistema".

Acesse a aba "Avançado" e clique no botão "Variáveis de ambiente".


Clique no botão "Novo", digite o nome da variável JAVA_HOME e no valor, informe o caminho completo da instalação do JDK e clique no botão "OK".


Encontre e selecione a variável "Path" e clique no botão "Editar". Clique no botão "Novo", adicione a entrada %JAVA_HOME%\bin e clique no botão "OK".


Em seguida, clique em "OK" novamente.

Abra o prompt de comando e verifique se a instalação foi feita com sucesso, executando os comandos baixo:

$ java -version
$ javac -version

#### Instalando o OpenJDK no macOS
Abra o terminal e extraia o arquivo baixado.

$ cd ~/Downloads
$ tar xf OpenJDK11U-jdk_x64_mac_hotspot_11.0.6_10.tar.gz
Mova a pasta extraída para o local onde o seu sistema operacional procura pelo JDK instalado.

$ sudo mv jdk-11.0.6+10 /Library/Java/JavaVirtualMachines/
Confira se o JDK foi instalado corretamente, executando os seguintes comandos:

$ java -version
$ javac -version

#### Instalando o OpenJDK no Ubuntu (Linux)
Para instalação no Ubuntu, não precisamos baixar o JDK diretamente do site.

Abra o terminal e execute o comando abaixo:

$ wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -
Agora adicione o repositório do AdoptOpenJDK com o comando:

$ sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/
Depois, atualize os repositórios:

$ sudo apt update
Agora execute a instalação do OpenJDK:

$ sudo apt install adoptopenjdk-11-hotspot
Aguarde a instalação ser concluída.

Talvez essa versão instalada não seja definida como a padrão do seu sistema operacional. Para ter certeza que vamos usar a versão correta, execute o comando abaixo:

$ sudo update-alternatives --config java
Você verá uma lista dos JDKs instalados na sua máquina, mais ou menos assim:

Existem 3 escolhas para a alternativa java (disponibiliza /usr/bin/java).

  Selecção   Caminho                                              Prioridade Estado
------------------------------------------------------------
  0            /usr/lib/jvm/adoptopenjdk-11-hotspot-amd64/bin/java   1111      modo automático
  1            /usr/lib/jvm/adoptopenjdk-11-hotspot-amd64/bin/java   1111      modo manual
  2            /usr/lib/jvm/java-11-openjdk-amd64/bin/java           1111      modo manual
* 3            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java        1081      modo manual
Depois você deve digitar o número correspondente à versão que deseja. No nosso caso é a opção de número 1:

 1            /usr/lib/jvm/adoptopenjdk-11-hotspot-amd64/bin/java   1111      modo manual
Em seguida, confira se o JDK foi instalado com sucesso:

$ java -version
$ javac -version
Deverá aparecer algo como:

openjdk version "11.0.6" 2020-01-14
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.6+10)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.6+10, mixed mode)

#### Links úteis
OpenJDK 11 da AdoptOpenJDK --- https://adoptopenjdk.net/releases.html?variant=openjdk11&jvmVariant=hotspot
OpenJDK 11 da Oracle (sem suporte e sem updates de segurança) -- https://jdk.java.net/archive/
JDK 11 da Oracle (não pode ter uso comercial sem uma licença) -- https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
Spring Tool Suite

### 2.1. Por que aprender e usar Spring?

#### o que é spring?
spring é uma tecnologia de backend, nao é um framework apenas mas um conjunto de projetos que resolvem varios problemas de um programador backend. ele ajuda a criar aplicacoes java com simpicidade e facilidade.

como existem muitos projetos spring, é comum se referenciar a eles como ecosistema spring.

o spring deve ajudar nos a focar nas regras de negocio ao inves de perder tempo desenvolvendo itens de arquitetura comuns.

#### porque usar spring?
- canivete suiço para desenvolvedores java (ele resolve varios problemas no desenvolvimento de software)
- simplicidade (reduzir a complexidade)
- maturidade (tecnologia bem madura usada por varias empresas)
- modularidade (spring nao é um projetao gigante, ele é organizado por projetos e subprojetos e agente pode escolher quais desses projetos agente quer usar)
- evolucao constante (o spring esta sempre sendo evoluido)
- open source
- comunidade grande e forte
- popularidade
- empregabilidade

### 2.2. Conhecendo o ecossistema Spring
o site do spring é o 
www.spring.io

o ecossitema spring tem varios projetos e subprojetos.
como ele é modular, é possivel utilizar somente um ou varios modulos.

