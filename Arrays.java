class Arrays {
  public static void main(String[] args) {
    //Max number in array
    double[] a = {1, 2, 5, 9, 0, 7};
    double max = a[0]; //set max equal to array index zero

    for(int i = 0; i < a.length; i++) {
      if(a[i] > max){
        max = a[i];
      }
    }
    System.out.println("The max number is: " +max);
  }
}
