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

### 2.5. Criando um projeto Spring Boot com Spring Initializr


para criar um projeto springboot é muito facil.

no STS, selecione new project.
procure por spring starter project

vai abrir uma tela de configuracao.

service URL - nao se altera, esta url é a url de servico do spring para a criacao de projetos. se nao tiver o STS voce pode acessar diretamente esta pagina para criar um projeto e importar no eclipse.

location - local onde sera criado o projeto

type - maven / gradle

packaging - jar / war

java version

language -  java

group - dominio da empresa ao contrario ex: com.algaworks

artifact - algafood-api

version

description 

package - o pacote inicial java ex: com.algaworks.algafood


clique em next e aparecera uma nova tela com as dependencias

spring boot version - 

adicionar a dependencia -> spring web starter

clicar em finish

pronto. o projeto esta pronto.

caso tenha feito pelo browser no site do spring intializr, basta somente importar o projeto na IDE.

### 2.6. Conhecendo o Maven e o pom.xml de um projeto Spring Boot

maven é uma ferramenta de gerenciamento de dependencias e automaçao de builds de projetos java.

a estrutura de pastas do projeto é a seguinte:

=> src/test/java

local onde colocar as classes de teste

=> src/main/java

onde colocamos o codigo fonte do projeto

=> src/main/resources

onde colocamos arquivos de configuracao, imagens, etc

esta estrutura é padronizada pelo maven. sempre que voce utilizar o maven, ele tera esta estrutura.

na raiz do projeto foi criado o arquivo POM.xml (Projet Object Model).

os arquivos mvnw sao arquivos maven wrapper que servem para executar o maven no terminal mesmo sem ter o maven instalado.

so que o eclipse/sts ja tem um maven embutido.

#### builds do projeto
no projeto, o maven ajuda a fazer o build do projeto.

para gerar um build para execucao externa do projeto basta clicar com o direito no projeto > run as > maven build

em goals, colocar 'package' e clicar em run

quando ele terminar, ele cria a pasta target.

dentro da pasta tem um jar com o projeto empacotado.

para empacotar pela linja de comando basta colocar o comando:

mvn package que ele executara o mesmo processo descrito acima

#### para iniciar o projeto depois do empacotamento:

na linha de comando:

java -jar NOME_DO_ARQUIVO_JAR

pronto. o projeto inicializara.

#### maven clean
o clean limpa os arquivos criados por builds anteriores, ou seja, ele apaga a pasta target no projeto.

#### POM.XML
o coracao do maven no projeto é o pom.xml

<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.1.7.RELEASE</version>
	<relativePath/> <!-- lookup parent from repository -->
</parent>

isto diz que agente esta herdando configuracoes de um outro local.

groupId - categoriza os projetos

artifactId - identificador do projeto

entao o que falamos é que, estou usando spring boot e quero que ele seja baseado nas configuracoes herdadas da versao 2.1.7 do spring boot.

agora as configuracoes do nosso projeto:

<groupId>com.algaworks.testes</groupId>
<artifactId>algafood-api-testes</artifactId>
<version>0.0.1-SNAPSHOT</version>
<name>algafood-api-testes</name>
<description>projetos para testes do capitulo 2
</description>

estas informaçoes foram as apresentadas no momentod e criacao do projeto.


<properties>
	<java.version>11</java.version>
</properties>

as propriedades sao propriedades do projeto, onde podemos criar qualquer propriedade para usar no projeto.

as propriedades do parent sao sobrescritas por estas, entao cuidado para nao criar propriedades cujo nome sejam identicas as existentes no projeto pai.

#### ver dependencias na linha de comando
embora na IDE seja possivel ver a arvore de dependencias ou a lista de dependencias no arquivo pom.xml, tanto no proprio arquivo quanto nas abas que a IDE fornece, tambem é possivel ve-las na linha de comando.

basta digitar:
mvn dependency:tree
ou
mvn dependency:resolve

OBS: o comando pode ser mvn se usar o maven instalado no computador ou se quiser usar o maven do projeto, utilizar mvnw em vez de mvn.

#### repositorio local do maven
quando agente baixa as dependencias, o maven armazena-as em uma pasta local, chamada repositorio local.

### 2.7. Criando um controller com Spring MVC

package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * esta classe servira como exemplo de como criar uma
 * endpoint simples.
 * 
 * agente vai criar uma endpoint simples e testa-la no 
 * browser
 * 
 * esta classe tem um metodo chamado hello. agente quer
 * acessar a endpoint pelo browser e receber a resposta
 * 'hello!'
 * 
 *  - anotar a classe com @Controller 
 *  - anotar o metodo
 *  -- @GetMapping("caminho pra chegar na resposta")
 *  -- @ResponseBody -- necessario para que o spring
 *  retorne a string para o browser
 *  
 *  
 *  iniciar a aplicacao
 *  
 *  basta acessar no browser da seguinte forma:
 *  localhost:8080/hello
 * 
 */

@Controller
public class MeuPrimeiroController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}

}

### 2.8. Restart mais rápido da aplicação com DevTools
existe uma ajuda muito legal no spring para nos desenvolvedores.

cada vez que alteramos uma classe, do jeito que esta hoje o projeto, é necessario fazer um restar da aplicacao, o que leva muito tempo.

entao no spring existe o DevTools.

para ativar o DevTools basta

clicar com o botao direito no projeto
> spring > add DevTools

isso ira inserir no pom uma outra dependencia:

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-devtools</artifactId>
</dependency>

pronto. agora sempre que voce salvar uma classe ela sera carregada automaticamente.

o devtools fica monitorando as classes do projeto. quando ha uma alteração o devtools somente recarrega a classe alterada.
o classloader é que é responsavel por esse comportamento.
tudo o que nao muda nao é recarregado de novo.

o devtools somente atua em desenvolvimento.

### 2.9. O que é injeção de dependências?

vamos supor que temos um projeto, que tem as classes cliente e produto.

supomos agora que quando um cliente se cadastrar, ele devera receber um email de confirmacao.

e supomos agora que quando ele comprar um produto ele recebera um SMS.

entao , na classe de servico AtivacaoClienteService, tem um metodo ativar que recebe um cliente.

após alterar o cliente, ela devera notificar o cliente que ele esta ativo, via email.

para dividir a responsabilidade, vamos criar uma classe chamada NotificadorEmail. nela tem um metodo notificar que recebe o cliente e a mensagem.

entao, na classe AtivacaoClienteService, logo apos ativar o cliente agente no metodo ativar, agente coloca:

NotificadorEmail notificador = new NotificadorEmail();
notificador.notificar(cliente, "seu cadastro esta ativo");

bom, legal. conseguimos separar as responsabilidades.

se criarmos uma classe main, so para testar e dentro do metodo main colocamos:

Cliente joao = new Cliente("joao", "joao@teste.com", "6199999999");

Cliente maria = new Cliente("maria", "maria@teste.com", "6188888888");

agora instanciamos o servico de notificacao de clientes:

AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();

ativacaoCliente.ativar(joao);
ativacaoCliente.ativar(maria);

beleza. nada de mais

imagina que agora temos uma nova classe de servico chamada EmissaoNotaFiscalService e que nela tem um metodo que emite uma nota fiscal recebendo um cliente e um produto.

neste mesmo metodo, precisamos avisar ao cliente que a nota fiscal foi emita.

entao como da outra vez, apos emitir a nota fiscal no metodo,
instanciamos o notificador

NotificadorEmail notificador = new NotificadorEmail();
notificador.notificar(cliente, "nota fiscal do produto foi emitida");

beleza. exatamente igual a outra.

bom agora temos duas classes de servilo usando a classe de notificacao email.

poderiamos ter centenas de outras classes usando o notificador de email desta forma.

por padrao o nosso sistema notifica por email.
mas surge uma nova necessidade. todos os clientes precisam ser notificado por SMS.

entao criamos uma nova classe, chamada NotificadorSMS e nela tem um metodo notificar que recebe cliente e a mensagem. tirando a parte de implementar o envio de email e sms que nao interessa ao nosso exemplo aqui, este metodo é identico ao do NotificarEmail.

agora, ja implementamos a notificacao por sms mas o sistema ainda usa a notificacao por email.

poderiamos sair caçando no sistema onde tiver NotificadorEmail notificador = new NotificadorEmail() e substituir por:

NotificadorSMS notificador = new NotificadorSMS()

imagina isso em centenas de classes. sem contar que voce pode ter uma complexidade no construtor.

alem de que voce esta alterando coisas que ja estavam testadas so para fazer uma pequena alteraçao.

se tiver que voltar atras, vai ter que mexer tudo de novo.

nesse cenario entao, da para perceber que temos um acoplamento muito grande no codigo, da implementacao do notificador com as classes de negocio.

tem uma forma de diminir esse acoplamento?

agente pode criar uma interface, com o nome de notificador, nela tem um metodo chamado notificar, que recebe o cliente e a mensagem.

e agora as classes NotificadorEmail e NotificadorSMS implementam a interface Notificador.

e agora como usar?

vamos colocar em pratica o conceito de polimorfismo.

o polimorfismo é a capacidade que o objeto tem de ser visto de varias formas.

