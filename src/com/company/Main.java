package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String w01 = "";
        String w2 = "";
        Scanner kbin = new Scanner(System.in);
        boolean con = true;
        boolean con1 = true;
        String sub = "";
        String sub1 = "";
        int a = 0, b = 0, c = 0, d = 0,e = 0,f = 0,g = 0,h = 0,i = 0,j = 0,k = 0,l = 0,m = 0,n =0,o = 0,p = 0,q = 0,r = 0,s = 0,t = 0,u = 0,v = 0,w = 0,x = 0,y = 0,z = 0;
        int a1 = 0, b1 = 0, c1 = 0, d1 = 0,e1 = 0,f1 = 0,g1 = 0,h1 = 0,i1 = 0,j1 = 0,k1 = 0,l1 = 0,m1 = 0,n1 =0,o1 = 0,p1 = 0,q1 = 0,r1 = 0,s1 = 0,t1 = 0,u1 = 0,v1 = 0,w1 = 0,x1 = 0,y1 = 0,z1 = 0;

        System.out.println("Anagram Tester\nPlease only use letter (No special characters or spaces)\nInput first word");
        w01 = kbin.nextLine().toLowerCase();
        System.out.println("Input second word");
        w2 = kbin.nextLine().toLowerCase();

        if (w01.length() == w2.length())
        {
            while(con)
            {
                if (w01.length() == 0)
                {
                    break;
                }
                else
                {
                    sub = w01.substring(w01.length()-1, w01.length());
                    System.out.println(sub);
                    w01 = w01.substring(0, w01.length() - 1);

                    a = (Objects.equals(sub, "a")) ? +1 : a ;
                    b = (Objects.equals(sub, "b")) ? +1 : b ;
                    c = (Objects.equals(sub, "c")) ? +1 : c ;
                    d = (Objects.equals(sub, "d")) ? +1 : d ;
                    e = (Objects.equals(sub, "e")) ? +1 : e ;
                    f = (Objects.equals(sub, "f")) ? +1 : f ;
                    g = (Objects.equals(sub, "g")) ? +1 : g ;
                    h = (Objects.equals(sub, "h")) ? +1 : h ;
                    i = (Objects.equals(sub, "i")) ? +1 : i ;
                    j = (Objects.equals(sub, "j")) ? +1 : j ;
                    k = (Objects.equals(sub, "k")) ? +1 : k ;
                    l = (Objects.equals(sub, "l")) ? +1 : l ;
                    m = (Objects.equals(sub, "m")) ? +1 : m ;
                    n = (Objects.equals(sub, "n")) ? +1 : n ;
                    o = (Objects.equals(sub, "o")) ? +1 : o ;
                    p = (Objects.equals(sub, "p")) ? +1 : p ;
                    q = (Objects.equals(sub, "q")) ? +1 : q ;
                    r = (Objects.equals(sub, "r")) ? +1 : r ;
                    s = (Objects.equals(sub, "s")) ? +1 : s ;
                    t = (Objects.equals(sub, "t")) ? +1 : t ;
                    u = (Objects.equals(sub, "u")) ? +1 : u ;
                    v = (Objects.equals(sub, "v")) ? +1 : v ;
                    w = (Objects.equals(sub, "w")) ? +1 : w ;
                    x = (Objects.equals(sub, "x")) ? +1 : x ;
                    y = (Objects.equals(sub, "y")) ? +1 : y ;
                    z = (Objects.equals(sub, "z")) ? +1 : z ;

                    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);


                }
            }

            while(con1)
            {
                if (w01.length() == 0)
                {
                    break;
                }
                else
                {
                    sub = w01.substring(w01.length()-1, w01.length());
                    System.out.println(sub);
                    w01 = w01.substring(0, w01.length() - 1);

                    a1 = (Objects.equals(sub1, "a")) ? +1 : a1 ;
                    b1 = (Objects.equals(sub1, "b")) ? +1 : b1 ;
                    c1 = (Objects.equals(sub1, "c")) ? +1 : c1 ;
                    d1 = (Objects.equals(sub1, "d")) ? +1 : d1 ;
                    e1 = (Objects.equals(sub1, "e")) ? +1 : e1 ;
                    f1 = (Objects.equals(sub1, "f")) ? +1 : f1 ;
                    g1 = (Objects.equals(sub1, "g")) ? +1 : g1 ;
                    h1 = (Objects.equals(sub1, "h")) ? +1 : h1 ;
                    i1 = (Objects.equals(sub1, "i")) ? +1 : i1 ;
                    j1 = (Objects.equals(sub1, "j")) ? +1 : j1 ;
                    k1 = (Objects.equals(sub1, "k")) ? +1 : k1 ;
                    l1 = (Objects.equals(sub1, "l")) ? +1 : l1 ;
                    m1 = (Objects.equals(sub1, "m")) ? +1 : m1 ;
                    n1 = (Objects.equals(sub1, "n")) ? +1 : n1 ;
                    o1 = (Objects.equals(sub1, "o")) ? +1 : o1 ;
                    p1 = (Objects.equals(sub1, "p")) ? +1 : p1 ;
                    q1 = (Objects.equals(sub1, "q")) ? +1 : q1 ;
                    r1 = (Objects.equals(sub1, "r")) ? +1 : r1 ;
                    s1 = (Objects.equals(sub1, "s")) ? +1 : s1 ;
                    t1 = (Objects.equals(sub1, "t")) ? +1 : t1 ;
                    u1 = (Objects.equals(sub1, "u")) ? +1 : u1 ;
                    v1 = (Objects.equals(sub1, "v")) ? +1 : v1 ;
                    w1 = (Objects.equals(sub1, "w")) ? +1 : w1 ;
                    x1 = (Objects.equals(sub1, "x")) ? +1 : x1 ;
                    y1 = (Objects.equals(sub1, "y")) ? +1 : y1 ;
                    z1 = (Objects.equals(sub1, "z")) ? +1 : z1 ;

                    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);


                }
            }

            if (a==a1 && b==b1 && c=c1 && d=d1 && e=e1 && f==f1 && g==g1 && h==h1 && i==i1 && j==j1 && k==k1 && l==l1 && m==m1 && n==n1 && o=o=1 && p==p1 && q==q1 && r==r1 && s==s1 && t==t1 && u==u1 && v==v1 && w==w1 && x==x1 && y==y1 && z==z1)




        }
        else
        {
            System.out.println("The words are not anagrams\nEnding Program");
            System.exit(0);
        }

    }
}
