package s_06.p1065;

import java.util.Scanner;

public class Main {
	
	public static int hs(int n) {
		//�� �ڸ����� �˻��ϰ� �Ѽ����� Ȯ���ϴ� ���α׷�
		int cnt = 0; // �Ѽ� ���� ī����
		
		if (n < 100) { // 99������ ���� ��ü������ ��������
			return n; 
		}
		
		else { // 100�̻��� ���̽�
			
			cnt += 99;
			if(n == 1000) { // 1000�� �Ѽ��� ���Ե��� ����
				n = 999;
			}
			
			for(int i = 100; i <= n; i++) { //�� �ڸ��� ���ϱ�
				int a = i % 10; // ���� �ڸ���
				int b = (i / 10) % 10; // ���� �ڸ���
				int c = i / 100; // ���� �ڸ���
				
				if ((c - b) == (b - a)){ //�� �ڸ����� ������ ���� �Ѽ����� Ȯ��
					cnt++;
				}
			}
			
			
		}
		
		return cnt;
		
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println(hs(N));
		
		scan.close();
	}
	
}
