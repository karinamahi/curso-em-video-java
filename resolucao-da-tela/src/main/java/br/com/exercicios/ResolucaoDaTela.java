package br.com.exercicios;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoDaTela 
{
    public static void main( String[] args )
    {
    	Toolkit tk = Toolkit.getDefaultToolkit();
    	Dimension resolucao = tk.getScreenSize();
        System.out.println( "Sua tela tem resolução: " + resolucao.width + " X " + resolucao.height);
    }
}
