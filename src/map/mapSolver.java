package map;

import blocks.Block;
import blocks.ClosedBlock;
import blocks.GoalBlock;

public class mapSolver {

	static boolean solution = false;

	Map map;

	static int dir = 1;

	static int steps = 0;

	public mapSolver(Map map) {
		this.map = map;
		int x = map.getStartX();

		int y = map.getStartY();

		solve(x, y, 1); // 1= upp
		solve(x, y, 2); // 2 = höger
		solve(x, y, 3); // 3 = ner
		solve(x, y, 4); // 4 = vänster

	}

	private void solve(int x, int y, int dir) {
		steps++;


		if (dir == 1) {
			Block b = map.getBlock(x, y-1);
			if (b instanceof ClosedBlock) {
				return;
			}

			if (b instanceof GoalBlock){
				
			}
			solve(x, y - 1, 1);
		}
		if (dir == 2) {
			solve(x + 1, y, 1);
		}
		if (dir == 3) {
			solve(x, y + 1, 1);
		}
		if (dir == 4) {
			solve(x - 1, y, 1);
		}

	}
}
