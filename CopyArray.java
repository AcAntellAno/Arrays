class Arrays {
  public static void main(String[] args) {
    //Copy contents of array into another array
    double[] a = {1, 2, 5, 9, 0, 7}; //declare and initialize array
    int N = a.length; 
    double[] b = new double[N];

    for(int i = 0; i < N; i++) {
      b[i] = a[i];
    }
    for(int i = 0; i < b.length; i++) {
      System.out.println("Array b is: " +b[i]);
    }
    for(int i = 0; i < a.length; i++) {
      System.out.println("Array a is: " +a[i]);
    }
  }
}
