package demo

class DemoController {

    IdentityService identityService

    def index() {
        int result = identityService.firstMethod()

        render "The Result: $result"
    }
}
