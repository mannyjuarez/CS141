public class MarshmallowAlien extends Alien
{
	private static final int MARSHMALLOW_DAMAGE  = 1;

	public MarshmallowAlien(int health, String name)
	{
		super(health,name);
	}

	public int getDamage()
	{
		return MARSHMALLOW_DAMAGE;
	}
}  

