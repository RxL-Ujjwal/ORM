import java.sql.Connection;
import java.sql.PreparedStatement;

public class Operation {
	public void save(Object o) {
		if(o instanceof Player) {
			Player p = (Player)o;
			Connection con = ConnectionProvider.getCon();
			try {
				PreparedStatement ps = con.prepareStatement("insert into player values(?,?,?)");
				ps.setInt(1,p.getPid());
				ps.setString(2,p.getPname());
				ps.setInt(3, p.getPjno());
				int i = ps.executeUpdate();
				if(i>0)
					System.out.println("Database Updated");
				else
					System.out.println("Database Not Updated");
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
