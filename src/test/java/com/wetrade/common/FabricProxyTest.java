/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.wetrade.common;

import org.json.JSONObject;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FabricProxyTest {
    Path walletPath = Paths.get("wallet");
    Path connectionProfilePath = Paths.get("connection.json");
    String channelName = "mychannel";
    String contractName = "mycontract";
    String org = "org1";

    public FabricProxyTest() {

    }

    // @Test public void testEvaluateTransactionReturnsJSONObject() throws IOException {
    //     FabricProxyConfig config = new FabricProxyConfig(walletPath, connectionProfilePath, channelName, contractName, org);
    //     FabricProxy classUnderTest = new FabricProxy(config);
    //     assertTrue("someLibraryMethod should return an instance of JSONObject", classUnderTest.evaluateTransaction() instanceof JSONObject);
    // }
}
