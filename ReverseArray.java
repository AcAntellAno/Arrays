class Arrays {
  public static void main(String[] args) {
    //Reverse the elements within an array
    double[] a = {1, 2, 5, 9, 0, 7}; //declare and initialize array
    int N = a.length;

    for(int i = 0; i < N/2; i++) {
      double temp = a[i];
      a[i] = a[N-1-i];
      a[N-i-1] = temp;

    }
    
    for(int i = 0; i < a.length; i++) {
      System.out.println("Contents of reversed array: " +a[i]);
    }
  }
}
