
public class ShellSortAlgo {

	public void ShellSort(int [] a)
	{
		int h=1;
		while(h<a.length/3)
		{
			h=h*3+1;
		}
		while(h>0)
		{
			for(int i=h;i<a.length;i++)
			{
				int tmp=a[i];
				int inner=i;
				while(inner>=h&&tmp<a[inner-h])
				{
					a[inner]=a[inner-h];
					inner-=h;
				}
				a[inner]=tmp;
				
			}
			h=(h-1)/3;
		}
	}
	public void display(int[]list)
	{
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
		System.out.println(" ");
	}
}
