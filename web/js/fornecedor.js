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
                '/api/fornecedor',
                this._obterSuccess,
                this._obterError);
    },
    _obterSuccess: function (value) {
        $('#tabela').html('');
        var tabela = '<tr>';
        tabela += '<td><center>Id</center></td>';
        tabela += '<td><center>Nome</center></td>';
        tabela += '<td><center>Identificador</center></td>';
        tabela += '<td><center>CPF</center></td>';
        tabela += '<td><center>RG</center></td>';
        tabela += '<td><center>Nome da Mãe</center></td>';
        tabela += '<td><center>Concocação</center></td>';
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
            tabela += '<td><center>';
            tabela += value[i].identificador;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].cpf;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].rg;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].mae;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].convocacao;
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
                '/api/fornecedor/' + value.data.id,
                this._alterarSuccess,
                this._alterarError);
    },
    _alterarSuccess: function (value) {
            $('#id').val(value.id);
            $('#nome').val(value.nome);
            $('#identificador').val(value.identificador);
            $('#cpf').val(value.cpf);
            $('#rg').val(value.rg);
            $('#mae').val(value.mae);
            $('#convocacao').val(value.convocacao);
    },
    _alterarError: function (value) {
        alert('Algo deu errado tentando alterar o fornecedor. Tente novamente.');
    },
    _excluir: function (value) {
            this.dataBind(
                'DELETE',
                '',
                '/api/fornecedor/' + value.data.id,
                this._obter,
                this._obterError);
    },
    _obterError: function () {
        alert('Algo deu errado ao obter a lista de fornecedores. Tente novamente.');
    },
    _salvar: function () {

        var data = {
            id: $('#id').val(),
            nome: $('#nome').val(),
            identificador: $('#identificador').val(),
            cpf: $('#cpf').val(),
            rg: $('#rg').val(),
            mae: $('#mae').val(),
            convocacao: $('#convocacao').val()
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
                    '/api/fornecedor',
                    this._salvarSuccess,
                    this._salvarError);

        } else {

            this.dataBind(
                    'PUT',
                    datastr,
                    '/api/fornecedor',
                    this._salvarSuccess,
                    this._salvarError);

        }

    },
    _salvarSuccess: function (value) {

        $('#id').val('');
        $('#nome').val('');
        $('#identificador').val('');
        $('#cpf').val('');
        $('#rg').val('');
        $('#mae').val('');
        $('#convocacao').val('');
        alert('Fornecedor salvo com sucesso.');
        this._obter();

    },
    _salvarError: function (value) {

        alert('Erro ao salvar fornecedor. Tente novamente.');

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