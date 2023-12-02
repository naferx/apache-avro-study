package example.avro;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        User user1 = User.newBuilder()
        .setName("Charlie")
        .setFavoriteColor("blue")
        .setFavoriteNumber(null)
        .build();  
        
        DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
dataFileWriter.create(user1.getSchema(), new java.io.File("users.avro"));
dataFileWriter.append(user1);

dataFileWriter.close();
    }
}
