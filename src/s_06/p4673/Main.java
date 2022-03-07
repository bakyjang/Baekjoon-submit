package s_06.p4673;

public class Main {
	
	public static int d(int n) {
		// ������ d(n)
		// �ڱ� �ڽ��� �����ٰ� �� �ڸ��� ���ڸ� ���ϴ°� ex) 33 -> 33 + 3 + 3 = 39 
		
		int sum = n; // �ڱ� �ڽ�
		
		while (n > 0) { // �� �ڸ����� ���ϱ�
			sum += n % 10;
			n /= 10;
		}
		return sum; // ��� ��ȯ
	}
	
	public static void main(String[] args) {
		
		boolean [] arr = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) { // �׽�Ʈ ���̽� 10000��
			int n = d(i); // �Լ�ȣ��, �� ����
			
			if (n < 10001) { // �����ڰ� �ִ� ���ڴ� True
				arr[n] = true;
			}
		}
		
		for (int i = 1; i < 10001; i++) { // �ٽ� �ݺ�
			if(arr[i] != true) { // �����ڰ� ���� ���� = ���� �ѹ�
				System.out.println(i); // ���
			}
		}
		
	}

}
