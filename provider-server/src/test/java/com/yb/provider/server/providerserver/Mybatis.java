package com.yb.provider.server.providerserver;



import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
* * wangchao
* mybatis实体转化器
* */
public class Mybatis {
    //tk.mybatis.mapper.generator.MapperPlugin
    protected static Logger logger = LoggerFactory.getLogger(Mybatis.class);

    public static void main(String[] args) {
        try {
            generator("mybatis.xml");
            logger.info("EWEWE");
           // int i = 3/0;
        }
        catch (Exception e) {
            logger.info("EWEWE",e.getMessage());
            e.printStackTrace();
        }
    }

    public static void generator(String xmlName) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        ClassLoader classLoader = Mybatis.class.getClassLoader();
        InputStream stream = classLoader.getResourceAsStream(xmlName);
        Configuration config = cp.parseConfiguration(stream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("生成成功");
    }
}
