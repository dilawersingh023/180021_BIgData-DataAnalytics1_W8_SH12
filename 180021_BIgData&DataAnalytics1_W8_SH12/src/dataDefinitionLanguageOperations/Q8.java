package dataDefinitionLanguageOperations;
//alter
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q8 {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c);
		HColumnDescriptor cDescriptor = new HColumnDescriptor("Name");
		ad.addColumn("FirstTable", cDescriptor);
		System.out.println("coloumn is  added which name is Name");
	}
}
