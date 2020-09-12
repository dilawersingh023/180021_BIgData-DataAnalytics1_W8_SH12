package dataDefinitionLanguageOperations;
//drop
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q10 {
	public static void main(String[] args) throws IOException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c);
		ad.disableTable("FirstTable");
		ad.deleteTable("FirstTable"); 
		System.out.println("Table is droped with name FirstTable");
	}
}
