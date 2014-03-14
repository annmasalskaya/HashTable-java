package com.hashtable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main( String args[] )
    {
        HashTable table=new HashTable(7);

        try
        {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
            {
               table.addElement(scanner.next());
            }
            scanner.close();

        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        table.printHashTable();
        if(table.findElement("te"))
        {
            System.out.print("Такое слово есть.");
        }
        else
            System.out.print("Такого слова нету.");

    }
}


