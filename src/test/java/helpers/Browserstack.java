package helpers;

import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {

    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
    //static LocalConfig config = ConfigFactory.create(LocalConfig.class, System.getProperties());

    //https://app-automate.browserstack.com/sessions/1fbff35e1bf8679aaf1effa14a7fb52bdf75d9fe/video?token=dFdyTGZPU1hoQS9ZQ2dtcFZrU0pocDBmSGxYdlE5NzZ6bDFFSFlJSjYvNjUxdUU4ZERxS0QrVEVrbHBhdmVxcWFzRlNEV2RoM2tDMmNuTDhlUkUwWnc9PS0tTmZLOFV4Ti9qT2gvbnpIazlXZ3JLUT09--9b9e790f63719e1f5f47421550b4707ddb40e5c8&source=rest_api&diff=936.698957738

    //curl -u "alenaporohova_YRLAUz:ds869fB5spnGzHmnJAUW" -X GET "https://api.browserstack.com/app-automate/sessions/1fbff35e1bf8679aaf1effa14a7fb52bdf75d9fe.json"
    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(config.getUserName(), config.getPassword())
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
