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

### 2.3. Spring vs Jakarta EE (Java EE)
a oracle decidiu transferir o Java EE para a eclipse foundation, na transferencia foi necessario trocar o nome de JavaEE para JAkarta EE, pois Java é uma marca registrada da oracle.

o JEE é baseado em especificaçoes. a ideia de especificacoes é padronizar a tecnologia. 

um exemplo é o JPA, que é uma especificacao que esta dentro do JEE, como uma subespecificacao.

o JPA foi a especificacao do Hibernate, que é mais antigo e agora o hibernate implementa a especificacao JPA. 

a consequencia é que agora podemos escolher outras implementaçoes de JPA concorrentes do Hibernate, pois elas tambem implementam o JPA.

com essas especificacoes, ganhamos o poder de escolha de soluçoes, pois varias delas implementam a especificacao JEE.

existem varias outras especificacoes dentro do JEE.

#### pontos fortes do JEE
-> portabilidade,
-> padronizacao 
-> estabilidade

#### spring
o spring tem um ecossistema muito grande, e traz muitas inovaçoes.
o core do spring é mais estavel porque é a parte mais antiga do sistema. mas os outros projetos spring que evoluem muito rapido e por isso nao é muito incomum quebra o codigo entre versoes, sendo necessario fazer algum ajuste quando se troca de versoes.
o spring tem muitas inoveçoes, sendo preferivel a inovacao à estabilidade.

qual escolher, spring ou JEE?
qualquer um dos dois sao boas opçoes. em alguns momentos o spring e JEE concorrem mas em outros momentos eles se complementam.

o spring implementa o JEE, e o uso de um nao impede a utilizacao do outro.

por exemplo se voce usar spring MVC, voce esta usando a implementacao de servlets do JEE.

se voce usar Spring data JPA, voce esta usando tambem JPA, que é uma especificacao JEE.

mas nada impede de voce usar JPA direto no sistema spring, sem a implementacao spring data.

se voce usar um projeto JEE mas usar componentes do spring, sem problemas.

existem alguns projetos spring que concorrem diretamente com o JEE. nesse caso somente um pode ser usado.
ex. a injeçao de dependencias, no JEE agente tem o CDI, no spring framework.

para desenvolver rest API no JEE agente pode usar o JAX-RS e no spring agente usa o spring MVC.

### 2.4. Conhecendo o Spring Boot
antigamente, os projetos spring era configurados usando arquivos XML. e isso era muito ruim pois eram necessarios varios arquivos e um erro de escrita passava desapercebido e so identificado na hora que estiver rodando a aplicacao.
por isso, a partir da versao 3 do spring foi possivel usar a configuracao programatica, evitando assim os erros de digitacao.
mas mesmo assim, eram necessarios varios arquivos e com essa configuracao excessiva, os desenvolvedores perdem o foco no desenvovimento das regras de negocio.

com todo esse problema surgiu o spring boot, que veio para simplificar a configuracao do projeto.

o spring boot utiliza conceito de convention over configuration, usando uma visao opnativa para a configuracao do projeto.
uma visao opnativa quer dizer que ele utiliza as configuracoes que ele identifica como sendo as melhores.

claro que é possivel customizar essas configuracoes, mas o spring usa as configuracoes mais usadas no mercado.

o spring boot nao gera codigo, ele apenas auto configura os projetos.

ao trabalhar com maven, pe necessario adicionar varias dependencias no POM.
com isso, o POM pode ficar bastante longo e complexo, levando a erros de incompatibilidade entre versoes.

o spring boot facilita isso tambem, pois ele fornece os starters, que sao dependencias que agrupam outras dependencias.

se voce trabalhar com JPa por exemplo, se voce adicionar o starter, ele ja traz todas as dependencias necessarias e compativeis, nao havendo conflito entre elas.

o spring boot facilita a implementaçao.

o spring boot é uma forma de acelerar a configuracao do projeto. spring boot nao substitui outros projetos, como o spring MVC. eles sao complementares.

o spring boot nao é um framework para desenvolvimento web, ele é apenas uma camada de abstracao em cima do spring, simplificando o desenvolvimento de aplicacoes.

somente o spring boot sem o spring mvc voce nao consegue desenvolver para web.