ou seja, ao inves de falarmos de notificadorEmail e notificadorSMS vamos falar de notificador.

na classe AtivacaoClienteService, entao, que era um lugar onde se usava new NotificadorEmail, vamos criar uma propriedade chamada notificador, do tipo da interface notificador.

agora no metodo ativar, agente apaga a instanciacao do notificadorEmail que estava la, e começamos a usar a propriedade notificador (que é a interface).

mas se rodarmos agora, o codigo vai dar nullpointer, pois ninguem esta instanciando o notificador.

se criarmos por exemplo um construtor na classe AtivacaoClienteService e nele colocarmos a instanciamento da prorpriedade notificador, nao mudamos nada, somente o local onde é instanciado.

o que agente faz é receber um objeto de tipo notificador (interface) no construtor, e setamos na propriedade esse objeto recebido.

assim nao temos mais o construtor vazio da classe, entao para usar a AtivacaoClienteService, somente se passar o notificador pretendido no construtor.

entao o notificador se transformou em uma dependencia da classe AtivacaoClienteService.

na classe EmissaoNotaFiscalService fazemos a mesma coisa.
de novo para usar a classe sera necessario passar o notificador pretendido como parametro no construtor.

agora a classe  AtivacaoClienteService e EmissaoNotaFiscalService nao estao mais acopladas na implementacao do notificador. podemos agora ate ter um notificadorWhatsapp que nao precisamos mudar mais nada nessas classes.

elas somente precisam saber que precisam notificar. a forma como vai ser feita a notificacao nao importa mais para elas, somente para quem precisa enviar a notificacao.

isso é o principio de inversao de controle.
ou seja as classes AtivacaoClienteService e EmissaoNotaFiscalService nao tem mais o controle de como a notificacao vai ser feita (e nem cabe a elas isso).

entao a notificacao agora esta baseada no contrato da interface.

essa inversao de controle (Inversion Of Control) se chama IOC.

depois que agente fez essas alteraçoes nas duas classes do notificador, vamos no metodo que chama elas, no nosso exemplo o metodo main.

nele agora instanciamos o notificador que queremos (email ou sms) mas colocamos o valor numa variavel do tipo notificador (interface).

Notificador notificador = new NotificadorEmail();

por exemplo.

e na hora de criar a service AtivacaoClienteService, agente passa o notificador pretendido como parametro.

AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);

nessa hora, estamos manualmente injetando o notificador na instanciacao da AtivacaoClienteService.

isso é uma injeçao de dependencias.

se rodarmos agora o projeto sera notificado por email.

se tivermos que alterar para sms basta alterar 

Notificador notificador = new NotificadorEmail();

para 

Notificador notificador = new NotificadorSMS();

pronto.

ficamos com baixo acoplamento entre as classes.

Notificador.java
package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}

NotificadorEmail.java
package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}

NotificadorSMS.java
package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}

AtivacaoClienteService.java
package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}

EmissaoNotaFiscalService.java
package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...
		
		this.notificador.notificar(cliente, "Nota fiscal do produto "
				+ produto.getNome() + " foi emitida!");
	}
	
}


Main.java
package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "1177772222");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}
	
}


### 2.10. Conhecendo o IoC Container do Spring
a funcionalidade mais importante de todo o ecosistema spring é o spring IoC container que é a implementacao de injecao de dependencias do framework.

esse container tambem é conhecido como spring context.

ele é o responsavel de fazer a injeçao de dependencias no Spring.

quando agente roda uma aplicacao spring o Ioc container é instanciado e começa a instanciar os beans que ele deve gerenciar.

beans ou dependencies como tambem sao conhecidos, sao objetos gerenciados pelo container do spring.

o container de ioc do spring é representado pela interface ApplicationContext.

### 2.11. Definindo beans com @Component
como definir um bean para que este fique disponivel para ser injetado.

como defino que uma classe é um bean spring, um componente spring?

para fazer isso agente usa a anotacao @Component

com essa anotaçao estou informando ao spring que essa classe é um componente spring. gerencia ele.

ao iniciar a aplicacao, o spring scaneia as classes e as que possuem essa anotacao sao criadas.
entao ela ja é criada e colocada no container.

as classes que utilizam a anotacao @Controller tambem sao gerenciadas e criadas ao inicializar.
dentro do codigo da @Controller podemos ver que ela tambem utiliza as anotacoes @Component.

o @Controller tem a semantica de alem de ser um componente spring ela tambem responde por requisicoes web.

como que o spring descobre os beans?

na incializacao da aplicacao ele vai escanear a aplicacao procurando pelas anotaçoes do spring, classes estas que serao gerenciadas pelo container.

porque ele executa o component scan?

quando criamos o projeto com o spring boot, ele cria uma classe com o nome do projeto (XXXXapplication.java).

nela existe um metodo main que inicia a aplicacao spring, mas essa classe tem uma anotacao importante.

@SpringBootApplication

essa anotacao tem dentro dela, uma outra anotacao importante:

@ComponentScan

aqui é onde esta configurando que todas as classes que pertencem ao pacote onde esta classe se encontra ou a sub-pacotes, devem ser escaneadas.

### 2.12. Injetando dependências (beans Spring)

uma forma de injetar dependencias no spring é usando o construtor com parametros.

vamos usar o AtivacaoClienteService como exemplo.

nele temos a prorpriedade NotificadorEmail.

private NotificadorEmail notificador;
	
public void ativar(Cliente cliente) {
	cliente.ativar();

	notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
}

porem, ela estara sempre nula nesse momento.

o NotificadorEmail é um bean spring. como os dois sao beans springs agente pode injetar uma na outra.

basta agente criar o construtor com parametros na classe AtivacaoClientes Service.


@Component
public class AtivacaoClienteService {

	private NotificadorEmail notificador;
	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

na inicializacao do spring, ele instacializa todos os beans gerenciados na sequencia que eles sao necessarios.

uma das formas de fazer a injeçao de dependencia é usando o construtor com o parametro necessario.

### 2.13. Usando @Configuration e @Bean para definir beans

agora vamos ver outra forma de configurar beans no spring.

mas para isso vamos criar um problema:

na classe NotificadorEmail, vamos adicionar uma configuracao a mais.

criamos uma prorpriedade boolean caixaAlta, que significa que quando ele estiver true, a mensagem deverá ser escrita em caixa alta.

e criamos outra, hostServidorSMTP, que sera recebida no construtor.

entao ela estava assim:
@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}

e agora vai ficar assim:
@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSMTP;
	
	public NotificadorEmail(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s usando o servidor SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
	}
	
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}

bom agora temo o problema.
a classe string nao é uma classe gerenciada do spring. entao no momento de instanciar esta classe ele nao sabe o que colocar no construtor para conseguir cria-la.

public NotificadorEmail(String hostServidorSMTP) {
	this.hostServidorSMTP = hostServidorSMTP;
}

mesmo que ele soubesse o que colocar no parametro string, ele nao configuraria o atributo caixaAlta.

ou seja, ele nao sabe configurar a classe para que ela seja instanciada corretamente.

existem alguns momentos em que agente quer customizar a criacao de um bean para que ele fique disponivel no spring.

como fazer isso?

primeiro, agente retira da classe a anotacao @Component.

ao fazer isso o spring nao vai mais tentar instanciar esta classe e dara erro pois esta classe é dependencia injetada de outra.

agora precisamos informar ao spring como que ele instancia esta classe.

ai devemos criar uma nova classe de configuracao do projeto. vamos chama-la neste momento de AlgaConfig.java

este tipo de classe pode ter qualquer nome. por convencao colocamos config no nome para poder facilmente identifica-las.

essas classes de configuracao sao anotadas com @Configuration

@configuration é tambem um @Component mas com o objetivo especifico de definicao de beans.

dentro desta classe criamos um metodo publico chamado notificadorEmail, que retona um NotificadorEmail.java

public NotificadorEmail notificadorEmail() {
	NotificadorEmail notificador = new NotificadorEmail("smtp.teste.config");
	notificador.setCaixaAlta(true);//configurando a caixa alta
	
	return notificador;
}

ele agora é o responsavel por criar e configurar a classe NotificadorEmail.

mas ainda nao esta pronto.

ele precisa da anotacao @Bean

@Bean
public NotificadorEmail notificadorEmail() {
	NotificadorEmail notificador = new NotificadorEmail("smtp.teste.config");
	notificador.setCaixaAlta(true);//configurando a caixa alta
	
	return notificador;
}

essa anotacao indica ao spring que este metodo é o responsavel por instanciar a classe NotificadorEmail.

dentro do IoC container, por padrao o bean sera nomeado como 'notificadorEmail', que é exatamente o nome do metodo de definicao do bean.

AlgaConfig.java
@Configuration
public class AlgaConfig {
	
	// este metodo é o responsavel por criar e configurar a classe NotificadorEmail
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.teste.config");
		notificador.setCaixaAlta(true);//configurando a caixa alta
		
		return notificador;
	}
}

desta forma o projeto ja vai funcionar corretamente.

Ok. agora vamos para um problema mais complexo.

na classe AtivacaoClienteService, que tem um bean como dependencia, que neste caso é uma implementacao da interface Notificador, tambem esta anotada com @Component.

