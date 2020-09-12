package dataDefinitionLanguageOperations;
//exists 
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q9 {
	public static void main(String args[]) throws IOException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c);
		boolean bool = ad.tableExists("FirstTable");
		System.out.println(bool);
	}
}