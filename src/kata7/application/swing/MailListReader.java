package kata7.application.swing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Person> readFromFile(String fileName) throws FileNotFoundException, IOException {
      
        
        ArrayList<Person> mailList = new ArrayList<>();
        BufferedReader fileRead = new BufferedReader(new FileReader(new File(fileName)));

        int id = 0;
        String email;
        while((email = fileRead.readLine())!= null) 
            if(email.contains("@")) mailList.add(new Person(id++, email));
                
        return mailList;
    }
}
