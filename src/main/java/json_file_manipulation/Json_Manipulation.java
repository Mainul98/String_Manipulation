package json_file_manipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Json_Manipulation {
    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
        //readJSONFile();
        //jsonWrite();
        //writeJSONList();
        //readStudentArrayList();
        //updateJSONList("name","Kamal");
       // updateListStudent(0,"name","faruk");
       // deleteStudent(0);

    }

    private static void jsonWrite() throws IOException {
        JSONObject empObj = new JSONObject();
        empObj.put("name", "Mr. Shajib");
        empObj.put("Department", "IT");
        empObj.put("Designation", "Software Engineer");
        JSONObject addressObj = new JSONObject();
        addressObj.put("present_address", "Badda,Gulshan-1");
        addressObj.put("PO", "Gulshan");
        addressObj.put("Area", "Gulshan-1");
        empObj.put("address", addressObj);
        empObj.put("phone_number", "01620141540");

        FileWriter file = new FileWriter("./src/main/resources/employee.json");
        file.write(empObj.toJSONString());
        file.flush();


        System.out.println(empObj);

    }

    private static void readJSONFile() throws IOException, ParseException, org.json.simple.parser.ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/main/resources/employee.json"));
        JSONObject empObj = (JSONObject) obj;
        System.out.println(empObj);

        String name = (String) empObj.get("name");
        System.out.println(name);

        String department = (String) empObj.get("Department");
        System.out.println(department);
        String designation = (String) empObj.get("Designation");
        System.out.println(designation);

        JSONObject addressObj = (JSONObject) empObj.get("address");
        String area = (String) addressObj.get("Area");
        System.out.println(area);
        String po = (String) addressObj.get("PO");
        System.out.println(po);
        String present_address = (String) addressObj.get("present_address");
        System.out.println(present_address);

    }

    private static void writeJSONList() throws IOException, ParseException, org.json.simple.parser.ParseException {
        char ch = 'y';
        String fileName = "./src/main/resources/student.json";
        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject studentObj = new JSONObject();

            Scanner input = new Scanner(System.in);
            System.out.println("Input student ID: ");
            studentObj.put("id", input.next());
            System.out.println("Input student name: ");
            studentObj.put("name", input.next());
            System.out.println("Input Department ");
            studentObj.put("department", input.next());

            JSONArray jsonStudentArray = (JSONArray) obj;
            jsonStudentArray.add(studentObj);
            System.out.print(jsonStudentArray);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonStudentArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved!");
            System.out.print(jsonStudentArray);
            System.out.println("\nDo you want to add more?[y/n]");
            ch = input.next().charAt(0);

        }
        while (ch != 'n');

    }
    private static void readStudentArrayList() throws IOException, ParseException, org.json.simple.parser.ParseException {
        int pos=1;
        String fileName="./src/main/resources/student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        System.out.println(jsonArray);
        JSONObject jsonObject = (JSONObject) jsonArray.get(pos);

        String name = (String) jsonObject.get("name");
        String id = (String) jsonObject.get("id");
        String department = (String) jsonObject.get("department");
        System.out.println(name);
        System.out.println(id);
        System.out.println(department);
    }
    public static void updateJSONList(String key, String value) throws IOException, ParseException, org.json.simple.parser.ParseException {
        String fileName="./src/main/resources/employee.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONObject empObj = (JSONObject) obj;
        System.out.println(empObj);
        empObj.put(key,value);
        FileWriter file = new FileWriter(fileName);
        file.write(empObj.toJSONString());
        file.flush();
        file.close();
        System.out.println("Updated!");
        System.out.print(empObj);
    }
    private static void updateListStudent(int index, String key, String value) throws IOException, ParseException, org.json.simple.parser.ParseException {
        String fileName="./src/main/resources/student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;

        JSONObject jsonObject = (JSONObject) jsonArray.get(index);
        jsonObject.put(key, value);

        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("Updated!");
        System.out.print(jsonArray);
    }
    private static void deleteStudent(int index) throws IOException, ParseException, org.json.simple.parser.ParseException {
        String fileName="./src/main/resources/student.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.remove(index);
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("Deleted!");
        System.out.print(jsonArray);
    }




}




