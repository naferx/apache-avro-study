### Apache Avro Study

Data serialization system



https://avro.apache.org/

Download Avro Tools from https://dlcdn.apache.org/avro/stable/java/

```shell
$ java -jar lib/avro-tools-1.11.3.jar compile schema schemas/
user.avsc .
Input files to compile:
  schemas/user.avsc
```

 `mvn -q exec:java -Dexec.mainClass=example.avro.Main`