vamos tirar essa anotacao para que possamos configurar ela na classe AlgaConfig.java

agora no AlgaConfig precisamos fazer um metodo para instancia-la.

@Bean
public AtivacaoClienteService ativacaoClienteService() {
	return new AtivacaoClienteService(notificador);
}

OPA! agora temos um outro problema: o construtor da classe precisa de um objeto notificador, que neste momento agente nao tem.

se agente instanciar lá com new NotificadorEmail, 
nao estamos criando um objeto gerenciado pelo spring.

o correto é chamar o metodo notificadorEmail da classe config.

@Bean
public AtivacaoClienteService ativacaoClienteService() {
	return new AtivacaoClienteService(notificadorEmail());
}

desta forma funciona!!!!

funcionou legal porque neste exemplo voce so tem uma classe de configuracao mas existem alguns cenarios em que voce tem varias classes de configuracao.

neste momento agente nao vai mais usar a classe AlgaConfig. podemos ate apaga-la.

vamos criar outra classe de config, chamada de notificacaoConfig.java e vamos colocar o metodo de configuracao do bean de NotificacaoEmail.

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.teste.config");
		notificador.setCaixaAlta(true);//configurando a caixa alta
		
		return notificador;
	}
}

e vamos criar outra classe agora chamada ServiceConfig.java e levar para la o metodo de configuracao da AtivacaoClienteService.java

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}

o problema agora é que nao temos mais o metodo notificadorEmail() para pegar o notificador, porque ele esta na outra classe de config.

estamos com esse problema agora:
como faço quando quero instanciar um bean que depende de outros beans que nao foram definidos na mesma classe de configuracao ou nao foram definidos com o @Component?

basta que, no metodo de configuracao voce receba a classe pretendida.

o spring vai ver que voce precisa daquela classe que foi instanciada seja pelo @Component seja por uma classe de configuracao e ja vai ter ela criada para voce.

@Bean
public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
	return new AtivacaoClienteService(notificador);
}

pronto. ja temos o sistema funcionando novamente.


### 2.14. Conhecendo os pontos de injeção e a anotação @Autowired

continuando com o codigo da aula anterior, mas vamos fazer algumas alteracoes para que possamos usar o codigo de uma forma mais enxuta.

as definiçoes dos beans foram voltadas para @Component, 
e as classes de configuracao nao vao ser necessarias (@Configuration).

nesta aula vamos ver os pontos de injecao.

o que sao os pontos de injecao?
sao locais onde agente pode injetar os objetos dentro do beans.

neste exemplo, o construtor esta sendo um ponto de injecao:

@Component 
public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

existem outros pontos de injecao.

continuando com o exemplo do contrutor, neste caso é simples, pois somente existe um construtor na classe, logo o spring nao tem duvidas sobre o que fazer.

mas e se tivessemos outro construtor?

@Component 
public class AtivacaoClienteService {

