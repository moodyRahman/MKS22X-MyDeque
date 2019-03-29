public class MyDeque<E>{

private E[] data;
private int size, start, end, capacity;

@SuppressWarnings("unchecked")
public MyDeque(){
    	data = (E[])new Object[10];
	size = 10;
	start = 0;
	end = -1;
	capacity = data.length;
}

@SuppressWarnings("unchecked")
public MyDeque(int initalCap){
    	data = (E[])new Object[initalCap];
	size = initalCap;
	start = -1;
	end = 0;
	capacity = data.length;
}

public int size(){
	return size;
}

public boolean isFullbeta(){
	if ((start == 0 && end == size-1)||
            (start == end+1)){
		return false;
	}
	return true;
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
	if (start > end){
		return;
	}
	data[start] = element;
	if (start == 0){
		start = data.length;
	}
	start--;
	size++;
}

public void addLast(E element){
	end++;
	if (end == data.length - 1){
		end = 0;
	}
	data[end] = element;
	size++;
}

@SuppressWarnings("unchecked")
private void resize(){
  	E[] temp = (E[]) new Object[size() * 2 + 1];
  	int idx = start;
  	for (int x = 0; x < size; x++){
    		temp[x] = data[idx % data.length];
    		idx++;
  	}
  	data = temp;
  	start = 0;
  	end = size - 1;
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

public boolean isFull(){
        boolean status = false;
        if (size == data.length){
		status = true;
        }
        return status;
}

public static void main(String[] args) {
	MyDeque<Integer> arr = new MyDeque<Integer>();
	arr.addFirst(new Integer(5));
	arr.addFirst(new Integer(4));
	arr.addFirst(new Integer(3));
	arr.addFirst(new Integer(2));
	arr.addFirst(new Integer(5));
	arr.addFirst(new Integer(4));
	arr.addFirst(new Integer(3));
	arr.addFirst(new Integer(2));
	arr.addFirst(new Integer(3));
	arr.addFirst(new Integer(2));

	// arr.addFirst(new Integer(420));
	// arr.resize();
	System.out.println(arr);
}


}
