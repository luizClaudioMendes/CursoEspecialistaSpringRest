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














