package question3;

import java.sql.Date;

public interface Studentdao {
	public String insertstudent(int roll,String name, String standard,String date,int fee) throws StudentException ;
	public Student findStudent(int roll)throws Exception;

}
