import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.ResponseCode;
import tasks.GetUsers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)
public class SerenityInitialTest {

    private static final String restApiUrl ="http://localhost:5000/api";
    @Test
    public void initialTest(){
        Actor carolina= Actor.named("Carolina")
                .whoCan(CallAnApi.at(restApiUrl));
        carolina.attemptsTo(
                GetUsers.frompage(3));

        //assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(200);

        carolina.should(
                seeThat("El código de respuesta", ResponseCode.was(),equalTo(200))
        );
    }
    /*@Test
    public void getUsersFail(){
        Actor carolina= Actor.named("Carolina").whoCan(CallAnApi.at(restApiUrl));
        carolina.attemptsTo(Get.resource("/users?page=2"));

        assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(400);

    }*/

}
