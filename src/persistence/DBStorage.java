package persistence;

public class DBStorage implements Persistence {
    @Override
    public void save(String data) {
        // Simulate DB save
        System.out.println("Saving to database: " + data);
    }
}
