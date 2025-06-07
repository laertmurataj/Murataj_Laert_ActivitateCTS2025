package ro.cts.clase;

public class BorrowRecord {
    private String borrowerName;
    private int borrowerDate;

    public BorrowRecord(String borrowerName, int borrowerDate) {
        this.borrowerName = borrowerName;
        this.borrowerDate = borrowerDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BorrowRecord{");
        sb.append("borrowerName='").append(borrowerName).append('\'');
        sb.append(", borrowerDate=").append(borrowerDate);
        sb.append('}');
        return sb.toString();
    }
}
