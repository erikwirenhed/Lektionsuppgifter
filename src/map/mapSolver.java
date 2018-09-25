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

		if ( visited_block.contains(b)){
			return;
		}
		
		visited_block.add(b);

		if (b instanceof GoalBlock) {
			System.out.println(steps);
			return;
		}
		if (b instanceof ClosedBlock || b == null) {
			return;
		}

		Circle c = new Circle(Block.SIZE / 2, Block.SIZE / 2, Block.SIZE / 3, Color.RED);
		b.getChildren().add(c);

		steps++;

		if (dir == 1) {
			System.out.println("upp");
			solve(x, y - 1, 1);
			solve(x, y - 1, 2);
			solve(x, y - 1, 4);

		}
		if (dir == 2) {
			System.out.println("höger");
			solve(x + 1, y, 1);
			solve(x + 1, y, 2);
			solve(x + 1, y, 3);
		}

		if (dir == 3) {
			System.out.println("ner");
			solve(x, y + 1, 2);
			solve(x, y + 1, 3);
			solve(x, y + 1, 4);
		}

		if (dir == 4) {
			System.out.println("vänster");
			solve(x - 1, y, 1);
			solve(x - 1, y, 3);
			solve(x - 1, y, 4);
		}
		
		if(!solution){
			
		}
	}
}
