import java.util.Scanner;

public class AmstrongNumber {
		public int armstrong (int n) {
			int num = n, cubeSum = 0;
			while (num > 0) {
				int digit = num % 10;
				cubeSum = cubeSum + (digit * digit * digit);
				num /=10;
			}
			if (cubeSum == n)
				return 1;
			else
				return 0;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.print("Enter Number: ");
			int num = in.nextInt();
			AmstrongNumber obj = new AmstrongNumber();
			int r = obj.armstrong(num);
			if (r==1)
				System.out.println(num + " is an Armstrong number");
			else
				System.out.println(num + " is not an Armstrong number");
			

		}

	}

