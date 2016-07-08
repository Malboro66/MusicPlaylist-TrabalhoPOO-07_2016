package musiclist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class musicList {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int escolha;
        ArrayList<Musica> musica;
        musica = new ArrayList<>();
        importarMusica(musica);
        ArrayList<Artist> artista = new ArrayList<>();
        importar(artista);
        do{
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("+         1. Cadastrar Musica        +");
            System.out.println("+------------------------------------+");
            System.out.println("+         2. Cadastrar Artista       +");
            System.out.println("+------------------------------------+");
            System.out.println("+         3. Excluir Musica          +");
            System.out.println("+------------------------------------+");
            System.out.println("+         4. Excluir Artista         +");
            System.out.println("+------------------------------------+");
            System.out.println("+         5. Encerrar Programa       +");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("Digite a opcao: ");
            escolha = input.nextInt();
            switch(escolha){
                case 1: incluir(musica);
                break;
                case 2: incluirArtista(artista);
                break;
                case 3: excluirMusica(musica);
                break;
                case 4: excluir(artista);
                break;
            }
            public static void importarMusica(ArrayList<Musica>musica){
                try{
                    try (FileReader arq = new FileReader("C:\\musica.txt")) {
                        BufferedReader lerArq = new BufferedReader(arq);
                        String linha = lerArq.readLine();
                        while(linha!=null){
                            musica.add(linha);
                            linha = lerArq.readLine();
                        }   }
                }catch(IOException err){
                System.err.printf("Erro na abertura do arquivo",err.getMessage());
                }       
            }
            public static void importar(ArrayList<Artist>artista){
                try{
                    FileReader arq2 = new FileReader("artista.txt");
                    BufferedReader lerArq2 = new BufferedReader(arq2);
                    String linha = lerArq2.readLine();
                    while(linha!=null){
                    artistas.add(linha);
                    linha = lerArq2.readLine();
                    }
                    arq.close();
                }
                catch(IOException err){
                    System.err.printf("Erro na abertura do arquivo",err.getMessage()); 
                }
            }
            public static void exportarMusica(ArrayList<Musica>musica) throws IOException{
                FileWriter arq = null;
                try {
                     arq = new FileWriter("C:\\musica.txt");
                    } 
                catch (IOException e) {
                }
                try (PrintWriter gravarArq = new PrintWriter(arq)) {
					int p = musica.size();
					for (int i = 0; i < p; i++) {
						gravarArq.printf(musica.get(i));
						gravarArq.printf("\r\n");
					}
				}
            }
            public static void exportar(ArrayList<Artist>artista) throws IOException{
                FileWriter arq2 = null;
            try {
                arq2 = new FileWriter("C:\\artista.txt");
                } 
                catch (IOException e) {
                }
            PrintWriter gravarArq2 = new PrintWriter(arq2);
            int r = artista.size();
            for (int j = 0; j < r; j++) {
                    gravarArq2.printf(artista.get(j));
                    gravarArq2.printf("\r\n");
                }
                    gravarArq.close();
            }
            public static void incluir(ArrayList<Musica>musica){
                Scanner input = new Scanner(System.in);
                String nome;
                System.out.printf("Informe o nome da musica: \n");
                nome = input.nextLine();
                musica.add(nome + ":");
                exportarMusica(musica);
            }
            public static void incluirArtista(ArrayList<Artist>artista){
                Scanner input = new Scanner(System.in);
                String nome;
                System.out.printf("Informe o nome do Artista: \n");
                nome = input.nextLine();
                artista.add(nome + ":");
                try {
                    exportar(artista);
                    } 
                catch (IOException ex) {
                        Logger.getLogger(Artist.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            public static void excluirMusica(ArrayList<Musica>musica){
                Scanner input = new Scanner(System.in);
                int i;
                System.out.printf("\nInforme o indice da posicao a ser excluida\n");
                i = input.nextInt(); 
                try{
                    musica.remove(i);
                   }
                catch(IndexOutOfBoundsException err){
                    System.out.printf("\nErro: Posicao invalida(%s).\n", err.getMessage());    
                }
            }
            public static void excluir(ArrayList<Artist>artista){
                Scanner input = new Scanner(System.in);
                int i;
                System.out.printf("\nInforme o indice da posicao a ser excluida\n");
                i = input.nextInt(); 
                try{
                     artista.remove(i);
                   }
                catch(IndexOutOfBoundsException err){
                    System.out.printf("\nErro: Posicao invalida(%s).\n", err.getMessage());    
                }
            }
}



