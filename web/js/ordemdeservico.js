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