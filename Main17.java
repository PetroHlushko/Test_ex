import com.sun.org.apache.bcel.internal.generic.LUSHR;
import sun.security.x509.SerialNumber;

import java.io.File;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class Main17 {
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
            System.out.println("6.Get all Devices whit higher prise");
            System.out.println();
            int select=scanner.nextInt();


            switch (select){
                case 1:{
                    device.stream().forEach(System.out::println);
                    break;
                }

                case 2:{
                    System.out.println("Enter serial number");
int num = scanner.nextInt();

                    break;
    }

                case 3:{

                    break;
                }



                case 4:{

                    break;
                }




                case 5:{

                    break;
                }
                default:{
                    System.exit(0);
                }
            }

        }
    }
}
