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
        debugger;
        this.dataBind(
                'GET',
                '',
                '/api/os',
                this._obterSuccess,
                this._obterError);
    },
    _obterSuccess: function (value) {
        $('#tabela').html('');
        var tabela = '<tr>';
        tabela += '<td><center>Id</center></td>';
        tabela += '<td><center>Evento</center></td>';
        tabela += '<td><center>Time 1</center></td>';
        tabela += '<td><center>Time 2</center></td>';
        tabela += '<td><center>Classificação</center></td>';
        tabela += '<td><center>Data</center></td>';
        tabela += '<td><center>Hora de início</center></td>';
        tabela += '<td><center>Hora de término</center></td>';
        tabela += '<td><center>Hora da abertura dos portões</center></td>';
        tabela += '<td><center>Hora da abertura do estacionamento</center></td>';
        tabela += '<td><center>Arquibancada Superior Norte</center></td>';
        tabela += '<td><center>Arquibancada Inferior Norte</center></td>';
        tabela += '<td><center>Arquibancada Superior Sul</center></td>';
        tabela += '<td><center>Arquibancada Inferior Sul</center></td>';
        tabela += '<td><center>Arquibancada Superior Oeste</center></td>';
        tabela += '<td><center>Cadeiras Especiais Oeste</center></td>';
        tabela += '<td><center>Arquibancada Superior Leste</center></td>';
        tabela += '<td><center>Cadeiras Especiais Leste</center></td>';
        tabela += '<td><center>Ações</center></td>';
        tabela += '</tr>';
        $('#tabela').append(tabela);
        for (var i = 0; i < value.length; i++) {
            tabela = '<tr>';
            tabela += '<td><center>';
            tabela += value[i].id;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].evento;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].time1;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].time2;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].classificacao;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].dia + "/" + value[i].mes + "/" + value[i].ano;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].inicioh + ":" + value[i].iniciom;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].fimh + ":" + value[i].fimm;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].aberturaPortoesH + ":" + value[i].aberturaPortoesM;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].aberturaEstacionamentoH + ":" + value[i].aberturaEstacionamentoM;;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].arquibancadaSuperiorNorte;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].arquibancadaInferiorNorte;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].arquibancadaSuperiorSul;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].arquibancadaInferiorSul;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].arquibancadaSuperiorOeste;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].cadeirasEspeciaisOeste;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].arquibancadaSuperiorLeste;
            tabela += '</center></td>';
            tabela += '<td><center>';
            tabela += value[i].cadeirasEspeciaisLeste;
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
    _obterError: function () {
        alert('Algo deu errado ao obter a lista de Ordens de Serviço. Tente novamente.');
    },
    _alterar: function (value) {
         this.dataBind(
                'GET',
                '',
                '/api/os/' + value.data.id,
                this._alterarSuccess,
                this._alterarError);
    },
    _alterarSuccess: function (value) {
            $('#id').val(value.id);
            $("#evento").val(value.evento);
            $("#time1").val(value.time1);
            $("#time2").val(value.time2);
            $("#classificacao").val(value.classificacao);
            $("#dia").val(parseInt(value.dia));
            $("#mes").val(parseInt(value.mes));
            $("#ano").val(parseInt(value.ano));
            $("#inicioh").val(parseInt(value.inicioh));
            $("#iniciom").val(parseInt(value.iniciom));
            $("#fimh").val(parseInt(value.fimh));
            $("#fimm").val(parseInt(value.fimm));
            $("#aberturaPortoesH").val(parseInt(value.aberturaPortoesH));
            $("#aberturaPortoesM").val(parseInt(value.aberturaPortoesM));
            $("#aberturaEstacionamentoH").val(parseInt(value.aberturaEstacionamentoH));
            $("#aberturaEstacionamentoM").val(parseInt(value.aberturaEstacionamentoM));
            $("#arquibancadaSuperiorNorte").val(parseInt(value.arquibancadaSuperiorNorte));
            $("#arquibancadaInferiorNorte").val(parseInt(value.arquibancadaInferiorNorte));
            $("#arquibancadaSuperiorSul").val(parseInt(value.arquibancadaSuperiorSul));
            $("#arquibancadaInferiorSul").val(parseInt(value.arquibancadaInferiorSul));
            $("#arquibancadaSuperiorOeste").val(parseInt(value.arquibancadaSuperiorOeste));
            $("#cadeirasEspeciaisOeste").val(parseInt(value.cadeirasEspeciaisOeste));
            $("#arquibancadaSuperiorLeste").val(parseInt(value.arquibancadaSuperiorLeste));
            $("#cadeirasEspeciaisLeste").val(parseInt(value.cadeirasEspeciaisLeste));
    },
    _alterarError: function (value) {
        alert('Algo deu errado tentando alterar a Ordem de Serviço. Tente novamente.');
    },
    _excluir: function (value) {
            this.dataBind(
                'DELETE',
                '',
                '/api/os/' + value.data.id,
                this._obter,
                this._obterError);
    },
    _salvar: function () {

        var data = {
            id: $('#id').val(),
            evento: $("#evento").val(),
            time1: $("#time1").val(),
            time2: $("#time2").val(),
            classificacao: $('#classificacao').val(),
            dia: $("#dia").val(),
            mes: $("#mes").val(),
            ano: $("#ano").val(),
            inicioh: $("#inicioh").val(),
            iniciom: $("#iniciom").val(),
            fimh: $("#fimh").val(),
            fimm: $("#fimm").val(),
            aberturaPortoesH: $("#aberturaPortoesH").val(),
            aberturaPortoesM: $("#aberturaPortoesM").val(),
            aberturaEstacionamentoH: $("#aberturaEstacionamentoH").val(),
            aberturaEstacionamentoM: $("#aberturaEstacionamentoM").val(),
            arquibancadaSuperiorNorte: $("#arquibancadaSuperiorNorte").val(),
            arquibancadaInferiorNorte: $("#arquibancadaInferiorNorte").val(),
            arquibancadaSuperiorSul: $("#arquibancadaSuperiorSul").val(),
            arquibancadaInferiorSul: $("#arquibancadaInferiorSul").val(),
            arquibancadaSuperiorOeste: $("#arquibancadaSuperiorOeste").val(),
            cadeirasEspeciaisOeste: $("#cadeirasEspeciaisOeste").val(),
            arquibancadaSuperiorLeste: $("#arquibancadaSuperiorLeste").val(),
            cadeirasEspeciaisLeste: $("#cadeirasEspeciaisLeste").val()
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
                    '/api/os',
                    this._salvarSuccess,
                    this._salvarError);

        } else {

            this.dataBind(
                    'PUT',
                    datastr,
                    '/api/os',
                    this._salvarSuccess,
                    this._salvarError);

        }

    },
    _salvarSuccess: function (value) {

        id: $('#id').val('');
        evento: $("#evento").val('');
        time1: $("#time1").val('');
        time2: $("#time2").val('');
        classificacao: $('#classificacao').val('');
        dia: $("#dia").val('');
        mes: $("#mes").val('');
        ano: $("#ano").val('');
        inicioh: $("#inicioh").val('');
        iniciom: $("#iniciom").val('');
        fimh: $("#fimh").val('');
        fimm: $("#fimm").val('');
        aberturaPortoesH: $("#aberturaPortoesH").val('');
        aberturaPortoesM: $("#aberturaPortoesM").val('');
        aberturaEstacionamentoH: $("#aberturaEstacionamentoH").val('');
        aberturaEstacionamentoM: $("#aberturaEstacionamentoM").val('');
        arquibancadaSuperiorNorte: $("#arquibancadaSuperiorNorte").val('');
        arquibancadaInferiorNorte: $("#arquibancadaInferiorNorte").val('');
        arquibancadaSuperiorSul: $("#arquibancadaSuperiorSul").val('');
        arquibancadaInferiorSul: $("#arquibancadaInferiorSul").val('');
        arquibancadaSuperiorOeste: $("#arquibancadaSuperiorOeste").val('');
        cadeirasEspeciaisOeste: $("#cadeirasEspeciaisOeste").val('');
        arquibancadaSuperiorLeste: $("#arquibancadaSuperiorLeste").val('');
        cadeirasEspeciaisLeste: $("#cadeirasEspeciaisLeste").val('')
        alert('Ordem de Serviço salva com sucesso.');
        this._obter();

    },
    _salvarError: function (value) {

        alert('Erro ao salvar Ordem de Serviço. Tente novamente.');

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