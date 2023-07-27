package com.alusionista;

import java.io.*;
import java.nio.file.Path;

public class FileReader {

    public void read(Path path) throws IOException {

        var file = new File(path.toUri());

        if (!file.exists()) {
            throw new IOException("O arquivo não existe.");
        }

        if (!file.isFile() || !file.getName().endsWith(".txt")) {
            throw new IOException("Arquivo não compatível.");
        }

        var inputStream = new FileInputStream(file);
        var streamReader = new InputStreamReader(inputStream);
        var bufferedReader = new BufferedReader(streamReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();    }
}
