package Controllers;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    private File events;

    //need to re-name test methods to something more appropriate
    //use boolean return values to determine if operations were successful or not
    public Boolean test(Context context, String name, String date) {
        events = new File (context.getExternalFilesDir(null), date + ".txt");
        if (!create()) {
            events = events.getAbsoluteFile();
            Log.d("PROGRESS", "CHECK");
        }
        return write(name,date);
    }

    //return a Dictionary received from read() so UI can easily pull values to display
    public Boolean test(String date) {
        events = new File(date + ".txt");
        events = events.getAbsoluteFile();
        return read();
    }

    public Boolean create() {
        try { return events.createNewFile(); }
        catch (IOException error) {
            Log.d("ERROR", error.getMessage());
            return false;
        }
    }

    //Need to test this appends to text file
    private Boolean write(String name, String date) {
        try {
            FileWriter writer = new FileWriter(events);
            //File Text Structure
            String data =
                    "****START_OF_EVENT****\n" +
                    "[EVENT_NAME] = " + name + "\n" +
                    "[EVENT_DATE] = " + date + "\n" +
                    "****END_OF_EVENT****\n";
            writer.write(data);
            writer.close();
        }
        catch (IOException error) {
            Log.d("ERROR", error.getMessage());
            return false;
        }
        return true;
    }

    private Boolean read() {
        int data = 0;
        try {
            FileReader reader = new FileReader(events);
            Log.d("INFO", reader.getEncoding());
            do {
                try {
                    data = reader.read();
                } catch (IOException error) {
                    Log.d("ERROR", error.getMessage());
                }
                char character = (char) data;
                Log.d("DATA", Character.toString(character));

                //Need to split string up consider using stringtokenizer
                StringBuffer sb = new StringBuffer();
                sb.append(character);

            }
            while (data != -1);
            reader.close();
        }
        catch (IOException error) {
            Log.d("ERROR", error.getMessage());
            return false;
        }
        return true;
    }
}
