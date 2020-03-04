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
    public void test(Context context, String name, String date) {
        events = new File (context.getExternalFilesDir(null), date);
        if (!create()) {
            events = events.getAbsoluteFile();
            Log.d("PROGRESS", "CHECK");
        }
        write(name, date);
        read();
    }

    //return a Dictionary received from read() so UI can easily pull values to display
    public void test(String date) {
        events = new File(date);
        events = events.getAbsoluteFile();
        //return read();
        read();
    }


    public Boolean create() {
        try { return events.createNewFile(); }
        catch (IOException error) {
            Log.d("ERROR", error.getMessage());

            return false;
        }
    }

    //File Text Structure
    //name.date.
    private Boolean write(String name, String date) {
        try {

            FileWriter writer = new FileWriter(events);
            String data = name + "." + date + "/n";
            writer.write(data);
            writer.close();
        }
        catch (IOException error) {
            Log.d("ERROR", error.getMessage());
            return false;
        }
        return true;
    }

    //testing file can be read() successfully
    private void read() {
        int data = 0;
        try {
            FileReader reader = new FileReader(events);
            do {
                try {
                    data = reader.read();
                } catch (IOException error) {
                    Log.d("ERROR", error.getMessage());
                }
                Log.e("DATA", Integer.toString(data));
            }
            while (data != -1);
            reader.close();
        }
        catch (IOException error) {
            Log.d("ERROR", error.getMessage());
        }
    }
}
