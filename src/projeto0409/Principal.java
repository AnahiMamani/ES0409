package projeto0409;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	
	static FileReader fr;
	static BufferedReader br;
	static FileWriter fw;
	static BufferedWriter bw;
	static final String ARQ_ENTRADA = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\entrada.txt";
	static final String ARQ_SAIDA = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\saida.txt";

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		fr = new FileReader(ARQ_ENTRADA);
		br = new BufferedReader(fr);
		fw = new FileWriter(ARQ_SAIDA); 
		bw = new BufferedWriter(fw);
		
		
//		escrita();
//		leitura();
//		formataDataSubString();
//		formataDataSplit();
//		formataNome();
		//formataResp();
		formataIgnoraNome();
	}

	private static void formataIgnoraNome() {
		String nomeComp= "Pedro alvares Cabral";
		String [] nomeSepa = nomeComp.split(" ");
		
		for(String nome : nomeSepa) {
			if(!nome.equals(nome.toLowerCase())) {
				System.out.println(nome);
			}
		}
		
	}

	private static void formataResp() {
		//Aqui a gente vai converter ambas as respostas em maiuscula para que ele compare elas na forma maiuscula
		String respCorr= "Pedro Álvares Cabral";
		String resp = " pedro álvares cabral ";
		resp = (resp.trim()).toUpperCase();
		respCorr = respCorr.toUpperCase();
		String [] nomes = resp.split(" ");
		
		if(respCorr.equals(resp)) {
			System.out.println("Resposta correta");
		}else {
			System.out.println("Resposta incorreta");
		}
	}

	private static void formataNome() {
		String nomeComp = "Ricardo Molinari dos Prazeres";
		String [] nomes = nomeComp.split(" ");
		System.out.println(nomes[nomes.length - 1]);//ele pega o ultimo nome
	}

	private static void formataDataSplit() {
		String dataAme = "2024/09/05";
		String [] datas = dataAme.split("/");
		System.out.println(datas[2] + "/"+ datas[1] +"/"+ datas[0]);
	}

	private static void formataDataSubString() {
		String dataAme = "2024/09/05";
		String ano = dataAme.substring(0, 4);//não necessariamente eu preciso criar uma variavel para as posições Ini e Fim
		String mes = dataAme.substring(5, 7);
		String dia = dataAme.substring(8);
		System.out.println(dia + "/"+ mes +"/"+ ano);
	
	}

	private static void escrita() throws IOException {
		bw.write("Linha 1"); //adicionando uma linha ao arquivo
		bw.newLine(); //linha pulada com o newLine
		bw.write("Linha 2");
		bw.flush(); //o Commit ja que anteriormente fizemos so o registro no buffer, agora ele sera registrado de verdade.

	}

	private static void leitura() throws IOException {
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	}

}
