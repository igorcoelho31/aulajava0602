public class shoppingcapital extends shopping{
    public shoppingcapital(String nome, String cidade, String bairro, String rua, int numero){
        super(nome, cidade,bairro,rua,numero); 
    }

  

        public static void main(String []args){
            shopping shoppings = new shopping (" Barra Shopping", " Rio de Janeiro"," Barra da Tijuca", " Av. Das Américas", 4666);
            shoppings.imprimirDados();
            shoppings.saudacao();
        }
   
    
}
