import java.util.Scanner;

public class Problem_07 {
     static int[] trimIndex(String s){
        int st=0,en=s.length()-1;
        while(st<=en&&s.charAt(st)==' ')st++;
        while(en>=st&&s.charAt(en)==' ')en--;
        return new int[]{st,en};
    }
    static String sub(String s,int a,int b){
        String r="";for(int i=a;i<=b;i++)r+=s.charAt(i);return r;
    }
    static boolean cmp(String a,String b){
        if(a.length()!=b.length())return false;
        for(int i=0;i<a.length();i++)if(a.charAt(i)!=b.charAt(i))return false;
        return true;
    }
    public static void main(String[] x){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] t=trimIndex(s);
        String m=sub(s,t[0],t[1]);
        System.out.println("Manual: "+m);
        System.out.println("Built : "+s.trim());
        System.out.println("Same? "+cmp(m,s.trim()));
    }
}
