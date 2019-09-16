
public class IterationMathLib extends MathLib{

	@Override
	int gcd(int x, int y) {
		int temp;
		
		while(y!=0) {
			if(x>=y && x!=0) {
				temp=x;
				x=y;
				y=temp%y;
				
			}
		}
		return x;
		

	}

	@Override
	int ack(int x, int y) {
		int temp;
		while(x!=0 && y!=0) {
			temp=x;
			y= ack(temp,y-1);
			x=x-1;
		}
		
		return y+1;
	}

	@Override
	int fib(int x) {
		// TODO Auto-generated method stub
		int temp;
		while(x!=0) {
			if (x==1) {
				return x;
			}
			else if(x>1) {
				temp=fib(x-1);
				x=fib(x-2) + temp;
				
			}
			return x;
		}
		return 0;
	}

	  @Override
	int hanoi(int n) {
		//TODO Auto-generated method stub
		int temp;
		while (n!=1) {
			
			if(n>1) {
			temp = 2* hanoi(n-1);
			n=temp +1;
		
			return n;
			}
			
		}
		
		return n;
	}

	

}