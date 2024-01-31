/* Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes
informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada. */

package UNIDADE1.CriacaoDeClasses1.Fatura24;

class Fatura24 {
    private String numeroIdentificacao;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    //Construtor
    public Fatura24(String numeroIdentificacao, String descricao, int quantidade, double precoUnitario){
        this.numeroIdentificacao=numeroIdentificacao;
        this.descricao=descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    //Getter e Setter para número de identificação
    public String getNumeroIdentificacao(){
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao){
        this.numeroIdentificacao=numeroIdentificacao;
    }

    //Getter e Setter para descrição
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Getter e Setter para quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if (quantidade>0) {
            this.quantidade = quantidade;
        } else{
            this.quantidade=0;
        }
    }

    //Getter e Setter para preço unitário
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario>0.0) {
            this.precoUnitario = precoUnitario;
        } else{
            this.precoUnitario=0.0;
        }
    }

    //Metodo para calculae o total da fatura
    public double calculaTotal(){
        return quantidade*precoUnitario;
    }

} 
