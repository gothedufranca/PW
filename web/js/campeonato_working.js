/*
 * SQL DE TESTE DO PROJETO: 
 * 
 * 
 * 
drop database `pw`;
CREATE database `pw`;
use `pw`;

-- drop table campeonato;
create table campeonato (
	id int auto_increment not null,
    nome varchar(50) not null,
    constraint pk_campeonato primary key (id)
);
insert into campeonato (nome) values ('campeonato 1');
insert into campeonato (nome) values ('campeonato 2');
insert into campeonato (nome) values ('campeonato 3');

-- drop table fornecedor;
create table fornecedor(
	id int auto_increment not null,
    nome varchar(50) not null,
    identificador varchar(50) not null,
    cpf int not null,
    rg varchar(50) not null,
    mae varchar(50) not null,
    convocacao varchar(50) not null,
    constraint pk_fornecedor primary key (id)
);
insert into fornecedor(nome, identificador, cpf, rg, mae, convocacao) values ('f1', 'f1', 1, 'f1', 'f1', 'f1');
insert into fornecedor(nome, identificador, cpf, rg, mae, convocacao) values ('f2', 'f2', 2, 'f2', 'f2', 'f2');
insert into fornecedor(nome, identificador, cpf, rg, mae, convocacao) values ('f3', 'f3', 3, 'f3', 'f3', 'f3');

-- drop table jogo;
create table jogo(
	id int auto_increment not null,
    dia int not null,
    mes int not null,
    ano int not null,
    hora int not null,
    minuto int not null,
    campeonato varchar(50) not null,
    time1 varchar(50) not null,
    time2 varchar(50) not null,
    constraint pk_jogo primary key (id)
);
insert into jogo(dia, mes, ano, hora, minuto, campeonato, time1, time2) values (1, 8, 17, 16, 30, 't1', 't1', 't1');
insert into jogo(dia, mes, ano, hora, minuto, campeonato, time1, time2) values (2, 8, 17, 21, 30, 't2', 't2', 't2');
insert into jogo(dia, mes, ano, hora, minuto, campeonato, time1, time2) values (3, 8, 17, 20, 30, 't3', 't3', 't3');

-- drop table setor;
create table setor (
	id int auto_increment not null,
    nome varchar(50) not null,
    constraint pk_setor primary key (id)
);
insert into setor (nome) values ('setor 1');
insert into setor (nome) values ('setor 2');
insert into setor (nome) values ('setor 3');

-- drop table tipoorientador;
create table tipoorientador (
	id int auto_increment not null,
    tipo varchar(50) not null,
    constraint pk_setor primary key (id)
);
insert into tipoorientador (tipo) values ('tipoorientador 1');
insert into tipoorientador (tipo) values ('tipoorientador 2');
insert into tipoorientador (tipo) values ('tipoorientador 3');

-- drop table orientador;
create table orientador (
	id int auto_increment not null,
    datacadastro date not null,
    tipo varchar(50) not null,
    nome varchar(50) not null,
    telefone int not null,
    celular int not null,
    contato int not null,
    email varchar(100) not null,
    setor varchar(50) not null,
    disponibilidade varchar(50) not null,
    cpf int not null,
    rg varchar(50) not null,
    mae varchar(50) not null,
    ctps int not null,
    pis int not null,
    banco varchar(50) not null,
    agencia int not null,
    digagencia int not null,
    conta int not null,
    digconta int not null,
    nascimento date not null,
    constraint pk_setor primary key (id)
);
insert into orientador (datacadastro, tipo, nome, telefone, celular,
	contato, email, setor, disponibilidade, cpf, rg, mae, ctps, pis,
    banco, agencia, digagencia, conta, digconta, nascimento
) values (sysdate(),'o1', 'o1', 111, 111, 111, 'o1', 'o1', 'o1',
	111, 'o1', 'o1', 111, 111, 'o1', 111, 111, 111, 111, sysdate());
    insert into orientador (datacadastro, tipo, nome, telefone, celular,
 contato, email, setor, disponibilidade, cpf, rg, mae, ctps, pis,
    banco, agencia, digagencia, conta, digconta, nascimento
) values (sysdate(),'o2', 'o2', 222, 222, 222, 'o2', 'o2', 'o2',
 222, 'o2', 'o2', 222, 222, 'o2', 222, 222, 222, 222, sysdate());
 insert into orientador (datacadastro, tipo, nome, telefone, celular,
 contato, email, setor, disponibilidade, cpf, rg, mae, ctps, pis,
    banco, agencia, digagencia, conta, digconta, nascimento
) values (sysdate(),'o3', 'o3', 333, 333, 333, 'o3', 'o3', 'o3',
 333, 'o3', 'o3', 333, 333, 'o3', 333, 333, 333, 333, sysdate());
 
-- drop table ordemdeservico;
create table ordemdeservico (
	id int auto_increment not null,
    evento varchar(100) not null,
    time1 varchar(50) not null,
    time2 varchar(50) not null,
    classificacao varchar(50) not null,
    dia int not null,
    mes int not null,
    ano int not null,
    inicioh int not null,
    iniciom int not null,
    fimh int not null,
    fimm int not null,
    aberturaPortoesH int not null,
    aberturaPortoesM int not null,
    aberturaEstacionamentoH int not null,
    aberturaEstacionamentoM int not null,
	arquibancadaSuperiorNorte int not null,
    arquibancadaInferiorNorte int not null,
    arquibancadaSuperiorSul int not null,
    arquibancadaInferiorSul int not null,
    arquibancadaSuperiorOeste int not null,
    cadeirasEspeciaisOeste int not null,
    arquibancadaSuperiorLeste int not null,
    cadeirasEspeciaisLeste int not null,
    constraint pk_ordemdeservico primary key (id)
);

insert into ordemdeservico (evento, time1, time2, classificacao, dia, mes, ano, inicioh, iniciom, fimh, fimm, aberturaPortoesH, aberturaPortoesM, aberturaEstacionamentoH, aberturaEstacionamentoM, arquibancadaSuperiorNorte, arquibancadaInferiorNorte, arquibancadaSuperiorSul, arquibancadaInferiorSul, arquibancadaSuperiorOeste, cadeirasEspeciaisOeste, arquibancadaSuperiorLeste, cadeirasEspeciaisLeste
)
values (
'os1', 'os1', 'os1', 'os1', 1, 1, 11, 12, 30, 12, 30, 12, 30, 12, 30, 1, 1, 1, 1, 1, 1, 1, 1);
insert into ordemdeservico (evento, time1, time2, classificacao, dia, mes, ano, inicioh, iniciom, fimh, fimm, aberturaPortoesH, aberturaPortoesM, aberturaEstacionamentoH, aberturaEstacionamentoM, arquibancadaSuperiorNorte, arquibancadaInferiorNorte, arquibancadaSuperiorSul, arquibancadaInferiorSul, arquibancadaSuperiorOeste, cadeirasEspeciaisOeste, arquibancadaSuperiorLeste, cadeirasEspeciaisLeste
)
values (
'os2', 'os2', 'os2', 'os2', 2, 2, 22, 22, 30, 22, 30, 22, 30, 22, 30, 2, 2, 2, 2, 2, 2, 2, 2);
insert into ordemdeservico (evento, time1, time2, classificacao, dia, mes, ano, inicioh, iniciom, fimh, fimm, aberturaPortoesH, aberturaPortoesM, aberturaEstacionamentoH, aberturaEstacionamentoM, arquibancadaSuperiorNorte, arquibancadaInferiorNorte, arquibancadaSuperiorSul, arquibancadaInferiorSul, arquibancadaSuperiorOeste, cadeirasEspeciaisOeste, arquibancadaSuperiorLeste, cadeirasEspeciaisLeste
)
values (
'os3', 'os3', 'os3', 'os3', 3, 3, 33, 32, 30, 32, 30, 32, 30, 32, 30, 3, 3, 3, 3, 3, 3, 3, 3);

select * from pw.ordemdeservico;
 */


