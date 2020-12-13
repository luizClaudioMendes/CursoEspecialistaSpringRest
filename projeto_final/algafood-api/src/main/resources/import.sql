insert into cozinha (id, nome) values (1,'Brasileira');
insert into cozinha (id, nome) values (2, 'Americana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Comida da Casa', 7.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Cantinho de Minas', 3.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('McDonalds', 5.90, 2);

insert into forma_pagamento (descricao) values ('Cartão de Credito');
insert into forma_pagamento (descricao) values ('Cartão de Débito');
insert into forma_pagamento (descricao) values ('Dinheiro');

insert into permissao (nome, descricao) values ('consultarCozinhas', 'Pode consultar cozinhas');
insert into permissao (nome, descricao) values ('salvarCozinhas', 'Pode salvar cozinhas');
insert into permissao (nome, descricao) values ('apagarCozinhas', 'Pode deletar cozinhas');

insert into estado (nome) values ('Acre');
insert into estado (nome) values ('Alagoas');
insert into estado (nome) values ('Amapá');
insert into estado (nome) values ('Amazonas');
insert into estado (nome) values ('Bahia');
insert into estado (nome) values ('Ceará');
insert into estado (nome) values ('Distrito Federal');
insert into estado (nome) values ('Espírito Santo');
insert into estado (nome) values ('Goiás');
insert into estado (nome) values ('Maranhão');
insert into estado (nome) values ('Mato Grosso');
insert into estado (nome) values ('Mato Grosso do Sul');
insert into estado (nome) values ('Minas Gerais');
insert into estado (nome) values ('Pará');
insert into estado (nome) values ('Paraíba');
insert into estado (nome) values ('Paraná');
insert into estado (nome) values ('Pernambuco');
insert into estado (nome) values ('Piauí');
insert into estado (nome) values ('Rio de Janeiro');
insert into estado (nome) values ('Rio Grande do Norte');
insert into estado (nome) values ('Rio Grande do Sul');
insert into estado (nome) values ('Rondônia');
insert into estado (nome) values ('Roraima');
insert into estado (nome) values ('Santa Catarina');
insert into estado (nome) values ('São Paulo');
insert into estado (nome) values ('Sergipe');
insert into estado (nome) values ('Tocantins');

insert into cidade (nome, estado_id) values ('Brasília', 7);
insert into cidade (nome, estado_id) values ('Sobradinho', 7);
insert into cidade (nome, estado_id) values ('Planaltina', 7);

