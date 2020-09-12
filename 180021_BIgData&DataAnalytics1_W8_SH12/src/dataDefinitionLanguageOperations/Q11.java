package dataDefinitionLanguageOperations;
//drop_all
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q11 {
	public static void main(String[] args) throws IOException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c);
		ad.disableTables("t1");
		ad.deleteTables("t1");
		System.out.println("All the tables are dropped");
	}
}		
