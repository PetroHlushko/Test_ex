import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private static final String PATH="C:\\Users\\Legion\\IdeaProjects\\Java\\src\\Task.txt";
    public static List<Device> getListOfDevices() {
        String line;
        List<Device> devices = new ArrayList<>();
        try (FileReader fileReader = new FileReader(PATH); BufferedReader reader = new BufferedReader(fileReader)) {
            while ((line = reader.readLine())!= null){
                devices.add(getObjectFromString(line.split(", ")));
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return devices;
    }
    private static Device getObjectFromString(String[] data){
        Device device = new Device();
        device.setSerialNumber(Long.parseLong(data[0]));
device.setBrand(data[1]);
device.setInfo(data[2]);
device.setPrise(Integer.parseInt(data[3]));



        return device;
    }

    }