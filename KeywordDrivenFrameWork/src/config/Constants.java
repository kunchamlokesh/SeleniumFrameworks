package config;

public class Constants {

	//List of System Variables
	public static final String URL = "http://whistler.mediavalet.com/";
	public static final String Path_TestData = "C://Users//lokesh//workspace//KeywordDrivenFrameWork//src//dataEngine//DataEngine1.xlsx";
	public static final String Path_OR = "C://Users//lokesh//workspace//KeywordDrivenFrameWork//src//config//OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";

	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	
	//This is the new column for 'Page Object'
	public static final int Col_PageObject =3 ;
	//This column is shifted from 3 to 4
	public static final int Col_ActionKeyword =4 ;
	//New entry in Constant variable
	public static final int Col_RunMode =2 ;

	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "TestSteps";
	//New entry in Constant variable
    public static final String Sheet_TestCases = "TestCases";

	//List of Test Data
	public static final String UserName = "nadministrator@yopmail.com";
	public static final String Password = "Second@123";
	
	public static final int Col_Result =3 ;
	public static final int Col_TestStepResult =5 ;
	
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";

}