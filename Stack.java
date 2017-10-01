public class Stack
{
	public int stackSize;
	public int stackArr[];
	public int top;
	public Stack(int size){
	 this.stackSize=size;
	 this.stackArr=new int[stackSize];
	 this.top=-1; 
}
	 public void push(int entry) throws Exception{
		if(this.isStackFull()){
		throw new Exception("Stack is full");
                }
 		else{
		System.out.println("Adding:"+entry);
		this.stackArr[++top]=entry;
		}
	}
	public int pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty");
    }
else{
int entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
}     
	public int peek() {
        return stackArr[top];
    }
 
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
   
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
			

public static void main(String[] args){
		Stack s=new Stack(4);
		try{
		s.push(5);
	     	s.push(2);
		s.push(7);  
		s.push(10);
		s.pop();
		s.push(51);
		s.push(1);
	   	}
	catch(Exception e){
	System.out.println(e.getMessage());
		}
		try{
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	    	}
catch (Exception e){
System.out.println(e.getMessage());
				}
			}
}