	//usando a interface para diminuir o acoplamento com a implementacao do notificador
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public AtivacaoClienteService(String qualquer_coisa) {
		
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

nesse caso o spring iria dar um erro, pois como ele identificou que existem dois construtores, ele nao soube qual dos dois utilizar e tentou usar o construtor padrao (o vazio).

como nessa classe implementamos construtores, o java nao implementou o construtor padrao, nisso o spring nao conseguiu encontra-lo e gerou um erro.

nesse caso, agente pode usar a anotacao @Autowired para definir qual construtor 'padrao' agente quer que o spring utilize.

a classe ficaria assim:
@Component 
public class AtivacaoClienteService {

	private Notificador notificador;
	
	@Autowired
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public AtivacaoClienteService(String qualquer_coisa) {
		
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

pronto. agora funciona corretamente.

a anotacao @Autowiered é opcional se somente existir um construtor.

outro ponto de injeçao é atraves de um setter:

@Component 
public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
}


somente deste jeito ele nao injetou o Notificador.

precisa usar a anotacao @Autowired

@Component 
public class AtivacaoClienteService {

	//usando a interface para diminuir o acoplamento com a implementacao do notificador
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
}

pronto. agora funciona corretamente de novo.

outro ponto de injeçao é no atributo:
@Component 
public class AtivacaoClienteService {

	@Autowired
	private Notificador notificador;
	
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

mesmo o atributo sendo privado, o spring consegue injetar ele.

mas qual o melhor?
o ideal é o do construtor pois ele deixa muito claro quando vamos instanciar a classe quais sao os elementos obrigatorios, neste caso do exemplo, o notificador.

mas o que agente sempre usa, por simplicidade, é no proprio atributo.

o problema de se usar no atributo é que dificulta um pouco os testes unitarios. é preciso fazer algumas tecnicas de mock para testar classes assim.


### 2.15. Dependência opcional com @Autowired
vamos ver agora como ter uma dependencia opcional dentro de um bean.

vamos usar como exemplo o AtivacaoClienteService

@Autowired
private Notificador notificador;

public AtivacaoClienteService(Notificador notificador) {
	this.notificador = notificador;
}

public void ativar(Cliente cliente) {
	cliente.ativar();

	notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
}

do jeito que esta aqui, o Notificador será sempre obrigatorio.

imagine que quando eu ativar o cliente, verifica se o notificador é nulo. se for faz uma coisa se nao for nulo notifica, deste jeito:

@Autowired
private Notificador notificador;

public AtivacaoClienteService(Notificador notificador) {
	this.notificador = notificador;
}

public void ativar(Cliente cliente) {
	cliente.ativar();

	if(notificador != null) {
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}else {
		System.out.println("Nao existe notificador mas cliente foi ativado");
	}
}

da forma que esta aqui, nao vai funcionar.

a anotacao @Autowired obriga que a classe seja injetada.

para colocar uma dependencia opcional agente precisa adicionar na anotacao @Autowired e colocar required = false

assim:
@Autowired( required = false)
private Notificador notificador;

public AtivacaoClienteService(Notificador notificador) {
	this.notificador = notificador;
}

public void ativar(Cliente cliente) {
	cliente.ativar();

	if(notificador != null) {
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}else {
		System.out.println("Nao existe notificador mas cliente foi ativado");
	}
}

pronto. agora se por algum motivo nao existir a classe injetada, o compilador nao reportará o erro e em runtime, se nao houver Notificador instanciado o codigo executara o else.

### 2.16. Ambiguidade de beans e injeção de lista de beans

vamos falar de ambiguidade de beans e como fazer a desambiguacao de beans injetando uma lista de beans.

imagine o seguinte:
alem de termos o NotificadorEmail, vamos ter tambem um NotificadorSMS. os dois vao continuar implementando Notificador.

@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através SMS no numero %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}

ao salvarmos a classe nova, obtemos um erro:

Parameter 0 of constructor in com.algaworks.algafood.service.AtivacaoClienteService required a single bean, but 2 were found:
	- notificadorEmail: defined in file [E:\04-Google_drive\Desenvolvimento_2018\01-GIT_REPOSITORIES\2020-05-EspecialistaSpringRest\CursoEspecialistaSpringRest\projeto_testes_capitulo_2\algafood-api-testes\target\classes\com\algaworks\algafood\notificacao\NotificadorEmail.class]
	- notificadorSMS: defined in file [E:\04-Google_drive\Desenvolvimento_2018\01-GIT_REPOSITORIES\2020-05-EspecialistaSpringRest\CursoEspecialistaSpringRest\projeto_testes_capitulo_2\algafood-api-testes\target\classes\com\algaworks\algafood\notificacao\NotificadorSMS.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed


o que aconteceu é que na classe AtivacaoClienteService, tem uma injeçao de Notificador. antes a injecao nao tinha problemas porque somente uma classe estava implementando a interface, mas agora existem duas.

o spring nao sabe qual usar e por isso lança o erro.

required a single bean, but 2 were found

na parte do log onde tem 'action', o spring sugere algumas soluçoes. vamos adotar nesta aula a 'updating the consumer to accept multiple beans', ou seja, ao inves de um objeto do tipo Notificador, vamos poder ter uma lista:

 @Autowired 
private List<Notificador> notificadores;

desta forma o spring vai instanciar todos os beans que implementem Notificador

para concluir o codigo adicionamos:

public void ativar(Cliente cliente) {
		cliente.ativar();

		for (Notificador notificador : notificadores) {			
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	}

desta forma estamos falando que,
independente de qual Notificador for instanciado, pegue todos, e notifique.

nesse nosso exemplo, ele irá enviar um email e um SMS, mas se existissem outros notificadores, ele tambem iria notificar usando cada um deles.

### 2.17. Desambiguação de beans com @Primary

voltando as alteracoes da aula passada.

supondo que, em caso de ambiguidade, queremos que a classe NotificadorEmail tenha prioridade sobre as outras.

para isso basta usar a @Primary.


voltando a classe AtivacaoClienteService ao estado anterior:

@Component 
public class AtivacaoClienteService {

	
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

voltamos a ter o mesmo erro.

mas na classe NotificadorEmail, adicionando a anotacao @Primary:

@Primary
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}

o sistema volta a funcionar corretamente e no lugar que existir a ambiguidade, o spring seleciona o NotificadorEmail e envia a notificacao somente por email.

### 2.18. Desambiguação de beans com @Qualifier
voltando com o exemplo da aula anterior, retirando a anotacao @Primary. o problema da ambiguidade retorna.

vamos supor a seguinte situacao.
para comunicacoes urgentes, devemos usar o NotificadorSMS, para comunicacoes normais devemos usar o NotificadorEmail.

ao inves de usar a anotacao @primary, usamos a anotacao @Qualifier("NOME_QUALIFICADOR")

o @Qualifier coloca uma qualidade naquele bean.

entao, na classe AtivacaoClienteService, usamos acima da propriedade do Notificador, a anotacao @Qualifier("urgente"):

@Component 
public class AtivacaoClienteService {

	@Autowired
	@Qualifier("urgente")
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

e colocamos no notificadorSMS o @Qualifier

@Qualifier("urgente")
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através SMS no numero %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}

e colocamos no notificadorEmail o @Qualifier
@Qualifier("normal") 
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}


pronto. ambiguidade resolvida. 

### 2.19. Desambiguação de beans com anotação customizada

continuando com o exemplo da aula anterior e usando ainda o @Qualifier, vamos dar uma melhorada, para usarmos uma anotacao personalizada.

um problema quando agente usa a anotacao @Qualifier é que agente tem que usar string no identificador e strings nao sao checadas em tempo de compilacao e tambem dificulta a refatoracao.
@Qualifier("normal")

para resolver esse problema, que fica bem mais elegante e que usa qualifier.

entao, agente cria uma nova anotacao, neste caso vamos chamar de TipoDoNotificador

colocamos o NivelUrgencia como o value.
e anotamos a anotacao com @Qualifier
e @Retention(RententionPolicy.RUNTIME)

a retention informa quanto tempo a anotacao deve ficar na classe usada. se nao especificar nada nao vai funcionar. entao usamos o RententionPolicy.RUNTIME

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {
	
	NivelUrgencia value();

}


e criamos tambem uma enumeracao, para guardar os tipos de prioridade, bem simples:

public enum NivelUrgencia {

	URGENTE,
	NORMAL
}

blz. criamos nossa anotacao personalizada que tambem é um qualificador.

agora, na classe NotificadorSMS, em vez de usar o @Qualifier("urgente") vamos usar a nossa anotacao:

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {


e no NotificadorEmail a mesma coisa:
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

e no ativacaoClienteService, ao inves de usar o @Qualifier, usamos tambem nossa anotacao:

	@Autowired
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	private Notificador notificador;


pronto.
agora caso precisemos refatorar, ou alterar fica mais facil, ao inves de usar strings.

### 2.20. Mudando o comportamento da aplicação com Spring Profiles

o spring profiles é uma forma de separar componentes da aplicacao que serao disponibilizados em certos ambientes.

ex: producao e desenvolvimento

entao vamos imaginar a seguinte situacao:
no ambiente de desenvolvimento o sistema deve simular um mock de envio de email mas em produçao deve enviar o email.

entao o NotificadorEmail envia um email real e o NotificadorEmailMock simula o envio.

criamos o NotificadorEmailMock
@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL) 
@Component
public class NotificadorEmailMock implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}

e colocamos no NotificadorEmail o @Profile

@Profile("prod")
public class NotificadorEmail implements Notificador {

entao temos o profile prod e dev colocados.

como ainda nao criamos os profiles, essas duas classes ainda nao sao encontradas no spring.

entao em src/main/resources existe um arquivo de configuracao chamado application.properties

nele adicionamos:
spring.profiles.active=prod

isso indica ao spring que o profile default é o prod.

pronto. ao subirmos a aplicacao normalmente, ele assume o profile de prod e carrega todas as classes que nao tenham definicao de profile ou as que tenham o profile prod.

podemos substituir os profiles por linha do comando tambem.

no STS agente pode configurar, na aba Boot Dashboard, clicando com o direito no projeto > open config

e no campo profile colocar o profile desejado, nesse caso o dev

para passar por linha de comando:
java -jar projeto.jar -Dspring.profiles.active=dev


podemos passar outros profiles juntos, separando por virgula:

spring.profiles.active=prod,mysql,AWS

### 2.21. Criando métodos de callback do ciclo de vida dos beans

todos os beans no spring tem um ciclo de vida. os ciclos de vida sao 3, a criacao, a utilizacao e a destruiçao.

existem algumas maneiras de se interceptar o ciclo de vida de criacao e destruiçao. mas para que interceptar esses ciclos de vida? pode existir algum codigo que voce queira executar logo após a criacao do bean ou antes da sua destruiçao.

o primeiro metodo é utilizando anotaçoes do java:
na classe AtivacaoClienteService criamos dois metodos, que podem ter qualquer nome.
um deles sera chamado na inicializacao e o outro na destuiçao do bean.

a inicializacao usa a anotacao @PostConstruct e a destruiçao usa a anotacao @PreDestroy

(...)
private Notificador notificador;
	
@PostConstruct
public void inicializar() {
	System.out.println("Inicializando");
}

@PreDestroy
public void destruir() {
	System.err.println("destruindo");
}

public void ativar(Cliente cliente) {
(...)

o metodo inicializar é executado logo apos o contrutor ter terminado a construçao e todas as injeçoes terem sido injetadas.

o metodo destruir é executado antes da destruicao do bean.

outra forma de se fazer isso é usando a anotacao @Bean

usando este exemplo de uma aula anterior, quando utilizamos a configuracao da inicializacao de classes (@Configuration):

@Bean
public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
	return new AtivacaoClienteService(notificador);
}

com esses exemplo a situaçao é a seguinte:

eu quero chamar os metodos inicializar e destruir mas nao quero usar as anotaçoes do java e uso uma classe de configuracao de bean.

para isso, basta acrescentar na anotaca @Bean os metodos que queremos que sejam executados da seguinte forma:

@Bean(initMethod = "inicializar", destroyMethod = "destruir")
public AtivacaoClienteService ativacaoClienteService(

existe uma terceira forma, que seria implementando duas interfaces na classe


a InitializingBean tem o metodo afterPropertiesSet() que é o nosso metodo inicializar() e a DisposableBean tem o metodo destroy() que é o nosso destruir()


usando essa tecnica, os metodos tem obrigatoriamente que serem chamados pelos respectivos nomes nas interfaces.

### 2.22. Publicando e consumindo eventos customizados (EventListeners)

existe um design pattern bem conhecido chamado Observer.
ele principalmente deixa o acoplamento mais baixo entre as classes lancando eventos.

o spring tambem tem essa implementacao, que chamaram de EventHandler.

vamos continuar com o exemplo da classe ativacaoClienteService.

hoje ela esta assim:
@Autowired
@TipoDoNotificador(NivelUrgencia.URGENTE)
private Notificador notificador;

@PostConstruct
public void inicializar() {
	System.out.println("Inicializando");
}

@PreDestroy
public void destruir() {
	System.err.println("destruindo");
}

public void ativar(Cliente cliente) {
	cliente.ativar();

	notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
}

ela esta acoplada com a classe Notificador e tambem o metodo ativar() esta com duas responsabilidades, ativar e notificar.

agente pode alterar isso, fazendo com que nao chame diretamente dizer que queremos notificar o cliente, agente vai somente lançar um evento dizendo 'olha, o cliente foi ativado' e quem estiver ouvindo esse evento vai realizar as suas açoes.

para fazer isso vamos, ainda na classe AtivacaoClienteService, retirar a chamada do notificador e adicionar a dependencia do publicador de eventos:

@Component 
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	(...)
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

	}
}

agora vamos criar uma classe de evento:
public class ClienteAtivadoEvent {
	
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
}


o cliente dentro da classe é para levar os dados do cliente dento do evento.


agora precisamos implementar o listener desse evento:
@Component
public class CilenteAtivadoListener {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo usando eventos!");
	}
}

vamos acrescentar mais um listener ao evento. ao ativar o cliente vai criar uma nota fiscal.

@Component
public class CilenteAtivadoListener {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void notificarCliente(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo usando eventos!");
	}
	
	@EventListener
	public void emitirNotaFiscal(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para o cliente " + event.getCliente().getNome());
	}
}

pronto. agora na hora que ativar o cliente sera notificado e emitida uma nota fiscal.

o importante é notar que, embora tenhamos criado uma classe listener, esse metodo poderia ficar na respectiva service, nao sendo necessario criar classes somente para receber os listeners


### 2.23. Configurando projetos Spring Boot com o application.properties

o arquivo application.properties é onde colocamos as propriedades do nosso projeto.

o spring boot ja vem com um monte de propriedades já pre configuradas e que podemos sobrescrever.

vamos usar como exemplo a porta onde o tomcat inicializa a aplicacao, que por default é a 8080.

o spring tem um link que disponibiliza todas as configuracoes pre carregadas no sistema:
https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html

mas continuando com o exemplo. se quisermos trocar a porta onde o spring inicializa, basta procurarmos na lista a propriedade onde isso é setada, no caso a 
server.port

e colocar no nosso application.properties a porta pretendida:

server.port=8081

pronto. a porta foi alterada!

### 2.24. Substituindo propriedades via linha de comando e variáveis de ambiente

as propriedades do arquivo application.properties tambem podem ser alteradas via linha de comando e variaveis de ambiente.

supondo que voce gere o jar da applicacao e vai leva-la para a maquina de homologacao.

la voce quer que ela rode na porta 8083

entao na linha de comando voce digita:
java -jar nome_do_jar.jar 

ele inicia na porta definida no arquivo properties ou na porta default.

para mudar a configuracao:
java -jar nome_do_jar.jar --server.port=8083

pronto. a aplicacao vai inicializar na porta 8083

tem tambem outra forma que é por variavel de ambiente:

no linux ou mac é desta forma:
no terminal:
export NOME_VARIAVEL=VALOR
ex:
export SERVER_PORT=8083

para ver o valor da variavel:
echo $NOME_VARIAVEL

ex:
echo $SERVER_PORT

no windows, pela linha de comando:
set NOME_VARIAVEL=VALOR
ex:
set SERVER_PORT=8082

e para ver o valor:
echo %SERVER_PORT%

### 2.25. Criando e acessando propriedades customizadas com @Value

como criar e acessar propriedades customizas no spring.

imagine que agente queira configurar o host e a porta do servidor de email.

no application.properties agente cria as nossas propriedades customizadas.
os nomes das nossas propriedades podem ser qualquer coisa.

notificador.email.host-servidor=smtp.algafood.com.br
notificador.email.porta-servidor=25


na classe NotificadorEmail vamos usar elas.

para este exemplo vamos somente criar duas variaveis, para imprimir.

@Profile("prod")
public class NotificadorEmail implements Notificador {
	
	@Value("${notificador.email.host-servidor}")
	private String host;
	
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;
	
	(...)

a anotacao @Value é a responsavel por trazer o valor da propriedade.

para pegar a propriedade, dentro do @Value colocamos "${NOME_VARIAVEL}"

ex.
@Value("${notificador.email.host-servidor}")

e pronto. os valores ficam disponiveis na classe para utilizacao.


### 2.26. Acessando propriedades com @ConfigurationProperties

uma outra forma de se utilizar os valores das propriedades customizadas, e que é melhor que o @Value, pois permite refactor mais facilmente é usando uma classe anotada com @ConfigurationProperties

quando um projeto começa a crescer fica dificil manter a forma de usar as propriedades customizadas usando o @Value, pois se voce alterar um nome de uma variavel por exemplo voce precisa sair correndo atras no sistema todo onde ela foi usada.

entao agente pode criar varias classes de configuracao de propriedades.

como estamos falando de notificador, entao vamos criar a NotificadorProperties.java

public class NotificadorProperties {
	
	private String hostServidor;
	private Integer portaServidor;

}

os nomes dessas duas variaveis deve ser identicos aos das propriedades no application.properties, com o detalhe de ser camelCase e nao conter simbolos.

elas estao mapeando estas duas propriedades:
notificador.email.host-servidor=smtp.algafood.com.br
notificador.email.porta-servidor=25

entao host-servidor virou hostServidor e porta-servidor virou portaServidor

mas isso ainda nao funciona. precisamos colocar mais coisas:

precisamos adicionar na classe de configuracao 
a anotacao @Component 
a anotacao @ConfigurationProperties("notificador.email")
esta anotacao indentifica que este é um arquivo de propriedades e como parametro passamos o prefixo.
o prefixo é o que antecede o nome da variavel.

ex. a variavel:
notificador.email.porta-servidor=25

tem como nome: porta-servidor
e prefixo: notificador.email

e agora criar os getters e setters.

e pronto. a classe esta representando as configuracoes do notificador.

o STS, na classe anotada com @ConfigurationProperties, na propria anotacao pode emitir um alerta. as outras IDEs nao vao fazer isso mas voce pode fazer manualmente este procedimento.

o STS esta sugerindo que agente adicione no POM uma dependencia que auxilia o desenvolvedor gerando o autocomplete das classes de configuracao.

se adicionarmos a dependencia, no arquivo application.properties o autocomplete sera incrementado com as nossas novas configuracoes presentes na classe.

o codigo no pom que ele adicionou foi:
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-configuration-processor</artifactId>
	<optional>true</optional>
</dependency>

inclusive, por conta deste fato, é recomendado usar javadoc nas variaveis na classe de configuracao. essa documentaçao ira aparecer no autocomplete, da mesma forma que as configuracoes oficiais.

outro detalhe nas classes de configuracao:

se ao criarmos a variavel e atribuirmos um valor a mesma, ela sera usada como default. isso quer dizer que, se a propriedade nao tiver nenhum valor na application.properties, o valor que será usado é o da classe.

ex:
se especificarmos que a porta a ser usada seria a 99 como default, se nao houver lancamento dessa propriedade no arquivo application.properties ele utilizará 99 como valor.

/**
 * porta do serividor de email
 */
private Integer portaServidor = 99;


como usar os valores agora?
na classe que sera usado os valores, injetamos a classe properties que criamos.

no nosso exemplo, na classe NotificadorEmail, onde antes usamos as anotacoes @Value, agora usamos a nova classe de propriedades.


### 2.27. Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles)

podemos ter arquivos de configuracao baseados em perfis do spring.

lembrando que nestas configuracoes nao deve ter nenhuma informacao sensivel, como senhas e etc.

entao, em src/main/resources, podemos criar os arquivos .properties

o spring consulta o principal, que é o application.properties mas se nao encontrar, ele pesquisa no arquivo .properties designado para o perfil.

como exemplo vamos criar os arquivos application-dev.properties e o application-prod.properties

o -dev por exemplo simboliza o nome do perfil, entao este nome deve coincidir com o nome do perfil.

e pronto.

as propriedades que existirem nesses arquivos serao utilizadas, caso nao existam serao utilizadas as do arquivo default e caso nao existam sera retornado null.

### 2.28. Ativando o Spring Profile por linha de comando e variável de ambiente

com o jar da aplicacao, podemos inicializar a aplicacao usando a linha de comando. 

com isso podemos passar valores para as variaveis usando a linha de comando ou variaveis de ambiente.

para iniciar a aplicacao na linha de comando usamos:
java -jar NOME_DO_JAR_DA_APLICACAO.jar

com isso ela subira com o perfil default ou caso esteja definido algum perfil como ativo, esse perfil.

java -jar NOME_DO_JAR_DA_APLICACAO.jar --spring.profiles.active=prod 


outra forma de ativar o perfil é por variavel de ambiente:

mac e linux:
export SPRING_PROFILES_ACTIVE=prod

windows:
ver as aulas anteriores

agora ja nao precisamos passar na linha de comando o perfil:
java -jar NOME_DO_JAR_DA_APLICACAO.jar 


### 3.1. Instalando o MySQL Server e MySQL Workbench
Durante as aulas, eu vou usar o MySQL Server 5.7.

O MySQL Server 8 ainda não é suportado por algumas ferramentas de gerenciamento de banco de dados (como o Sequel Pro, por exemplo) e o próprio MySQL Workbench 8 não tinha suporte para a versão do meu sistema operacional (na data de gravação da aula).

*Mas nós testamos o projeto com o MySQL Server 8 e funciona perfeitamente.*

Ou seja, fique à vontade para usar o MySQL Server 5.7 (versão mais usada atualmente em produção) ou o MySQL Server 8.x.

Caso você decida usar o MySQL Server 8.x, lembre que terá que instalar uma ferramenta de gerenciamento atualizada e que dê suporte ao seu sistema operacional. O MySQL Workbench 8 é uma boa ferramenta para isso (mas não funciona no macOS High Sierra).

Só para esclarecer, o MySQL Server 5.7 foi a última versão antes do MySQL Server 8. Eu sei que parece um pouco confuso, mas antes do MySQL Server 8, não existiram as versões 6 e 7.

#### Instalando o MySQL Server
O MySQL Server é o banco de dados open source mais popular do mundo. Vamos instalar a distribuição Community Edition, que é gratuita.

Windows
Acesse https://dev.mysql.com/downloads/mysql/ e faça download do arquivo de instalação.

Para usar a versão 5.7, clique no link "Looking for previous GA versions?".

Selecione a versão 5.7 na caixa "Select Version" e clique no botão "Go to Download Page".

aixe o arquivo completo, sem ser o web installer (segunda opção).

Execute o arquivo de instalação baixado e siga o passo a passo.

Quando solicitar o tipo de configuração, mantenha selecionado "Developer Default" e clique em "Next".

Quando solicitar a seleção de produtos e funcionalidades, você pode deixar na caixa à direita apenas "MySQL Server" e "MySQL Workbench".

Na tela "High Availability", mantenha a opção previamente selecionada e clique em "Next".

Em "Account and Roles", digite e confirme uma senha para o usuário administrador (root) e clique em "Next".

Em "Windows Service", apenas clique em "Next".

Depois, aplique a configuração clicando em "Execute".

Ubuntu (Linux)
Para instalar o MySQL Server 5.7, abra o terminal e digite os comandos:

$ sudo apt update
$ sudo apt install mysql-server
Caso queira configurar o usuário no MySQL de forma simples, basta executar o comando:

$ mysql_secure_installation
Para instalar a versão 8.x, é necessário fazer mais alguns procedimentos.

Vá para a pasta /tmp e baixe o arquivo .deb, conforme demonstrado abaixo, para que possamos adicionar o repositório necessário para instalar o MySQL Server 8:

$ cd /tmp
$ curl -OL https://dev.mysql.com/get/mysql-apt-config_0.8.10-1_all.deb
Depois disso, iremos instalar o arquivo .deb assim:

$ sudo dpkg -i mysql-apt-config*
Após a adição do repositório, ao ser solicitado, pressione a tecla ENTER e em seguida execute o comando abaixo, para atualizarmos a lista de repositórios:

$ sudo apt update
Depois disso, você será capaz de instalar o MySQL Server 8 normalmente, dessa forma:

$ sudo apt install mysql-server
macOS
Abra o terminal e instale o Homebrew (um gerenciador de pacotes para Mac), caso ainda não tenha instalado:

$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
Execute o comando abaixo para instalar o MySQL Server 5.7, usando o Homebrew:

$ brew install mysql@5.7
Inicie o serviço do MySQL Server:

$ brew services start mysql@5.7
Para instalar o MySQL Server 8 usando o Homebrew, execute o comando:

$ brew install mysql
E para iniciar o serviço do MySQL Server 8, execute:

$ brew services start mysql
Instalando o MySQL Workbench
O MySQL Workbench é uma ferramenta para DBAs e desenvolvedores que usam o banco de dados MySQL Server.

No Windows, pode ser que você já tenha instalado o MySQL Workbench junto com o MySQL Server. Se esse for o caso, seu ambiente já está pronto. Não precisa baixar e instalar o Workbench novamente.

Caso não tenha instalado, acesse https://dev.mysql.com/downloads/workbench/ e faça o download do arquivo de instalação para o seu sistema operacional.

Execute o arquivo de instalação e siga os passos.

Você pode usar qualquer outra ferramenta de sua preferência para gerenciar o banco de dados, desde que ela tenha suporte à versão do MySQL Server que você está usando.

### 3.2. O que é JPA e Hibernate?

o que é persistencia de dados?
é a preservaçao de dados alem da execuçao do software.

a persistencia de dados usando java puro
![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem1.PNG)
imagem1.png

o codigo java conversa com o driver JDBC, que intermedia o acesso da aplicacao com o banco de dados.
cada banco de dados tem pelo menos um driver.

o codigo java conversa somente com o driver e este conversa com o banco de dados.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem2.PNG)
imagem2.png

usando desta forma, o SQL precisa ser escrito inteiramente visando o banco de dados. 

todas os atributos dos objetos devem ser passados diretamente na posicao certa para a inserçao dos dados.

isso é a utilizacao de persistencia sem a utilizacao do JPA.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem3.PNG)
imagem3.png

a consulta tambem fica onerosa, sendo necessario converter cada coluna do banco de dados no seu respectivo atributo do objeto.

desta forma tambem é oneroso fazer a recuperaçao dos objetos.

embora funcione, nao é recomendada devido ao trabalho que gera para persistencia e recuperacao dos dados.

#### o que é o ORM?
object relational mapping, é uma tecnica de mapeamento de classes para a tabela do banco relacional, de forma a simplificar as operaçoes com o banco de dados, deixando o programador mais concentrado nos objetos e menos nas tabelas do banco de dados.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem4.PNG)
imagem4.png

