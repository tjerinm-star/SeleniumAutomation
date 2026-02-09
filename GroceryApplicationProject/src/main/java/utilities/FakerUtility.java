package utilities;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.github.javafaker.Faker;

public class FakerUtility 
{ 
	
	Faker faker=new Faker();
	
	public String createRandomUsernmae()
	{
		return faker.name().username();
	}
    public  String createRandomPassword()
{
	return faker.internet().password();
}
    public String createRandomEmail()
    {
    	return faker.internet().emailAddress();
    }
    public String createMobileNumber()
    {
    	return faker.phoneNumber().cellPhone();
    }
    public String createRandomAddress()
    {
    	return faker.address().fullAddress();
    }
}
