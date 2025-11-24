interface Exporter {
    void exportCSV();
    void exportPDF();

    default void exportJSON() {
        System.out.println("Exporting as JSON...");
    }
}

class Report implements Exporter {
    public void exportCSV() { System.out.println("CSV Export"); }
    public void exportPDF() { System.out.println("PDF Export"); }
}

public class TestExport {
    public static void main(String[] args) {
        Exporter r = new Report();
        r.exportJSON();
    }
}