as tabelas sao representadas pela classe, as linhas sao objetos, a coluna sao os atributos e a chave estrangeira sao as associacoes nos objetos.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem5.PNG)
imagem5

as anotaçoes auxiliam na representacao do objeto java para a tabela. elas fazem os vinculos entra os atributos e as colunas.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem6.PNG)
imagem6

a persistencia com ORM é acrescida de uma camada, a aplicacao java fala com a solucao de ORM, que traduz isso para o driver que fala com o banco de dados.

assim agente reduz a complexidade de como fazer a persistencia e recuperacao de dados na aplicacao.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem7.PNG)
imagem7

a imagem7 tambem é um codigo JPA.

a solucao ORM faz a persistencia de objetos e ela é a responsavel por traduzir isso na linguagem de banco de dados, usando o mapeamento.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem8.PNG)
imagem8

a recuperacao de dados tambem é mais facil.

nao precisamos escrever SQL direto no codigo, o que, alem de deixar o codigo mais enxuto, facilita a troca de banco de dados sem necessidade de refatorar o codigo.

o que é JPA (Java Persistence API)?

é uma especificacao JEE, uma solucao ORM para persistencia de dados padronizada.

o JPA define a forma de mapeamento objeto relacional, possui uma api de consulta e modificacao de objetos e uma linguagem propria tambem, a JPQL.

