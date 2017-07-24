class Arrays {
  public static void main(String[] args) {
    //Find average
    double[] a = {1, 2, 5, 9, 0, 7}; //declare and initialize array
    int N = a.length; //amount of indexes in array
    double sum = 0.0; //holds sum

    for(int i = 0; i < N; i++) {
      sum = sum + a[i]; //start point 0.0 + current index
    }
    double average = sum/N; //hold average
    System.out.println("The average is: " +average);
  }
}
