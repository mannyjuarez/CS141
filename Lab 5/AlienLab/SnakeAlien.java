class SnakeAlien extends Alien
{
	private static final int SNAKE_DAMAGE  = 10;

	public SnakeAlien(int health, String name)
	{
		super(health,name);
	}

  public int getDamage()
	{
		return SNAKE_DAMAGE;
	}
} 