JPA nao funciona sozinho, é uma especificacao.

o que é o hibernate?

o hibernate é uma das implementacoes do JPA. ele é o produto que colocamos no projeto. o JPA descreve como serao realizadas as alteraçoes no banco de dados e o hibernate ou afim, é que implementa essa especificacao e executa a alteracao.

o hibernate nao executa um vendor lock in, ou seja nao ficamos presos no hibernate, podendo trocar facilmente de ORM.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-2/imagem9.PNG)
imagem9

como fica a persistencia de dados usando JPA?

o codigo fala com a implementacao do JPA (que nesse caso sera o hibernate) que fala com o driver que fala com o banco de dados.


### 3.3. Adicionando JPA e configurando o Data Source

Em um projeto novo, configurado somente com o spring web, vamos adicionar o JPA para nos podermos continuar com os estudos.

clicando com o direito no projeto, depois em spring > edit starters

procuramos por jpa e adicionamos o spring data JPA e adicionamos ele ao projeto.

ele adicionou a dependencia do spring data no pom:

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

vamos agora configurar o nosso datasource.

no arquivo application.properties vamos adicionar:

spring.datasource.url=jdbc:mysql://localhost:3306/algafood?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root


agora vamos adicionar o driver do mysql no projeto:

clicando com o direito no projeto, depois em spring > edit starters

procurar por mysql e adicionar o driver mysql

ele adicionou a dependencia do spring data no pom:

<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<scope>runtime</scope>
</dependency>

nao foi especificado a versao pois o projeto parent especifica para nos.

### 3.4. Mapeando entidades com JPA

mapear entidades com JPA é muito facil.
vamos usar nesse exemplo a classe Cozinha, que possui somente o id e o nome.

@Table(name = "tab_cozinhas")//por padrao o JPA usa o nome da classe como nome da tabela. para setar basta usar @Table(name = NOME_TABELA)
@Entity//anotacao do JPA e informa que esta classe representa uma entidade no banco de dados
public class Cozinha {

	@Id//informa que este atributo representa o identificador da entidade
	private Long id;

	//se deixar sem anotacao o JPA vai buscar na tabela a coluna com o nome do atributo
	//se usar @Column somente, ocorre o mesmo
	@Column(name = "nom_cozinha")//se usar assim o JPA busca pelo nome da coluna
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cozinha other = (Cozinha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}


o atributo id, como nao especificamos o @Column, o JPA ira buscar por uma coluna chamada id na tabela.

o equals e hashcode foram gerados a partir do id, pois é o que diferencia a classe.

### 3.5. Criando as tabelas do banco a partir das entidades

neste momento ja temos as classes java das entidades mas agora podemos criar as tabelas.

neste exemplo, vamos ver uma forma de criar as tabelas automaticamente a partir do mapeamento nas classes.

NAO É UMA BOA PRATICA FAZER ISSO EM PRODUCAO. SOMENTE EM DESENVOLVIMENTO.

o JPA e o Hibernate ja vem por default NAO FAZENDO ISSO.
É NECESSARIO INFORMAR O JPA/HIBERNATE ESPECIFICAMENTE QUE VOCE QUER FAZER ISSO.

entao, no application.properties, vamos adicionar mais duas entradas:

spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=create

pronto. agora ao iniciarmos o projeto, o spring ira criar as tabelas par nos.

OBS: os atibutos passados na @Column, são somente para criacao da tabela, nao para validacao dos atributos.


### 3.6. Mapeando o id da entidade para autoincremento

neste momento, as tabelas estao sendo criadas mas a coluna id nao esta com auto incremento.

o auto incremento significa que o BD é responsavel por gerar o id de cada inserçao.

para informar que o BD deve ser responsavel devemos acrescentar no atributo id a anotacao @GeneratedValue(strategy = GenerationType.IDENTITY)

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


### 3.7. Importando dados de teste com import.sql
quando agente usa o generate ddl (application.properties) ele cria a tabela do zero, agente pode usar uma tecnica para popular as tabelas com dados logo apos serem criadas.

para isso usamos o arquivo import.sql

em src/main/resources criamos um novo arquivo, que por padrao deve se chamar import.sql.

nele colocamos o sql de insert nas tabelas que queremos.

ATENÇAO: FAZER ISSO SOMENTE EM DESENVOLVIMENTO

import.sql
insert into cozinha (nome) values ('Tailandesa');
insert into cozinha (nome) values ('Indiana');

pronto. agora quando ele recriar as tabelas ele ira inserir em cozinha os dois valores que indicamos no arquivo.

### 3.8. Consultando objetos do banco de dados
vamos fazer uma consulta de objetos do tipo cozinha.

vamos fazer a consulta usando JPA.

vamos implementar uma classe que ira fazer essa consulta:

@Component
public class CadastroCozinha {

