public class grouund {
    public static void main(String[] args) {
        System.out.println("Welcome to Ground Booking System");

        String[] grounds={"Foot Ball Ground","Volley Ball Ground","Cricket Ground"};
        String[] bookings =new String[10];
        int count =0;

        bookings[count++] =grounds[0]+" 2025-12-03,Hari";
        bookings[count++]=grounds[1]+" 2025-12-03, Rhythan";
        bookings[count++]=grounds[2]+" 2025-12-04,Varsha";


        System.out.println("\nCurrent Bookings:");

        for(int  i=0;i<count;i++){
            System.out.println((i+1)+ "."+bookings[i]);
        }

        System.out.println("\nTotal Bookings:"+count);
        System.out.println("Available Slots:"+(10-count));
    }
}
