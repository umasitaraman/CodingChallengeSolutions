import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {

        //File file = new File("sampfile.txt"); // some file


        /*try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Lorem ipsum dolor sit amet");
            //printWriter.print("Lorem ipsum "); printWriter.print("dolor sit amet");
            //printWriter.printf("Lorem %s dolor %s", "ipsum", "sit amet");
            //printWriter.printf("%s", "Lorem ipsum dolor sit amet");
            //printWriter.printf("%s dolor sit %s", "Lorem", "ipsum", "amet");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Lorem ipsum");
            fileWriter.write(" dolor sit amet");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            //Lorem ipsum dolor sit amet
//            //printWriter.print("Lorem ipsum "); printWriter.print("dolor sit amet");
//            //printWriter.printf("Lorem %s dolor %s", "ipsum", "sit amet");
//            //printWriter.printf("%s", "Lorem ipsum dolor sit amet");
//            printWriter.printf("%s dolor sit %s", "Lorem", "ipsum", "amet");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



/*        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Lorem ipsum");

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            File myFile = new File("dataset_91033.txt");
            File myFile2 = new File("dataset_91007.txt");
            File myFile3 = new File("dataset_91022.txt");

            Scanner myReader = new Scanner(myFile);
            Scanner myReader2 = new Scanner(myFile2);
            Scanner myReader3 = new Scanner(myFile3);

            int greatest = 0;
            int strCurrentLine;
            int sum = 0;
            int cnt = 0;
            while (myReader.hasNextLine()) {
                strCurrentLine = Integer.parseInt(myReader.nextLine());
                sum = sum + strCurrentLine;
            }

            while(myReader2.hasNext()) {
                strCurrentLine = myReader2.nextInt();
                if (strCurrentLine > greatest) {
                    greatest = strCurrentLine;
                }
            }

            while(myReader3.hasNext()) {
                strCurrentLine = myReader3.nextInt();
                if (strCurrentLine >= 9999) {
                    cnt ++;
                }
            }

            System.out.println("Sum : " + sum);
            System.out.println("Greatest : " + greatest);
            System.out.println("Count of numbers >= 9999 : " + cnt);

        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            e.printStackTrace();
        }
    }

}
