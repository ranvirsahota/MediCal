package Controllers;


import java.io.File;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Enumeration;

public class FileOperations {
    private File events;


    public void test(String name, String date) {
        events = new File (date);
        if (create()) { write(); } else { open();}
    }

    public Boolean create() {

        try {
            events.createNewFile();
        }
        catch (IOException error) {
            return false;
        }
        return true;
    }

    private Boolean update() {

        return false;
    }

    private void write() {

    }

    private void open() {

    }

    public Dictionary read() {
        Dictionary data = new Dictionary() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration keys() {
                return null;
            }

            @Override
            public Enumeration elements() {
                return null;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }
        };
        return data;
    }

}
