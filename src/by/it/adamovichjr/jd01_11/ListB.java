package by.it.adamovichjr.jd01_11;

import java.util.*;

public class ListB<T> implements List<T> {

    private T[] elements = (T[]) new Object[]{};

    private int size = 0;

    @Override
    public boolean add(T o) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements,(size*3)/2+1);
        elements[size++] =  o;
        return false;
    }

    @Override
    public T remove(int index) {
        if(index < size){
            T remElement = elements[index];
            System.arraycopy(elements,index+1,elements,index,size-index);
            size--;
            return remElement;
        }
        return null;
    }

    @Override
    public T get(int index) {

        if(index < size)
            return elements[index];
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String delimetr = "";
        for (int i = 0; i < size; i++) {
            sb.append(delimetr).append(elements[i]);
            delimetr = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public T set(int index, T element) {

        if(index < size){
            T setElement = elements[index];
            elements[index] =  element;
            return setElement;
        }
        return null;
    }

    @Override
    public void add(int index, T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (size * 3) / 2 + 1);
        }
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index] = element;
        size++;
    }


    @Override
    public boolean addAll(Collection<? extends T> c) {
        if(elements.length <= size + c.size()){
            elements = Arrays.copyOf(elements,size+c.size());
        }
        Iterator<T>iterator = (Iterator<T>) c.iterator();
        while (iterator.hasNext()){
            elements[size] = iterator.next();
            size++;
        }

        return true;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }
}
