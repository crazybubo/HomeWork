// Liuboslav Dimitrov Jordanov
// 11a klas
//15-ti nomer
//Tehnologichno uchilishte kym TU Sofia
//programa za podrejdane na pytnici v samolet











import java.util.*;
import java.util.Arrays;

public class AirPlaneBig {

		public static void main(String[] args) {
			flyingAwesome plane = new flyingAwesome();
			plane.new_seats();

	}
}







		class flyingAwesome{
		int sum = 0;
		fillingComputer Pulp = new fillingComputer();
		public void new_seats(){
			while(sum<162){
				int aero_c2 = Pulp.aero_c;
					int rvalue = new Random().nextInt(Pulp.aero_c) + 1;
						if(sum+rvalue > 162) continue;
							if( Pulp.aero_c == 999 ){
							System.out.println("There are no more free seats.");
							break;
				}				
					sum = sum + rvalue;
					Pulp.case_system(rvalue);
					if ( Pulp.aero_c != aero_c2 ) sum = sum - rvalue;
						System.out.println(" ");
						System.out.println( rvalue + " people aer getting on the airplane." );
						print_seats();
			}

		}


		public void print_seats(){	
			System.out.println(" ");	
			for(int c=0;c<=26;c++) {
				for (int r=0;r<=5;r++) {
					System.out.print(Pulp.seats[c][r]+ " ");
					if (r==2) System.out.print(" ");
					}
						System.out.println(" ");
				}
			}



	}


		class fillingComputer{
			int ColRow = 0;
			int aero_c = 3;
			int[][] seats = new int[27][6];

			public void case_pack(int num){

				switch(num){
					case 3: casenum1();
					break;
					case 2: casenum2();
					break;
					case 1: casenum3();
					break;
				}
			return;
			}

			public void casenum1(){
				for( int i=0;;){
					if (seats[ColRow][i]+seats[ColRow][i+2]==0){
						seats[ColRow][i] = 1;
						seats[ColRow][i+1] = 1;
						seats[ColRow][i+2] = 1;
						
						}
						if( i==3 ) break;
						else{
						i = 3;
						
						}
					}



					for(int m=ColRow+1; m<=27; m++){

						if(m==27){
							aero_c=2;
							return;
						}

						for( int k=0;;){

						if(seats[m][k]+seats[m][k+2]==0){
							seats[m][k] = 1;
							seats[m][k+1] = 1;
							seats[m][k+2] = 1;
							return;
						}

							if( k==3 ) break;
							else{
							k = 3;
							
							}
						}
					}



				}


			public void casenum2(){



				for ( int i=0; i<5; i++ ){
					if(i==2) continue;
						if(seats[ColRow][i]+seats[ColRow][i+1] == 0){
							seats[ColRow][i] = 1;
							seats[ColRow][i+1] = 1;
							return;
						}
				}

						for(int m=ColRow+1; m<=27; m++){
							if (m==27){
								aero_c=1;
								return;
							}
						for ( int k=0; k<5;k++ ){
							if(k==2) continue;
								if(seats[m][k]+seats[m][k+1] == 0){
									seats[m][k] = 1;
									seats[m][k+1] = 1;
									return;
								}
							}
						if ( ColRow == 26  ){
							aero_c = 1;
							return;
						}
					}
			}

			public void casenum3(){
				for( int i=0; i<=5; i=i+1 ){
					if ((seats[ColRow][i]) == 0){
						seats[ColRow][i] = 1;
						return;
						}
					}


					for(;;){
						ColRow++;
						for( int i=0; i<=5; i++ ){
							if ((seats[ColRow][i]) == 0){
								seats[ColRow][i] = 1;
								return;
							}
						}						
						
					}
			}
		}	