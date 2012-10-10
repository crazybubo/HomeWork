//Tehnologichno uchilishte Elektronni sistemi kym TU Sofiq.
//11 A klas
//Nomer 15
//Liuboslav Dimitrov Jordanov
//Namira sumata na vsichki nechetni chisla v interval ot 2 vyvedeni chisla.



# include <stdio.h>

int main()
{
      int x, y, n, i;
      printf("vuvedi na4alo", x);
      scanf("%d",&x);
      printf("vuvedi krai", y);
      scanf("%d",&y);
      
      
      n = x;
      
      while (n<=y){
            if (n%2 != 0)
            i = i + n;
            else {
                 n = n++;
                 }
                 }
      printf("%d",i);
            
      return 0;        
}
