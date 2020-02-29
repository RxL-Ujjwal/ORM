
public class Demo {
	public static void main(String args[]) {
		Player p = new Player();
		p.setPid(101);
		p.setPname("Messi");
		p.setPjno(10);
		
		Operation o = new Operation();
		o.save(p);
	}
}
