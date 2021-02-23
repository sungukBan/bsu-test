package TEST_003_TimeComplexity;

/*
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
   Count the minimal number of jumps that the small frog must perform to reach its target.
   
   FrogJmp�� Count minimal number of jumps from position X to Y., X���� Y�� D��ŭ�� ������ �� �� ���� �����ϴ����� ����ϴ� ���� �Դϴ�.
 */
public class FrogJmp {

	public static void main(String[] args)
	{
		int X = 10;
		int Y = 85;
		int D = 30;
		
		FrogJmp test = new FrogJmp();
		System.out.println(test.solution(X, Y, D));
	}

    public int solution(int X, int Y, int D) {
        int cnt = Y - X;
        return cnt%D == 0 ? cnt/D : cnt/D + 1;
    }
}


