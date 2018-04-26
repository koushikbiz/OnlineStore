package config;

public class Constants {
	
	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    //'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "http://www.store.demoqa.com";
	public static final String Path_TestData = "C:/Users/Me/eclipse-workspace/OnlineStore/src/test/java/dataEngine/DataEngine.xlsx";
	public static final String Path_OR = "C:/Users/Me/eclipse-workspace/OnlineStore/src/test/java/config/OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";
 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID = 1;
	public static final int Col_PageObject = 3;
	public static final int Col_ActionKeyword =4;
	//New entry in Constant variable
	public static final int Col_RunMode =2;
	
	//Constants variables for the results column of Test Case sheet and Test Step sheet
	public static final int Col_Result =3;
	public static final int Col_DataSet =5;
	public static final int Col_TestStepResult =6;
	
	//Create two new Constants variables for the Pass results & Fail result
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
 
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	//New entry in Constant variable
    public static final String Sheet_TestCases = "Test Cases";
 
	// List of Test Data
	public static final String UserName = "testuserkd";
	public static final String Password = "vKztotiq0nlNv^YC";
 
}