	@PersistenceContext //o PersistenceContext é o mesmo que o @Autowired mas que permite algumas configuracoes do entity manager
	private EntityManager manager;
	
	public List<Cozinha> listar () {
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class); //usando JPQL
		return query.getResultList();
	
	}
}

pronto. a consulta por todas as cozinhas esta pronta.

para testar vamos fazer uma nova classe main, mas que nao ira instanciar uma apllicacao web e sim uma simples aplicacao:

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		//a ideia do teste é iniciar a aplicacao por aqui.
		// nao inciar uma aplicacao web, mas somente uma applicacao nao web
		ApplicationContext applicationContext = 
				new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE) //informa que nao é uma aplicacao web
				.run(args);
		
		//inicio dos testes
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		List<Cozinha> lista = cadastroCozinha.listar();
		
		for (Cozinha cozinha : lista) {
			System.out.println(cozinha.getNome());
		}
	}
}


pronto. as duas cozinhas foram exibidas no console.

mas agente queria ver o sql executado pelo JPA.
isso nao é recomendado ser feito em produção mas como estamos em desenvolvimento, vamos exibi-la.

no application.properties:

spring.jpa.show-sql=true

pronto.

### 3.9. Adicionando um objeto no banco de dados
persisitir um objeto é muito simples usando o JPA.

uma das poucas diferenças é que, para realizar alteracoes no banco de dados, o sql gerado deve ser executado dentro de uma transacao.

para fazer isso no spring, basta que no metodo que realiza a alteracao, anotarmos com @Transactional do pacote do spring. CUIDADO: NAO UTILIZAR A ANOTACAO DE OUTROS PACOTES!

@Component
public class CadastroCozinha {

	@PersistenceContext //o PersistenceContext é o mesmo que o @Autowired mas que permite algumas configuracoes do entity manager
	private EntityManager manager;
	
	public List<Cozinha> listar () {
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class); //usando JPQL
		return query.getResultList();
	
	}
	
	@Transactional//transacao do spring para alteracao do banco de dados
	public Cozinha adicionar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
}


pronto. ao chamarmos o metodo adicionar() ele ira persistir a cozinha e retornar a instancia persistida.

### 3.10. Buscando um objeto pelo id no banco de dados
buscar um objeto pelo seu id é muito facil no JPA:

	public Cozinha buscar(Long id) {
		return manager.find(Cozinha.class, id);
	}


### 3.11. Atualizando um objeto no banco de dados
a atualizacao de um objeto é tambem muito simples.

podemos reaproveitar o metodo adicionar() que criamos nas aulas anteriores e somente alterar o nome dele para persistir();

no exemplo vamos criar uma new Cozinha, e setar os dados dela, inclusive o id.

ao chamar o metodo salvar(), o hibernate, ve que essa instancia da classe nao esta no seu contexto e realiza um select para verificar se ela ja nao existe no banco de dados.

como nesse caso ja existe, ele executa um update, trocando os dados que estao no banco pelos dados passados na instancia.

@Transactional//transacao do spring para alteracao do banco de dados
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}

e o teste vai ser:

Cozinha cozinha = new Cozinha();
cozinha.setNome("Brasileira");
cozinha.setId(1L);//vai alterar a cozinha de id 1 com nome tailandesa para brasileira

cozinha = cadastroCozinha.salvar(cozinha);

pronto. a cozinha de id 1 foi alterada


https://blog.algaworks.com/tutorial-jpa/
(...)
Diferença entre o persist e o merge
O método persist serve para entidades novas, que acabaram de ser criadas e que ainda não existem na base de dados.

Quando passamos uma nova entidade para ele, o mesmo a torna uma entidade gerenciada e que será inserida na base.

O objetivo do método merge é tornar um objeto novo como gerenciado.

Mas não é a exata instância passada para ele que será gerenciada.

Ele pega a instância dada a ele e faz uma cópia. Essa sim é a instância gerenciada.

Para ter acesso a ela, basta pegar o retorno do merge. Assim:

1
cliente = entityManager.merge(cliente);
Uma vez que a instância está como gerenciada, qualquer alteração na mesma é enviada para a base de dados no momento do flush e confirmada no commit da transação.
(...)


### 3.12. Excluindo um objeto do banco de dados
agora vamos excluir um objeto do banco de dados.

a exclusao de um objeto do BD usando JPA é muito facil mas tem alguns detalhes.

se o objeto tiver sido recuperado do banco de dados atraves do find ou similares ou tiver sido persistido no banco dentro do atual contexto, o metodo remove() do EntityManager ira conseguir apagá-lo.

mas e se for uma entidade criada com o new Entidade()?

bom, ai o JPA nao consegue apaga-lo e lançara uma exception.

o motivo disso acontecer é que o estado do objeto nesse ponto é Transient ou Detached.

os objetos com esses estados nao sao gerenciados pelo JPA e por isso nao podem ser apagados.

https://blog.algaworks.com/tutorial-jpa/

(...)
Estados de uma entidade
Uma entidade pode assumir alguns estados com relação ao EntityManager. Os estados podem ser:

Novo (new ou transient)
Gerenciado (managed)
Removido (removed)
Desanexado (detached)
O estado “novo” é o mais natural. É simplesmente quando construímos um objeto qualquer usando o operador new.

Para estar no estado “gerenciado”, podemos chamar os métodos persist, merge ou buscar a entidade usando o EntityManager.

O estado “removido” é alcançado quando chamamos o método remove.

Por último, uma entidade fica no estado “desanexado” quando é passada para o método detach.

Importante notar que entidades desanexadas podem voltar a ser gerenciadas com a chamada do método merge.

Veja como fica no diagrama abaixo.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-12/imagem1.PNG)

Diagrama de estados

Repare os comentários no código abaixo:

public static void main(String... args) {
  EntityManagerFactory entityManagerFactory 
        = Persistence.createEntityManagerFactory("Clientes-PU");
  EntityManager entityManager = entityManagerFactory.createEntityManager();
     
  // Estado novo
  Cliente cliente = new Cliente();
  cliente.setNome("Construtora Silva");
 
  entityManager.getTransaction().begin();
 
  // Estado gerenciado
  entityManager.persist(cliente);
 
  // Estado desanexado (nenhuma operação será feita)
  entityManager.detach(cliente);
 
  // Volta ao estado gerenciado 
  cliente = entityManager.merge(cliente);
 
  // Estado removido (será removido da base de dados)
  entityManager.remove(cliente);
 
  entityManager.getTransaction().commit();
 
  entityManager.close();
  entityManagerFactory.close();
}

(...)

entao, para conseguirmos apagar a entidade no nosso exemplo precisamos antes chamar o metodo buscar() passando o id. desta forma a cozinha fica no modo managed e podemos apaga-la.

@Transactional
public void apagar(Cozinha cozinha) {
	cozinha = buscar(cozinha.getId());
	manager.remove(cozinha);
}

e a chamada do codigo foi:

//deletar
Cozinha cozinha = new Cozinha();
cozinha.setId(1L);//vai deletar a cozinha de id 1 		
cadastroCozinha.apagar(cozinha);

com isso conseguimos apagar a cozinha de id 1.


### 3.13. Conhecendo o padrão Aggregate do DDD
vamos conhecer o padrao Aggregate do DDD.

o que é o DDD?
o DDD é uma abordagem de desenvolvimento de software com foco no dominio, ou seja, no negocio.

o que é o Aggregate?
o aggregate é um grupo de objetos de dominio que podem ser tratados como uma unica unidade.

https://martinfowler.com/bliki/DDD_Aggregate.html
"Aggregate is a pattern in Domain-Driven Design. A DDD aggregate is a cluster of domain objects that can be treated as a single unit. An example may be an order and its line-items, these will be separate objects, but it's useful to treat the order (together with its line items) as a single aggregate.

An aggregate will have one of its component objects be the aggregate root. Any references from outside the aggregate should only go to the aggregate root. The root can thus ensure the integrity of the aggregate as a whole."

vamos usar um exemplo do nosso projeto, neste caso o pedido.

