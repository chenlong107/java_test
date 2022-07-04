package Connect_Pool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Auther: chenlong
 * @Date: 2022/04/12/14:54
 * @Description:
 */
public class JDBC_Test {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream resource = properties.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(resource);
        resource.close();
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
    }
}
