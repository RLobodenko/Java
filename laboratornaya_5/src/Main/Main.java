package Main;
import java.util.Scanner;




class Football{

    String name;

    double pobed;

}

public class Main{
    //Metody
    public static Football [] setFootballArr(int k){

        Scanner sc=new Scanner(System.in, "cp1251");
        Football football[]=new Football[k];

        System.out.println("Vvedite informaciu:");
        for (int i =0; i < football.length; i++){


            football[i]=new Football();
            System.out.print("Nazvanie "+(i+1)+"=>");

            football[i].name=sc.nextLine();
            System.out.print("Kolichestvo pobed "+(i+1)+"komandy =>");
            football[i].pobed=sc.nextDouble();
            sc.nextLine();


        }
        return football;
    }

public static void showArray(Football[] cntr){    //Vyvod massiva
    for(int i=0; i< cntr.length; i++){

        System.out.println(""+cntr[i].name+"\t"+cntr[i].pobed+"");

    }


}

//informacia ob odnoi komande

public static void showFootball(Football cntr){
        System.out.println(""+cntr.name+"\t"+cntr.pobed+"");


}

// Samoe bolshoe kolichestvo pobed

    public static int NomMax(Football []st){
        int nommax=0;
        double max=st[nommax].pobed;
        for(int i=0; i< st.length;i++)
            if(st[i].pobed>max){
                max=st[i].pobed;
                nommax=i;

            }
        return nommax;
    }

    //pobed bolshe srednego

    //public static Football[]Bigger(Football cntr[]){
    
// double sred=avgPobed(cntr);

     //   int kol=0;
       // for(int i=0; i< cntr.length;i++){

      //      if(cntr[i].pobed>sred)
      //          ++kol;

     //   }
      //  if(kol!=0){
       //     Football[]bigFootball=new Football[kol];
       //     int n=-1;
       //     for(int i=0;i<cntr.length;i++)
        //        if(cntr[i].pobed>sred){

        //            bigFootball[++n]=cntr[i];




       //         }
       //     return bigFootball;

      //  }else return null;



//    }

//sortirovka

    public static void sortPobed(Football []cntr){
        for (int i = 0; i <cntr.length-1; i++)
            for (int j=0;j<cntr.length-1-i;j++)
                if(cntr[j].pobed>cntr[j+1].pobed){

                    Football rab=cntr[j];

                    cntr[j]=cntr[j+1];
                    cntr[j+1]=rab;


                }



    }



//poisk po nazvaniu
    public static Football findForName(Football cntr[], String name){
        int n=-1;
        for(int i=0; i<cntr.length; i++)
            if(name.equals(cntr[i].name))
                n=i;
            if(n!=-1){

                return cntr[n];

            }else return null;

    }
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in,"cp1251");

        System.out.print("Vvedite kolichestvo komand=>");
        int n=sc.nextInt();
        Football football[]=setFootballArr(n);
        System.out.println("\n Haracteristiki");
        showArray(football);


        // kolichestvo pobed
        int nommax=NomMax(football);
        System.out.println("\n Komanda s max kolichestvom pobed:");
        showFootball(football[nommax]);


        // bolshe srednego

   //     System.out.println("\n Komandy, s kolichestvom pobed bolshe srednego:");
    //    Football[] larger=Bigger(football);
    //    showArray(larger);


        //sorirovka

        sortPobed(football);
        System.out.println("\nOtsortirovannyi spisok:");
        showArray(football);


        //poisk strany

        System.out.println("\n Poisk Vvedite nazvanie=>");
        sc.nextLine();
        String sname=sc.nextLine();
        Football sfind=findForName(football, sname);
        if(sfind!=null){
            showFootball(sfind);


        }else {
            System.out.println("takoi komandy net!");
        }




    }
    }























