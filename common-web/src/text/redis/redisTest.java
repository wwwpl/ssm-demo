package redis;

import redis.clients.jedis.Jedis;

public class redisTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("47.94.128.249",6379);

        jedis.set("sjl20180305","HelloWorld");
        System.out.println(jedis.get("sjl20180305"));
    }
}
