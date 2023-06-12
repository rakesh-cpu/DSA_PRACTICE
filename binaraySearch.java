class binarySearch {
    public static void main(String [] args)
    {
    int[] nums =new int[]{3,4,5,5,5,6}; int target=5;
        int h=nums.length,size=nums.length,l=0,m=(h/2)-1,i=0,c=0;
        int[] op = new int[2];
        System.out.println("hello world");

         op[0]=-1;
        op[1]=-1;


        if(h==0)
        {
           

            System.out.print(op[0]+" "+op[1]);

        }
        else
        while(h>=l)
        {
            m=(l+h)/2;
            if(nums[m]==target)
            {
                op[0]=m;
                for(i=1;i<10;i++)
                {
                    if(nums[m+i]==target)
                    {
                        c++;

                    }
                    else
                    break;
                }
                op[1]=m+c;


            }
            else if(nums[m]>target)
            {
                l=0;
                h=m-1;
            }
            else
            {
                l=m+1;
                h=size;
            }

        }
        System.out.print(op[0]+" "+op[1]);
    
}
}