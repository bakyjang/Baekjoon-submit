package s_05.p4344;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt(); // �׽�Ʈ ���̽��� ���� C
		int[] arr; // �迭 �ʱ�ȭ
		
		for (int i = 0; i < C; i++) {
			
			int N = scan.nextInt(); // �� �׽�Ʈ ���̽��� �л���
			arr = new int[N]; // �л� �� ��ŭ �迭 ����
			double sum = 0; // �հ�
			
			for (int j = 0; j < N; j++) {
				int score = scan.nextInt(); // �� �л��� ���� �Է�
				arr[j] = score; // ���� �迭�� ����
				sum += score; // ���� �տ� ����
			}
			
			double avg = sum/N;
			int cnt = 0;
			
			for (int j = 0; j < N; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			double std = (double)cnt/N*100;
			
			System.out.printf("%.3f%%\n", std);
			
		}
		
		scan.close();
		
	}
}
