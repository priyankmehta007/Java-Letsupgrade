import java.util.Scanner;
class Cab {
    int fare;
    int d;

    public Cab() {
        fare = 30;
    }
    //parameterized constructor
    public Cab(int fare) {
        this.fare = fare;   //"this" gives reference of current object being used
        //ob.fare - fare
    }

    //copy constructor 
    public Cab(Cab ob1) {         //ob1 = ob
        fare = ob1.fare;   //ob2.fare = ob.fare
    }
}

class RideCab {
    public static void main(String[] args) {
        int cd; //distance of cab from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();

        if(cd > 5) {
            Cab ob = new Cab(30 + (cd - 5) * 10); //invokes param constructor
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare += 10 * ob.d;

            System.out.println("Total fare: Rs " + ob.fare);

            
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare += 10 * ob.d;

            System.out.println("Total fare: Rs " + ob.fare);

            Cab ob2 = new Cab(ob);
            System.out.println("Data ob2: " + ob2.fare);
        }

    }
}
*/

class Demo {
    private int x;

    //setter
    public void setX(int val) {
        x = val;
    }

    //getter
    public int getX() {
        return x;
    }
}

class DriveDemo {
    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.setX(30);
        System.out.println("Data: " + ob.getX());
    }
}