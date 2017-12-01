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
                '/api/jogo',
                this._obterSuccess,
                this._obterError);
    },
    _obterSuccess: function (value) {
        $('#tabela').html('');
        var tabela = '<tr>';
        tabela += '<td><center>Id</center></td>';
        tabela += '<td><center>Data</center></td>';
        tabela += '<td><center>Horário</center></td>';
        tabela += '<td><center>Time1</center></td>';
        tabela += '<td><center>Time2</center></td>';
        tabela += '<td><center>Campeonato</center></td>';
        tabela += '<td><center>Ações</center></td>';
        tabela += '</tr>';
        $('#tabela').append(tabela);
        for (var i = 0; i < value.length; i++) {
            tabela = '<tr>';
            tabela += '<td><center>';
            tabela += value[i].id;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].dia + '/' + value[i].mes + '/' + value[i].ano;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += (value[i].minuto < 10) ? value[i].hora + ':' + '0' + value[i].minuto : value[i].hora + ':' + value[i].minuto;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].time1;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].time2;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].campeonato;
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
                '/api/jogo/' + value.data.id,
                this._alterarSuccess,
                this._alterarError);
    },
    _alterarSuccess: function (value) {
            $('#id').val(value.id);
            $('#dia').val(value.dia);
            $('#mes').val(value.mes);
            $('#ano').val(value.ano);
            $('#hora').val(value.hora);
            $('#minuto').val(value.minuto);
            $('#time1').val(value.time1);
            $('#time2').val(value.time2);
            $('#campeonato').val(value.campeonato);
    },
    _alterarError: function (value) {
        alert('Algo deu errado tentando alterar o jogo. Tente novamente.');
    },
    _excluir: function (value) {
            this.dataBind(
                'DELETE',
                '',
                '/api/jogo/' + value.data.id,
                this._obter,
                this._obterError);
    },
    _obterError: function () {
        alert('Algo deu errado ao obter a lista de jogos. Tente novamente.');
    },
    _salvar: function () {
        debugger;
        var data = {
            id: $('#id').val(),
            dia: $('#dia').val(),
            mes: $('#mes').val(),
            ano: $('#ano').val(),
            hora: $('#hora').val(),
            minuto: $('#minuto').val(),
            time1: $('#time1').val(),
            time2: $('#time2').val(),
            campeonato: $('#campeonato').val()
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
                    '/api/jogo',
                    this._salvarSuccess,
                    this._salvarError);

        } else {

            this.dataBind(
                    'PUT',
                    datastr,
                    '/api/jogo',
                    this._salvarSuccess,
                    this._salvarError);

        }

    },
    _salvarSuccess: function (value) {

        $('#id').val('');
        $('#dia').val('');
        $('#mes').val('');
        $('#ano').val('');
        $('#hora').val('');
        $('#minuto').val('');
        $('#time1').val('');
        $('#time2').val('');
        $('#campeonato').val('');
        alert('Jogo salvo com sucesso.');
        this._obter();

    },
    _salvarError: function (value) {

        alert('Erro ao salvar jogo. Tente novamente.');

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