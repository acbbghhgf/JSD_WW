package day01;

public class demo {

	public static void main(String[] args) {
		int cock, hen, chick;
		System.out.println("百钱买百鸡的方案如下：");
		for(cock = 0; cock <= 20; cock++)
		{
			for(hen = 0; hen <= 33; hen++)
			{
				chick = 100 - cock - hen;
				if(chick % 3 == 0)
				{
					int total = cock * 5 + hen * 3 + chick /3;
					if(total == 100)
					{
						System.out.println("公鸡：" + cock + "，母鸡：" + hen 
								+ "，小鸡：" + chick);
					}
				}
			}
		}
	}

}
