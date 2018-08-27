class SortArray
{

    public static void main(String[] args)

    {
        int tempo,i,j;

        int[] Arry=new int[]{1,1,1,1,0,0,1,0};

        for(i=0;i<Arry.length;i++)

        {

            for(j=i;j<Arry.length;j++)

            {

                if(Arry[i]>Arry[j])

                {

                    tempo=Arry[j];

                    Arry[j]=Arry[i];

                    Arry[i]=tempo;

                }

            }

        }

        for(i=0;i<Arry.length;i++)

        {

            System.out.println(Arry[i]);

        }

    }

}