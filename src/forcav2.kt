import java.util.Scanner
fun main(args: Array<String>) {
	
	val input = Scanner(System.`in`)
	
	print("Digite o número tentativas: ")	
	var numeroTentativas = input.nextInt()
	
	print("Digite a palavra secreta: ")
	var secreta = input.next()
	
	var pesquisa = "" //guardar as letras que serão digitadas
	var index = 0 //indice que foi encontrado a letra digitada
	
	var palavraEncontrada = CharArray(secreta.length); //criar um array de char do tamanho da palavra secreta
	
	
	
	var i =0
	while(i<secreta.length){//loop para percorrer o array colocando os asteriscos
		
		palavraEncontrada[i] = '*'
	
		i++
		
	}

	println(palavraEncontrada)
	var perdeu = true
	while(numeroTentativas>0){
		print("Digite a letra a ser pesquisada: ")
		pesquisa = input.next()
		
		var p = pesquisa.toCharArray() //converte para um array de char porque palavraencontrada é do tipo char e não string
		
		index = secreta.indexOf(pesquisa) //verifica em qual posição foi encontrada a letra digitada
		
		
		if(index==-1){//a função indexOf retorna a posição da letra digitada ou  -1 se não encontrou a letra
			numeroTentativas--
		}else{
			
			while(index>=0){//substitui os asteriscos pela letra que foi encontrada
			palavraEncontrada[index] = pesquisa.toCharArray()[0] //pego só a primeira posição...(verificar se tem como ler no formato char)
			
			index = secreta.indexOf(pesquisa,index+1) //continua pesquisando a partir da ultima ocorrencia 
		}
			
		}			
		
		
		println("Numero de Tentativas: "+numeroTentativas)
		println(palavraEncontrada)

		if (secreta.equals(String(palavraEncontrada))){
			println("Acertou mizeravi!!!")
			numeroTentativas=0
			perdeu = false
		}
	}
	if(perdeu==true) print("Perdeu!!!")

	
	
}