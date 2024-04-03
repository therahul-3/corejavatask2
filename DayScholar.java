class DayScholar extends Student {
    private int busNumber;
    private float distance;

    // Constructor
    public DayScholar(int studentId, String studentName, String department, String gender, String category,
                      double collegeFee, int busNumber, float distance) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.busNumber = busNumber;
        this.distance = distance;
    }

    // Method to calculate total fee for DayScholar
    public double calculateTotalFee() {
        double busFee;
        if (distance > 30 && distance <= 40) {
            busFee = 28000;
        } else if (distance > 20 && distance <= 30) {
            busFee = 20000;
        } else if (distance > 10 && distance <= 20) {
            busFee = 12000;
        } else if (distance <= 10) {
            busFee = 6000;
        } else {
            busFee = 0; // Default value if distance is invalid
        }

        double totalFee = collegeFee + busFee;
        return totalFee;
    }
}
