package solid.lesson1_SRP.emplyee_arch;

public class EmployeeReportFormatter extends ReportFormatter {
    public EmployeeReportFormatter(Object o, FormatType formatType) {
        super(o, formatType);
    }

    public String getFormattedEmployee() {
        return formattedOutput;
    }
}
