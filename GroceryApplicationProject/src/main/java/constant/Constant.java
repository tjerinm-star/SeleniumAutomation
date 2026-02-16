package constant;

public class Constant {

	public static final String VALID_CREDENTIAL_ERROR_MESSAGE = "User is unable to login with valid credentials";
	public static final String INVALID_PASSWORD_LOGIN_ERROR_MESSAGE = "Login succeeded when it should fail";
	public static final String INVALID_USERNAME_LOGIN_ERROR_MESSAGE = "User should not login with invalid username";
	public static final String INVALID_CREDENTIAL_LOGIN_ERROR_MESSAGE = "Error message should be displayed for invalid login";
	public static final String LOGOUT_FAILED_MESSAGE = "User logout failed";

	public static final String USER_CREATION_FAILED_MESSAGE = "User was NOT created successfully";
	public static final String SEARCH_FAILED_MESSAGE = "Search results NOT displayed";
	public static final String RESET_FAILED_MESSAGE = "Reset search FAILED";

	public static final String NEWS_CREATION_FAILED_MESSAGE = "New news was NOT created successfully";

	public static final String NEWS_SEARCH_FAILED_MESSAGE = "Search results for news were NOT displayed";

	public static final String NEWS_RESET_FAILED_MESSAGE = "Resetting news list failed";
	public static final String TEST_DATA_PATH = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\TestData.xlsx";
	public static final String CONFIG_FILE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\config.properties";

}
