public class MyDeque<E>{

private E[] data;
private int size, start, end;

@SuppressWarnings("unchecked")
public MyDeque(){
    	data = (E[])new Object[10];
	size = 10;
	start = 0;
	end = 1;
}

@SuppressWarnings("unchecked")
public MyDeque(int initalCap){
    	data = (E[])new Object[initalCap];
	size = initalCap;
	start = 0;
	end = 1;
}

public int size(){
	return size;
}

public String toString(){
	String output = "";
	output += start + ", " + end + "\n";
	for (E x : data) {
		if (x == null){
			output += "_, ";
		}
		else{
			output += x.toString() + ", ";
		}
	}
	return output;
}

public void addFirst(E element){
	if (start == 0){
		data[start] = element;
		start = data.length;
	}
	start--;
}

public void addLast(E element){
	data[end] = element;
	if (end == data.length - 1){
		end = 0;
	}
	end++;
}

public E removeFirst(){
	return data[0];
}

public E removeLast(){
	return data[0];
}

public E getFirst(){
	return data[0];
}

public E getLast(){
	return data[0];
}

public static void main(String[] args) {
	MyDeque<Integer> arr = new MyDeque<Integer>();
	arr.addLast(new Integer(5));
	arr.addLast(new Integer(4));
	arr.addLast(new Integer(3));
	arr.addLast(new Integer(2));
	arr.addFirst(new Integer(9));
	System.out.println(arr);
}


}
