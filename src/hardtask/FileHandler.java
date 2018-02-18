package hardtask;

import java.io.*;
import java.util.Arrays;

public class FileHandler {
    
    public static void main(String[] args) {
        
        if (args.length == 0) {
            throw new IllegalArgumentException("No arguments set");
        }

        File inputFile = new File(args[0]);
        String directory = inputFile.getParent();

        File outputFile = new File(directory + "\\" +
                inputFile.getName().split(".txt", 2)[0] + "_output.txt");
        int i = 1;

        while (outputFile.exists()) {

            outputFile = new File(directory + "\\" +
                    inputFile.getName().split(".txt", 2)[0] + "output_" + i + ".txt");
            i++;

        }


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line = reader.readLine();
            int number = 1;

            while (line != null) {
                String[] data = line.split(" ");
                String command = data[0];
                String[] arguments = Arrays.copyOfRange(data, 1, data.length);

                writer.write(number + " " + Functions.functionSwitch(command, arguments) + "\n");
                writer.newLine();
                number++;
                line = reader.readLine();
            }

            reader.close();
            writer.flush();
            writer.close();
            System.out.println("Complete. Output file: " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
