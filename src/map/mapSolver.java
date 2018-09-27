package map;

import java.util.ArrayList;

import blocks.Block;
import blocks.ClosedBlock;
import blocks.GoalBlock;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class mapSolver {

	static boolean solution = false;

	Map map;

	static int dir = 1;

	static int steps = 0;

	ArrayList<Block> visited_block = new ArrayList<Block>();
	ArrayList<Block> path = new ArrayList<Block>();

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

		Block b = map.getBlock(x, y);

		
		if (solution) {
			return;
		}

		if (b instanceof GoalBlock) {
			System.out.println(steps);
			
			solution = true;
			return;
		}

		if (b instanceof ClosedBlock || b == null|| visited_block.contains(b)) {

			return;
		}

		path.add(b);

		visited_block.add(b);

		steps++;

		if (dir == 1) {
			// System.out.println("upp");
			solve(x, y - 1, 1);
			solve(x+1, y , 2);
			solve(x-1, y , 4);
		}
		
		if (dir == 2) {
			// System.out.println("höger");
			solve(x , y-1, 1);
			solve(x + 1, y, 2);
			solve(x , y+1, 3);
		}

		if (dir == 3) {
			// System.out.println("ner");
			solve(x+1, y , 2);
			solve(x, y + 1, 3);
			solve(x-1, y , 4);
		}

		if (dir == 4) {
			// System.out.println("vänster");
			solve(x , y- 1, 1);
			solve(x , y+ 1, 3);
			solve(x - 1, y, 4);
		}
		if(!solution){
			path.remove(b);
		}
	}

	public void showNextPath() {
		if(path.size()==0){
			return;
		}
		Circle c = new Circle(Block.SIZE / 2, Block.SIZE / 2, Block.SIZE / 3, Color.BLUEVIOLET);
		path.get(0).getChildren().add(c);
		path.remove(0);
		

	}
}
