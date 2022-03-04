package jacksonTutorials;

import Optional.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class jacksonMain {
    public static void main(String[] args) {
        PersonEntity personEntity = new PersonEntity("Hossein", "javooni");

        ObjectMapper mapper = new ObjectMapper();
        //write object as json string
        try {
            String personObject = mapper.writeValueAsString(personEntity);
            System.out.println(personObject);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        //write object as json string in a file
        try {
            mapper.writeValue(new File("target/jackson.json"), personEntity);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonString = "{\"lastName\":\"javooni1\",\"firstName\":\"Hossein1\"}";

        //write string as a json object
        try {
            PersonEntity personFromJson = mapper.readValue(jsonString, PersonEntity.class);
            System.out.println(personFromJson.toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        //write json string from a file to an object
        try {
            PersonEntity personFromFile = mapper.readValue(new File("target/jackson.json"), PersonEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read json String from a URL and map to object
        try {
            PersonEntity personEntity2 = mapper.readValue(new URL("file:src/main/java/jacksonTutorials/person.json"), PersonEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonStringNodes = "{\"firstName\":\"HosseinNode\",\"lastName\":\"javooniNode\"}";


        try {
            JsonNode jsonNode = mapper.readTree(jsonStringNodes).get("firstName");
            String firstNameNode = jsonNode.asText();
            System.out.println("firstNameNode is --> " + firstNameNode);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        String jsonStringList = "[{\"firstName\":\"HosseinList1\",\"lastName\":\"javooniList1\"}, {\"firstName\":\"HosseinList2\",\"lastName\":\"javooniList2\"}]";
        try {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            List<PersonEntity> personEntities = mapper.readValue(jsonStringList, new TypeReference<List<PersonEntity>>(){});
            System.out.println(personEntities.get(0).toString());
            System.out.println(personEntities.get(1).toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        PersonEntityWithList personEntityWithList =
                new PersonEntityWithList("Mahan",
                        "Javooni", Arrays.asList("drink milk", "sleep"),
                        new PersonEntityWithList.Mechin(23.3, "QUIK", "1399"));

        try {
            mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            mapper.writeValue(new File("target/jackson2.json"), personEntityWithList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Map<String , Object> jsonMapping = mapper.readValue(new File("target/jackson2.json"), new TypeReference<Map<String, Object>>(){});
            jsonMapping.forEach((r, s) -> System.out.println(r + "  ****  " + s.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
