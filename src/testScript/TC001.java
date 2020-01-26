package testScript;
		import java.util.ArrayList;
		import java.util.HashMap;

		
import keywordLibrary.KeywordLib;
import utilities.Excel;

		public class TC001 {

			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				HashMap<Integer, ArrayList<String>> testCases  = Excel.readAllData("TestCases");
				for(Integer testCase : testCases.keySet()) {
					ArrayList<String>testCaseInfo= testCases.get(testCase);
					System.out.println(testCaseInfo);
					if(testCaseInfo.get(1).equals("run")) {
						HashMap<Integer, ArrayList<String>> map = Excel.readAllData(testCaseInfo.get(0));
						System.out.println(map);
						
				for (Integer key : map.keySet()) {
					
					ArrayList<String> values = map.get(key);
					
					KeywordLib.controller(values.get(0), values.get(1), values.get(2),
							values.get(3));
				}
				
				
			}
					else {
						System.out.println("Test case" +testCaseInfo.get(0) +": skipped");
					}

		
				}
			}
		}


