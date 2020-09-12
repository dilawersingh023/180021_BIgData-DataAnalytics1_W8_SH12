package dataManipulationLanguageOperations;
//delete
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class Q3 {
	public static void main(String[] args) throws IOException {
		Configuration c = HBaseConfiguration.create();
		HTable table = new HTable(c, "Employee");
		Delete delete = new Delete(Bytes.toBytes(005)); 
		delete.deleteColumn(Bytes.toBytes("OfficialDetails"), Bytes.toBytes("Name"));
		table.delete(delete);
		table.close();
		System.out.println("Data  is deleted");
	}
}
