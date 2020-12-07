package java120701;

public class Find {
	void R_zero(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero坐标是：R("+column+","+row+")");
				}
			}
		}
	}
	void R_left(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column =0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int leftX=column-1;
					System.out.println("R_left坐标是：R("+leftX+","+row+")");
				}
			}
		}
	}
	void R_right(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int rightX=column+1;
					System.out.println("R_right坐标是：R("+rightX+","+row+")");
				}
			}
		}
	}
	void R_up(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int upY=row-1;
					System.out.println("R_up坐标是：R("+column+","+upY+")");
				}
			}
		}
	}
	void R_down(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int downY=row+1;
					System.out.println("R_down坐标是：R("+column+","+downY+")");
				}
			}
		}
	}
	
}
