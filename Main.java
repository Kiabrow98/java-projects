// Kia Brown
//Homework 1
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main
{

	public void one() {
		int[] myArr = new int[10];
		int high = 0;
		int low = 101;
		for(int i =0; i < 10; i++) {
			myArr[i] = (int) (Math.random() * 100 + 1);
			System.out.print(myArr[i] + " ");
		}
		for(int i = 0; i < 10; i++) {
			if (high < myArr[i]) {
				high = myArr[i];
			}
			if (low > myArr[i]) {
				low = myArr[i];
			}
		}
		System.out.println();
		System.out.println("High is " + high);
		System.out.println("Low is " + low);
	}


	public void two() {
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 7 == 0 ) {
				sum += i;
			}
		}
		System.out.println("Sum is " + sum);
	}
	public void three() {
		Scanner sc = new Scanner(System.in);
		int n = 1, sum = 1;
		System.out.println("Enter A Number to Factor ");
		n = sc.nextInt();
		for (int i = n; i > 1; i--) {
			sum *= i;
		}
		System.out.println("Factor of " + n + " is " + sum);
	}
	public void four() {
		Scanner sc = new Scanner(System.in);
		String original = " ",flipped = " ";
		System.out.println("Enter a word to check ");
		original = sc.nextLine();
		for(int i = original.length()- 1; i >= 0; i++) {
			flipped += original.charAt(i);
		}
		if(original.equals(flipped)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public void five() {
		Scanner sc = new Scanner(System.in);
		int prime;
		boolean checker = true;
		System.out.println("Enter a Number");
		prime = sc.nextInt();
		for(int i =2; i <= prime /2; i++) {
			if(prime % i == 0) {
				checker = false;
				break;
			}
		}
		if(checker){
			System.out.println("Prime");
		}
		else {
			System.out.println("NOT Prime");
		}
	}
	public void six() {
		int[] myArr = new int[100];
		int sum = 0;
		for(int i =0; i < 10; i++) {
			myArr[i] = (int) (Math.random() * 100 + 1);
			System.out.print(myArr[i] + " ");
			sum += myArr[i];
		}
		System.out.println(" ");
        System.out.println("Sum is " + sum + " Average is " + sum / 100);
}
    public void seven(){
        int number = 0,biggest = 0;
        ArrayList<String> words = new ArrayList <> ();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words?");
        number = sc.nextInt();
        try (Scanner scanner = new Scanner(new File ("test.txt"))){
            for(int i = 0; i < number; i++){
                words.add(scanner.next());
            }
            for(String word : words){
                System.out.print(word + " ");
            }
        }
        catch (FileNotFoundException e){
            System.err.println("File not found " + e.getMessage());
        }
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() > words.get(biggest).length()){
                biggest = i;
            }
        }
        System.out.println(" ");
        System.out.println("Biggest word is "+ words.get(biggest));
    }

		public static void main(String[] args) {
			Main luckyS = new Main();
			luckyS.one();
			luckyS.two();
			luckyS.three();
			luckyS.four();
			luckyS.five();
			luckyS.six();
			luckyS.seven();
		}
	}