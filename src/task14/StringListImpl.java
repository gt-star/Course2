package task14;

import java.util.Objects;

public class StringListImpl implements StringList {

    private static final int INITIAL_SIZE = 15;
    private final String[] array;
    private int capacity;

    public StringListImpl() {
        array = new String[INITIAL_SIZE];
        capacity = 0;
    }
    public StringListImpl(int n){
        if (n<=0){
            throw new IllegalArgumentException();
        }
        array = new String[n];
        capacity = 0;
    }

    @Override
    public String add(String item) {
            return add(capacity, item);
    }

    @Override
    public String add(int index, String item) {
        if (capacity >= array.length){
            throw new IllegalArgumentException();
        }
        if (Objects.isNull(item)){
            throw new IllegalArgumentException();
        }
        if (index < 0){
            throw new IllegalArgumentException();
        }
        if (index > capacity){
            throw new IllegalArgumentException();
        }
        System.arraycopy(array,index,array,index+1,capacity - index);
        array[index] = item;
        capacity++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException();
        }
        if (index < 0){
            throw new IllegalArgumentException();
        }
        if (index >= capacity){
            throw new IllegalArgumentException();
        }
        return array[index] = item;
    }

    @Override
    public String remove(String item) {
        int indexForRemoving = indexOf(item);
        if (indexForRemoving == -1){
            throw new IllegalArgumentException();
        }
        return remove(indexForRemoving);
    }

    @Override
    public String remove(int index) {
        if (index < 0){
            throw new IllegalArgumentException();
        }
        if (index >= capacity){
            throw new IllegalArgumentException();
        }
        String removed = array[index];
        System.arraycopy(array,index+1,array,index,capacity - 1 - index);
        array[--capacity] = null;
        return removed;
    }

    @Override
    public boolean contains(String item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < capacity; i++) {
            if (array[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException();
        }
        int index = -1;
        for (int i = 0; i < capacity; i++) {
            if (array[i].equals(item)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(String item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException();
        }
        int index = -1;
        for (int i = capacity -1; i>=0;i--){
            if (array[i].equals(item)){
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public String get(int index) {
        if (index < 0){
            throw new IllegalArgumentException();
        }
        if (index >= capacity){
            throw new IllegalArgumentException();
        }
        return array[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (size() != otherList.size()){
            return false;
        }
        for (int i = 0; i < capacity; i++) {
            if (!array[i].equals(otherList.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            array[i] = null;
        }
        capacity = 0;
    }

    @Override
    public String[] toArray() {
        String[] result = new String[capacity];
        System.arraycopy(array,0,result,0,capacity);
        return result;
    }
}
