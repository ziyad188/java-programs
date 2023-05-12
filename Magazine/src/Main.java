import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);


        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);


        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);
        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    }

    public static boolean isNullOrBlank(String input){
        if(input.isBlank() || input == null){
            return true;
        }
        return false;
    }
    public static boolean incorrectIssueNumber(int issueNumber) {
        if(issueNumber<=0){
            return true;
        }
        return false;
    }
    public static boolean incorrectPublicationYear(int publicationYear) {
        if(publicationYear<=0){
            return true;
        }
        return false;
    }
    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid title: ");
            String title = scanner.nextLine();
            if(!isNullOrBlank(title)){
                return title;
            }
        }
    }
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();
            if(!isNullOrBlank(publisher)){
                return publisher;
            }
        }
    }
    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int issueNumber = scanner.nextInt();
            if(!incorrectIssueNumber(issueNumber)){
                return issueNumber;
            }
        }
    }
    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            // First check if the next input is not an integer
            // scanner.next();
            // continue;
            int publicationYear = scanner.nextInt();
            if(!incorrectPublicationYear(publicationYear)){
                return publicationYear;
            }
        }
    }








}