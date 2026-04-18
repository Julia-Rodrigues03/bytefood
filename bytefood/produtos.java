
package bytefood;



public class produtos {
    private String nome;
    private String descricao;
    private double preco;

    public produtos(String nome, String descricao, double preco) {

        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco; }

        public void exibirProdutos(){
            System.out.println("produto: " + nome);
            System.out.println("Descrição: " + descricao);
            System.out.println("Preço: R$ " + preco);
        }
        
        public String getDescricao(){return descricao;}
        public String getNome(){return nome;}
        public double getPreco(){return preco;}


        public void setPreco(double preco){
            if (preco > 0){
                this.preco = preco;
            } else {
                System.out.println("Preço inválido! O preço deve ser maior que zero.");
            }
        }
    }
        









