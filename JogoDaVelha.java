import java.util.Scanner;

public class JogoDaVelha 
{
    public static void main(String[] args) 
    {
        int posicao = 0;
        int jogadas = 0;
        String linha1, linha2, linha3, coluna1, coluna2, coluna3, diagonal1, diagonal2;
        String jogador;

        Scanner scan = new Scanner(System.in);

        String matriz[][] = new String[3][3];

        matriz[0][0] = "7";
        matriz[0][1] = "8";
        matriz[0][2] = "9";

        matriz[1][0] = "4";
        matriz[1][1] = "5";
        matriz[1][2] = "6";

        matriz[2][0] = "1";
        matriz[2][1] = "2";
        matriz[2][2] = "3";

        System.out.println(" \n_______Jogo iniciado, boa sorte :) !_______\n");
        System.out.println(" \n  _______'X' Faça sua jogada!_______");

        while (jogadas < 9) 
        { 
// EXIBIR O TABULEIRO //

            System.out.println("\n" +
            matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + "\n" +
            matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + "\n" +
            matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2]);
          
// POSICOES PARA GANHAR //

            linha1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
            linha2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
            linha3 = matriz[2][0] + matriz[2][1] + matriz[2][2];

            coluna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
            coluna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
            coluna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];

            diagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
            diagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];

// DEFINIR VITORIA PARA JOGADOR "X" //

            if (
                linha1.equals("XXX") || linha2.equals("XXX") || linha3.equals("XXX") || 
                coluna1.equals("XXX") || coluna2.equals("XXX") || coluna3.equals("XXX") ||
                diagonal1.equals("XXX") || diagonal2.equals("XXX")
            ) {
                System.out.println(" \n Jogador 'X' VENCEU!! \n ");
                break;
            }

// DEFINIR VITORIA PARA JOGAR "O" //

            if (
                linha1.equals("OOO") || linha2.equals("OOO") || linha3.equals("OOO") || 
                coluna1.equals("OOO") || coluna2.equals("OOO") || coluna3.equals("OOO") || 
                diagonal1.equals("OOO") || diagonal2.equals("OOO")
            ) {
                System.out.println(" \n Jogador 'O' VENCEU!! \n ");
                break;
            }

// DEFINIR JOGADAS //

            if (jogadas % 2 == 0) 
            {
                jogador = "X";
            } else {
                jogador = "O";
            }

            System.out.printf("\nEscolha uma posição: ");
            posicao = scan.nextInt();
            
// DEFINIR POSICOES SELECIONADAS //

            switch (posicao) 
            {
                case 1:
                    if (matriz[2][0].equals("1")) 
                    {
                        matriz[2][0] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 2:
                    if (matriz[2][1].equals("2")) 
                    {
                        matriz[2][1] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 3:
                    if (matriz[2][2].equals("3")) 
                    {
                        matriz[2][2] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 4:
                    if (matriz[1][0].equals("4")) 
                    {
                        matriz[1][0] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 5:
                    if (matriz[1][1].equals("5")) 
                    {
                        matriz[1][1] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 6:
                    if (matriz[1][2].equals("6")) 
                    {
                        matriz[1][2] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 7:
                    if (matriz[0][0].equals("7")) 
                    {
                        matriz[0][0] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 8:
                    if (matriz[0][1].equals("8")) 
                    {
                        matriz[0][1] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
                case 9:
                    if (matriz[0][2].equals("9")) 
                    {
                        matriz[0][2] = jogador;
                    } else {
                        System.out.println("\nPosição já preenchida!");
                        continue;
                    }
                    break;
            }
            jogadas++;
        } 

// CONDICAO PARA DAR VELHA //

    if (jogadas == 9) 
        {
            System.out.println("\n!!!!! VELHA !!!!!\n");
        }
    }
}