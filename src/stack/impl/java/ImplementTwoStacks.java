package stack.impl.java;

public class ImplementTwoStacks {

	public static void main(String[] args) {

	}

	void push1(int x, TwoStack sq)
    {
	  if(sq.top1 != sq.top2) {
        sq.top1++;
        sq.arr[sq.top1] = x;
		}
    }
	
	int pop(TwoStack sq) {
		int ele = -1;
        if(sq.top1 == -1){
              ele = -1;
              return ele;
        }
        else{
             ele = sq.arr[sq.top1];
            sq.top1--;
        }
        return ele;
	}
}


class TwoStack
{
	int size;
	int top1,top2;
	int arr[] = new int[100];
	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}