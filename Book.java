import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
class BookMyShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String head = "Welcome to Book My Show !";
        String pattern = "*************************";
        int widthc = 150;
        int space = (widthc - head.length())/2;
        String middle = String.format("%" + space + "s", " ");
        System.out.println(middle + pattern);
        System.out.println("\u001B[35m"+middle + head+"\u001B[0m");
        System.out.println(middle+ pattern);
        int choice;
         String name;
         String email;
         String phno;
         System.out.print("Enter your name            : ");
        name = sc.nextLine();
        System.out.print("Enter you E-mail id        : ");
        email = sc.nextLine();
        check(email);
        if (check(email) == false) {
            while(check(email) == false){
                System.out.println(email +"\u001B[31m"+ "  : It is not a valid email address."+"\u001B[0m");
                System.out.print("Enter correct email address : ");
                email = sc.nextLine();
                check(email);
            }
        }
        System.out.print("Enter your Phone Number   : ");
        phno = sc.nextLine();
        if(phno.length() == 10){
            System.out.println("\u001B[32m"+"Account Created1"+"\u001B[0m" );
        }else{
             while(phno.length() > 10 || phno.length() < 10){
            System.out.println("\u001B[31m"+"Invalid Phone Number!"+"\u001B[0m");
            System.out.print("Enter valid phone number   :");
            phno = sc.nextLine();
        } 
        }
        AccountHolder user = new AccountHolder(name, email, phno);
        System.out.println();
        System.out.println("User details are:     ");
        System.out.println(user.toString());
        System.out.println();
        Insert ir = new Insert();
        do{
            System.out.println("1. For Movie ");
            System.out.println("2. For Sports");
            System.out.println("0. For exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1 : ir.movieAll();
                break;
                case 2: ir.sportsAll();
                break;
                case 0: System.out.println("Exit!");
                return;
                default: System.out.println("\u001B[31m"+"Invalid choice!"+"\u001B[0m");
                System.out.println("Please enter valid choice.");
            }
        }while(choice != 0);
        sc.close();
    }
   
    static boolean check(String email){
        if (email == null || email.isEmpty()) {
            return false;
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if (atIndex < 1 || dotIndex < atIndex + 6 || dotIndex >= email.length() - 3) {
            return false;
        }

        // Check if there are no consecutive dots or "@" symbols
        for (int i = 0; i < email.length() - 1; i++) {
            if ((email.charAt(i) == '.' && email.charAt(i + 1) == '.') ||
                (email.charAt(i) == '@' && email.charAt(i + 1) == '@')) {
                return false;
            }
        }
        return true;   
    }
}
class AccountHolder{
    Scanner sc = new Scanner(System.in);
    String name;
    String email;
    String phno;

     AccountHolder(String name, String email, String phno) {
        this.name = name;
        this.email = email;
        this.phno = phno;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhno() {
        return phno;
    }
    @Override
    public String toString() {
        return " Name = " + name + ", email = " + email + ", Phone Number = " + phno ;
    }
}

    class Insert {
        Scanner sc = new Scanner(System.in);
        Theater theater1 = new Theater("PVR");
        Theater theater2 = new Theater("INOX");
        Theater theater3 = new Theater("Cinepolis");

