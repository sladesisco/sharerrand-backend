package sharerrand.api;

import org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials;
import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableRdsInstance(databaseName = "${database-name:}",
//        dbInstanceIdentifier = "${db-instance-identifier:}",
//        password = "${rdsPassword:}")
//@EnableContextCredentials(accessKey="******", secretKey="******")
public class AwsResourceConfig {}