Index = function () {

};

Index.Load = function () {
    var index = new Index();
    index.initialize();
    return index;
};

Index.prototype = {
    initialize: function () {

        $('#btnSalvar').bind('click', '', $.createDelegate(this, this._salvar));
        this._obter();
    },
    _obter: function () {
        this.dataBind(
                'GET',
                '',
                '/api/campeonato',
                this._obterSuccess,
                this._obterError);
    },
    _obterSuccess: function (value) {
        $('#tabela').html('');
        var tabela = '<tr>';
        tabela += '<td><center>Id</center></td>';
        tabela += '<td><center>Nome</center></td>';
        tabela += '<td><center>Ações</center></td>';
        tabela += '</tr>';
        $('#tabela').append(tabela);
        for (var i = 0; i < value.length; i++) {
            tabela = '<tr>';
            tabela += '<td><center>';
            tabela += value[i].id;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].nome;
            tabela += '</center></td>';
            tabela += '<td><input type="button" id="btnExcluir' + value[i].id + '" value="Excluir"/>';
            tabela += '<input type="button" id="btnAlterar' + value[i].id + '" value="Alterar"/></td>';
            tabela += '</tr>';
            $('#tabela').append(tabela);
            // criando um objeto item para passar como parâmetro no método de exclusão
            var item = {
                id: value[i].id
            };
            $('#btnExcluir' + value[i].id).bind('click', item, $.createDelegate(this, this._excluir));
            $('#btnAlterar' + value[i].id).bind('click', item, $.createDelegate(this, this._alterar));
        }
    },
    _alterar: function (value) {
         this.dataBind(
                'GET',
                '',
                '/api/campeonato/' + value.data.id,
                this._alterarSuccess,
                this._alterarError);
    },
    _alterarSuccess: function (value) {
            $('#id').val(value.id);
            $('#nome').val(value.nome);
    },
    _alterarError: function (value) {
        alert('Algo deu errado tentando alterar o campeonato. Tente novamente.');
    },
    _excluir: function (value) {
            this.dataBind(
                'DELETE',
                '',
                '/api/campeonato/' + value.data.id,
                this._obter,
                this._obterError);
    },
    _obterError: function () {
        alert('Algo deu errado ao obter a lista de campeonatos. Tente novamente.');
    },
    _salvar: function () {

        var data = {
            id: $('#id').val(),
            nome: $('#nome').val()
        };

        // atenção que esta estrutura em javascript precisa respeitar a mesma estrutura
        // do modelo criado no java.
        // os valores que estão sendo passado via JQUERY $('#xxx') precisam ter o mesmo
        // nome do id no input, div, textarea, etc

        var datastr = JSON.stringify(data);

        // JSON.stringify - método que transforma o modelo javascript em string

        if (data.id === '' || data.id === undefined) {

            this.dataBind(
                    'POST',
                    datastr,
                    '/api/campeonato',
                    this._salvarSuccess,
                    this._salvarError);

        } else {

            this.dataBind(
                    'PUT',
                    datastr,
                    '/api/campeonato',
                    this._salvarSuccess,
                    this._salvarError);

        }

    },
    _salvarSuccess: function (value) {

        $('#id').val('');
        $('#nome').val('');
        alert('Campeonato salvo com sucesso.');
        this._obter();

    },
    _salvarError: function (value) {

        alert('Erro ao salvar campeonato. Tente novamente.');

    },
    dataBind: function (type, data, url, success, error) {
        $.ajax({
            type: type,
            cache: false,
            data: data,
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
            url: url,
            success: $.createDelegate(this, success),
            error: $.createDelegate(this, error)
        });
    }
};

$(document).ready(function () {
    Index.Load();
});