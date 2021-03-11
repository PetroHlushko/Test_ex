import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        List<Device> device = Reader.getListOfDevices();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println();
            System.out.println("1.Get all Devices.");
            System.out.println("2.Search Device by serial number");
            System.out.println("3.Get all Sorted Devices by brand");
            System.out.println("4.Get all Devices by prise > 400");
            System.out.println("5.Get all Devices by serial number whit 0,and prise is < 800 ");
            System.out.println("6.Get all Device whit higher prise");
            System.out.println();
            System.out.println("Chose:");
            int select=scanner.nextInt();


            switch (select){
                case 1:{
                    device.stream().forEach(System.out::println);
                    break;
                }

                case 2:{
                    System.out.println("Enter serial number");
                    int num = scanner.nextInt();
                device
                        .stream()
                        .filter(s -> s.getSerialNumber() == num).forEach(System.out::println);


                    break;
                }

                case 3:{
device.stream()
        .sorted(new DeviceComparator())
        .forEach(System.out::println);
                    break;
                }



                case 4:{
device.stream()
        .filter(s -> s.getPrise() > 400)
        .forEach(System.out::println);
                    break;
                }



                case 5:{

device.stream()
        .filter(s -> s.getPrise() < 800 && Long.toString( s.getSerialNumber() ).contains("0"))
        .forEach(System.out::println);
                    break;
                }



                case 6:{
Device device1 = device.stream()
        .max(Comparator.comparingInt(Device::getPrise))
        .get();
                    System.out.println(device1);
                    break;
                }

                default:{
                    System.exit(0);
                }
            }

        }
    }

    static class DeviceComparator implements Comparator<Device>{
        public int compare(Device a,Device b){
            return
                    a.getBrand().toUpperCase().compareTo(b.getBrand().toUpperCase());
        }
    }
    }