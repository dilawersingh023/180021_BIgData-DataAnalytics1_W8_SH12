package dataManipulationLanguageOperations;
//put
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
public class Q1{
	
public static void main(String[] args) throws IOException {
Configuration c = HBaseConfiguration.create(); 
HTable hTable = new HTable(c, "Employee"); 

Put P1 = new Put(Bytes.toBytes("001")); 
P1.add(Bytes.toBytes("OfficialDetails"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("E001"));
P1.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Name"),		Bytes.toBytes("Todoroki"));
P1.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Post"),		Bytes.toBytes("Manager"));
P1.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
P1.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Age"),		Bytes.toBytes("24"));
P1.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("City"),		Bytes.toBytes("Jagadhri"));
hTable.put(P1);

Put P2 = new Put(Bytes.toBytes("002"));  
P2.add(Bytes.toBytes("OfficialDetails"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("E002"));
P2.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Name"),		Bytes.toBytes("Deku"));
P2.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Post"),		Bytes.toBytes("Sales Representative"));
P2.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Gender"),		Bytes.toBytes("F"));
P2.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Age"),		Bytes.toBytes("23"));
P2.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("City"),		Bytes.toBytes("Delhi"));
hTable.put(P2);

Put P3 = new Put(Bytes.toBytes("003"));
P3.add(Bytes.toBytes("OfficialDetails"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("E003"));
P3.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Name"),		Bytes.toBytes("Alice"));
P3.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Post"),		Bytes.toBytes("Project Manager"));
P3.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
P3.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Age"),		Bytes.toBytes("22"));
P3.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("City"),		Bytes.toBytes("Mumbai"));
hTable.put(P3);

Put P4 = new Put(Bytes.toBytes("004")); 
P4.add(Bytes.toBytes("OfficialDetails"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("E004"));
P4.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Name"),		Bytes.toBytes("Natsu"));
P4.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Post"),		Bytes.toBytes("Hiring Recruiter"));
P4.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Gender"),		Bytes.toBytes("M"));
P4.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Age"),		Bytes.toBytes("24"));
P4.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("City"),		Bytes.toBytes("Yamuna Nagar"));
hTable.put(P4);

Put P5 = new Put(Bytes.toBytes("005"));
P5.add(Bytes.toBytes("OfficialDetails"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("E005"));
P5.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Name"),		Bytes.toBytes("Kirito"));
P5.add(Bytes.toBytes("OfficialDetails"),	Bytes.toBytes("Post"),		Bytes.toBytes("Personal Secretory"));
P5.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Gender"),		Bytes.toBytes("F"));
P5.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("Age"),		Bytes.toBytes("22"));
P5.add(Bytes.toBytes("PersonalDetails"),	Bytes.toBytes("City"),		Bytes.toBytes("Ambala"));
hTable.put(P5);
System.out.println("Data is inserted");       
hTable.close();      
}
}
