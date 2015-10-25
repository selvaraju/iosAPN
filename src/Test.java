import java.io.File;

import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import javapns.notification.PushNotificationPayload;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	           final PushNotificationPayload payload = PushNotificationPayload.complex();
	            payload.addAlert("You have a new message from Test");
	            payload.addCustomDictionary("message","Test Messgae from local");
	            payload.addCustomDictionary("messageSentFrom","Benny Anderson");
	            payload.addCustomDictionary("type","new_message");
	            payload.addCustomDictionary("time","1440190125546");
	            payload.addCustomDictionary("userid", "1166526293363108");
	            payload.addCustomDictionary("firstname", "Selva");
	            payload.addCustomDictionary("lastname","R");
	            payload.addCustomDictionary("count",  "1");
	           File p12fileLocation = new File("src/iphone_dev.p12");
	           Push.payload(payload, p12fileLocation, "walmart123", false, "d9290f97cad2532b4572975002b28a4bd5e55e3afa082e0de9071f2f40b21b79");
	      
		  } catch (CommunicationException e) {
	                        e.printStackTrace();
	            } catch (KeystoreException e) {
	                        e.printStackTrace();
	           } catch (org.json.JSONException e) {
	            e.printStackTrace();
	        }
	    }
	
	 

}
