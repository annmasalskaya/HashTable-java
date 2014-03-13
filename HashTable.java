package com.hashtable;
import java.util.ArrayList;

public class HashTable
{
   private int size;
   private ArrayList<String>[] array;

   public HashTable(int number)
    {
        size=number;
        array= new ArrayList[size];
        for (int i=0; i<size; ++i)
            array[i]=new ArrayList<String>();
    }

    public ArrayList<String> hashFunc(String str)
    {
        int result=0;
        for( int i=0; i<str.length(); i++)
            result+=(int)str.charAt(i);

       return array[result%size];
    }

    public void addElement(String str)
    {
       hashFunc(str).add(str);
    }

    /*public boolean findElement(String str)
    {
        ArrayList<String> res=hashFunc(str);
       for (int i = 0; i  <hashFunc(str).size(); i++)
       {
            if(res.get(i)==str)
           System.out.print(hashFunc(str).get(i) + " ");
                return true;

       }


       return false;
    }*/

    public void printHashTable()
    {
        System.out.println("Ключ:  значение ");
        for (int i=0; i<size; ++i)
        {
          System.out.print(i + ":  ");
            for (int j = 0; j < array[i].size(); j++)
              System.out.print(array[i].get(j) + " ");
            System.out.println();
        }
    }
}

