package dataDefinitionLanguageOperations;
//enable
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q5 {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c);
		boolean bool = ad.isTableEnabled("FirstTable");
		if (!bool) {
			ad.enableTable("FirstTable");
			System.out.println("Table is Enabled");
		}
	}
}