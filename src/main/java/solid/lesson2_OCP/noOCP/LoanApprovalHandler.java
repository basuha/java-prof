package solid.lesson2_OCP.noOCP;

public class LoanApprovalHandler {
    public void approvePersonalLoan(PersonalLoanValidator validator) {
        if(validator.isValid()) {
            //process of loan
        }
    }
    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if(validator.isValid()) {
            //process of loan
        }
    }
}

class PersonalLoanValidator {
    public boolean isValid() {
        //validation logic
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        return true;
    }
}