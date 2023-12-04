### Apache Avro Study

Data serialization system

#### Fundamentals

##### Schema
JSON file that defines the structure of the data 


https://avro.apache.org/docs/1.11.1/specification/


https://avro.apache.org/

Download Avro Tools from https://dlcdn.apache.org/avro/stable/java/

```shell
$ java -jar lib/avro-tools-1.11.3.jar compile schema schemas/
user.avsc .
Input files to compile:
  schemas/user.avsc
```

java -jar lib/avro-tools-1.11.3.jar getschema input/output4.avro

java -jar lib/avro-tools-1.11.3.jar fromjson input/sample1.json --schema-file input/schema1.avsc > input/out.avro

 java -jar lib/avro-tools-1.11.3.jar tojson input/out.avro

 `mvn -q exec:java -Dexec.mainClass=example.avro.Main`