        Movie movie1 = new Movie("The Shawshank Redemption", 1994, "Drama", 9.3, 800);
        Movie movie2 = new Movie("The Godfather", 1972, "Crime", 9.2, 800);
        Movie movie3 = new Movie("Inception", 2010, "Sci-Fi", 8.8, 800);
        Movie movie4 = new Movie("Qala", 2022, "Drama", 8.3, 800);
        Movie movie5 = new Movie("Jawan", 2023, "Thriller", 7.5, 800);
        Movie movie6 = new Movie("The Nun 2", 2023, "Horror", 8.2, 800);
        Movie movie7 = new Movie("3 Akka",2023, "Comedy", 6.3, 800);
        Movie movie8 = new Movie("Fukrey 3", 2023, "Comedy", 8.2, 800);
        Movie movie9 = new Movie("Barbie", 2023, "Fantasy", 7.8, 800);
        Movie movie10 = new Movie("Yeh Jawani Hai Deewani", 2012, "Drama", 7.2, 800);

        
        public void movieAll(){
        
        Movie selectedMovie=null;
        Theater selectedTheater=null;

        System.out.println("Choose a movie:");
        System.out.println("1. " + movie1.title);
        System.out.println("2. " + movie2.title);
        System.out.println("3. " + movie3.title);
        System.out.println("4. " + movie4.title);
        System.out.println("5. " + movie5.title);
        System.out.println("6. " + movie6.title);
        System.out.println("7. " + movie7.title);
        System.out.println("8. " + movie8.title);
        System.out.println("9. " + movie9.title);
        System.out.println("10. " + movie10.title);

        int movieChoice = sc.nextInt();
        sc.nextLine();


        switch (movieChoice) {
            case 1:
                selectedMovie = movie1;
                System.out.println(movie1.toString());
                break;
            case 2:
                selectedMovie = movie2;
                System.out.println(movie2.toString());
                break;
            case 3:
                selectedMovie = movie3;
                System.out.println(movie3.toString());
                break;
                case 4:
                selectedMovie = movie4;
                System.out.println(movie4.toString());
                break;
            case 5:
                selectedMovie = movie5;
                System.out.println(movie5.toString());
                break;
            case 6:
                selectedMovie = movie6;
                System.out.println(movie6.toString());
                break;
                case 7:
                selectedMovie = movie7;
                System.out.println(movie7.toString());
                break;
            case 8:
                selectedMovie = movie8;
                System.out.println(movie8.toString());
                break;
            case 9:
                selectedMovie = movie9;
                System.out.println(movie9.toString());
                break;
                case 10:
                selectedMovie = movie10;
                System.out.println(movie10.toString());
                break;

            default:
                System.out.println("Invalid choice.");
                
        }
 
         
        String time1[] = {"9:00 AM", "12:00 PM", "3:00 PM", "5:00 PM"};
        String time2[] = {"10:00 AM", "1:00 PM", "4:00 PM", "6:00 PM"};
        String time3[] = {"2:00 PM", "6:00 PM", "8:00 PM", "10:00 PM"};

        theater1.addMovie(movie1, time1,800);
        theater1.addMovie(movie2, time2,700);
        theater1.addMovie(movie3, time3,600);
        theater1.addMovie(movie4, time1,900);
        theater1.addMovie(movie5, time2,400);
        theater1.addMovie(movie6, time3,500);
        theater1.addMovie(movie7, time1,550);
        theater1.addMovie(movie8, time2,800);
        theater1.addMovie(movie9, time3,300);
        theater1.addMovie(movie10, time1,650);

        theater2.addMovie(movie1, time1,800);
        theater2.addMovie(movie2, time2,700);
        theater2.addMovie(movie3, time3,600);
        theater2.addMovie(movie4, time1,650);
        theater2.addMovie(movie5, time2,400);
        theater2.addMovie(movie6, time3,500);
        theater2.addMovie(movie7, time1,550);
        theater2.addMovie(movie8, time2,400);
        theater2.addMovie(movie9, time3,300);
        theater2.addMovie(movie10, time2,900);

        theater3.addMovie(movie1, time1,800);
        theater3.addMovie(movie2, time2,400);
        theater3.addMovie(movie3, time3,300);
        theater3.addMovie(movie4, time1,500);
        theater3.addMovie(movie5, time2,600);
        theater3.addMovie(movie6, time3,700);
        theater3.addMovie(movie7, time1,900);
        theater3.addMovie(movie8, time2,800);
        theater3.addMovie(movie9, time3,550);
        theater3.addMovie(movie10,time3,450);
        System.out.println();
        System.out.println("Choose a theater:");
        System.out.println("1. " + theater1.getName());
        System.out.println("2. " + theater2.getName());
        System.out.println("3. " + theater3.getName());
        System.out.println();
        int choice = sc.nextInt();
        sc.nextLine();


        switch (choice) {
            case 1:
                selectedTheater = theater1;
                break;
            case 2:
                selectedTheater = theater2;
                break;
            case 3:
                selectedTheater = theater3;
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }
        System.out.println();
        selectedTheater.displayMovieTimings(selectedMovie);

        System.out.println("Enter a movie timing:");
        String selectedTiming = sc.nextLine();
        
        boolean validTiming = selectedTheater.isValidMovieTiming(selectedMovie, selectedTiming);
        System.out.println();
        while (!validTiming) {
            System.out.println("\u001B[31m"+"Invalid timing."+"\u001B[0m");
            System.out.println("Please enter a valid movie timing : ");
            selectedTiming = sc.nextLine();
            System.out.println();
            validTiming = selectedTheater.isValidMovieTiming(selectedMovie, selectedTiming);
        }
        System.out.println();
        System.out.println("How many tickets do you want to buy?");
        int numTickets = sc.nextInt();
        sc.nextLine();
        selectedTheater.bookingOfSeats(numTickets, selectedTheater);
        
        double totalPrice=(selectedMovie.price*numTickets);
        System.out.println("Thank you for booking!");
        System.out.println("Total amount to be paid: " + totalPrice+" Rs.");
        System.out.println("Thank you for booking!");

        System.out.println("\nReceipt:");
        System.out.println("Movie: " + selectedMovie.title);
        System.out.println("Theater: " + selectedTheater.getName());
        System.out.println("Timing: " + selectedTiming);
        System.out.println("Total Tickets: " + numTickets);
        System.out.println("Total Amount Paid: " + totalPrice+" Rs.");
        System.out.println();
        selectedTheater.clearMovieSchedule();

            }
   Indoor chessEvent1 = new Indoor('A',"Chess Tournament State", 100.0, "Indoor Stadium A", "3:00 PM");
        Indoor chessEvent2 = new Indoor('B',"Chess Tournament National", 250.0, "Indoor Stadium A", "6:00 PM");
        Indoor chessEvent3 = new Indoor('C',"Chess Tournament Final", 300.0, "Indoor Stadium A", "12:00 PM");
          Outdoor cricketEvent1 = new Outdoor('P',"Cricket Match MI VS GT", 2000.0, "Outdoor Stadium B", "2:30 PM", 50000);
        Outdoor cricketEvent2 = new Outdoor('Q',"Cricket Match RCB VS CSK", 5000.0, "Outdoor Stadium A", "2:30 PM", 50000);
        Outdoor cricketEvent3 = new Outdoor('R',"Cricket Match GTVS CSK", 9000.0, "Outdoor Stadium C", "2:30 PM", 50000);
        Indoor selectedIndoorEvent;
        Outdoor selectedOutdoorEvent ;
        void sportsAll(){
            Scanner sc=new Scanner(System.in);
          
           
        LL sportsList = new LL();
       

        

          System.out.println();
            System.out.println("The coloured dates shows the day of match");
            System.out.println();
            String month = "September";
            int begin = 6;
            int dayNum = 30;
            String header = "  S  M  T  W  T  F  S";
            System.out.print(header);
            int day = 1;
            for (int i = 1; i <= begin + dayNum - 1; i++) {
            if (i % 7 == 1) {
                System.out.println();
                }
            if (i < begin) {
                System.out.print("   ");
            } else {
            if (day / 10 == 0) {
                System.out.print("  " + day);
            } else if (day % 3 == 0) {
                System.out.print(" " + "\u001B[34m" + day + "\u001B[0m");
            } else {
                System.out.print(" " + day);
            }
            day++;
        }
  }
  System.out.println();
  System.out.println("Please select the day you want to book your tickets");
  int selectedDate = sc.nextInt(); 
  while(!(selectedDate == 12 ||selectedDate == 15|| selectedDate == 18||selectedDate == 21||selectedDate == 24||selectedDate == 27||selectedDate == 30)){  
       System.out.println("Enter valid date : ");
        selectedDate = sc.nextInt();
  }

        System.out.println("Sports Events:");
        

        System.out.println("Choose an event type:");
        System.out.println("1. Indoor");
        System.out.println("2. Outdoor");

        int eventTypeChoice = sc.nextInt();
        sc.nextLine();

        switch (eventTypeChoice) {
            case 1:
                System.out.println();
                System.out.println("You selected an indoor event.");
                 sportsList.insert(chessEvent1);
                 sportsList.insert(chessEvent2);
                 sportsList.insert(chessEvent3);
                 sportsList.display();
                System.out.println();
                System.out.println("Select an Event");
                char selectedEvent = sc.next().charAt(0);
                while(!(selectedEvent == 'a' || selectedEvent == 'b'|| selectedEvent == 'c' || selectedEvent == 'A'|| selectedEvent =='B'|| selectedEvent =='C')){
                    System.out.println("Invalid choice");
                    System.out.println("Enter again");
                    selectedEvent = sc.next().charAt(0);
                }
                if(selectedEvent == 'A'){
                    selectedEvent = 'a';
                }else  if(selectedEvent == 'B'){
                    selectedEvent = 'b';
                }else{
                    selectedEvent = 'c';
                }
                
                    String name;
                    switch(selectedEvent){
                    case 'a': selectedIndoorEvent = chessEvent1;
                    name = selectedIndoorEvent.name;
                    System.out.println(name);
                    break;
                    case 'b': selectedIndoorEvent = chessEvent2;
                    name = selectedIndoorEvent.name;
                    System.out.println(name);
                    break;
                    case 'c': selectedIndoorEvent = chessEvent3;
                    name = selectedIndoorEvent.name;
                    System.out.println(name);
                    break;
                    default : System.out.println("\u001B[31m"+ "Enter valid choice : "+ "\u001B[0m");
                }
                
                System.out.println("How many tickets do you want to buy?");
                int numTickets_indoor = sc.nextInt();
                sc.nextLine();

                double totalPrice_indoor = numTickets_indoor * selectedIndoorEvent.ticketPrice;
                System.out.println();
                System.out.println("Total amount to be paid for " + numTickets_indoor + " tickets: $" + totalPrice_indoor);
                System.out.println("Thank you for booking!");
       
                System.out.println("\nReceipt:");
                System.out.println("Event: " + selectedIndoorEvent.name);
                System.out.println("Venue: " + selectedIndoorEvent.venue);
                System.out.println("Timing: " + selectedIndoorEvent.timing);
                System.out.println("Quantity: " + numTickets_indoor);
                System.out.println("Total Amount Paid: $" + totalPrice_indoor);
                System.out.println();
                return;
            case 2:
            System.out.println();
                System.out.println("You selected an outdoor event.");
                System.out.println();
                sportsList.insert(cricketEvent1);
        sportsList.insert(cricketEvent2);
        sportsList.insert(cricketEvent3);
        sportsList.display();
                 System.out.println("Select a Match");
                char selectOutdoor = sc.next().charAt(0);
                while(!(selectOutdoor == 'P' || selectOutdoor == 'Q'|| selectOutdoor == 'R'||selectOutdoor == 'p' || selectOutdoor == 'q'|| selectOutdoor == 'r')){
                    System.out.println("Invalid choice");
                    System.out.println("Enter again");
                    selectOutdoor = sc.next().charAt(0);
                }
                if(selectOutdoor == 'p'){
                    selectOutdoor = 'P';
                }else  if(selectOutdoor == 'q'){
                    selectOutdoor = 'Q';
                }else{
                    selectOutdoor = 'R';
                }
                    String nameOutdoor;
                    switch(selectOutdoor){
                    case 'P': selectedOutdoorEvent = cricketEvent1;
                    nameOutdoor = selectedOutdoorEvent.name;
                    System.out.println(nameOutdoor);
                    break;
                    case 'Q': selectedOutdoorEvent = cricketEvent1;
                    nameOutdoor = selectedOutdoorEvent.name;
                    System.out.println(nameOutdoor);
                    break;
                    case 'R': selectedOutdoorEvent = cricketEvent1;
                    nameOutdoor = selectedOutdoorEvent.name;
                    System.out.println(nameOutdoor);
                    break;
                    default : System.out.println("\u001B[31m"+ "Enter valid choice : "+ "\u001B[0m");
                }
                System.out.println();
                System.out.println("How many seats do you want to book?");
        int numSeats = sc.nextInt();
        sc.nextLine();
        System.out.println();
         char c = 'A';
        for(int i = 1; i < 7; i ++){
            for(int j = 1; j < 9; j++){
                if((i == 3 || i == 4) && (j == 3 || j == 4  || j == 5 || j == 6) ){
                    System.out.print("  ");
                }else{
                    System.out.print(" "+ j);
                }
            }
            System.out.print(" "+c);
            c++;
            System.out.println();
        }
        char pattern[][] = {
            {'1',' ','2',' ','3',' ','4',' ','5',' ','6',' ','7',' ','8',' ','A'},
            {'1',' ','2',' ','3',' ','4',' ','5',' ','6',' ','7',' ','8',' ','B'},
            {'1',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ','8',' ','C'},
            {'1',' ','2',' ',' ',' ',' ',' ',' ',' ',' ',' ','7',' ','8',' ','D'},
            {'1',' ','2',' ','3',' ','4',' ','5',' ','6',' ','7',' ','8',' ','E'},
            {'1',' ','2',' ','3',' ','4',' ','5',' ','6',' ','7',' ','8',' ','F'}
        };
        int count = 0;
        HashMap<Character, Integer> store = new HashMap<>();
        char rowSelect = 'A';
        int colSelect = 0;
        while (count < numSeats) {
            System.out.println("Enter the row you want to select");
            rowSelect = sc.next().charAt(0);

            while (!(rowSelect >= 'A' && rowSelect < 'G')) {
                System.out.println("Enter a valid row");
                rowSelect = sc.next().charAt(0);
            }

            System.out.println("Enter the column you want to select");
            colSelect = sc.nextInt();

            while (colSelect < 1 || colSelect > 9) {
                System.out.println("Enter a valid column");
                colSelect = sc.nextInt();
            }
             while((rowSelect == 'C' || rowSelect == 'D' ) && (colSelect == 5 || colSelect == 3 || colSelect == 4 || colSelect == 6)){
                System.out.println("Invalid choice");
                colSelect = sc.nextInt();
            }


            // Check if the seat is already selected
            if (store.containsKey(rowSelect) && store.get(rowSelect) == colSelect) {
                System.out.println("Seat " + rowSelect + colSelect + " is already selected. Please choose another seat.");
            } else {
                // Mark the seat as selected and update the store
                pattern[rowSelect - 'A'][2 * (colSelect - 1)] = 'X';
                store.put(rowSelect, colSelect);
                count++;
            }
        }

        // Display the updated pattern
        for (int m = 0; m < 6; m++) {
            for (int n = 0; n < 17; n++) {
                char seat = pattern[m][n];
                
                    System.out.print(seat + " ");
                
            }
            System.out.println();
        }
        System.out.println(selectedOutdoorEvent);
              double totalPrice_outdoor = selectedOutdoorEvent.ticketPrice * numSeats;
              System.out.println("Total amount to be paid for " + numSeats + " seats: $" + totalPrice_outdoor);
              System.out.println("Thank you for booking!");
              System.out.println("\nReceipt:");
              System.out.println("Event: " + selectedOutdoorEvent.name);
             System.out.println("Venue: " + selectedOutdoorEvent.venue);
             System.out.println("Timing: " + selectedOutdoorEvent.timing);
              System.out.println("Quantity: " + numSeats);
              System.out.println("Total Amount Paid: $" + totalPrice_outdoor);
              System.out.println();
              return;     
    }

}
}
class LL {
    class Node {
        Node next, prev;
        Object object;

