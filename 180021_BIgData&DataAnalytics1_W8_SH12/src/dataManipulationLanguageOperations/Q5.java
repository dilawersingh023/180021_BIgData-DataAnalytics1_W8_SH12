package dataManipulationLanguageOperations;
//scan 
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class Q5 {
	public static void main(String args[]) throws IOException {
		Configuration c = HBaseConfiguration.create();
		HTable table = new HTable(c, "Employee");
		Scan scan = new Scan(); 
		scan.addColumn(Bytes.toBytes("OfficialDetails"), Bytes.toBytes("Name"));
		ResultScanner scanner = table.getScanner(scan);	
		for (Result result = scanner.next(); result != null; result = scanner
				.next())
			System.out.println("Result Found: " + result);
		scanner.close(); 
	}
}	