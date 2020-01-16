import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

    public class Visitor  {
      static String Name;
      static int n;
      static LocalDate date = LocalDate.now();
      static LocalTime time = LocalTime.now();
      static String feedback;
      static String aid;
      static String fileName;


     Visitor(String visitorName,int age,LocalDate dateOfVisit, LocalTime checkIn, String comment, String assistanceName){
        Name = visitorName;
        n  = age;
        date = dateOfVisit;
        time = checkIn;
        feedback = comment;
        aid = assistanceName;
        fileName = "visitor_"+Name.split(" ")[0]+"_"+Name.split(" ")[1]+".txt";
    }
    public String save() {
         String outcome = "";
        try {
            File myNewFile = new File(fileName);
                if(myNewFile.createNewFile()){
                    FileWriter myFile = new FileWriter(myNewFile);
                    myFile.write("Name: " + Name + "\n"+ "Age: " + n + "\n" + "Date: " + date + "\n" + "Time: " + time + "\n" + "Comments: " + feedback + "\n" + "Aid: " + aid);
                    myFile.close();
                    outcome += "results in "+fileName;
                }else{
                    outcome +=fileName+" File already exists!";
                }


        } catch (IOException e) {
            outcome +="An error has occurred";
            e.printStackTrace();
        }
            return outcome;
    }
    public String load(String visitorName){
         String output = "";
         String fileName = "visitor_"+visitorName.split(" ")[0]+"_"+visitorName.split(" ")[1]+".txt";
         try{
             File myObj = new File(fileName);
             Scanner myReader = new Scanner(myObj);
             while(myReader.hasNextLine()){
                 String data = myReader.nextLine();
                 output += data+"\n ";
             }
             myReader.close();
         } catch (FileNotFoundException e) {
             output = "An error has occurred";
             e.printStackTrace();
         }
         return output;
    }

}
