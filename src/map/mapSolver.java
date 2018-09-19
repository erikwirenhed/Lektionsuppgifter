package map;

public class mapSolver {
	
	static boolean solution = false; 
	
	public mapSolver(Map Map){
	
		int x = Map.getStartX();
		
		int y = Map.getStartY();
		
		solve(x,y,1);
		solve(x,y,2);
		solve(x,y,3);
		solve(x,y,4);
			
		}

	private void solve(int x, int y, int i) {
		if(solution){
			return;
		
	}
	}
}
