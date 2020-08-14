import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class WriteJSONExample
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "John");
        employeeDetails.put("lastName", "Doe");
        employeeDetails.put("company", "Oracle");
        employeeDetails.put("designation", "Manager");
        employeeDetails.put("salary", "500000");
         
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);
         
        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
         employeeDetails2.put("company", "Wipro");
        employeeDetails2.put("designation", "Developer");
        employeeDetails2.put("salary", "5000000");
         
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
         
        
        //third employee
        
        JSONObject employeeDetails3 = new JSONObject();
        employeeDetails3.put("firstName", "Brian");
        employeeDetails3.put("lastName", "Schultz");
        employeeDetails3.put("company", "Capgemini");
        employeeDetails3.put("designation", "Developer");
        employeeDetails3.put("salary", "5000000");
        
        JSONObject employeeObject3 = new JSONObject(); 
        employeeObject3.put("employee", employeeDetails3);
        
        
        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        employeeList.add(employeeObject3);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {
 
            file.write(employeeList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
          
        
    }
}