![](https://github.com/luizClaudioMendes/CursoEspecialistaSpringRest/blob/master/imagens_materia/capitulo_3-13/imagem1.PNG)

o pedido é composto pela entidade pedido, entidade itemPedido e o enum StatusPedido.

tudo isso pode ser tratado como uma unica entidade, a Pedido.

nao podemos ter um itemPedido sem existir um Pedido atrelado.

a entidade mais forte do conjunto é a Aggregate root, neste caso o Pedido.

as referencias fora do agregado devem sempre apontar para o aggregate root.

ou seja, outros objetos do sistema nao deve apontar para o item pedido, e sim para o pedido, que é a aggregate root.

 
### 3.14. Conhecendo e implementando o padrão Repository
o padrao repository é um padrao do DDD que adiciona uma camada de abstraçao na persistencia de dados.

o repository nao é vinculado a tabela e sim ao agregado (agreggate). entao nao teremos um repository de pedido e outro repository para item pedido por exemplo.

o repository de pedido ficara encarregado de persistir todos os dados relacionado ao pedido.


CozinhaRepository
package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Cozinha;

public interface CozinhaRepository {
	//um repository representa uma coleçao, neste caso de cozinhas.
	// a interface do repositorio faz parte do dominio, nao tem mecanismos de persistencia, ou seja se é em BD ou arquivo, etc
	
	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover (Cozinha cozinha);

}


CozinhaRepositoryImpl
package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class CozinhaRepositoryImpl implements CozinhaRepository{
	
	@PersistenceContext //o PersistenceContext é o mesmo que o @Autowired mas que permite algumas configuracoes do entity manager
	private EntityManager manager;
	
	@Override
	public List<Cozinha> listar () {
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class); //usando JPQL
		return query.getResultList();
	
	}
	
	@Override
	public Cozinha buscar(Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional//transacao do spring para alteracao do banco de dados
	@Override
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	@Transactional
	@Override
	public void remover(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());
		manager.remove(cozinha);
	}
}


### 3.15. Conhecendo e usando o Lombok
o lombok é uma biblioteca que facilita muito a nossa vida.

o foco é em produtividade e reducao de codigo boiler plate, que sao codigos que sao repetidos frequentemente, como os getter e os setters.

para adicionao o lombok no spring, basta clicar com o botao direito no projeto
e depois em spring >> edit starters

depois basta pesquisar por lombok

sera adicionado ao pom a dependencia do lombok

 <dependency>
	<groupId>org.projectlombok</groupId>
	<artifactId>lombok</artifactId>
</dependency>

mas so com isso nao funciona. precisamos adicionar o plugin do lombok na IDE, de forma a ensinar a IDE a trabalhar com o lombok.

para isso vamos no site do lombok https://projectlombok.org/

e em dowloads, baixamos o lombok. esse arquivos .jar que baixamos é o instalador do lombok.

pronto.

como usar?

nas classes de entidades, basta usarmos as anotaçoes do lombok.

vamos usar como exemplo a classe Cozinha
ela esta assim:

@Table(name = "cozinha")
@Entity
public class Cozinha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cozinha other = (Cozinha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

e vai ficar assim, após retirarmos os getters e setters:

@Getter
@Setter
@Table(name = "cozinha")
@Entity
public class Cozinha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")//se usar assim o JPA busca pelo nome da coluna
	private String nome;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cozinha other = (Cozinha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

podemos tambem fazer a geraçao do equals e hash code, basta acrescentar a anotacao @EqualsAndHashCode. existe uma configuraçao legal do equals e hashcode que veremos mais adiante.

para voce ver as funcionalidades que existem no lombok, basta voce dar uma olhada no site.

existe uma bem interessante, que é a @Data

@Data
All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor!

como ela diz é uma atalho para @ToString, @EqualsAndHashCode, @Getter and @Setter, e @RequiredArgsConstructor

@Data
@Table(name = "cozinha")
@Entity
public class Cozinha {
	...

bom o problema é que agora ele gerou um equals e hashcode com todos os atributos e nao é o que queremos.

entao vamos, mesmo com o @Data, vamos acrescentar o @EqualsAndHashCode para podermos configurar.

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "cozinha")
@Entity
public class Cozinha {

	@EqualsAndHashCode.Include //informa que o equals e hashcode deve incluir esta propriedade
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	...

### 3.16. Desafio: Lombok e repositório de restaurantes

### 3.17. Mapeando relacionamento com @ManyToOne
como fazer o mapeamentod e muitos para um.
vamos focar no restaurante e cozinha
entao um restaurante tem um cozinha, entao muitos restaurantes podem ter a mesma cozinha (many to one)

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Restaurante {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Column(name = "taxa_frete")
	private BigDecimal taxaFrete;
	
	@ManyToOne
	private Cozinha cozinha;

}

agora, um problema que temos neste momento é que nao especificamos o dialeto do banco para a criacao automatica das tabelas. com isso o hibernate usa o dialeto MyISAM, que nao suporta a chave estrangeira.

precisamos de usar o dialeto INNODB.

como estamos usando a criacao automatica, vamos passar essa instruçao para o spring, no application.properties

spring.jpa.properties.hibernate.dialect = nome_completo_classe_do_dialeto

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL57Dialect

pronto. agora ele vai criar as tabelas com chaves estrangeiras, usando o INNODB

### 3.18. A anotação @JoinColumn
a anotaçao @ManyToOne e outras similares cria de um modo default o nome da coluna no BD.
mas e se usarmos um banco legado ou se quisermos personalizar o nome da coluna?

para os dados convencionaiso como string ou integer, agente usa a anotaçao 
@Column.

para este caso, usaremos a anotaçap @JoinColumn e a classe ficará assim:

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Restaurante {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Column(name = "taxa_frete")
	private BigDecimal taxaFrete;
	
	@ManyToOne
	@JoinColumn(name = "cozinha_id")
	private Cozinha cozinha;
}


### 3.19. Propriedade nullable de @Column e @JoinColumn
quando utilizamos a criacao automatica de tabelas, que nao deve ser utilizado em produçao, podemos necessitar de que seja inserido na tabela em si, a validacao de nao aceitaçao de nulos. por default, a criacao automatica da tabela permite que as colunas sejam nulas, exceto a coluna do id.

entao, em @Column e @JoinColumn basta adicionarmos a propriedade

nullable = false

para que na criacao automatica ela seja criada como NOT NULL.

OBS: as anotacoes @Column e @JoinColumn sao do JPA. com isso, essas propriedades sao aplicadas ao BD e nao ao codigo. se nao estiver sendo utilizada criacao automatica essas propriedades serao mais informativas que praticas.

a validacao pelo codigo de permissao de null ou nao serao vistas no capitulo de validadores.

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Restaurante {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false) //nullable somente aplicado à criacao de tabelas automaticas
	private String nome;
	
	@Column(name = "taxa_frete", nullable = false)
	private BigDecimal taxaFrete;
	
	@ManyToOne
	@JoinColumn(name = "cozinha_id", nullable = false)
	private Cozinha cozinha;

}


### 3.20. Desafio: mapeando entidades

### 4.1. O que é REST?
REST vem de REpresentational State Transfer, nao sendo uma tecnologia e sim um modelo arquitetuiral. ele nao é uma tecnologia, pois nao pode ser baixada em um site. 

ele define a forma de comunicacao entre componentes de software na web, independente de linguagem utilizada.

surgiu no inicio dos anos 2000 na tese de PHD de um cientista chamado Roy Fielding.

o intiuito era a formaçao de melhores praticas e regras para desenvovlvimento de web api.

essas melhores praticas sao chamadas de constraints.

uma rest api é um sistema que segue essas melhores praticas do roy fielding.

#### porque usar rest?
* separacao entre cliente e servidor. desta forma temos uma maior flexibilidade e portabilidade. o sistema cliente pode evoluir independente do sistema servidor, podendo ate consumir de diferentes servidores
* escalabilidade - é muito facil escalar os sevidores, se um nao estiver dando conta de atender as necessidades dos clientes, basta subir outra instancia, sem necessidade de ficar transferindo sessoes entre eles.
* independencia de linguagem - os servidores podem ser escritos em qualquer linguagem, podendo interagir entre si e outros servidores externos.
* mercado - empresas pequenas e grandes cada vez mais contratam serviços de outras empresas onde o REST ajuda na comunicacao entre eles. e tambem cada vez mais existem mais dispositivos como celulares, tvs, etc solicitando e enviando dados para as api´s.

### 4.2. Conhecendo as constraints do REST
o rest tem o intuito de formalizar uma serie de constraints, que sao as melhores praticas.

#### constraints:
* cliente-servidor. uma aplicacao REST necessita de um cliente para consumir os dados. eles sao independentes, e tanto um quanto o outro podem ser substituidos sem interferir no funcionamento dos mesmos, desde que a interface entre eles permaneça inalterada.
* stateless - o servidor nao deve possuir estado, ou seja, nao deve manter sessoes entre requisicoes. cada requisicao é independente e ela mantem o seu estado e no termino deve ser apagado.
* cache - a api pode fazer cache para reduzir o tempo de resposta. podemos ter tambem servidores intermediarios entre o cliente e o servidor para manter esse cache.
* interface uniforme - um conjunto de operaçoes bem definidas do sistema. uma vez definida a interface voce deve manter ela em todo o sistema. essa constraint simplifica e desacopla a arquitetura que permite que tanto o cliente quanto o servidor possam evoluir independemente. a resposta deve tambem ser padronizada e os verbos http devem ser utilizados corretamente.
* sistema em camadas - possibilidade de entre cliente e servidor existirem outros servidores, como segurança, cache, balanceadores, etc. estas camadas nao devem afetar a requisicao nem a resposta
* codigo sob demanda - opcional e muito pouco usada. o servidor pode enviar como resposta algum codigo que pode ser executado no cliente.

### 4.3. Diferença entre REST e RESTful
rest e restful sao dois conceitos.
rest é um estilo arquitetural que possui as constraints.
restful é uma api desenvolvida com todas as constraints. 

na pratica, poucas api´s sao restful porque viola alguma constraint.






















































