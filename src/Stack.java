//sources: https://www.geeksforgeeks.org/stack-class-in-java/
//https://www.geeksforgeeks.org/how-to-implement-stack-in-java-using-array-and-generics/
//https://www.geeksforgeeks.org/stack-toarrayt-method-in-java-with-example/
class Stack<T>{

    private T[] storage = (T[]) new Object[3];
    private int upper = -1;

    boolean isEmpty(){
        return upper <0;
    }

    void push(T a) {
        storage[++upper] = a;
    }
    T top(){
        return storage[upper];
    }

    T pop(){
        T result = top();
        storage[upper--]=null;
        return result;
    }


}