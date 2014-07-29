package org.wso2.appserver.integration.tests.webapp.classloading;

import org.testng.annotations.BeforeClass;
import org.wso2.appserver.integration.common.clients.WebAppAdminClient;

public class CXFWebApplicationPatchTestCase extends
        WebApplicationClassloadingTestCase {
    private final String webAppFileName = "jaxrs_basic.war";
    private final String webAppName = "jaxrs_basic";
    private final String webAppLocalURL ="/jaxrs_basic/services/customers/customerservice/customers/";
    WebAppAdminClient webAppAdminClient;

    @BeforeClass(alwaysRun = true)
    public void init() throws Exception {
        super.init();
        setWebAppFileName(webAppFileName);
        setWebAppName(webAppName);
        setWebAppURL(getWebAppURL() + webAppLocalURL);
    }
}
