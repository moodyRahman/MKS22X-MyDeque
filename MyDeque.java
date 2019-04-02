import java.util.NoSuchElementException;

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
	if (element == null) throw new NullPointerException("Nsull");

    	if(size == data.length) {
		resize();
	}
    	if(size != 0){
      		if(start == 0) {
			start = data.length - 1;
		}
		else{
			start--;
		}
    	}
    	data[start] = element;
    	size++;
}

public void addLast(E element){
	if (element == null){
		throw new NullPointerException("Cannot add null");
	}

    	if(size == data.length) {
		resize();
	}
    	if(size != 0){
      		if(end == data.length) {
			end = 0;
		}
      		else {
			end++;
		}
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

public E removeFirst(){
    	if (size == 0) {
		throw new NoSuchElementException("empty");
	}

    	E out = data[start];
    	data[start] = null;
    	if(size != 1){
      		if(start == data.length - 1) start = 0;
		else start++;
	}
    	size--;
    	return out;
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
	arr.addFirst(new Integer(2));
	arr.addFirst(new Integer(2));
	arr.addFirst(new Integer(2));

	arr.removeFirst();
	arr.removeFirst();
	arr.removeFirst();
	arr.removeFirst();
	arr.removeFirst();
	arr.removeFirst();arr.removeFirst();
	arr.removeFirst();
	arr.removeFirst();


	// arr.addFirst(new Integer(420));
	// arr.resize();
	System.out.println(arr);
}


}
