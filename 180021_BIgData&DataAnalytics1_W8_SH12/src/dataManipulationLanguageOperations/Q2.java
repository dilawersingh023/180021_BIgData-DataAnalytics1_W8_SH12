package dataManipulationLanguageOperations;
//get 
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class Q2 {
	public static void main(String[] args) throws IOException {
		Configuration c = HBaseConfiguration.create();
		HTable table = new HTable(c, "Employee"); 
		Get g = new Get(Bytes.toBytes("001"));
		Result result = table.get(g);
		byte[] value = result.getValue(Bytes.toBytes("OfficialDetails"),
				Bytes.toBytes("Name"));
		String name = Bytes.toString(value);
		System.out.println("Name: " + name);
	}
}