package dataDefinitionLanguageOperations;
//List 
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q2 {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c);
		HTableDescriptor[] tDescriptor = ad.listTables(); 												
		for (int k = 0; k < tDescriptor.length; k++) {
			System.out.println(tDescriptor[k].getNameAsString());
		}
	}
}
