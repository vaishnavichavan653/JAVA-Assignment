class Sort{
    public static void main(String []args){
        int a[] ={9,3,4,5,2,1,6,8,7,0};
        int temp;
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted numbers:");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
    }
}