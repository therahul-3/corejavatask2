class Hosteller extends Student {
    private int roomNumber;
    private char blockName;
    private String roomType;

    // Constructor
    public Hosteller(int studentId, String studentName, String department, String gender, String category,
                     double collegeFee, int roomNumber, char blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }

    // Method to calculate total fee for Hosteller
    public double calculateTotalFee() {
        double hostelFee;
        if (blockName == 'A') {
            hostelFee = 60000;
        } else if (blockName == 'B') {
            hostelFee = 50000;
        } else if (blockName == 'C') {
            hostelFee = 40000;
        } else {
            hostelFee = 0; // Default value if blockName is invalid
        }

        double totalFee;
        if (roomType.equals("AC")) {
            totalFee = collegeFee + hostelFee + 8000; // AC room fee
        } else {
            totalFee = collegeFee + hostelFee; // Non-AC room fee
        }

        return totalFee;
    }
}
