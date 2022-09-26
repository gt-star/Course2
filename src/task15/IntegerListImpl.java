package task15;

import task14.StringList;

import java.util.Objects;

public class IntegerListImpl implements IntegerList {
    private static final int INITIAL_SIZE = 15;
    private final Integer[] array;
    private int capacity;

    public IntegerListImpl() {
        array = new Integer[INITIAL_SIZE];
        capacity = 0;
    }


    @Override
    public Integer add(Integer item) {
        return add(capacity, item);
    }

    @Override
    public Integer add(int index, Integer item) {
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
    public Integer set(int index, Integer item) {
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
    public Integer remove(Integer item) {
        int indexForRemoving = indexOf(item);
        if (indexForRemoving == -1){
            throw new IllegalArgumentException();
        }
        return remove(indexForRemoving);
    }

    @Override
    public Integer remove(int index) {
        if (index < 0){
            throw new IllegalArgumentException();
        }
        if (index >= capacity){
            throw new IllegalArgumentException();
        }
        Integer removed = array[index];
        System.arraycopy(array,index+1,array,index,capacity - 1 - index);
        array[--capacity] = null;
        return removed;
    }

    @Override
    public boolean contains(Integer item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException();
        }
        Integer[] arrayForSearch = toArray();
        SortInsertion(arrayForSearch);

        int min = 0;
        int max = arrayForSearch.length-1;
        while (min <= max){
            int mid = (min + max) /2;
            if (item.equals(arrayForSearch[mid])){
                return true;
            }
            if (item < arrayForSearch[mid]){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Integer item) {
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
    public int lastIndexOf(Integer item) {
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
    public Integer get(int index) {
        if (index < 0){
            throw new IllegalArgumentException();
        }
        if (index >= capacity){
            throw new IllegalArgumentException();
        }
        return array[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
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
    public Integer[] toArray() {
        Integer[] result = new Integer[capacity];
        System.arraycopy(array,0,result,0,capacity);
        return result;
    }
    private void SortInsertion(Integer[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] >= temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
