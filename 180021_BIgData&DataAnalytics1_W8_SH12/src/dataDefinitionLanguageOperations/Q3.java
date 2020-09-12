package dataDefinitionLanguageOperations;
//Disable
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q3 {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c); 
		boolean bool = ad.isTableDisabled("FirstTable");
		if (!bool) {
			ad.disableTable("FirstTable");
			System.out.println("Table is disabled");
		}
	}
}