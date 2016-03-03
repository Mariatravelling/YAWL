package test;

import java.io.IOException;

import org.yawlfoundation.yawl.engine.YSpecificationID;
import org.yawlfoundation.yawl.engine.interfce.interfaceE.YLogGatewayClient;

class test {

	public static void main(String[] args) throws IOException {
		
		String result=test.testLogGateway();
		System.out.println(result);
	}
    
		public static String testLogGateway() throws IOException {
        YLogGatewayClient logClient
                = new YLogGatewayClient("http://localhost:8080/yawl/logGateway");
        String handle = logClient.connect("admin", "YAWL");

        YSpecificationID id = new YSpecificationID("UID_f3553de7-ca9b-455b-adb6-3cd897001bf8", "0.1", "logtest");

        String caseLogXML = logClient.getCompleteCaseLog("12", handle);
        
        return caseLogXML;
    }

}
