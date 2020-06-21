package solid.lesson2_OCP.OCP_solution;

public class LoanApprovalHandler {
    public void approveLoan(Validator validator) {
        if (validator.isValid()) {
            //process a loan
        }
    }
}

class test {
    public static void main(String[] args) {
        var loanApprovalHandler = new LoanApprovalHandler();
        loanApprovalHandler.approveLoan(new ThreeMonthLoan());

    }
}
