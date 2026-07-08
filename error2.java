class error2{
    public static void main(String args[]){
       try{
int a=3;
        int b=0;
int result=a/b;
       } 
       catch(Exception e){
    e.printStackTrace();
    System.out.println(e);
    System.out.println(e.getMessage());
       }
    }
}