        Node(Object object) {
            this.object = object;
        }
    }

    Node head_pointer;

    void insert(Object object) {
        Node newNode = new Node(object);
        if (head_pointer == null) {
            head_pointer = newNode;
        } else {
            Node last_node = head_pointer;
            while (last_node.next != null) {
                last_node = last_node.next;
            }
            last_node.next = newNode;
            newNode.prev = last_node;
        }
    }

    void display() {
        Node last_node = head_pointer;
        if (head_pointer == null) {
            System.out.println("No movies are currently available.");
        } else {
            while (last_node != null) {
                System.out.println(last_node.object.toString());
                last_node = last_node.next;
                System.out.println();
            }
        }
    }
}

class Movie {
    String title;
    int year;
    String genre;
    double rating;
    double price;
    static LL movie_linked_list = new LL();

    public Movie(String title, int year, String genre, double rating, double price) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
        movie_linked_list.insert(this);
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nYear: " + year + "\nGenre: " + genre + "\nRating: " + rating+"\nPrice: "+price;
    }

    void display() {
        movie_linked_list.display();
    }
}

class Theater {
     static Scanner sc = new Scanner(System.in);
    String name;
    LL movieSchedule;
    public Theater(String name) {
        this.name = name;
        movieSchedule = new LL();
    }
    public void clearMovieSchedule() {
        movieSchedule = new LL();
    }
    public String getName() {
        return name;
    }

