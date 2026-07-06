class DynamicArray {

    public int[] arr;
    public int numElements = 0;
    public int capacity = 0;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (numElements == capacity) { // array is full
            resize();
        }
        arr[numElements] = n;
        numElements++;
    }

    public int popback() {
        numElements--;
        int n = arr[numElements];
        arr[numElements] = 0;
        return n;
    }

    private void resize() {
        capacity *= 2;
        int[] temp = new int[capacity]; // new empty array
            for (int i = 0; i < numElements; i++) { // traverse curr array
                temp[i] = arr[i]; // copy curr array into new array
            }
            arr = temp; // curr array is now new array
    }

    public int getSize() {
        return numElements;
    }

    public int getCapacity() {
        return capacity;
    }
}
