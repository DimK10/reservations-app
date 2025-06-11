package com.uniwa.core.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uniwa.core.model.BaseEntity;

import java.io.File;
import java.io.IOException;

public class JsonSerializerToFile {

    private static JsonSerializerToFile INSTANCE;

    private File outFile;

    private JsonSerializerToFile(Class<?> clazz) {
        outFile = null;

        File dataDir = new File("data");
        if (!dataDir.exists()) {
            dataDir.mkdirs();
        }

        outFile = new File(dataDir, clazz.getTypeName() + "s.json");
    }


    public static JsonSerializerToFile getInstance(Class<?> t) {
        if (INSTANCE == null) {
            INSTANCE = new JsonSerializerToFile(t);
        }

        return INSTANCE;
    }


    public synchronized void serialize(Object object) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(outFile, object);
            System.out.println("Wrote JSON to: " + outFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