    public void addMovie(Movie movie, String timing[],double price) {
        MovieShow movieShow = new MovieShow(movie, timing,price);
        movieSchedule.insert(movieShow);
    }
   public void displayMovieTimings(Movie selectedMovie) {
        System.out.println("Movie timings for " + selectedMovie.title + " at " + name + ":");
        LL.Node currentNode = movieSchedule.head_pointer;

        while (currentNode != null) {
            MovieShow show = (MovieShow) currentNode.object;
            if (show.movie == selectedMovie) {
                for(String t : show.timing){
                    System.out.println(t);
                }
            }
            currentNode = currentNode.next;
        }
    }
   
   

    public void 
    bookingOfSeats(int numOfTickets, Theater selectedTheater){
        if(selectedTheater.name.equalsIgnoreCase("PVR")){   
        char ch = 'A';
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.print(ch);
            ch++;
            System.out.println();
        }
      
        // Initialize the seating pattern
        char pattern[][] = {
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', 'A'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', 'B'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', 'C'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', 'D'}
        };
        int count = 0;
        HashMap<Character, Integer> store = new HashMap<>();
        char rowSelect = 'A';
        int colSelect = 0;
        while (count < numOfTickets) {
            System.out.println("Enter the row you want to select");
            rowSelect = sc.next().charAt(0);

            while (!(rowSelect >= 'A' && rowSelect < 'E') && !(rowSelect >= 'a' && rowSelect < 'e')) {
                System.out.println("Enter a valid row");
                rowSelect = sc.next().charAt(0);
            }

            System.out.println("Enter the column you want to select");
            colSelect = sc.nextInt();

            while (colSelect < 1 || colSelect > 4) {
                System.out.println("Enter a valid column");
                colSelect = sc.nextInt();
            }

            // Check if the seat is already selected
            if (store.containsKey(rowSelect) && store.get(rowSelect) == colSelect) {
                System.out.println("Seat " + rowSelect + colSelect + " is already selected. Please choose another seat.");
            } else {
                // Mark the seat as selected and update the store
                pattern[rowSelect - 'A'][2 * (colSelect - 1)] = 'X';
                store.put(rowSelect, colSelect);
                count++;
            }
        }

