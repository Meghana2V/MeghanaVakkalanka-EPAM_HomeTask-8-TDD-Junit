package EPAMHometask.junittdd;

public class PaswordValidator {

	public boolean isValid(String Password) {
		// TODO Auto-generated method stub
		if(Password.length()>=7 && Password.length()<=15)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
