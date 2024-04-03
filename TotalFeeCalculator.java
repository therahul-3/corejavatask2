public class TotalFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Id");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter Student name");
        String studentName = scanner.nextLine();

        System.out.println("Enter Department name");
        String department = scanner.nextLine();

        System.out.println("Enter gender");
        String gender = scanner.nextLine();

        System.out.println("Enter category");
        String category = scanner.nextLine();

        System.out.println("Enter College fee");
        double collegeFee = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        if (category.equalsIgnoreCase("Hosteller")) {
            System.out.println("Enter the room number");
            int roomNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.println("Enter the Block name");
            char blockName = scanner.nextLine().charAt(0);

            System.out.println("Enter the room type");
            String roomType = scanner.nextLine();

            Hosteller hosteller = new Hosteller(studentId, studentName, department, gender, category,
                    collegeFee, roomNumber, blockName, roomType);
            double totalFee = hosteller.calculateTotalFee();
            System.out.println("Total College fee is " + totalFee);
        } else if (category.equalsIgnoreCase("DayScholar")) {
            System.out.println("Enter Bus number");
            int busNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.println("Enter the distance");
            float distance = scanner.nextFloat();

            DayScholar dayScholar = new DayScholar(studentId, studentName, department, gender, category,
                    collegeFee, busNumber, distance);
            double totalFee = dayScholar.calculateTotalFee();
            System.out.println("Total College fee is " + totalFee);
        } else {
            System.out.println("Invalid category. Please enter either Hosteller or DayScholar.");
        }

        scanner.close();
    }
}