        // Display the updated pattern
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 9; n++) {
                char seat = pattern[m][n];
                    System.out.print(seat + " ");
            }
            System.out.println();
        }

        }else if( selectedTheater.name.equalsIgnoreCase("INOX")){
                 HashMap<Character, Integer> store = new HashMap<>();
       
         for(int i =0;i<8;i++){
            for(int j = 0;j<7;j++){
                if(((i==7 || i==6 ) && (j==2 || j == 3 || j == 4 )))
                    System.out.print("   ");
                else
                    System.out.print(j+1 + "  ");
            }
            System.out.println("\u001B[34m"+(char)(65+i) + "\u001B[0m"); 
        }
        System.out.println("______________________________");
        System.out.printf("%-5s %-12s" ,  " ", " SCREEN THIS WAY" );
        System.out.println();
        System.out.println("______________________________");   

        // Initialize the seating pattern
        char pattern[][] = {
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', 'A'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', 'B'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', 'C'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', 'D'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', 'E'},
            {'1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', 'F'},
            {'1', ' ', '2', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '6', ' ', '7', ' ', '8', ' ', 'G'},
            {'1', ' ', '2', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '6', ' ', '7', ' ', '8', ' ', 'H'}
        };
        int count = 0;

        while (count < numOfTickets) {
            System.out.println("Enter the row you want to select");
            char rowSelect = sc.next().charAt(0);

            while (!(rowSelect >= 'A' && rowSelect < 'I') && !(rowSelect >= 'a' && rowSelect < 'i')) {
                System.out.println("Enter a valid row");
                rowSelect = sc.next().charAt(0);
            }

            System.out.println("Enter the column you want to select");
            int colSelect = sc.nextInt();

            while (colSelect < 1 || colSelect > 8) {
                System.out.println("Enter a valid column");
                colSelect = sc.nextInt();
            }

            while ((rowSelect == 'G' || rowSelect == 'H') && (colSelect == 5 || colSelect == 3 || colSelect == 4)) {
                System.out.println("Invalid choice");
                System.out.println("Enter the column you want to select");
                colSelect = sc.nextInt();
            }

            // Check if the seat is already selected
            if (store.containsKey(rowSelect) && store.get(rowSelect) == colSelect) {
                System.out.println("Seat " + rowSelect + colSelect + " is already selected. Please choose another seat.");
            } else {
                for (int m = 0; m < 8; m++) {
                for (int n = 0; n < 17; n++) {
                    if (m == rowSelect - 'A' && n == 2 * (colSelect - 1)) {
                        pattern[m][n] = 'X';
                    }
                }
            }

                store.put(rowSelect, colSelect);
                count++;
            }
        }

        // Display the updated pattern
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("______________________________");
        System.out.printf("%-5s %-12s", " ", " SCREEN THIS WAY");
        System.out.println();
        System.out.println("______________________________");
        }else{
            HashMap<Character, Integer> store = new HashMap<>();
        char ch = 'A';
        for(int i = 1; i < 6; i ++){
            for(int j = 1; j < 9; j ++){
               if( (i > 3)  && ( j == 3 || j == 6)){
                System.out.print("  ");
               }else{
                System.out.print(" "+j);
               }
               
            }
            System.out.print(" "+ch);
            ch++;
            System.out.println();
        }
        System.out.println("_________________________");
        System.out.println();
        System.out.println("---- SCREEN THIS WAY----");
        System.out.println("_________________________");
        char pattern[][] = {
            {'1',' ','2',' ','3',' ', '4',' ','5',' ','6',' ','7',' ','8',' ','A'},
            {'1',' ','2',' ','3',' ', '4',' ','5',' ','6',' ','7',' ','8',' ','B'},
            {'1',' ','2',' ','3',' ', '4',' ','5',' ','6',' ','7',' ','8',' ','C'},
            {'1',' ','2',' ',' ',' ', '4',' ','5',' ',' ',' ','7',' ','8',' ','D'},
            {'1',' ','2',' ',' ',' ', '4',' ','5',' ',' ',' ','7',' ','8',' ','E'}
        };
        int count = 0;

        while (count < numOfTickets) {
            System.out.println("Enter the row you want to select");
            char rowSelect = sc.next().charAt(0);

            while (!(rowSelect >= 'A' && rowSelect < 'F') && !(rowSelect >= 'a' && rowSelect < 'f')) {
                System.out.println("Enter a valid row");
                rowSelect = sc.next().charAt(0);
            }

            System.out.println("Enter the column you want to select");
            int colSelect = sc.nextInt();

            while (colSelect < 1 || colSelect > 8) {
                System.out.println("Enter a valid column");
                colSelect = sc.nextInt();
            }

            while ((rowSelect == 'D' || rowSelect == 'E'|| rowSelect == 'd'|| rowSelect == 'e') && (colSelect == 3 || colSelect == 6 )) {
                System.out.println("Invalid choice");
                System.out.println("Enter the column you want to select");
                colSelect = sc.nextInt();
            }

            // Check if the seat is already selected
            if (store.containsKey(rowSelect) && store.get(rowSelect) == colSelect) {
                System.out.println("Seat " + rowSelect + colSelect + " is already selected. Please choose another seat.");
            } else {
                for (int m = 0; m < 5; m++) {
                for (int n = 0; n < 15; n++) {
                    if (m == rowSelect - 'A' && n == 2 * (colSelect - 1)) {
                        pattern[m][n] = 'X';
                    }
                }
            }
                store.put(rowSelect, colSelect);
                count++;
            }
        }

        // Display the updated pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print(pattern[i][j] );
            }
            System.out.println();
        }

         System.out.println("_________________________");
        System.out.println();
        System.out.println("---- SCREEN THIS WAY----");
        System.out.println("_________________________");
        }

    }
