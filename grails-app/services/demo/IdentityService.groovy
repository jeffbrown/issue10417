package demo

class IdentityService {

    InvestigatorStatusService investigatorStatusService

    int firstMethod() {
        investigatorStatusService.secondMethod()
    }

    int thirdMethod() {
        42
    }
}
