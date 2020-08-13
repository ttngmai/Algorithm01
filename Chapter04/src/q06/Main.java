package q06;

import java.util.Scanner;

// 160p Q5, Q6

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gqueue<Integer> q = new Gqueue<Integer>(64); // 최대 64개를 인큐할 수 있는 큐

		while (true) {
			System.out.println("현재 데이터 수 : " + q.size() + "/" + q.capacity());
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료 : ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 인큐
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					q.enque(x);
				} catch (Gqueue.OverflowQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;

			case 2: // 디큐
				try {
					x = q.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				} catch (Gqueue.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = q.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (Gqueue.EmptyQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;

			case 4: // 덤프
				q.dump();
				break;

			case 5: // 검색
				System.out.print("데이터: ");
				x = sc.nextInt();
				x = q.search(x);
				if (x != 0)
					System.out.println("검색한 데이터는 " + x + "번째 위치해있습니다.");
				else
					System.out.println("검색한 데이터는 존재하지 않습니다.");
				break;
			}
		}
	}
}

class Gqueue<E> {
	private int max; // 큐 용량
	private int num; // 현재 데이터 수
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private E[] que; // 큐 본체

	// 실행 시 예외 : 큐가 비어 있음
	public static class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {}
	}

	// 실행 시 예외 : 큐가 가득 참
	public static class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {}
	}

	// 생성자
	public Gqueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max]; // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}

	// 인큐
	public E enque(E x) throws OverflowQueueException {
		if (num >= max)
			throw new OverflowQueueException();
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// 디큐
	public E deque() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException();
		E x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// 피크
	public E peek() throws EmptyQueueException {
		if (num <= 0)
			throw new EmptyQueueException();
		return que[front];
	}

	// 검색하여 인덱스 (찾지 못하면 -1) 반환
	public int indexOf(E x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) // 검색 성공
				return idx;
		}
		return -1; // 검색 실패
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.println(que[(i + front) % max] + " ");
			System.out.println();
		}
	}

	public int search(E x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) // 검색 성공
				return (i + 1);
		}
		return 0; // 검색 실패
	}
}