public boolean isValidMovieTiming(Movie movie, String timing) {
        LL.Node currentNode = movieSchedule.head_pointer;

        while (currentNode != null) {
            MovieShow show = (MovieShow) currentNode.object;
            for(String time : show.timing){
                if (show.movie == movie && time.equals(timing)) {
                return true;
            }
            }
            
            currentNode = currentNode.next;
        }

        return false;
    }
}

class MovieShow {
    Movie movie;
    String timing[];
    double price;

    public MovieShow(Movie movie, String timing[],double price) {
        this.movie = movie;
        this.timing = timing;
        this.price=price;
    }

    @Override
    public String toString() {
        return "MovieShow [Movie = " + movie + ", Timings = " + Arrays.toString(timing) + ", Price = " + price + "]";
    }

   
}

class Sports {
    String name;
    double ticketPrice;
    String venue;
    String timing;
    char cName;

    public Sports(char cName,String name, double ticketPrice, String venue, String timing) {
        this.cName = cName;
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.venue = venue;
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "Sports Name = " + cName + ", Stadium Name=" + name + ", ticketPrice=" + ticketPrice + ", venue=" + venue + ", timing=" + timing +"]";
    }

   
}

class Indoor extends Sports {
    public Indoor(char cName,String name, double ticketPrice, String venue, String timing) {
        super(cName,name, ticketPrice, venue, timing);
    }
}

class Outdoor extends Sports {
    int stadiumSeats;
    public Outdoor(char cName,String name, double ticketPrice, String venue, String timing, int stadiumSeats) {
        super(cName,name, ticketPrice, venue, timing);
        this.stadiumSeats = stadiumSeats;
    }
}