public class AlienTest
{
	public static void main(String[] args)
	{
		OgreAlien brutus = new OgreAlien(100, "brutus");
		SnakeAlien slimy = new SnakeAlien(100, "slimy");
		MarshmallowAlien puffy = new MarshmallowAlien(100, "puffy");

		AlienPack pack = new AlienPack(3);
		pack.addAlien(brutus, 0);
		pack.addAlien(slimy, 1);
		pack.addAlien(puffy, 2);

		System.out.println("Total pack damage = " + pack.calculateDamage());
	}
} 
