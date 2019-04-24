package com.zdd.log4jTest;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author zdd
 * @date 2019-04-23 19:56
 */

public class TestLog4j {
    static Logger logger = Logger.getLogger(TestLog4j.class);

    public static void main(String[] args) throws InterruptedException {
        //BasicConfigurator.configure();
        //PropertyConfigurator.configure("e:\\project\\log4j\\src\\log4j.properties");
        PropertyConfigurator.configure("D:\\研一\\项目\\JavaLearn\\Log4jTest\\src\\main\\java\\log4j.xml");
        logger.setLevel(Level.DEBUG);
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        Thread.sleep(1000);
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
        //提交2？
        //提交3//
        //提交4//
        //提交5

    }
}
