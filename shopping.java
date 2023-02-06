public class shopping{
    private String nome,cidade,bairro, rua;
    private int numero;

    public shopping(String nome, String cidade,String bairro, String rua,int numero){
        this.nome=nome;
        this.cidade=cidade;
        this.bairro=bairro;
        this.rua=rua;
        this.numero=numero;

    }
    public void imprimirDados(){
        System.out.println("Nome:" + nome + "Cidade:" + cidade + "Bairro:" + bairro + "Rua:" + rua + "numero:" + numero );

    }

    public void saudacao(){
        System.out.println("Bem vindo ao Shopping: " + nome);
        }

        public static void main(String []args){
            shopping shoppings = new shopping (" Partage", " São Gonçalo"," Centro", " Av.Presidente Kenneddy", 495);
            shoppings.imprimirDados();
            shoppings.saudacao();
        }


    
    }


    
    

    
        


