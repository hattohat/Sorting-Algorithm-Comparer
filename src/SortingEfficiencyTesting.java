//Author: Emmitt Frankenberry
//Program to sort the given arrays to the the efficiency in a bigger setting
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortingEfficiencyTesting {

	public static void main(String[] args){
		int numInFile=10000;
		int numOfMaxFiles=270;
        int FileNum=0;
        int i;
        int j=0;
        //array of durations to be added to a file at the end
        long temp;
        float[] durationOfQS = new float[numOfMaxFiles];
        float[] durationOfMS = new float[numOfMaxFiles];
        float[] durationOfHS = new float[numOfMaxFiles];
        long startTime;
        long endTime;
        File file[] = new File[270];
		{
			file[0] = new File("File_Small_Unsorted0.txt");
			file[1] = new File("File_Small_Unsorted1.txt");
			file[2] = new File("File_Small_Unsorted2.txt");
			file[3] = new File("File_Small_Unsorted3.txt");
			file[4] = new File("File_Small_Unsorted4.txt");
			file[5] = new File("File_Small_Unsorted5.txt");
			file[6] = new File("File_Small_Unsorted6.txt");
			file[7] = new File("File_Small_Unsorted7.txt");
			file[8] = new File("File_Small_Unsorted8.txt");
			file[9] = new File("File_Small_Unsorted9.txt");
			file[10] = new File("File_Small_Unsorted10.txt");
			file[11] = new File("File_Small_Unsorted11.txt");
			file[12] = new File("File_Small_Unsorted12.txt");
			file[13] = new File("File_Small_Unsorted13.txt");
			file[14] = new File("File_Small_Unsorted14.txt");
			file[15] = new File("File_Small_Unsorted15.txt");
			file[16] = new File("File_Small_Unsorted16.txt");
			file[17] = new File("File_Small_Unsorted17.txt");
			file[18] = new File("File_Small_Unsorted18.txt");
			file[19] = new File("File_Small_Unsorted19.txt");
			file[20] = new File("File_Small_Unsorted20.txt");
			file[21] = new File("File_Small_Unsorted21.txt");
			file[22] = new File("File_Small_Unsorted22.txt");
			file[23] = new File("File_Small_Unsorted23.txt");
			file[24] = new File("File_Small_Unsorted24.txt");
			file[25] = new File("File_Small_Unsorted25.txt");
			file[26] = new File("File_Small_Unsorted26.txt");
			file[27] = new File("File_Small_Unsorted27.txt");
			file[28] = new File("File_Small_Unsorted28.txt");
			file[29] = new File("File_Small_Unsorted29.txt");
			file[30] = new File("File_Med_Unsorted0.txt");
			file[31] = new File("File_Med_Unsorted1.txt");
			file[32] = new File("File_Med_Unsorted2.txt");
			file[33] = new File("File_Med_Unsorted3.txt");
			file[34] = new File("File_Med_Unsorted4.txt");
			file[35] = new File("File_Med_Unsorted5.txt");
			file[36] = new File("File_Med_Unsorted6.txt");
			file[37] = new File("File_Med_Unsorted7.txt");
			file[38] = new File("File_Med_Unsorted8.txt");
			file[39] = new File("File_Med_Unsorted9.txt");
			file[40] = new File("File_Med_Unsorted10.txt");
			file[41] = new File("File_Med_Unsorted11.txt");
			file[42] = new File("File_Med_Unsorted12.txt");
			file[43] = new File("File_Med_Unsorted13.txt");
			file[44] = new File("File_Med_Unsorted14.txt");
			file[45] = new File("File_Med_Unsorted15.txt");
			file[46] = new File("File_Med_Unsorted16.txt");
			file[47] = new File("File_Med_Unsorted17.txt");
			file[48] = new File("File_Med_Unsorted18.txt");
			file[49] = new File("File_Med_Unsorted19.txt");
			file[50] = new File("File_Med_Unsorted20.txt");
			file[51] = new File("File_Med_Unsorted21.txt");
			file[52] = new File("File_Med_Unsorted22.txt");
			file[53] = new File("File_Med_Unsorted23.txt");
			file[54] = new File("File_Med_Unsorted24.txt");
			file[55] = new File("File_Med_Unsorted25.txt");
			file[56] = new File("File_Med_Unsorted26.txt");
			file[57] = new File("File_Med_Unsorted27.txt");
			file[58] = new File("File_Med_Unsorted28.txt");
			file[59] = new File("File_Med_Unsorted29.txt");
			file[60] = new File("File_Large_Unsorted0.txt");
			file[61] = new File("File_Large_Unsorted1.txt");
			file[62] = new File("File_Large_Unsorted2.txt");
			file[63] = new File("File_Large_Unsorted3.txt");
			file[64] = new File("File_Large_Unsorted4.txt");
			file[65] = new File("File_Large_Unsorted5.txt");
			file[66] = new File("File_Large_Unsorted6.txt");
			file[67] = new File("File_Large_Unsorted7.txt");
			file[68] = new File("File_Large_Unsorted8.txt");
			file[69] = new File("File_Large_Unsorted9.txt");
			file[70] = new File("File_Large_Unsorted10.txt");
			file[71] = new File("File_Large_Unsorted11.txt");
			file[72] = new File("File_Large_Unsorted12.txt");
			file[73] = new File("File_Large_Unsorted13.txt");
			file[74] = new File("File_Large_Unsorted14.txt");
			file[75] = new File("File_Large_Unsorted15.txt");
			file[76] = new File("File_Large_Unsorted16.txt");
			file[77] = new File("File_Large_Unsorted17.txt");
			file[78] = new File("File_Large_Unsorted18.txt");
			file[79] = new File("File_Large_Unsorted19.txt");
			file[80] = new File("File_Large_Unsorted20.txt");
			file[81] = new File("File_Large_Unsorted21.txt");
			file[82] = new File("File_Large_Unsorted22.txt");
			file[83] = new File("File_Large_Unsorted23.txt");
			file[84] = new File("File_Large_Unsorted24.txt");
			file[85] = new File("File_Large_Unsorted25.txt");
			file[86] = new File("File_Large_Unsorted26.txt");
			file[87] = new File("File_Large_Unsorted27.txt");
			file[88] = new File("File_Large_Unsorted28.txt");
			file[89] = new File("File_Large_Unsorted29.txt");
			file[90] = new File("File_Small_SmallToLarge0.txt");
			file[91] = new File("File_Small_SmallToLarge1.txt");
			file[92] = new File("File_Small_SmallToLarge2.txt");
			file[93] = new File("File_Small_SmallToLarge3.txt");
			file[94] = new File("File_Small_SmallToLarge4.txt");
			file[95] = new File("File_Small_SmallToLarge5.txt");
			file[96] = new File("File_Small_SmallToLarge6.txt");
			file[97] = new File("File_Small_SmallToLarge7.txt");
			file[98] = new File("File_Small_SmallToLarge8.txt");
			file[99] = new File("File_Small_SmallToLarge9.txt");
			file[100] = new File("File_Small_SmallToLarge10.txt");
			file[101] = new File("File_Small_SmallToLarge11.txt");
			file[102] = new File("File_Small_SmallToLarge12.txt");
			file[103] = new File("File_Small_SmallToLarge13.txt");
			file[104] = new File("File_Small_SmallToLarge14.txt");
			file[105] = new File("File_Small_SmallToLarge15.txt");
			file[106] = new File("File_Small_SmallToLarge16.txt");
			file[107] = new File("File_Small_SmallToLarge17.txt");
			file[108] = new File("File_Small_SmallToLarge18.txt");
			file[109] = new File("File_Small_SmallToLarge19.txt");
			file[110] = new File("File_Small_SmallToLarge20.txt");
			file[111] = new File("File_Small_SmallToLarge21.txt");
			file[112] = new File("File_Small_SmallToLarge22.txt");
			file[113] = new File("File_Small_SmallToLarge23.txt");
			file[114] = new File("File_Small_SmallToLarge24.txt");
			file[115] = new File("File_Small_SmallToLarge25.txt");
			file[116] = new File("File_Small_SmallToLarge26.txt");
			file[117] = new File("File_Small_SmallToLarge27.txt");
			file[118] = new File("File_Small_SmallToLarge28.txt");
			file[119] = new File("File_Small_SmallToLarge29.txt");
			file[120] = new File("File_Med_SmallToLarge0.txt");
			file[121] = new File("File_Med_SmallToLarge1.txt");
			file[122] = new File("File_Med_SmallToLarge2.txt");
			file[123] = new File("File_Med_SmallToLarge3.txt");
			file[124] = new File("File_Med_SmallToLarge4.txt");
			file[125] = new File("File_Med_SmallToLarge5.txt");
			file[126] = new File("File_Med_SmallToLarge6.txt");
			file[127] = new File("File_Med_SmallToLarge7.txt");
			file[128] = new File("File_Med_SmallToLarge8.txt");
			file[129] = new File("File_Med_SmallToLarge9.txt");
			file[130] = new File("File_Med_SmallToLarge10.txt");
			file[131] = new File("File_Med_SmallToLarge11.txt");
			file[132] = new File("File_Med_SmallToLarge12.txt");
			file[133] = new File("File_Med_SmallToLarge13.txt");
			file[134] = new File("File_Med_SmallToLarge14.txt");
			file[135] = new File("File_Med_SmallToLarge15.txt");
			file[136] = new File("File_Med_SmallToLarge16.txt");
			file[137] = new File("File_Med_SmallToLarge17.txt");
			file[138] = new File("File_Med_SmallToLarge18.txt");
			file[139] = new File("File_Med_SmallToLarge19.txt");
			file[140] = new File("File_Med_SmallToLarge20.txt");
			file[141] = new File("File_Med_SmallToLarge21.txt");
			file[142] = new File("File_Med_SmallToLarge22.txt");
			file[143] = new File("File_Med_SmallToLarge23.txt");
			file[144] = new File("File_Med_SmallToLarge24.txt");
			file[145] = new File("File_Med_SmallToLarge25.txt");
			file[146] = new File("File_Med_SmallToLarge26.txt");
			file[147] = new File("File_Med_SmallToLarge27.txt");
			file[148] = new File("File_Med_SmallToLarge28.txt");
			file[149] = new File("File_Med_SmallToLarge29.txt");
			file[150] = new File("File_Large_SmallToLarge0.txt");
			file[151] = new File("File_Large_SmallToLarge1.txt");
			file[152] = new File("File_Large_SmallToLarge2.txt");
			file[153] = new File("File_Large_SmallToLarge3.txt");
			file[154] = new File("File_Large_SmallToLarge4.txt");
			file[155] = new File("File_Large_SmallToLarge5.txt");
			file[156] = new File("File_Large_SmallToLarge6.txt");
			file[157] = new File("File_Large_SmallToLarge7.txt");
			file[158] = new File("File_Large_SmallToLarge8.txt");
			file[159] = new File("File_Large_SmallToLarge9.txt");
			file[160] = new File("File_Large_SmallToLarge10.txt");
			file[161] = new File("File_Large_SmallToLarge11.txt");
			file[162] = new File("File_Large_SmallToLarge12.txt");
			file[163] = new File("File_Large_SmallToLarge13.txt");
			file[164] = new File("File_Large_SmallToLarge14.txt");
			file[165] = new File("File_Large_SmallToLarge15.txt");
			file[166] = new File("File_Large_SmallToLarge16.txt");
			file[167] = new File("File_Large_SmallToLarge17.txt");
			file[168] = new File("File_Large_SmallToLarge18.txt");
			file[169] = new File("File_Large_SmallToLarge19.txt");
			file[170] = new File("File_Large_SmallToLarge20.txt");
			file[171] = new File("File_Large_SmallToLarge21.txt");
			file[172] = new File("File_Large_SmallToLarge22.txt");
			file[173] = new File("File_Large_SmallToLarge23.txt");
			file[174] = new File("File_Large_SmallToLarge24.txt");
			file[175] = new File("File_Large_SmallToLarge25.txt");
			file[176] = new File("File_Large_SmallToLarge26.txt");
			file[177] = new File("File_Large_SmallToLarge27.txt");
			file[178] = new File("File_Large_SmallToLarge28.txt");
			file[179] = new File("File_Large_SmallToLarge29.txt");
			file[180] = new File("File_Small_LargeToSmall0.txt");
			file[181] = new File("File_Small_LargeToSmall1.txt");
			file[182] = new File("File_Small_LargeToSmall2.txt");
			file[183] = new File("File_Small_LargeToSmall3.txt");
			file[184] = new File("File_Small_LargeToSmall4.txt");
			file[185] = new File("File_Small_LargeToSmall5.txt");
			file[186] = new File("File_Small_LargeToSmall6.txt");
			file[187] = new File("File_Small_LargeToSmall7.txt");
			file[188] = new File("File_Small_LargeToSmall8.txt");
			file[189] = new File("File_Small_LargeToSmall9.txt");
			file[190] = new File("File_Small_LargeToSmall10.txt");
			file[191] = new File("File_Small_LargeToSmall11.txt");
			file[192] = new File("File_Small_LargeToSmall12.txt");
			file[193] = new File("File_Small_LargeToSmall13.txt");
			file[194] = new File("File_Small_LargeToSmall14.txt");
			file[195] = new File("File_Small_LargeToSmall15.txt");
			file[196] = new File("File_Small_LargeToSmall16.txt");
			file[197] = new File("File_Small_LargeToSmall17.txt");
			file[198] = new File("File_Small_LargeToSmall18.txt");
			file[199] = new File("File_Small_LargeToSmall19.txt");
			file[200] = new File("File_Small_LargeToSmall20.txt");
			file[201] = new File("File_Small_LargeToSmall21.txt");
			file[202] = new File("File_Small_LargeToSmall22.txt");
			file[203] = new File("File_Small_LargeToSmall23.txt");
			file[204] = new File("File_Small_LargeToSmall24.txt");
			file[205] = new File("File_Small_LargeToSmall25.txt");
			file[206] = new File("File_Small_LargeToSmall26.txt");
			file[207] = new File("File_Small_LargeToSmall27.txt");
			file[208] = new File("File_Small_LargeToSmall28.txt");
			file[209] = new File("File_Small_LargeToSmall29.txt");
			file[210] = new File("File_Med_LargeToSmall0.txt");
			file[211] = new File("File_Med_LargeToSmall1.txt");
			file[212] = new File("File_Med_LargeToSmall2.txt");
			file[213] = new File("File_Med_LargeToSmall3.txt");
			file[214] = new File("File_Med_LargeToSmall4.txt");
			file[215] = new File("File_Med_LargeToSmall5.txt");
			file[216] = new File("File_Med_LargeToSmall6.txt");
			file[217] = new File("File_Med_LargeToSmall7.txt");
			file[218] = new File("File_Med_LargeToSmall8.txt");
			file[219] = new File("File_Med_LargeToSmall9.txt");
			file[220] = new File("File_Med_LargeToSmall10.txt");
			file[221] = new File("File_Med_LargeToSmall11.txt");
			file[222] = new File("File_Med_LargeToSmall12.txt");
			file[223] = new File("File_Med_LargeToSmall13.txt");
			file[224] = new File("File_Med_LargeToSmall14.txt");
			file[225] = new File("File_Med_LargeToSmall15.txt");
			file[226] = new File("File_Med_LargeToSmall16.txt");
			file[227] = new File("File_Med_LargeToSmall17.txt");
			file[228] = new File("File_Med_LargeToSmall18.txt");
			file[229] = new File("File_Med_LargeToSmall19.txt");
			file[230] = new File("File_Med_LargeToSmall20.txt");
			file[231] = new File("File_Med_LargeToSmall21.txt");
			file[232] = new File("File_Med_LargeToSmall22.txt");
			file[233] = new File("File_Med_LargeToSmall23.txt");
			file[234] = new File("File_Med_LargeToSmall24.txt");
			file[235] = new File("File_Med_LargeToSmall25.txt");
			file[236] = new File("File_Med_LargeToSmall26.txt");
			file[237] = new File("File_Med_LargeToSmall27.txt");
			file[238] = new File("File_Med_LargeToSmall28.txt");
			file[239] = new File("File_Med_LargeToSmall29.txt");
			file[240] = new File("File_Large_LargeToSmall0.txt");
			file[241] = new File("File_Large_LargeToSmall1.txt");
			file[242] = new File("File_Large_LargeToSmall2.txt");
			file[243] = new File("File_Large_LargeToSmall3.txt");
			file[244] = new File("File_Large_LargeToSmall4.txt");
			file[245] = new File("File_Large_LargeToSmall5.txt");
			file[246] = new File("File_Large_LargeToSmall6.txt");
			file[247] = new File("File_Large_LargeToSmall7.txt");
			file[248] = new File("File_Large_LargeToSmall8.txt");
			file[249] = new File("File_Large_LargeToSmall9.txt");
			file[250] = new File("File_Large_LargeToSmall10.txt");
			file[251] = new File("File_Large_LargeToSmall11.txt");
			file[252] = new File("File_Large_LargeToSmall12.txt");
			file[253] = new File("File_Large_LargeToSmall13.txt");
			file[254] = new File("File_Large_LargeToSmall14.txt");
			file[255] = new File("File_Large_LargeToSmall15.txt");
			file[256] = new File("File_Large_LargeToSmall16.txt");
			file[257] = new File("File_Large_LargeToSmall17.txt");
			file[258] = new File("File_Large_LargeToSmall18.txt");
			file[259] = new File("File_Large_LargeToSmall19.txt");
			file[260] = new File("File_Large_LargeToSmall20.txt");
			file[261] = new File("File_Large_LargeToSmall21.txt");
			file[262] = new File("File_Large_LargeToSmall22.txt");
			file[263] = new File("File_Large_LargeToSmall23.txt");
			file[264] = new File("File_Large_LargeToSmall24.txt");
			file[265] = new File("File_Large_LargeToSmall25.txt");
			file[266] = new File("File_Large_LargeToSmall26.txt");
			file[267] = new File("File_Large_LargeToSmall27.txt");
			file[268] = new File("File_Large_LargeToSmall28.txt");
			file[269] = new File("File_Large_LargeToSmall29.txt");
		}

		try{
			while(FileNum<numOfMaxFiles){
				//Increments the size control based on the size of the next file
				if(FileNum==30||FileNum==60||FileNum==120||FileNum==150||FileNum==210||FileNum==240){
					numInFile=numInFile*10;
				} else if(FileNum==90||FileNum==180){
					numInFile=numInFile/100;
				}
				//Takes the next file and puts it into an array
				Scanner input = new Scanner(file[j]);
				int[] array = new int[numInFile];
				for(i=0;i<numInFile;i++){
					if(input.hasNextInt()){
						array[i] = input.nextInt();
					}else{
						numInFile--;
					}
				}
				input.close();
				
				//Time is gotten by calling System.nanoTime which gives a large integer
				//I get the time right before the method is called and right after the method
				//From the subtract the first time from the second time
				//After that I divide that number by 100000 to get the time in milliseconds
				
				//QuickSort function call and timer
				startTime = System.nanoTime();
				QuickSort(array,0,numInFile-1);
				endTime = System.nanoTime();
				temp = (endTime-startTime);
				durationOfQS[j]=((float)temp)/1000000;
				System.out.println("File "+FileNum+" QS duration "+durationOfQS[j]+" milliseconds ");
				
				//MergeSort function call and timer
				startTime = System.nanoTime();
				MergeSort(array, numInFile-1);
				endTime = System.nanoTime();
				temp = (endTime-startTime);
				durationOfMS[j]=((float)temp)/1000000;
				System.out.println("File "+FileNum+" MS duration "+durationOfMS[j]+" milliseconds ");
				
				//HeapSort function call and timer
				startTime = System.nanoTime();
				HeapSort(array);
				endTime = System.nanoTime();
				temp = (endTime-startTime);
				durationOfHS[j]=((float)temp)/1000000;
				System.out.println("File "+FileNum+" HS duration "+durationOfHS[j]+" milliseconds ");
				
				j++;
				FileNum++;
			}
		} catch(IOException ex){
			System.out.printf("Error: %s", ex);
		}
		File results = new File("results.txt");
		try {
			PrintWriter input = new PrintWriter(results);
			FileNum=0;
			input.println("\tUnsorted\t\t\tSorted(1-9999)\t\t\tSorted(9999-1)");
			input.println("\tQuickSort\tMergeSort\tHeapSort\tQuickSort\tMergeSort\tHeapSort\tQuickSort\tMergeSort\tHeapSort");
			while(FileNum<90){
				input.println("File "+FileNum+"\t"+durationOfQS[FileNum]+"\t"+durationOfMS[FileNum]
					+"\t"+durationOfHS[FileNum]+"\t"+durationOfQS[FileNum+90]+"\t"+durationOfMS[FileNum+90]
							+"\t"+durationOfHS[FileNum+90]+"\t"+durationOfQS[FileNum+180]+"\t"+durationOfMS[FileNum+180]
									+"\t"+durationOfHS[FileNum+180]+"\t");
				FileNum++;
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.printf("Error: %s", e);
		}
	}
	
	//Basic plan throw in the array start the timer then return the time of the timer
	public static void QuickSort(int[] array, int l, int r){
		if(l<r){
			int s = HoarePartition(array, l, r);
			QuickSort(array, l, s-1);
			QuickSort(array, s+1, r-1);
		}
		
	}
	public static int HoarePartition(int[] array, int l, int r){
		int p = array[l];
		int t =l;
		int z = r;
		while(t<z){
			while(array[t]<=p&&t<z){
				t++;
			}
			while(array[z]>p){
				z--;
			}
			array = swap(array,t,z);
		}
		if(z<1){
			z=1;
		}
		array = swap(array, t, z-1); //undo last swap when i>=j
		array = swap(array, l, z-1);
		return z;
	}	
	public static int[] swap(int[] array, int first, int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
		return array;
		
	}
	
	public static void MergeSort(int[] array, int n){
		
		if(n>1){
			int nOrg = n;
			n=Math.floorDiv(n, 2);
			int[] B= new int[n];
			int[] C= new int[n];
			int i=0;
			do{
				B[i]=array[i];
				i++;
			}while(i<n-1);
			int j=0;
			do{
				C[j]=array[i+j];
				j++;
			}while(j<n-1);
			if(n>2){
			MergeSort(B,n-1);
			MergeSort(C,n-1);
			}
			array=Merge(B,C,array, n, nOrg);
		}	
	}
	public static int[] Merge(int[] B, int[] C, int[] A, int p, int q){
		int i=0;int j=0;int k=0;
		while(k<q){
			while(i<p&&j<p){
				if(B[i]<=C[j]){
					A[k]=B[i];
					i++;
				} else {
					A[k] = C[j];
					j++;
				}
				k++;
			}
			while(i<p){
					A[k]=B[i];
					k++;
					i++;
			} 
			while(j<p){
					A[k]=C[j];
					k++;
					j++;
					
			}
			if(i>=p&&j>=p){
				k++;
			}
		}
		return A;
	}
	
	public static void HeapSort(int[] array){
		int n = array.length-1;
		buildHeap(array,n);
		for(int i=n;i>0;i--){
            n=n-1;
            swap(array, 0, i);
            maxHeap(array, n, 0);
        }
		
	}
	public static void buildHeap(int[] array, int n){
		int i=n/2;
		while(i>=0){
			maxHeap(array, n, i);
			i--;
		}
	}

	private static void maxHeap(int[] array,int n, int i) {
		/*From http://www.code2learn.com/2011/09/heapsort-array-based-implementation-in.html*/
		int left = 2*i;
		int right = 2*i+1;
		int largest;
		if(left<=n&&array[left]>array[i]){
			largest=left;
		}else{
			largest=i;
		}
		if(right<=n&&array[right]>array[largest]){
			largest=right;
		}
		if(largest!=i){
			swap(array,i,largest);
			maxHeap(array, n, largest);
		}
		/*Above from http://www.code2learn.com/2011/09/heapsort-array-based-implementation-in.html*/
	}
}
