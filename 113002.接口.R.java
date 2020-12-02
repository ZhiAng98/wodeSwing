package pac;

public interface R {
	static void Test() {
		String boy_filePath="img/boy.gif";
		String girl_filePath="img/girl.gif";
		System.out.println(boy_filePath);
		System.out.println(girl_filePath);
		int array2d[][]={
				{1,2,3},
				{4,5,6}
				};
		for (int i= 0; i <array2d.length; i++) {
			for (int j= 0; j<array2d[0].length; j++) {
				System.out.print(array2d[i][j]+" ");
			}
		}
		System.out.println();
	}
}
