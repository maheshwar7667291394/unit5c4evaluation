package question3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoimpl implements Studentdao{

	@Override
	public String insertstudent(int roll, String name, String standard, String date, int fee) throws StudentException {
		String result="not inserted";
	
		try(Connection con=GEtConnection.GetConnect()) {
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1,roll);
			ps.setString(2,name);
			ps.setString(3,standard);
			ps.setString(4,date);
			ps.setInt(5, fee);
			int x=ps.executeUpdate();
			if(x>0) {
				result="insertin sucessfull";
			}
			
		} catch (SQLException e) {
			
		     throw new StudentException(e.getMessage());
		}
		
		
		
		
		return result;
	}

	@Override
	public Student findStudent(int roll) throws Exception {
	 Student student=null;
	 
	 
	 try(Connection con=GEtConnection.GetConnect()) {
			PreparedStatement ps=con.prepareStatement("select from student where Rollno=?");
			ps.setInt(1,roll);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			 student.setRoll(rs.getInt("Rollno"));
				student.setName(rs.getString("StudentName"));
				student.setStandard(rs.getString(" Standard"));
				student.setDateofbitrth(rs.getString("Date_Of_Birth"));
				student.setFee(rs.getInt("Fee"));
			}
			
		} catch (SQLException e) {
			
		     throw new StudentException(e.getMessage());
		}
	 
	 
	 
	 
	 return student;
	}

}
