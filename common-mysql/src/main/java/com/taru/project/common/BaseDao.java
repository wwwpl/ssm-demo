package com.taru.project.common;



import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * ☺
 * @author wangfei
 * @date 2018年3月4日 13:57:26
 * ☺
 *
 */
public class BaseDao {
    public static SqlMapClient sqlMap = null;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis/sqlmap-config.xml");
            sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("Error initializing IbatisSqlMap class.Cause;" + e);
        }
    }

}
