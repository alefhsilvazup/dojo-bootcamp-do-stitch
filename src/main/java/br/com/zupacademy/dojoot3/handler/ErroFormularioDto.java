package br.com.zupacademy.dojoot3.handler;


public class ErroFormularioDto {

    private String campo;
    private String erro;

    public ErroFormularioDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
