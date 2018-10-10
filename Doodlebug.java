package assignment08;

public class Doodlebug extends Critter {
	public Doodlebug(World world, int rowIndex, int columnIndex) {
		super(world, rowIndex, columnIndex);
	}

	public void move()
	{
		int[] antDir = new int[] {0, 0, 0, 0};
		
		if(this.hasMoved() == true)
		{
			return;
		}
		System.out.println("doodlebug moved");
		
		//Doodlebug eating mechanic
		do
		{
			if(this.x - 1 >= 0 && this.x < this.myWorld.getGridSize() - 1)
			{
				if(this.myWorld.getCell(x - 1, y) != null && this.myWorld.getCell(x - 1, y).getClass().equals(Ant.class))
				{
						antDir[0] = 1;
				}
			}

			if(this.y - 1 >= 0 && this.y < this.myWorld.getGridSize() - 1)
			{
				if(this.myWorld.getCell(x, y + 1) != null && this.myWorld.getCell(x, y + 1).getClass().equals(Ant.class))
				{
						antDir[1] = 2;
				}
			}

			if(this.x - 1 >= 0 && this.x < this.myWorld.getGridSize() - 1)
			{
				if(this.myWorld.getCell(x + 1, y) != null && this.myWorld.getCell(x + 1, y).getClass().equals(Ant.class))
				{
						antDir[2] = 3;
				}
			}

			if(this.y - 1 >= 0 && this.y < this.myWorld.getGridSize() - 1)
			{
				if(this.myWorld.getCell(x, y - 1) != null && this.myWorld.getCell(x, y - 1).getClass().equals(Ant.class))
				{
						antDir[3] = 4;
				}
			}
		}
		while(1==2);
		
		int arrlen = 0;
		for(int i = 0; i < antDir.length; i++)
		{
			if(antDir[i] != 0) {arrlen++;}		
		}
		do
		{
			if(arrlen == 0)
			{
				break;
			}
			int[] eat = new int[arrlen];
			int n = 0;
			for(int j = 0; j < 4; j++)
			{
				if(antDir[j] != 0)
				{
					eat[n] = antDir[j];
					n++;
				}
			}
			int d = (int)(Math.random()*arrlen);
			
			if(eat[d] == 1)
			{
				this.myWorld.setCell(this.x-1, this.y, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.x = this.x-1;
				this.setMoved(true);
				return;
			}
			if(eat[d] == 2)
			{
				this.myWorld.setCell(this.x, this.y + 1, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.y = this.y+1;
				this.setMoved(true);
				return;
			}
			if(eat[d] == 3)
			{
				this.myWorld.setCell(this.x+1, this.y, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.x = this.x+1;
				this.setMoved(true);
				return;
			}
			if(eat[d] == 4)
			{
				this.myWorld.setCell(this.x, this.y-1, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.y = this.y-1;
				this.setMoved(true);
				return;
			}


		}while(1==2);
		

		//If no Ants to eat, Doodlebug moves randomly
		int dir = (int)(Math.random()*4 + 1);
		if(dir == 1)
		{
			if(this.x - 1 < 0)
			{
				return;
			}

			if(this.myWorld.getCell(x - 1, y) == null)
			{
				this.myWorld.setCell(this.x-1, this.y, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.x = this.x-1;
				this.setMoved(true);
			}
		}

		if(dir == 2)
		{
			if(this.y >= this.myWorld.getGridSize() - 1)
			{
				return;
			}

			if(this.myWorld.getCell(x, y + 1) == null)
			{
				this.myWorld.setCell(this.x, this.y + 1, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.y = this.y+1;
				this.setMoved(true);
			}
		}

		if(dir == 3)
		{
			if(this.x >= this.myWorld.getGridSize() - 1)
			{
				return;
			}

			if(this.myWorld.getCell(x + 1, y) == null)
			{
				this.myWorld.setCell(this.x+1, this.y, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.x = this.x+1;
				this.setMoved(true);
			}
		}
		if(dir == 4)
		{
			if(this.y - 1 < 0)
			{
				return;
			}

			if(this.myWorld.getCell(x, y - 1) == null)
			{
				this.myWorld.setCell(this.x, this.y-1, this);
				this.myWorld.setCell(this.x, this.y, null);
				this.y = this.y-1;
				this.setMoved(true);
			}
		}

	}


	public void display()
	{
		System.out.print("D  ");
	}
}