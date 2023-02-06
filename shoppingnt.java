public class shoppingnt extends shopping{
    public shoppingnt(String nome, String cidade, String bairro, String rua, int numero){
        super(nome, cidade,bairro,rua,numero); 
    }

  

        public static void main(String []args){
            shopping shoppings = new shopping (" Plaza", " Niterói"," Centro", " Av.Amaral Peixoto", 299);
            shoppings.imprimirDados();
            shoppings.saudacao();
        }
   
    
}