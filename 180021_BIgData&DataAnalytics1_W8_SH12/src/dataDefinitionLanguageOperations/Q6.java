package dataDefinitionLanguageOperations;
//is_enabled
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Q6 {
	public static void main(String args[]) throws IOException,
			MasterNotRunningException {
		Configuration c = HBaseConfiguration.create();
		HBaseAdmin ad = new HBaseAdmin(c);
		boolean bool = ad.isTableEnabled("FirstTable");
		System.out.println(bool);
	}
}

