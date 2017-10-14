
import java.util.Scanner
fun main(args: Array<String>) {
	//println("Hello world")
	
	val input = Scanner(System.`in`)
	print("Digite o numero de tentativas: ")
	
	var numeroTentativas = input.nextInt()
	println("Numero de tentativas: "+numeroTentativas)
	
	print("Digite a palavra: ")
	var b = input.next()
	var secreta="____________________"
    var cont=0
	var ast = b.length
		
	while(ast>0){
		print("*")
		//aqui era pra preencher a varaiavel secreta com asteriscos, mas da erro igual na linha 36
		ast--
	
	}
	println("")
	
	
    while(numeroTentativas>0)
    {
		println("Tentativas restantes:"+numeroTentativas)
        println("Chute a letra")
		var pdig = input.next()
		if(b.contains(pdig)){
			println("Chutou certo\n")
			while(cont<ast){
				if(b[ast]==pdig[1]){   // coloquei pdig[] pq é uma letra so
					secreta[ast]=b[ast];  
				}
			}
			
		}else{
			println("Chutou errado\n")
			numeroTentativas--
			
		}
		
        
    }
	println("Chutou errado\n")
}