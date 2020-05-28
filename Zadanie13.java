class Main {
  public static void main(String[] args) {
    int [][] m = new int [10][10];
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        m[i][j] = (int)(Math.random()*10);
        System.out.print(m[i][j] + "  ");
      }
      System.out.println();
    }
    int b;
    for (int i=0;i<10;i++) { 
      for (int j = 0; j < 10; j++) {
        for (int p=i+1; p<10; p++){
          if (m[i][j]>m[p][j]){ 
            b=m[i][j];
            m[i][j]=m[p][j];
            m[p][j]=b;                        
          }
        }
      }
    }
    System.out.println();
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        System.out.print(m[i][j] + "  ");
      }
      System.out.println();
    }
  }
}